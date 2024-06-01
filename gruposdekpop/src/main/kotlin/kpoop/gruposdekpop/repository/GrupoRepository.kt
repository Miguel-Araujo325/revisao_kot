package kpoop.gruposdekpop.repository

import kpoop.gruposdekpop.domain.Grupo
import org.springframework.data.jpa.repository.JpaRepository

interface GrupoRepository : JpaRepository<Grupo, Int>{
}