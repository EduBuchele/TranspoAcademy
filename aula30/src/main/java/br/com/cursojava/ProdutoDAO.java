package br.com.cursojava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements RepositorioProduto{

	@Override
	public List<Produto> buscarTodos() {
		List<Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from \"Produtos\" order by id");
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produtos.add(carregarProduto(cursor));
			}
			cursor.close();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possivel carregar a lista de Contatos");
		}
		return produtos;
	}

	private Produto carregarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		double preco = cursor.getDouble("preco");
		return new Produto(id, nome, preco);		
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		List<Produto> produtos = new ArrayList<>();
		if (nome != null && !nome.isEmpty()) {

			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("select * from \"Produtos\" where upper(nome) like upper(?)");
				comando.setString(1, "%" + nome + "%");
				ResultSet cursor = comando.executeQuery();
				while (cursor.next()) {
					produtos.add(carregarProduto(cursor));
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o produto solicitado");
			}
		}
		return produtos;
	}

	@Override
	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		List<Produto> produtos = new ArrayList<>();
				try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("select * from \"Produtos\" where preco >= ? and preco <= ? ");
				comando.setDouble(1, minimo);
				comando.setDouble(2, maximo);
				ResultSet cursor = comando.executeQuery();
				while (cursor.next()) {
					produtos.add(carregarProduto(cursor));
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o produto solicitado");
			
		}
		return produtos;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		if (id != null) {

			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from \"Produtos\" where id = ?");
				comando.setInt(1, id);
				ResultSet cursor = comando.executeQuery();
				if (cursor.next()) {
					produto = carregarProduto(cursor);
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possivel encontrar o produto solicitado");
			}
		}
		return produto;
	}

	@Override
	public void inserir(Produto produto) {
		if (produto != null) {
			try {
				Connection conexao = new BancoUtils().getConnection();
				PreparedStatement comando = conexao.prepareStatement(
						"insert into \"Produtos\"(nome, preco) values (?, ?)",
						Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if (cursor.next()) {
					Integer id = cursor.getInt("id");
					produto.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel inserir o Produto");
				e.printStackTrace();
			}
		}

		
	}

	@Override
	public void atualizar(Produto produto) {
		if (produto != null && produto.getId() != null) {
			try {
				Connection conexao = new BancoUtils().getConnection();
				PreparedStatement comando = conexao
						.prepareStatement("update \"Produtos\" set nome = ?, preco = ? where id = ?");
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.setInt(3, produto.getId());
				comando.executeUpdate();

				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível atualizar o Produto.");
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
				PreparedStatement comando = conexao.prepareStatement("delete from \"Produtos\" where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possivel remover o Produto");
			}

		}

		
	}

	@Override
	public int contar() {
		int quantidade = 0;
		try {
			Connection conexao = new BancoUtils().getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count(*) as quantidade from \"Produtos\"");
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
