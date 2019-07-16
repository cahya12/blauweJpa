package com.verdin.jsf.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.verdin.jsf.model.Hosts;



@Stateless
public class HostsEJB {
	
	@PersistenceContext(unitName = "Ambari")
	EntityManager em;
	
	public String greet(String str) {
		
		
		Hosts _hosts = null;
		if (em != null) {
			
			//_hosts = 	(Hosts) em.createNamedQuery("Hosts.findAll").setParameter("host_name", str).getSingleResult();
			_hosts = 	(Hosts) em.createNamedQuery("Hosts.findAll");
		}
		
		
        return "Host: " + _hosts.getHost_name() +" | "+ _hosts.getIpv4();
    }
}
