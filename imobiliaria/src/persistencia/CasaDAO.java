package persistencia;
import dominio.Casa;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CasaDAO {
	private static List<Casa> casas = new ArrayList<>();
	
	public void cadastrar(Casa casa) {
		casas.add(casa);
	}
	
    public List<Casa> listarPorCodigo() {
        Collections.sort(casas, Comparator.comparing(Casa::getCodigo));
        return casas;
    }
    
    public List<Casa> listarPorBairroValor() {
        Collections.sort(casas, Comparator.comparing(Casa::getBairro).thenComparing(Casa::getValor));
        return casas;
    }
}
