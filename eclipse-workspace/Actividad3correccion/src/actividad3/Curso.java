package actividad3;

public class Curso {
	private int codigo;
	private String programa;
	private String grupo;
	private Asignatura asignatura;
	private Docente docente;
	private Estudiante[] arregloEstudiante;
	/**
	 * @param codigo de la asignatura
	 * @param programa nombre del programa
	 * @param grupo del curso
	 * @param asignatura instancia de la clase Asignatura que contiene los datos de la asignatura 
	 * @param docente instancia de la clase Docente que contiene los datos del docente
	 * @param numero es el numero de elementos de arreglos de estudiantes 
	 */
	public Curso(int codigo, String programa, String grupo,	int numero) {
		super();
		this.codigo = codigo;
		this.programa = programa;
		this.grupo = grupo;
		//Composicion
		this.arregloEstudiante =new Estudiante[numero];
	}
	
	/**
	 * Metodo para asignar los datos de los estudiantes de los arreglos de clase Estudiante
	 * @param estudiante es una instancia de la clase Estudiante que contiene los datos de un estudiante 
	 */
	public void agregarEstudiante(Estudiante estudiante) {
		
		for (int i = 0; i < arregloEstudiante.length; i++) {
			if (arregloEstudiante[i] == null) {
				arregloEstudiante[i] = estudiante;
				break;
 			}
		}
		
	}
	/**
	 * Método para mostar por consola todos los estudiantes del cursos con las notas del corte 1
	 * corte 2, corte 3 y la nota definitiva.
	 */
	public void mostrarArregloEstudiante() {
		double sumaNota=0;
		System.out.println("Notas del Curso " + this.codigo + " Programa " + this.programa + " Grupo " + this.grupo);
		System.out.println("Asignatura " + this.asignatura + " Docente " + this.docente);
		
		
		
		for (Estudiante estu : arregloEstudiante) {
			
			double notaFinal = ((estu.getNotas()[0]*30/100 + estu.getNotas()[1]*30/100 + estu.getNotas()[2]*40/100));
			
			sumaNota += notaFinal;
			
			System.out.println(estu + " "+ notaFinal);
		}
		
		System.out.println("El promedio del Curso es " + sumaNota/arregloEstudiante.length);
		
	}
	/**
	 * Método para mostrar por consola las notas por rango
	 * @param desde nota donde incia el rango
	 * @param hasta nota donde termina el rango
	 */
	public void mostrarNotasRango(double desde, double hasta) {
		System.out.println("Notas del Curso " + this.codigo + " Programa " + this.programa + " Grupo " + this.grupo);
		System.out.println("Asignatura " + this.asignatura + " Docente " + this.docente);
		
		double sumaNota=0;
		
		int nEstu = 0;
		
		for (Estudiante estu : arregloEstudiante) {
			double notaFinal = ((estu.getNotas()[0]*30/100 + estu.getNotas()[1]*30/100 + estu.getNotas()[2]*40/100));
			
			if (notaFinal >= desde && notaFinal <= hasta ) {
			
				sumaNota += notaFinal;
				
				System.out.println(estu + " "+ notaFinal);
				
				nEstu++;
			}
		}
		System.out.println("El Promedio del Curso es " + sumaNota/nEstu);
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Estudiante buscarEstudiante(int id) {
		Estudiante estudiante = null;
		for (Estudiante e : arregloEstudiante) {
				if(id==e.getId()) {
					estudiante = e;
					break;
				}
			}
		
		return estudiante;
	}

	
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}

	/**
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the docente
	 */
	public Docente getDocente() {
		return docente;
	}

	/**
	 * @param docente the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	/**
	 * @return the arregloEstudiante
	 */
	public Estudiante[] getArregloEstudiante() {
		return arregloEstudiante;
	}

	/**
	 * @param arregloEstudiante the arregloEstudiante to set
	 */
	public void setArregloEstudiante(Estudiante[] arregloEstudiante) {
		this.arregloEstudiante = arregloEstudiante;
	}
	
	
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", programa=" + programa + ", grupo=" + grupo + "]";
	}
	
	
	

}
