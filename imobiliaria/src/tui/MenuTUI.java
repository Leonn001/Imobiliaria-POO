package tui;

public class MenuTUI {

	public static void executar() {
		OpcaoMenuEnum opcaoSelecionada = null;
		do {
			try {
				exibirOpcoes();
				opcaoSelecionada = obterOpcaoSelecionada();
				executarOpcao(opcaoSelecionada);
			} catch (Exception e) {
				System.out.println("Algo de errado. Entre em contato com o suporte, informando erro 0134. (Erro="
						+ e.getClass() + ")");
			}
		} while (opcaoSelecionada == null || !opcaoSelecionada.equals(OpcaoMenuEnum.SAIR));
	}

	private static void executarOpcao(OpcaoMenuEnum opcaoSelecionada) {
		switch (opcaoSelecionada) {
		case CADASTRAR_CASA:
			ImovelTUI.cadastrarCasa();
			break;
		case CADASTRAR_APARTAMENTO:
			ImovelTUI.cadastrarApartamento();
			break;
		case EXIBIR_IMOVEIS_CODIGO:
			ImovelTUI.exibirImoveisPorCodigo();
			break;
		case EXIBIR_IMOVEIS_BAIRRO_VALOR:
			ImovelTUI.exibirImoveisPorBairroValor();
			break;
		case SAIR:
			System.out.println("Bye...");
			break;
		default:
			System.out.println("Opção não válida.");
			break;
		}
	}

	private static OpcaoMenuEnum obterOpcaoSelecionada() {
		Integer opcaoInt = UtilTUI.obterInteger("Informe a opção desejada:");
		return OpcaoMenuEnum.valueOfInteger(opcaoInt);
	}

	private static void exibirOpcoes() {
		System.out.println("\n\n############ MENU ############");
		for (OpcaoMenuEnum opcaoMenu : OpcaoMenuEnum.values()) {
			System.out.println(opcaoMenu.obterDescricaoCompleta());
		}
	}

}

