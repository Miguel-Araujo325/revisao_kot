package kpoop.gruposdekpop.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Empresa (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    var nome: String? = null,

    var dataFundacao: LocalDate? = null,

    @OneToMany(mappedBy = "empresa")
    val grupos: List<Grupo>? = null
)