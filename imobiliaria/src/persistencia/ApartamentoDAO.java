package persistencia;
import dominio.Apartamento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApartamentoDAO {
	
    private static List<Apartamento> apartamentos = new ArrayList<>();
    
    public void cadastrar(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }
   
    public List<Apartamento> listarPorCodigo() {
        Collections.sort(apartamentos, Comparator.comparing(Apartamento::getCodigo));
        return apartamentos;
    }
    
    public List<Apartamento> listarPorBairroValor() {
        Collections.sort(apartamentos, Comparator.comparing(Apartamento::getBairro).thenComparing(Apartamento::getValor));
        return apartamentos;
    }
}
