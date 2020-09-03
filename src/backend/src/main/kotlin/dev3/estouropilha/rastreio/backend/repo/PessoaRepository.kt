package dev3.estouropilha.rastreio.backend.repo

import dev3.estouropilha.rastreio.backend.model.Pessoa
import org.springframework.data.repository.CrudRepository

interface PessoaRepository : CrudRepository<Pessoa, Int> {

}