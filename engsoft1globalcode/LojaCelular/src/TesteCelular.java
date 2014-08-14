import java.util.List;

public class TesteCelular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Loja cel = new Loja();
		cel.addCelular(new Celular(450, "Vermelho", So.ANDORID,new Especificacao(Marca.ERICSSON, "XYZ")));
		cel.addCelular(new Celular(500, "Rosa", So.WINDOWNS_PHONE,new Especificacao(Marca.LG, "DVQ")));
		cel.addCelular(new Celular(1250, "Preto", So.IOS, new Especificacao(Marca.APPLE, "IOX")));
		cel.addCelular(new Celular(280, "Preto", So.ANDORID, new Especificacao(Marca.MOTOROLA, "EX115")));
		cel.addCelular(new Celular(280, "Amarelo", So.WINDOWNS_PHONE, new Especificacao(Marca.MOTOROLA, "EX115")));
		

		List<Celular> encontrado = cel.buscarCelular(new Especificacao(Marca.STI, "XYZ"));

		if (!encontrado.isEmpty()) {
			System.out.println("Foram encontrados " + encontrado.size()
					+ " celulares:");
			for (Object i : encontrado) {
				Celular celular = (Celular) i;
				celular.imprimir();
				System.out.println("#################");
			}
		} else {
			System.out.println("Não foi encontrado nenhum celular");
			System.out.println("#################");
		}
		List encontrado1 = cel.buscarCelular(new Especificacao(Marca.ERICSSON,"XYZ"));

		if (!encontrado1.isEmpty()) {
			System.out.println("Foi encontrado " + encontrado1.size()+ " celular:");
			for (Object i : encontrado1) {
				Celular celular = (Celular) i;
				celular.imprimir();
				System.out.println("#################");
			}
		} else {
			System.out.println("Não foi encontrado nenhum celular");
			System.out.println("#################");
		}
		List encontrado2 = cel.buscarCelular(new Especificacao(Marca.ERICSSON,"WYZ"));

		if (!encontrado2.isEmpty()) {
			System.out.println("Foram encontrados " + encontrado2.size()+ " celulares:");
			for (Object i : encontrado2) {
				Celular celular = (Celular) i;
				celular.imprimir();
				System.out.println("#################");
			}
		} else {
			System.out.println("Não foi encontrado nenhum celular");
			System.out.println("#################");
		}
		List encontrado3 = cel.buscarCelular(new Especificacao(Marca.LG, "WYZ"));

		if (!encontrado3.isEmpty()) {
			System.out.println("Foram encontrados " + encontrado3.size()
					+ " celulares:");
			for (Object i : encontrado3) {
				Celular celular = (Celular) i;
				celular.imprimir();
				System.out.println("#################");
			}
		} else {
			System.out.println("Não foi encontrado nenhum celular");
			System.out.println("#################");
		}
		List encontrado4 = cel.buscarCelular(new Especificacao(Marca.MOTOROLA, "EX115"));

		if (!encontrado4.isEmpty()) {
			System.out.println("Foram encontrados " + encontrado4.size()
					+ " celulares:");
			for (Object i : encontrado4) {
				Celular celular = (Celular) i;
				celular.imprimir();
				System.out.println("#################");
			}
		} else {
			System.out.println("Não foi encontrado nenhum celular");
			System.out.println("#################");
		}
	}

}
