import java.io.OutputStream;

import java.io.FileOutputStream;

import java.io.OutputStreamWriter;

import java.io.BufferedWriter;

import java.io.IOException;

import java.util.ArrayList;

public class WriterNames {

	private OutputStream initFile;
	
	private OutputStreamWriter os;
	
	private BufferedWriter writerFile;
	
	private String caminho;
	
	private ArrayList<String> nomes = new ArrayList<>();
	
	public WriterNames (String[] names, String caminho){
	
		try{
		
			this.caminho = caminho;
		
			initFile = new FileOutputStream(caminho, true);
			
			os = new OutputStreamWriter(initFile);
			
			writerFile = new BufferedWriter(os);
			
			for(String n : names){
			
				nomes.add(n);
			
			}
			
			escreverArquivos();
		
		}catch(IOException e){
		
			System.out.println("Deu pra iniciar não paizão");
			
		}
	
	}
	
	public WriterNames(String[] names){
	
		try{
		
			this.caminho = "./names/names.txt";
		
			initFile = new FileOutputStream(caminho, true);
			
			os = new OutputStreamWriter(initFile);
			
			writerFile = new BufferedWriter(os);
			
			for(String n : names){
			
				nomes.add(n);
			
			}
			
			escreverArquivos();
		
		}catch(IOException e){
		
			System.out.println("Deu pra iniciar não paizão");
			
		}
	
	}
	
	public void escreverArquivos(){

		try{
		
			for(String n : nomes){
			
				writerFile.write(n);
				
				writerFile.newLine();
			
			}
			
			writerFile.flush();
		
		}catch(IOException e){
		
			System.out.println("Deu pra escrever não paizão");
		
		}finally{
		
			try{
			
				writerFile.close();
			
			}catch(IOException e){
			
				System.out.println("Não deu para fechar arquivo");
			
			}
		
		}	
	
	}

}
