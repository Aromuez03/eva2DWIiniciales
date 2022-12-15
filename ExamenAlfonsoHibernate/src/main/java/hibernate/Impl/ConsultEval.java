package hibernate.Impl;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hibernate.DAO.Evaluations;
import hibernate.DAO.EvaluationsServImpl;

@Component
public class ConsultEval {
}

		@Autowired
		private EvaluationsServImpl Esi;
		
		@Transactional
		public void insertaEv(Evaluations evaluacion) {
			Esi.insertarEvaluacion(evaluacion);
		}
		
		@Transactional
		public void insertarListaEv(Collection<Evaluations> colEvaluaciones) {
			for (Evaluations evaluacion : colEvaluaciones) {
				Esi.insertarEvaluacion(evaluacion);
			}
		}
		
		@Transactional
		public List<Evaluations> buscaEvA(String ev) {
			return Esi.buscaEv(ev);
		}

}
