package kpoop.gruposdekpop.repository

import kpoop.gruposdekpop.domain.SubUnit
import org.springframework.data.jpa.repository.JpaRepository

interface SubUnitRepository : JpaRepository<SubUnit, Int>{
}