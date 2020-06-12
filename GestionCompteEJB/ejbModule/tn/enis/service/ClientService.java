package tn.enis.service;

import java.util.List;

import javax.ejb.*;

import tn.enis.dao.ClientDao;
import tn.enis.entities.Client;

@Stateless
@LocalBean
public class ClientService {

	@EJB
	private ClientDao dao;

	public void save(Client client) {
		dao.save(client);
	}

	public Client getById(int id) {
		return dao.getById(id);
	}

	public void delete(int id) {
		Client client = getById(id);
		dao.delete(client);
	}

	public void update(Client client) {
		dao.update(client);
	}

	public List<Client> getAll() {
		return dao.getAll();
	}

}
