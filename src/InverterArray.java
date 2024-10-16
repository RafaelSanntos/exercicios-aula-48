public class InverterArray {
    public int[] inverter(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }
        return vetor;
    }
}
