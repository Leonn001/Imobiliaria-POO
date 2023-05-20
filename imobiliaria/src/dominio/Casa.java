package dominio;

public class Casa extends Imovel {
	private float areaTerreno;
	private float areaConstrida;
	
	public Casa(String endereco, String bairro, float valor, float areaTerreno, float areaConstrida) {
		super(endereco, bairro, valor);
		this.areaTerreno = areaTerreno;
		this.areaConstrida = areaConstrida;
	}
	public float getAreaTerreno() {
		return areaTerreno;
	}
	public void setAreaTerreno(float areaTerreno) {
		this.areaTerreno = areaTerreno;
	}
	public float getAreaConstrida() {
		return areaConstrida;
	}
	public void setAreaConstrida(float areaConstrida) {
		this.areaConstrida = areaConstrida;
	}
	@Override
	public float calcularImposto() {
		float imposto;
		imposto = (220 * this.areaConstrida) + (5 * this.getAreaConstrida());
		return imposto;
	}
	@Override
	public String toString() {
		return "Casa [areaTerreno=" + areaTerreno + ", areaConstrida=" + areaConstrida + "]";
	}
	
	
}
