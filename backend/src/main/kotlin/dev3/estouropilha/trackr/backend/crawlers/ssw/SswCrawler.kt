package dev3.estouropilha.trackr.backend.crawlers.ssw

import dev3.estouropilha.trackr.backend.crawlers.ssw.models.Movimentacao
import dev3.estouropilha.trackr.backend.crawlers.ssw.models.Entrega
import org.jsoup.Jsoup
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class SswCrawler {
    private val baseUrl = "https://ssw.inf.br"

    fun consultarEntregas(cpfDestinatario: String): List<Entrega> {
        val document = Jsoup.connect("${baseUrl}/2/resultSSW_dest")
                .data("urlori", "/2/rastreamento_pf")
                .data("cnpjdest", cpfDestinatario)
                .post()

        return document.select("a.email")
                .map {
                    val onclickAttr = it.attr("onClick")

                    val detalhes = Jsoup.connect("${baseUrl}${onclickAttr.substring(onclickAttr.indexOf("'") + 1, onclickAttr.lastIndexOf("'"))}")
                            .get()
                            .select("table")[1]
                            .select("tr")
                            .drop(1)
                            .filter { tr ->
                                tr.children().any { c -> c.hasClass("rastreamento") } && tr.children().count() >= 3
                            }
                            .map { linha ->
                                val (data, unidade, detalhes) = linha.select("td").map { td ->
                                    td.select("p.tdb").text()
                                }

                                Movimentacao(LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")), unidade, detalhes)
                            }
                    Entrega(detalhes)
                }
    }
}