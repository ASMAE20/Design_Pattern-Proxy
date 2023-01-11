package pres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import metier.IMetier;
import proxy.Proxy;

public class Client {
	
		private IMetier metier;
		
		public Client() {
			try {
				BufferedReader br=new BufferedReader(new FileReader(new File("config.txt")));
	            String className=br.readLine();
	            metier=(IMetier) Class.forName(className).newInstance();
	            System.out.println(metier.calcul());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//Pattern Decoratore
			
		}
		public static void main(String[] args) {
			new Client();
			
		}

}