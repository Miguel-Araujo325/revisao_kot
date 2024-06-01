package kpoop.gruposdekpop.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Grupo (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    var nome: String? = null,

    var dataDebut: LocalDate? = null,

    @ManyToOne
    var empresa: Empresa? = null,

    @OneToMany(mappedBy = "grupo")
    val subUnits: MutableList<SubUnit>? = null

)