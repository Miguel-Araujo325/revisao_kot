package kpoop.gruposdekpop.repository

import kpoop.gruposdekpop.domain.Empresa
import org.springframework.data.jpa.repository.JpaRepository

interface EmpresaRepository : JpaRepository<Empresa, Int>{
}
