package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// faz a condução dos dados da tabela ao banco
// serve para persistir os dados no banco (insert, delete etc)
//para fazer os gets, posts, puts, vc precisa persistir

public interface ManutencaoRepository extends JpaRepository<ManutencaoTable, Long> {

}
