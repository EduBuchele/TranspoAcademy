package br.com.cursojava.exercicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import aula29.BancoUtils;
import aula29.Pessoa;

public class ContatoDAO implements RepositorioContato {

	@Override
	public List<Contato> buscarTodos() {
		List<Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos");
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possivel carregar a lista de Contatos");
		}
		return contatos;
	}

	private Contato carregarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");

		return new Contato(id, nome, email, telefone);
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatos = new ArrayList<>();
		if (nome != null && !nome.isEmpty()) {

			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("select * from contatos where upper(nome) like upper(?)");
				comando.setString(1, "%" + nome + "%");
				ResultSet cursor = comando.executeQuery();
				while (cursor.next()) {
					contatos.add(carregarContato(cursor));
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o contato solicitado");
			}
		}
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		Contato contato = null;
		if (telefone != null && !telefone.isEmpty()) {

			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where telefone = ?");
				comando.setString(1, telefone);
				ResultSet cursor = comando.executeQuery();
				if (cursor.next()) {
					contato = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o contato solicitado");
			}
		}
		return contato;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		if (id != null) {

			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where id = ?");
				comando.setInt(1, id);
				ResultSet cursor = comando.executeQuery();
				if (cursor.next()) {
					contato = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o contato solicitado");
			}
		}
		return contato;
	}

	@Override
	public void inserir(Contato contato) {
		if (contato != null) {
			try {
				Connection conexao = new BancoUtils().getConnection();
				PreparedStatement comando = conexao.prepareStatement(
						"insert into contatos(nome, email, telefone) values (?, ?, ?)",
						Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if (cursor.next()) {
					Integer id = cursor.getInt("id");
					contato.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel inserir o Contato");
				e.printStackTrace();
			}
		}

	}

	@Override
	public void atualizar(Contato contato) {
		if (contato != null && contato.getId() != null) {
			try {
				Connection conexao = new BancoUtils().getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("update contatos set nome = ?, email = ?, telefone = ? where id = ?");
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.setInt(4, contato.getId());
				comando.executeUpdate();

				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível atualizar o cadastro.");
				e.printStackTrace();
			}
		}
	}

	@Override
	public void remover(Integer id) {
		if (id != null) {
			Connection conexao;
			try {
				conexao = new BancoUtils().getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from contatos where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel remover o Contato");
			}

		}

	}

	@Override
	public int contar() {
//		int tamanho = buscarTodos().size();
//		return tamanho;
		int quantidade = 0;
		try {
			Connection conexao = new BancoUtils().getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count(*) as quantidade from contatos");
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		} catch (Exception e) {
			System.out.println("Não foi possivel contar a quantidade de contatos");
		}
		return quantidade;
	}

}
