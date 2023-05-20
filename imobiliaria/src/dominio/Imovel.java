package dominio;
import excecoes.ValorImovelInvalidoException;

public abstract class Imovel {
    private static int ultimoCodigo = 0;
	private int codigo;
	private String endereco;
	private String bairro;
	private float valor;
	
	public Imovel(String endereco, String bairro, float valor) {
		this.codigo = gerarCodigo();
		this.endereco = endereco;
		this.bairro = bairro;
		this.valor = valor;
	}
    private static int gerarCodigo() {
        ultimoCodigo++;
        return ultimoCodigo;
    }
	public int getCodigo() {
		return codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
	    try {
	        if (valor <= 0) {
	            throw new ValorImovelInvalidoException("O valor do imóvel deve ser maior que zero.");
	        }
	        this.valor = valor;
	    } catch (ValorImovelInvalidoException e) {
	        System.out.println("Erro ao definir o valor do imóvel: " + e.getMessage());
	    }
	}
	
	public abstract float calcularImposto();

	@Override
	public String toString() {
		return "Imovel [codigo=" + codigo + ", endereco=" + endereco + ", bairro=" + bairro + ", valor=" + valor + "]";
	}
	
}
