package hibernate.DAO;

import java.util.List;

public interface EvaluationsServ {
	

	public void insertarEvaluacion(Evaluations evaluacion);
	
	public List<Evaluations> buscaEv(String ev);
	
}
