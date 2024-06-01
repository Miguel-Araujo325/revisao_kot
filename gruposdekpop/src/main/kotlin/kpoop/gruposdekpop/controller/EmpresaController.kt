package kpoop.gruposdekpop.controller

import kpoop.gruposdekpop.domain.Empresa
import kpoop.gruposdekpop.repository.EmpresaRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Empresas")
class EmpresaController(
    val empresaRepository: EmpresaRepository
){
    @GetMapping
    fun listar(): ResponseEntity<List<Empresa>> {
        val empresas = empresaRepository.findAll()

        if(empresas.isEmpty()) {
            return ResponseEntity.status(204).build()
        }

        return ResponseEntity.status(200).body(empresas)
    }
}