package dio.java.basica.diagramacao.main;

import dio.java.basico.diagramacao.iphone.classe.Iphone;

public class Main {
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		System.out.println(iphone.ligar(37628181));
		
		System.out.println(iphone.adicionarNovaAba());
		System.out.println(iphone.exibirPaguina("www.google.com.br"));
		
		System.out.println(iphone.tocar("Iron Mainden - Iron Mainden"));
		System.out.println(iphone.selecionarMusica("The Trooper"));
		
	}
}
