public class Cliente {

	private static int codigoGlobalClientes =1000;//global e estático cada vez que chamar na classe ele atribui 1 
	
	private String nome;
	private String sobreNome;
	private int codigo;
	private String cpf;
	private DadosCliente esp;
	

	public Cliente(String nome, String sobreNome,int codigo , String cpf,DadosCliente esp) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	    setCodigo(codigo);	    
		setCpf(cpf);
		this.esp = esp;
		
	}
	
	public Cliente(String nome, String sobreNome, String cpf, DadosCliente esp) {
	this(nome, sobreNome, codigoGlobalClientes++, cpf, esp);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	
	

	public int   getCodigo() {
		
		return codigo;
		
	}
	public void setCodigo(int codigo){
		if(codigo <2000){
			this.codigo = codigo;
		}else{
			this.codigo = 9999;
		}
	}

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() != 11) {
			if(cpf.length()<11)
			this.cpf = "Cpf inválido, está(ão) faltando "+(11-cpf.length())+ " digito(s) ";
			if(cpf.length()>11)
				this.cpf = "Cpf inválido,contém "+(cpf.length()-11)+ " digito(s) a mais ";
		} else {
			this.cpf = cpf;
		}
	}

	public DadosCliente getEsp() {
		return esp;

	}

	public boolean compararCliente(String cpf ) {
		if (!this.cpf.equals(cpf))
			return false;
		return true;
	}

	public void imprimir() {
		if(getCodigo() != 9999){
		System.out.println("Codigo: " + getCodigo());
		}else{
			System.out.println("Codigo: ERRO!!!!Range completo crie um novo!!!");
		}
		System.out.println("Nome: " + getNome() + " " + getSobreNome());
		
		if(cpf.length()==11){
		System.out.println("Cpf: " +getCpf().substring(0, 3)+"."+getCpf().substring(3,6)+"."+getCpf().substring(6, 9)+"-"+getCpf().substring(9,11));
		}else{
			System.out.println("Cpf: "+getCpf());
		}
		System.out.println("Telefone fixo: "+getEsp().getTelFix() );
		System.out.println("Telefone Celular: " + getEsp().getTelCel());
		System.out.println("Endereço: " + getEsp().getEndereco());
		System.out.println("Cep: " +getEsp().getCep());
		System.out.println("Email: " + getEsp().getEmail());

	}
	
}