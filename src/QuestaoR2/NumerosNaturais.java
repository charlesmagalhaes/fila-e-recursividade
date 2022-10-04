package QuestaoR2;

public class NumerosNaturais {
	private int n;

	public NumerosNaturais(int n) {
		this.n = n;
	}

	public NumerosNaturais() {
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void exibirNumNaturais(int n) {
		
		if (n > 0) {
			exibirNumNaturais(n-1);
		}
		System.out.println(n);
		
	}
	
	
	
	
}
