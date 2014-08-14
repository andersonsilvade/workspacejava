
public class Guitar {
	
	private String serialNumber;
	private double price;
	private Caracteristica carc;
	
	public Guitar(String sn, double pr, Caracteristica ca){
		serialNumber = sn;
		price = pr;
		carc = ca;
	}
	public String getSerialNumber(){
		return serialNumber;
	}
	public void setSerialNumber(String novoSerial){
		serialNumber = novoSerial;
	}
    public double getPrice(){
    	return price;
    }
    public void setPrice(double novoPrice){
    	price = novoPrice;
    }
    public Caracteristica getCarc(){
		return carc;
	}
	
	public void setcarc(Caracteristica carcx){
		carc = carcx;
	}
	public void print(){
		System.out.println("Serial: "+getSerialNumber());
		System.out.println("Preço: "+getPrice());
		System.out.println("Fabricante: "+getCarc().getBuilder());
		System.out.println("Modelo: "+getCarc().getModel());
		System.out.println("Madeira da Frente: "+getCarc().getTopWood());
		System.out.println("Madeira de traz: "+getCarc().getBackWood());
	}
}
