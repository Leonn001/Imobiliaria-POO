package tui;

public enum OpcaoMenuEnum {
	
	CADASTRAR_CASA(1, "Cadastrar casa"),
	
	CADASTRAR_APARTAMENTO(2, "Cadastrar apartamento"),
	
	EXIBIR_IMOVEIS_CODIGO(3, "Exibir imoveis por codigo"),
	
	EXIBIR_IMOVEIS_BAIRRO_VALOR(3, "Exibir os imoveis por bairro e valor"),
	
	SAIR(9, "Sair");
	
	private Integer codigo;

	private String descricao;

	private OpcaoMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String obterDescricaoCompleta() {
		return codigo + " - " + descricao;
	}

	public static OpcaoMenuEnum valueOfInteger(Integer opcaoInteger) {
		for (OpcaoMenuEnum opcaoMenu : values()) {
			if (opcaoMenu.codigo.equals(opcaoInteger)) {
				return opcaoMenu;
			}
		}
		return null;
	}

}
