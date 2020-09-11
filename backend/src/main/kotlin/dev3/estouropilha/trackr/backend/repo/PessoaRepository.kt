package dev3.estouropilha.trackr.backend.repo

import dev3.estouropilha.trackr.backend.model.Pessoa
import org.springframework.data.repository.CrudRepository

interface PessoaRepository : CrudRepository<Pessoa, Int>