package sn.isi.escolariteejb.metier;

import javax.ejb.Local;

import sn.isi.escolaritesejb.entities.User;

@Local
public interface IEscolarites {
	public User createU();
}
