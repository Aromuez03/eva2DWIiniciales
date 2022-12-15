package hibernate.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.expression.EvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class EvaluationsServImpl implements EvaluationsServ {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insertarEvaluacion(Evaluations evaluacion) {
		em.persist(evaluacion);
	}
	
	public List<Evaluations> buscaEv(String ev) {
		System.out.println("Entrando al metodo buscaEv");
		return em.createQuery("SELECT e FROM Evaluacion e WHERE e.evaluacion ="+ev).getResultList();
	}

}
