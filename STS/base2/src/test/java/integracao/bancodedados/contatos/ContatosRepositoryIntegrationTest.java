package integracao.bancodedados.contatos;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import integracao.bancodedados.ContatoModel;
import integracao.bancodedados.ContatoRepository;


//Run with rodará com o spring runner,
//que suporta testes de integração de interfaces (testa se a 
//repository está funcionando)

@RunWith(SpringRunner.class)
@DataJpaTest //melhor testador de JPA
public class ContatosRepositoryIntegrationTest {

	
}