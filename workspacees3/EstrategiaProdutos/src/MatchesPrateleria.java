
public class MatchesPrateleria implements Matches {

	
		public boolean matches(Produto p,Produto p2){
			if(!p.getPrateleira().equals(p2.getPrateleira()))return false;
			return true;
			}
	}

