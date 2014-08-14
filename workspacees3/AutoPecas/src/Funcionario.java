import java.util.List;


public class Funcionario {
	
	private Visualizacao vis;

	public void setVis(Visualizacao vis){
		this.vis = vis;
	}
	public void realizarImpressao(List pEncontrado){
	 vis.imprimir(pEncontrado);
	}
	
	

}
