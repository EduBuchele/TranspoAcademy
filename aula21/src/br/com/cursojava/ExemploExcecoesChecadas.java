package br.com.cursojava;

public class ExemploExcecoesChecadas {

	public static void main(String[] args) {

		boolean ok = usaImprimirRange();
		if (ok) {
			System.out.println("Range impresso com sucesso");
		} else {
			System.out.println("Não consegui imprimir o range");
		}
		// imprimirRange(10, 20);
	}

	private static boolean usaImprimirRange() {
		boolean ok = true;
		int inicio = 1;
		int fim = 5;
		try {
			imprimirRange(fim, inicio);
			return ok;
		} catch (RangeInvalidoException e) {
			System.out.println(e.getMessage());
			ok = false;
			return ok;
			// throw new RuntimeException(e);
		} finally {
			System.out.println("Estou executando sempre!!");
		}

	}

	private static void imprimirRange(int inicio, int fim) throws RangeInvalidoException {
		if (fim <= inicio) {
			throw new RangeInvalidoException("Fim deve ser maior que Inicio");
		} else {
			for (int i = inicio; i <= fim; i++) {
				System.out.printf("%d ", i);
			}
			System.out.println("");
		}
	}
}
