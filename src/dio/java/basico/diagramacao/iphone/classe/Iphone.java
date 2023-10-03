package dio.java.basico.diagramacao.iphone.classe;

import dio.java.basico.diagramacao.iphone.interfaces.Telefone;
import dio.java.basico.diagramacao.iphone.interfaces.Musica;
import dio.java.basico.diagramacao.iphone.interfaces.Navegador;

public class Iphone implements Musica, Navegador, Telefone{

	@Override
	public String ligar(int numero) {
		return "Ligando para "+numero;
	}

	@Override
	public String atender() {
		return "Ligação eceita.";
	}

	@Override
	public String iniciarCorreioVoz() {
		return "Correio de  voz iniciado";
	}

	@Override
	public String exibirPaguina(String url) {
		return "Bem vindo a " + url; 
	}

	@Override
	public String adicionarNovaAba() {
		return "Nova Aba aberta";	
	}

	@Override
	public String atualizar() {
		return "Atualizando a paguina";
	}

	@Override
	public String tocar(String album) {
		return "Tocando : " + album;
	}

	@Override
	public String pausar() {
		return "A musisca  está PAUSADA.";
	}

	@Override
	public String selecionarMusica(String selecionarMusica) {
		return "Tocando agora " +  selecionarMusica;
	}

}
