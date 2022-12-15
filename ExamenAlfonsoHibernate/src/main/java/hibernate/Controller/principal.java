package hibernate.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import hibernate.Impl.ConsultEval;

@Controller
public class principal {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ConsultEval consulta = (ConsultEval) context.getBean(ConsultEval.class);
		//consulta.insertaEv(new Evaluations(,""));
		System.out.println("Lista alumnos por evaluaciones: " + consulta.buscaEvA("PR"));

	}

}
