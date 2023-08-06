package spotdraft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

import spotdraft.dto.Airtable;
import spotdraft.dto.Asana;

@Component
public class SpotDraftdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveAsana(Asana a) {
		et.begin();
		em.persist(a);
		et.commit();
	}
	
	public void saveAirtable(Asana a) {
		Airtable ai=new Airtable();
		ai.setTaskid(a.getTaskid());
		ai.setName(a.getName());
		ai.setDuedate(a.getDuedate());
		ai.setAssignee(a.getAssignee());
		ai.setDescription(a.getDescription());
		et.begin();
		em.persist(ai);
		et.commit();
	}
	
	public List<Asana> getAllAsana() {
		Query q=em.createQuery("select a from Asana a");
		List<Asana> l=q.getResultList();
		return l;
	}
	
	public List<Airtable> getAllAirtable() {
		Query q=em.createQuery("select a from Airtable a");
		List<Airtable> l=q.getResultList();
		return l;
	}
	
	public Asana getAsana(int id) {
		return em.find(Asana.class, id);
	}
	
	public void updateAsana(Asana asana) {
		et.begin();
		em.merge(asana);
		et.commit();
	}
	
	public void deleteAsana(Asana asana) {
		et.begin();
		em.remove(asana);
		et.commit();
	}

}
