package dominio;

public class Apartamento extends Imovel {
	private float AreaFracaoIdeal;
	private float areaPrivativa;
	
	
	public Apartamento(String endereco, String bairro, float valor, float areaFracaoIdeal,
			float areaPrivativa) {
		super(endereco, bairro, valor);
		this.AreaFracaoIdeal = areaFracaoIdeal;
		this.areaPrivativa = areaPrivativa;
	}
	public float getAreaFracaoIdeal() {
		return AreaFracaoIdeal;
	}
	public void setAreaFracaoIdeal(float areaFracaoIdeal) {
		AreaFracaoIdeal = areaFracaoIdeal;
	}
	public float getAreaPrivativa() {
		return areaPrivativa;
	}
	public void setAreaPrivativa(float areaPrivativa) {
		this.areaPrivativa = areaPrivativa;
	}
	@Override
	public float calcularImposto() {
		float imposto;
		imposto = (130 * this.areaPrivativa) + (40 * this.AreaFracaoIdeal);
		return imposto;
	}
	@Override
	public String toString() {
		return "Apartamento [AreaFracaoIdeal=" + AreaFracaoIdeal + ", areaPrivativa=" + areaPrivativa + "]";
	}
	
}
