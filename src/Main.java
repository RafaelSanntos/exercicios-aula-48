import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Exibir o array inicial
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.print("Array inicial: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Exercicio 1: Inverter o Array
        InverterArray inverterArray = new InverterArray();
        int[] vetorInvertido = inverterArray.inverter(vetor);
        System.out.print("Array invertido: ");
        for (int i : vetorInvertido) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Exercicio 2: Adicionar Elementos ao Array
        AdicionarElemento adicionarElemento = new AdicionarElemento();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista = adicionarElemento.adicionar(lista, 6);
        System.out.print("Array após adicionar elemento: ");
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Exercicio 3: Excluir Elementos do Array
        ExcluirElemento excluirElemento = new ExcluirElemento();
        lista = excluirElemento.excluir(lista, 1);
        System.out.print("Array após excluir elemento 2: ");
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Exercicio 4: Pesquisar Elementos no Array
        PesquisarElemento pesquisarElemento = new PesquisarElemento();
        int elementoParaPesquisar = 3;
        boolean encontrado = pesquisarElemento.pesquisar(lista, elementoParaPesquisar);
        if (encontrado) {
            System.out.println("Elemento " + elementoParaPesquisar + " encontrado na lista.");
        } else {
            System.out.println("Elemento " + elementoParaPesquisar + " não encontrado na lista.");
        }
    }
}
