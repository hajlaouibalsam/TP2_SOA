package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService 
{
	public double conversion(double mt) {
		return mt*10.6;
		}
	public Compte getCompte()
	{
		Compte compte = new Compte(1,20000,"20/10/2023");
		return compte;
	}
	public List<Compte> getComptes()
	{
		List<Compte> list=new ArrayList<Compte>();
		Compte compte1 = new Compte(1,20000.300,"04/05/2023");
		Compte compte2 = new Compte(6,700000,"08/09/2023");
		Compte compte3 = new Compte(10,11.1200,"12/13/2023");
		
		list.add(compte2);
		list.add(compte1);
		list.add(compte3);
		return list;
	}

	
}
