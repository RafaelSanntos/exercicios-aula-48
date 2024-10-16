import java.util.ArrayList;

public class ExcluirElemento {
    public ArrayList<Integer> excluir(ArrayList<Integer> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        }
        return lista;
    }
}
