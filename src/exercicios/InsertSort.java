package exercicios;

public class InsertSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int troca, j;
		int vetor[] = {2, 6, 5, 4, 3};
		
		for (int i = 1; i <vetor.length; i++) {
			troca = vetor[i];
			j = i -1;
			while (j >=0 && vetor[j] > troca) {
				vetor[j + 1] = vetor[j];
				j += -1;
			}
			vetor[j + 1] = troca;
		}
		
		
		for (int v : vetor) {
			System.out.println(v);
		}
		
		
	}


}
