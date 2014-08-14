
public class Caracteristica{
	private String builder;
	private String model;
	private String type;
	private String topWood;
	private String backWood;
	
	public Caracteristica(String bu, String mo,String ty,String tw,String bw){
		builder = bu;
		model  = mo;
		type = ty;
		topWood = tw;
		backWood = bw;
	}
	
	
	
	public String getBuilder(){
		return builder;
	}
	public void setbuilder(String novoBuilder){
		builder = novoBuilder;
	}
	
	public String getModel(){
		return model;
	}
	public void setModel(String novoModel){
		model = novoModel;
	}
	
	public String getType(){
		return type;
	}
	public void setType(String novoType){
		type = novoType;
	}
	public String getTopWood(){
		return topWood;
	}
	public void setTopWood(String novoTopWood){
		topWood = novoTopWood;
	}
	
	public String getBackWood(){
		return backWood;
	}
	public void setBackWood(String novoBackWood){
		backWood = novoBackWood;
	}
	public boolean matches(Caracteristica specCliente){//resolucao do problema 2
		if(!builder.equals(specCliente.builder)) return false;
		if(!model.equals(specCliente.model)) return false;
		if(!type.equals(specCliente.type)) return false;
		if(!topWood.equals(specCliente.topWood)) return false;
		if(!backWood.equals(specCliente.backWood)) return false;
		
		return true;
	}
}
