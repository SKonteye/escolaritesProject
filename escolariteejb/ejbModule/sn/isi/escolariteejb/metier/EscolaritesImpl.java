package sn.isi.escolariteejb.metier;

import javax.ejb.Stateless;

import sn.isi.escolaritesejb.entities.User;

@Stateless 
public class EscolaritesImpl implements IEscolarites {

	@Override
	public User createU() {
		User u = new User();
		u.setId(4);
		u.setNom("Sidy");
		return u ;
	}
	
}
