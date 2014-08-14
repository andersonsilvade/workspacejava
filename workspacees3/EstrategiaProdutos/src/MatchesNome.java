


public class MatchesNome implements Matches{
	
	public boolean matches(Produto p,Produto p2){
		if(!p.getNome().equals(p2.getNome()))return false;//p produto da lista ,p2 produto buscado
		return true;
		}

}
