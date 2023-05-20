package excecoes;

public class ValorImovelInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ValorImovelInvalidoException(String mensagem) {
	      super(mensagem);
	   }
	
	public ValorImovelInvalidoException(String message, Exception e) {
		super(message, e);
	}

}
