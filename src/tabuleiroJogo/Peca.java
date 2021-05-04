package tabuleiroJogo;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; 		//inicia com o valor nulo
	}

	protected Tabuleiro getTabuleiro() { //somente classes dentro do mesmo pacote e subclasses poder�o acessar o tabuleiro de um pe�a;
		return tabuleiro;
	}

	
	

}
