package exercicios;

public class InsertSortDecresent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int troca, j;
		int vetor[] = {2, 6, 5, 4, 3};
		
		for (int i = 1; i <vetor.length; i++) {
			j = i;
			while (j >0 && vetor[j -1] < vetor[j]) {
				troca = vetor[i];
				vetor[j] = vetor[j -1];
				vetor[j -1] = troca;
				j--;
			}
		}
		
		
		for (int v : vetor) {
			System.out.println(v);
		}
		
		
	}

}
