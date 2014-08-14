import java.util.List;


public class TesteCliente {

	public static void main(String[] args) {
		
		

		CadastroCliente clienteCad = new CadastroCliente();
		clienteCad.addCliente(new Cliente("Anderson", "Silva","28217500031", new DadosCliente("1236530000", "1288240000","anderson@gmail.com", " AV Roberval ,423", "12289423")));
		clienteCad.addCliente(new Cliente("Jeffrey", "Toledo","28217500032", new DadosCliente("1236530001", "1288240011","jf@gmail.com", " AV Brasil ,1200", "12289444")));
		clienteCad.addCliente(new Cliente("Maria", "Luciana ","35417600033", new DadosCliente("1236520002", "1288230001","marilu@gmail.com", " AV Esperança ,234 ", "12289000")));
		clienteCad.addCliente(new Cliente("Mauro", "Shin","35000000000",new DadosCliente("1236533424", "1223242424", "mshin@gmail.com"," AV Coréia ,24", "12000000")));
        clienteCad.addCliente(new Cliente("Vitória","Bretas","35000000001",new DadosCliente("1236530002","1297076679","vitbreta@hotmail.com"," Rua 9 de julho,155","12289001")));
        clienteCad.addCliente(new Cliente("Carolina","Pinto","28177900123",new DadosCliente("1236532425","1297074579","carPinto@hotmail.com"," Rua 9 de julho,396","12289001")));
        clienteCad.addCliente(new Cliente("Reynaldo","Albuquerque","28217634531",new DadosCliente("1136535401","1197073450","reyalb@hotmail.com"," Rua Yone Moutinho,155","12289111")));
       
        
        List<Cliente> listarCliente = clienteCad.listarClientes();
        
        
		
		Cliente encontrado = clienteCad.buscarCliente("35000000001");
		Cliente nencontrado = clienteCad.buscarCliente("28217500033");
		List<Cliente> excluido =  clienteCad.excluirCliente("28217500032");
        
		 
		
		
		//TRUE//////////////////////////////////////////////////////////////////
		
		if(encontrado!=null){
			System.out.println("Cliente Localizado: ");
			encontrado.imprimir();
			System.out.println("================================");
		}else{
			System.out.println("Cleinte não cadastrado");
		}
		
		//FALSE///////////////////////////////////////////////////////////////////
		
		if(nencontrado!=null){
			System.out.println("Cliente Localizada: ");
			System.out.println("================================");
			nencontrado.imprimir();
			System.out.println("================================");
		}else{     
			System.out.println("Cleinte não cadastrado");
			System.out.println("================================");
		}
		//LIST////////////////////////////////////////////////////////////////

		System.out.println("Foram encontrados "+listarCliente.size()+" clientes:");
		System.out.println();
		for (Object i : listarCliente) {
			Cliente cliente = (Cliente) i;
            cliente.imprimir();
            System.out.println("================================");

		}
		////EXCLUIDO/////////////////////////////////////////////////
		System.out.println("====================Lista com cliente Excluido===================");
		System.out.println("Foram encontrados "+ excluido.size()+" clientes:");
		System.out.println();
		
			for (Object i : excluido) {  
				Cliente cliente = (Cliente) i;
				cliente.imprimir();
				System.out.println("================================");
		}
		
	}
	}


