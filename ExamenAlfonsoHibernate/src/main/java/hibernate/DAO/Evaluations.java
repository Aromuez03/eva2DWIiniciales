package hibernate.DAO;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import java.security.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class Evaluations {
	//CONSTRUCTOR
		public Evaluations(String alumno, int nota, String evaluacion) {
			super();
			this.alumno = alumno;
			this.nota = nota;
			this.evaluacion = evaluacion;
		}
		
		


		//ATRIBUTOS
			@Id
			@Column(name="md_uuid")
			private String mduuid;
			@Column(name="cod_pedido")
			private Timestamp mdfecha;
			@Column(name="id_nota_evaluacion", unique=true)
			private int idnota;
			@Column(name="cod_alumno", nullable=false)
			private String alumno;
			@Column(name="cod_nota", nullable=false)
			private int nota;
			@Column(name="cod_evaluacion", nullable=false)
			private String evaluacion;
		
			//GETTERS & SETTERS
			
			public String getMduuid() {
				return mduuid;
			}
			public void setMduuid(String mduuid) {
				this.mduuid = mduuid;
			}
			public Timestamp getMdfecha() {
				return mdfecha;
			}
			public void setMdfecha(Timestamp mdfecha) {
				this.mdfecha = mdfecha;
			}
			public int getIdnota() {
				return idnota;
			}
			public void setIdnota(int idnota) {
				this.idnota = idnota;
			}
			public String getAlumno() {
				return alumno;
			}
			public void setAlumno(String alumno) {
				this.alumno = alumno;
			}
			public int getNota() {
				return nota;
			}
			public void setNota(int nota) {
				this.nota = nota;
			}
			public String getEvaluacion() {
				return evaluacion;
			}
			public void setEvaluacion(String evaluacion) {
				this.evaluacion = evaluacion;
			}



			@Override
			public String toString() {
				return "Evaluacion [cod_alumno="  + ", cod_nota=" + ", cod_evaluacion="  + "]";
			}	
}
