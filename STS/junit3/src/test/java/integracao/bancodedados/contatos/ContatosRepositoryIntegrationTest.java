package integracao.bancodedados.contatos;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContatosRepositoryIntegrationTest {
	
	@Autowired
	private ContatoRepository contatoRepository;

	@Before
	public void start() {
	Contato contato = new Contato("Chefe", "0y", "9xxxxxxx9");
	if (contatoRepository.findFirstByNome(contato.getNome()) == null)
	contatoRepository.save(contato);

	contato = new Contato("Novo Chefe", "0y", "8xxxxxxx8");
	if (contatoRepository.findFirstByNome(contato.getNome()) == null)
	contatoRepository.save(contato);

	contato = new Contato("chefe Mais Antigo", "0y", "7xxxxxxx7");
	if (contatoRepository.findFirstByNome(contato.getNome()) == null)
	contatoRepository.save(contato);

	contato = new Contato("Amigo", "0z", "5xxxxxxx5");
	if (contatoRepository.findFirstByNome(contato.getNome()) == null)
	contatoRepository.save(contato);
	}


	@Test
	public void findByNomeRetornaContato() throws Exception {

		Contato contato = contatoRepository.findFirstByNome("Chefe");

		Assert.assertTrue(contato.getNome().equals("Chefe"));
	}

	@Test
	public void findAllByNomeIgnoreCaseRetornaTresContato() {

		List<Contato> contatos = contatoRepository.findAllByNomeIgnoreCaseContaining("chefe");

		Assert.assertEquals(3, contatos.size());

	}

	@Test
	public void buscaTodosContatosComOrdenacaoRetornaListaOrdenadaDeFormaAscendente() {

		List<Contato> contatos = contatoRepository.buscaTodosContatos2("nome");

		Assert.assertTrue(contatos.get(0).getNome().equals("Amigo"));

	}

//
//	@Test
//	@Transactional
//	public void buscaTodosContatosRetornaStreamOrdenada() {
//
//		try(Stream<Contato> contatos = contatoRepository.buscaTodosContatos()){
//			Assert.assertTrue(contatos.findFirst().get().getNome().equals("Amigo"));
//		}
//
//	}

}