package kpoop.gruposdekpop.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
data class SubUnit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    var nome: String? = null,

    var dataDebut: LocalDate? = null,

    @ManyToOne
    var empresa: Empresa? = null,

    @ManyToOne
    var grupo: Grupo? = null
)
