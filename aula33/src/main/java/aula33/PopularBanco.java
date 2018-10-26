package aula33;

import java.util.List;

public class PopularBanco {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco(null, "Rua XV de Novembro", "155");
		Endereco e2 = new Endereco(null, "Rua XV de Novembro", "344");
		Endereco e3 = new Endereco(null, "Rua XV de Novembro", "1845");
		Endereco e4 = new Endereco(null, "Rua 7 de Setembro", "1");
		Endereco e5 = new Endereco(null, "Avenida Castelo Branco", "3254");
		Endereco e6 = new Endereco(null, "Rua João Pessoa", "21");
		
		EnderecoDAO daoEnd = new EnderecoDAO();
//		daoEnd.inserir(e1);
//		daoEnd.inserir(e2);
//		daoEnd.inserir(e3);
//		daoEnd.inserir(e4);
//		daoEnd.inserir(e5);
//		daoEnd.inserir(e6);
		
		
		Funcionario f1 = new Funcionario(null, "Jhon American", new Endereco(null, "Rua João Pessoa", "21"));
//		Funcionario f2 = new Funcionario(null, "Tiburcio Soarez", daoEnd.buscarPorId(2));
//		Funcionario f3 = new Funcionario(null, "Maria da Silva", daoEnd.buscarPorId(3));
//		Funcionario f4 = new Funcionario(null, "Eva Argentina", daoEnd.buscarPorId(4));
//		Funcionario f5 = new Funcionario(null, "Tiago Medeiro", daoEnd.buscarPorId(5));
//		Funcionario f6 = new Funcionario(null, "Joana Alves", daoEnd.buscarPorId(6));
		
		FuncionarioDAO daoFun = new FuncionarioDAO();
//		daoFun.inserir(f1);
//		daoFun.inserir(f2);
//		daoFun.inserir(f3);
//		daoFun.inserir(f4);
//		daoFun.inserir(f5);
//		daoFun.inserir(f6);
		
		List<Funcionario> list = daoFun.buscarTodos();
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
			
		}
		
		
		
	}
	
}
