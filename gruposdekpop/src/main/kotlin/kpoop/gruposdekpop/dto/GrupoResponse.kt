package kpoop.gruposdekpop.dto

import java.time.LocalDate

data class GrupoResponse (
    var nome: String? = null,

    var dataDebut: LocalDate? = null,

    var subUnits: List<SubUnityResponse>? = null
)