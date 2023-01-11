package proxy;

import metier.IMetier;
import metier.MetierImpl;

public class Proxy implements IMetier{
	private MetierImpl metier;

	@Override
	public double calcul() {
		if(metier==null) metier=new MetierImpl();
		System.out.println("Overture d'une transaction");
		double res;
		try {
			res=metier.calcul();
			System.out.println("Commit");
		} 
		catch (Exception e) {
			System.out.println("Rollback");
			throw(e);
		}
		return res;
	}

}
