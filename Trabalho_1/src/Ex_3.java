import java.util.*;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int alunos;
		System.out.println("Informe o número de estudantes:");
		alunos = in.nextInt();
		int aux;
		aux = 0;
		int nota;
		nota = 0;
		
		String [] gabarito = new String [10];
		String [] respostas = new String [10];
		int[]notas = new int[alunos];
		Random rng = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe a resposta da questão "+(i+1)+": ");
			gabarito[i] = in.next();
		}
		System.out.println("\t\tQ1\tQ2\tQ3\tQ4\tQ5\tQ6\tQ7\tQ8\tQ9\tQ10");
		for(int w = 0; w < alunos; w++) {
			System.out.print("Aluno: "+ (w+1) + "\t");
			for(int i = 0; i < 10; i++) {
				aux = rng.nextInt(5);
				switch(aux) {
					case 0:
						respostas[i] = "a";
						break;
					case 1:
						respostas[i] = "b";
						break;
					case 2:
						respostas[i] = "c";
						break;
					case 3:
						respostas[i] = "d";
						break;
					case 4:
						respostas[i] = "e";
						break;}
				System.out.print(respostas[i]+"\t");

			}
			for(int h = 0; h < 10; h++) {
				if(respostas[h].equals(gabarito[h])) {
					nota++;
					}
		}
			notas[w] = nota;
			System.out.println();
			nota = 0;
		}
		
		System.out.println();
		
		for(int i = 0; i < alunos; i++) {
			if(notas[i] > 7) {
				System.out.println("Aluno: "+(i+1)+" / Nota: "+ notas[i]+" / Status: APROVADO ;)");
			}else {
				System.out.println("Aluno: "+(i+1)+" / Nota: "+ notas[i]+" / Status: Reprovado :(");
			}
		}
	}
}