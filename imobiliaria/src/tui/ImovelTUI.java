package tui;
import java.util.List;
import dominio.Apartamento;
import dominio.Imovel;
import dominio.Casa;
import persistencia.ImovelDAO;

public class ImovelTUI {

	private static final Integer SIM = 1;

	public static void cadastrarCasa() {
		System.out.println("############ INCLUSÃO DE CASAS ############");

		Integer resposta = SIM;

		do {
			
			String endereco = UtilTUI.obterString("Informe o endereco:");
			String bairro = UtilTUI.obterString("Informe o bairro:");
			float valor = UtilTUI.obterFloat("Informe o valor:");
			float areaTerreno = UtilTUI.obterFloat("Informe a area do terreno:");
			float areaConstrida = UtilTUI.obterFloat("Informe a area construida:");
			
			Casa casa = new Casa(endereco,bairro,valor,areaTerreno,areaConstrida);
			
			try {
				ImovelDAO.cadastrarCasa(casa);
				System.out.println("Inclusão feita com sucesso.");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (resposta == SIM);

	}
	
	public static void cadastrarApartamento() {
		System.out.println("############ INCLUSÃO DE APARTAMENTOS ############");

		Integer resposta = SIM;

		do {
			
			String endereco = UtilTUI.obterString("Informe o endereco:");
			String bairro = UtilTUI.obterString("Informe o bairro:");
			float valor = UtilTUI.obterFloat("Informe o valor:");
			float areaFracaoIdeal = UtilTUI.obterFloat("Informe a area da fracao ideal:");
			float areaPrivativa = UtilTUI.obterFloat("Informe a area privativa:");
			
			Apartamento apartamento = new Apartamento(endereco,bairro,valor,areaFracaoIdeal,areaPrivativa);
			
			try {
				ImovelDAO.cadastrarApartamento(apartamento);
				System.out.println("Inclusão feita com sucesso.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (resposta == SIM);

	}
	
	public static void exibirImoveisPorCodigo() {
		System.out.println("############ LISTAGEM DE IMÓVEIS POR CÓDIGO ############");
	    List<Imovel> imoveis = ImovelDAO.listarImoveisPorCodigo();
	    if (imoveis.isEmpty()) {
	        System.out.println("Não há imóveis cadastrados.");
	    } else {
	        for (Imovel imovel : imoveis) {
	            System.out.println(imovel.toString());
	        }
	    }
	}
	
	public static void exibirImoveisPorBairroValor() {
		System.out.println("############ LISTAGEM DE IMÓVEIS POR BAIRRO E VALOR ############");
	    List<Imovel> imoveis = ImovelDAO.listarPorBairroValor();
	    if (imoveis.isEmpty()) {
	        System.out.println("Não há imóveis cadastrados.");
	    } else {
	        for (Imovel imovel : imoveis) {
	            System.out.println(imovel.toString());
	        }
	    }
	}

}

