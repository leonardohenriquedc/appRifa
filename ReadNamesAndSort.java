import java.io.InputStream;

import java.io.FileInputStream;

import java.io.InputStreamReader;

import java.io.BufferedReader;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import java.util.Random;

public class ReadNamesAndSort{

	private InputStream initFile;
	
	private InputStreamReader isr;
	
	private BufferedReader readFile;
	
	private Map<Integer, String> names = new HashMap<>();
	
	public ReadNamesAndSort(String caminho){
	
		try{
		
			initFile = new FileInputStream(caminho);
			
			isr = new InputStreamReader(initFile);
			
			readFile = new BufferedReader(isr);
			
			lerArquivo();
		
		}catch(IOException e){
		
			System.out.println("Deu pra iniciar não paizão");
			
		}
	
	}
	
	public void lerArquivo(){
	
		try{
		
			String lines = readFile.readLine();
			
			Random random = new Random();
			
			int num = 0;
		
			while(lines != null){
			
				System.out.println("Nome: " + lines);
				
				names.put(num, lines);
				
				num++;
								
				lines = readFile.readLine();
			
			}
			
			int numSorteado = random.nextInt(num);
						
			
			System.out.println("Pessoa sorteada é: " + names.get(numSorteado));
		
		}catch(IOException e){
		
			System.out.println("Deu pra ler não paizão");
			
		}finally{
		
			try{
			
				readFile.close();
			
			}catch(IOException e){
			
				System.out.println("Não deu para fechar arquivo");
			
			}
		
		}
	
	}

}
