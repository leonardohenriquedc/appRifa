import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		System.out.println("Deseja lançar quantos nomes para sorteio: ");
		int numNomesSorteio = scan.nextInt();
		
		scan.nextLine();
		
		String[] names = new String[numNomesSorteio];
		
		for(int num = 0; num < numNomesSorteio; num++){
		
			System.out.println("Digite o nome da pessoa: (" + num + ")");
			String nome = scan.nextLine();
			
			names[num] = nome;
		}
		
		new WriterNames(names);
		
		new ReadNamesAndSort("./names/names.txt");
	
	}

}
