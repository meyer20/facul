package exercicios;

public class insertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int troca, j;
		int vetor[] = {2, 6, 5, 4, 3};

		System.out.println("Inicio do primeiro laço");
		System.out.println("Inicio loop");
		for (int i = 1; i <vetor.length; i++) {
			troca = vetor[i];
			j = i -1;
			System.out.println("Inicio loop (while) com comparação");
			while (j >=0 && vetor[j] > troca) {
				System.out.println("troca");
				vetor[j + 1] = vetor[j];
				j += -1;
				System.out.println("fim loop - Fecha o ciclo atual do while");
			}
			System.out.println("troca");
			vetor[j + 1] = troca;
			System.out.println("fim loop");
		}
		
		
		for (int v : vetor) {
			System.out.println(v);
		}
	}
}
