
public class Cliente {
	
	private String endereco;
	private String nome;
	private String telFix;
	private String telCel;
	private int quant;
	private float valor;
	
	public Cliente(String endereco, String nome, String telFix, String telCel,
			int quant, float valor) {
		this.endereco = endereco;
		this.nome = nome;
		this.telFix = telFix;
		this.telCel = telCel;
		this.quant = quant;
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelFix() {
		return telFix;
	}

	public void setTelFix(String telFix) {
		this.telFix = telFix;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	} 
	
    public void calcula(){
    	float total = quant * valor;
    	System.out.println("o valor total é: "+total);
    }
    public void print(){
	}
}
