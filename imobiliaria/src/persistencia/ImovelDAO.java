package persistencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import dominio.Apartamento;
import dominio.Casa;
import dominio.Imovel;

public class ImovelDAO {
	
    private static CasaDAO casaDAO;
    private static ApartamentoDAO apartamentoDAO;
    
    public ImovelDAO() {
        casaDAO = new CasaDAO();
        apartamentoDAO = new ApartamentoDAO();
    }
    
    public static void cadastrarCasa(Casa casa) {
        casaDAO.cadastrar(casa);
    }
    
    public static void cadastrarApartamento(Apartamento apartamento) {
        apartamentoDAO.cadastrar(apartamento);
    }
    
    public static List<Imovel> listarImoveisPorCodigo() {
        List<Imovel> imoveis = new ArrayList<>();
        
        imoveis.addAll(casaDAO.listarPorCodigo());
        imoveis.addAll(apartamentoDAO.listarPorCodigo());
        
        return imoveis;
    }
    
    public static List<Imovel> listarPorBairroValor() {
        List<Imovel> imoveis = new ArrayList<>();
        List<String> bairros = new ArrayList<>();
        // Adiciona os bairros existentes na lista de bairros
        for (Imovel imovel : imoveis) {
            if (!bairros.contains(imovel.getBairro())) {
                bairros.add(imovel.getBairro());
            }
        }
        // Ordena a lista de bairros em ordem alfabética
        Collections.sort(bairros);
        // Para cada bairro, adiciona os imóveis na lista de imóveis, ordenados por valor
        for (String bairro : bairros) {
            List<Imovel> imoveisPorBairro = new ArrayList<>();
            for (Imovel imovel : imoveis) {
                if (imovel.getBairro().equals(bairro)) {
                    imoveisPorBairro.add(imovel);
                }
            }
            Collections.sort(imoveisPorBairro, new Comparator<Imovel>() {
                @Override
                public int compare(Imovel i1, Imovel i2) {
                    return Float.compare(i1.getValor(), i2.getValor());
                }
            });
            imoveis.addAll(imoveisPorBairro);
        }
        return imoveis;
    }
}
