Tools = new function () {

    // /**
    //  * Metodo responsavel por realizar consulta simples no back e retornar
    //  * genericamente um resultado em JSON.
    //  */
    // this.request = function (url, data, isFormData, typeRequest) {
    //     var contentT = 'application/json; charset=utf-8';
    //     if (!typeRequest) {
    //         typeRequest = "POST";
    //     }
    //     if (isFormData) {
    //         var dataValue = data;
    //         contentT = 'application/x-www-form-urlencoded';
    //     } else {
    //         dataValue = JSON.stringify(data);
    //     }
    //     var values = '';
    //     $.ajax({
    //         url: url,
    //         type: typeRequest,
    //         data: dataValue,
    //         dataType: "json",
    //         contentType: contentT,
    //         async: false,
    //         success: function (resultData) {
    //             values = resultData
    //         }
    //     });
    //     return values;
    // }


    // this.timeNow = function () {
    //     return (new Date().getTime());
    // }

    this.cleanCPF = function (cpf) {
        cpf = cpf.toString().replaceAll("-", "");
        cpf = cpf.toString().replaceAll(".", "");
        cpf = cpf.toString().replaceAll("_", "");
        return cpf;
    }

    this.cleanCNPJ = function (cnpj) {
        cnpj = cnpj.toString().replaceAll("-", "");
        cnpj = cnpj.toString().replaceAll(".", "");
        cnpj = cnpj.toString().replaceAll("/", "");
        cnpj = cnpj.toString().replaceAll("\\", "");
        cnpj = cnpj.toString().replaceAll("(", "");
        cnpj = cnpj.toString().replaceAll(")", "");
        cnpj = cnpj.toString().replaceAll(" ", "");
        cnpj = cnpj.toString().replaceAll(":", "");
        cnpj = cnpj.toString().replaceAll("_", "");
        return cnpj;
    }
}