package integracao.bancodedados.contatos;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	//procurar pela primeira palavra
	Contato findFirstByNome (String nome);
	
	//ignorar maiusculas
	List<Contato> findAllByNomeIgnoreCaseContaining (String nome);
	
	//ordena por ordem alfabetica, e depois verificar uma palavra
	 @Query(value = "SELECT * FROM contato ORDER BY nome", nativeQuery = true)
	 List<Contato>  buscaTodosContatos2(String string);

}
