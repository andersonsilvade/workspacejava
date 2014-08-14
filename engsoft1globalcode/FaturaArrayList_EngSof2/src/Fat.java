import java.io.ObjectInputStream.GetField;
import java.util.List;


public class Fat {
	
	private int nFat;
	private String data;
	private int codigo;
	private FatDet fatDet;
	
	
	public Fat(int nFat, String data, int codigo, FatDet fatDet) {
		super();
		this.nFat = nFat;
		this.data = data;
		this.codigo = codigo;
		this.fatDet = fatDet;
	}



	public int getnFat() {
		return nFat;
	}
	
	public void setnFat(int nFat) {
		this.nFat = nFat;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public FatDet getFatDet() {
		return fatDet;
	}



	public void setFatDet(FatDet fatDet) {
		this.fatDet = fatDet;
	}
    public  void print(){
		
		System.out.println("Número da Fatura: "+getnFat());
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Data da compra: "+getData());
		System.out.println("Descrição: "+ getFatDet().getDescrição());
		System.out.println("total da compra: "+getFatDet().calcula());
		
	}  
	
	

}
