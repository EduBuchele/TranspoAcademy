package br.com.cursojava.exercicio;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContatoTest {
	RepositorioContatoMemory repositorio;

	@Before
	public void antesDeCadaTest() {
		repositorio = new RepositorioContatoMemory();
	}

	@Test
	public void testAdicionarContato() {
		// Assert.fail("Teste Adicionar ainda nao implementado");
		boolean resultado = repositorio.adicionar(new Contato());
		Assert.assertTrue(resultado);
	}

	@Test
	public void testAdicionarContatoSize() {
		repositorio.adicionar(new Contato());
		repositorio.adicionar(new Contato());
		repositorio.adicionar(new Contato());
		Assert.assertEquals(repositorio.buscarTodos().size(), 3);
	}

	@Test
	public void testAdicionarContatoNull() {
		// Assert.fail("Teste Adicionar ainda nao implementado");
		boolean resultado = repositorio.adicionar(null);
		Assert.assertFalse(resultado);
	}

	@Test
	public void testEditarContato() {
		// Assert.fail("Teste Adicionar ainda nao implementado");
		boolean resultado = repositorio.editar(new Contato());
		Assert.assertFalse(resultado);
	}

	@Test
	public void testEditarSetNome() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		contato01.setNome("Maria");
		boolean resultado = repositorio.editar(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testEditarSetEmail() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		contato01.setEmail("Email");
		boolean resultado = repositorio.editar(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testEditarSetFone() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		contato01.setTelefone("Telefone");
		boolean resultado = repositorio.editar(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testEditarSetId() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		contato01.setId(01);
		boolean resultado = repositorio.editar(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testEditarSetTipo() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		contato01.setTipo(TipoContato.FAMILIA);
		boolean resultado = repositorio.editar(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testBuscarTodosSize() {
		repositorio.adicionar(new Contato(01, "Nome01", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Nome02", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "telefone", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscarTodos().size(), 4);
	}

	@Test
	public void testBuscarTodosDois() {
		repositorio.adicionar(new Contato(01, "Nome01", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Nome02", "email", "telefone", TipoContato.AMIGO));

		Assert.assertEquals(repositorio.buscarTodos().size(), 2);
	}

	@Test
	public void testBuscarPorNomeEduardo() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "telefone", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscarPorNome("Eduardo").size(), 2);
	}

	@Test
	public void testBuscarPorNomeErrado() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "telefone", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscarPorNome("Maria").size(), 0);
	}

	@Test
	public void testBuscarPorNomeNull() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		ArrayList<Contato> lista = (ArrayList<Contato>) repositorio.buscarPorNome(null);
		Assert.assertEquals(lista.size(), 0);
	}

	@Test
	public void testBuscarPorTelefone() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Eduardo", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "telefone", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "telefone", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscaPorTelefone("telefone").size(), 4);
	}

	@Test
	public void testBuscarPorTelefoneUnico() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Eduardo", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "99996666", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "99995555", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscaPorTelefone("99996666").size(), 1);
	}

	@Test
	public void testBuscarPorTelefoneString() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email1", "99998888", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Joao", "email2", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email3", "99996666", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email4", "99995555", TipoContato.AMIGO));
		ArrayList<Contato> lista = (ArrayList<Contato>) repositorio.buscaPorTelefone("99998888");
		Assert.assertEquals(lista.get(0).getEmail(), "email1");
	}

	@Test
	public void testBuscarPorTelefoneNull() {
		// Assert.assertNull(repositorio.buscarPorNome("Jose"));
		repositorio.adicionar(new Contato(01, "Eduardo", "email1", "99998888", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Joao", "email2", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email3", "99996666", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email4", "99995555", TipoContato.AMIGO));
		ArrayList<Contato> lista = (ArrayList<Contato>) repositorio.buscaPorTelefone(null);
		Assert.assertEquals(lista, null);
	}

	@Test
	public void testBuscarPorTipoAmigo() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "99996666", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "99995555", TipoContato.AMIGO));
		Assert.assertEquals(repositorio.buscaPorTipo(TipoContato.AMIGO).size(), 4);
	}

	@Test
	public void testBuscarPorTipoJoao() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "99995555", TipoContato.OUTROS));
		ArrayList<Contato> lista = (ArrayList<Contato>) repositorio.buscaPorTipo(TipoContato.AMIGO);
		Assert.assertEquals(lista.get(0).getNome(), "Joao");
	}

	@Test
	public void testBuscarPorTipoNull() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Nome03", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "99995555", TipoContato.OUTROS));
		ArrayList<Contato> lista = (ArrayList<Contato>) repositorio.buscaPorTipo(null);
		Assert.assertEquals(lista, null);
	}

	@Test
	public void testBuscarPorIdTres() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Maria", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Nome04", "email", "99995555", TipoContato.OUTROS));
		Contato contato = (Contato) repositorio.buscaPorId(3);
		Assert.assertEquals(contato.getNome(), "Maria");
	}

	@Test
	public void testBuscarPorIdUm() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Maria", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Jose", "email", "99995555", TipoContato.OUTROS));
		Contato contato = (Contato) repositorio.buscaPorId(1);
		Assert.assertEquals(contato.getNome(), "Eduardo");
	}

	@Test
	public void testBuscarPorIdMaior() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Maria", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Jose", "email", "99995555", TipoContato.OUTROS));
		Contato contato = (Contato) repositorio.buscaPorId(10);
		Assert.assertEquals(contato, null);
	}

	@Test
	public void testBuscarPorIdNull() {
		repositorio.adicionar(new Contato(01, "Eduardo", "email", "99998888", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(02, "Joao", "email", "99997777", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(03, "Maria", "email", "99996666", TipoContato.TRABALHO));
		repositorio.adicionar(new Contato(04, "Jose", "email", "99995555", TipoContato.OUTROS));
		Contato contato = (Contato) repositorio.buscaPorId(null);
		Assert.assertEquals(contato, null);
	}

	@Test
	public void testRemoverTrue() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		boolean resultado = repositorio.remover(contato01);
		Assert.assertTrue(resultado);
	}

	@Test
	public void testRemoverNull() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		boolean resultado = repositorio.remover(null);
		Assert.assertFalse(resultado);
	}

	@Test
	public void testRemoverFalse() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		repositorio.adicionar(contato01);
		boolean resultado = repositorio.remover(new Contato());
		Assert.assertFalse(resultado);
	}

	@Test
	public void testHashCode() {
		Contato contato01 = new Contato(10, "Eduardo", "email", "telefone", TipoContato.AMIGO);
		Assert.assertEquals(contato01.hashCode(), 41);
	}

}
