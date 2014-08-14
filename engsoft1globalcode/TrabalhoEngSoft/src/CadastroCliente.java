import java.util.List;

import java.util.LinkedList;

public class CadastroCliente {

	private List<Cliente> clientes;

	public CadastroCliente() {
		clientes = new LinkedList<Cliente>();
	}

	public void addCliente(Cliente cliente) {

		this.clientes.add(cliente);
	}

	public List<Cliente> listarClientes() {
		List<Cliente> lista = new LinkedList<Cliente>();
		for (Object i : clientes) {
			Cliente clienteCadastrado = (Cliente) i;
			lista.add(clienteCadastrado);

		}
		return lista;

	}

	public Cliente buscarCliente(String locCpf) {
		
		for (Object i : clientes) {
			Cliente cadastrado = (Cliente) i;
			if (cadastrado.getCpf().equals(locCpf))
				return cadastrado;
		}
		return null;
	}

	  public List  <Cliente> excluirCliente(String cpf){
		List <Cliente>lista = new  LinkedList<Cliente>();
		for (Object i : clientes){	
			Cliente loc = (Cliente) i;
			if(loc.compararCliente(cpf)==false)lista.add(loc) ;
				
		}
		return lista;
	
		}	
	}
	

