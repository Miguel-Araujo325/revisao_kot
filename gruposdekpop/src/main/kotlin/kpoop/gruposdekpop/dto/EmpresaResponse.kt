package kpoop.gruposdekpop.dto

import java.time.LocalDate

data class EmpresaResponse (
    var nome: String? = null,

    var dataFundacao: LocalDate? = null,

    var grupos: List<GrupoResponse>? = null
)