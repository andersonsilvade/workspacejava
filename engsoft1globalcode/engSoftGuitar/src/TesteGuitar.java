import java.util.List;
public class TesteGuitar {

	
	public static void main(String[] args) {
		Inventory inv = new Inventory();
		inv.addGuitar("12345abc", 8000.0, new Caracteristica("Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil"));
	    inv.addGuitar("12341hgt", 6500.0, new Caracteristica("Gibson", "Les Paul" , "Jimmy Page", "Pau Brasil", "Pau Brasil"));
	    inv.addGuitar("547hjt", 5500.0, new Caracteristica("Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil"));
	    
	    
		Caracteristica meuClienteQuer = new Caracteristica("Fender", "Stratocaster", "Gilmour", "Pau Brasil", "Pau Brasil");
		
		List guitarrasEncontradas = inv.search(meuClienteQuer);
		
		if(!guitarrasEncontradas.isEmpty()){
			for(Object i: guitarrasEncontradas){
				Guitar guitar = (Guitar)i;
				System.out.println("Encontramos a guitarra com numero de serie: "+guitar.getSerialNumber());
				System.out.println("Ela custa: "+guitar.getPrice()+" reais");
				System.out.println("Sua marca e: "+guitar.getCarc().getBuilder());
				System.out.println("Seu modelo e: "+guitar.getCarc().getModel());
				System.out.println("Seu tipo e: "+guitar.getCarc().getType());
				System.out.println("Suas madeiras da frente e costas sao: "+guitar.getCarc().getTopWood()+" e "+guitar.getCarc().getBackWood());
				
			}
		}
	}
}
