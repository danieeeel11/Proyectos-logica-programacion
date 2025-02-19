package RepartosSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * Clase Distri que almacena los metodos de manejo de listas de los domicilios
 * @author Laura Ojeda & Daniel Velasquez
 * @date 30-05-2021
 */
public class Distri {
	//Lista de repartos para cada dia
	public static ArrayList<Repart> listaReparto = new ArrayList<Repart>();
	//Lista de Domiciliarios inscritos
	public static ArrayList<Domicili> listaDomi =  new ArrayList<Domicili>();
	//Lista de domicilios completa
	public static ArrayList<Domicilio> listaDomicilios =  new ArrayList<Domicilio>();
	public static Integer nR = 1;
	static Scanner leerDato =new Scanner(System.in);
	
	/**
	 * Método para generar un nombre aleatorio para un cliente
	 * @return el nombre aleatorio del cliente
	 */
	public static String nomAleatorioCliente() {
		String aleaNom = new String();
		String[] nombres = { "Andrea", "David", "Baltasar", "Barry", "Bartolomeo",
				"Carlos", "Zaramay", "Marcos", "Davinson", "Polo", "Pepito", "Pachito", 
				"Carlota", "Estefania", "Gabriel", "Dayana", "Hulio", "Roco"};
		String[] apellidos = { "Ruiz", "Guerrero", "Cardenas", "Montoya", "Cuccitini", 
				"Dos Santos", "Gaucho", "Rodriguez","Garcia", "Sanchez", "Cantona", 
				"McKennie", "Araujo", "Alba", "Lavezzi", "Ramos", "Paez", "Montero" };
		aleaNom = nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " "+ apellidos[(int)(Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
		return aleaNom;
	}
	/**
	 * Método para generar un nombre aleatorio para un domiciliario
	 * @return el nombre aleatorio del domiciliario
	 */
	public static String nomAleatorioDomici() {
		String aleaNom = new String();
		String[] nombres = { "Arilio", "Darlos", "Breaham", "Barto", "Berry",
				"Cleo", "Yeimy", "Alonso", "Devin", "Lorenzo", "Pedro", "Patricio", 
				"Fernando", "Esteban", "Guille", "Hernando", "Kevin", "Tulio"};
		String[] apellidos = { "Zaramai", "Guedes", "Aguirre", "Saenz", "Alvarado", 
				"Burgos", "Vanegas", "Blanchet", "Perez", "Villalobos", "Teran", 
				"McKinster", "De la Peña", "Ayala", "Martinez", "Quiroz", "Gordon", "Yepez" };
		aleaNom = nombres[(int)(Math.floor(Math.random()*((nombres.length-1)-0+1)+0))] + " "+ apellidos[(int)(Math.floor(Math.random()*((apellidos.length-1)-0+1)+0))];
		return aleaNom;
	}
	/**
	 * Método para generar una fecha aleatoria de nacimiento
	 * @return una fecha aleatoria de nacimiento
	 */
	public static String fechaNacAlea() {
		String fechaNac = new String();
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		Integer[] dia = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31 };
		Integer[] año = { 1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999 };
		fechaNac = mes[(int)(Math.floor(Math.random()*((mes.length-1)-0+1)+0))] + " "+ dia[(int)(Math.floor(Math.random()*((dia.length-1)-0+1)+0))] + " "+ año[(int)(Math.floor(Math.random()*((año.length-1)-0+1)+0))];
		return fechaNac;
	}
	/**
	 * Método para generar una nacionalidad aleatoria
	 * @return una nacionalidad aleatoria
	 */
	public static String nacionalidad() {
		String nacion = new String();
		String[] naciones = { "colombiano", "paraguayo", "venezolano", "argentino", "chileno",
				"beliceño", "panameño", "ecuatoriano", "brasileño" };
		nacion = naciones[(int)(Math.floor(Math.random()*((naciones.length-1)-0+1)+0))];
		return nacion;
	}
	/**
	 * Método para generar una Upz aleatoria
	 * @return una Upz aleatoria
	 */
	public static String UPZ() {
		String upz = new String();
		String[] listaUpz = { "La Uribe", "Galerias", "Teusquillo", "La Sabana", "Parque El Salitre", "Parque Simon Bolivar", "La Esmeralda" , "Quinta Paredes"
				, "Zona Industrial", "Ciudad Salitre Oriental", "Ciudad Salitre Occidental", "Puente Aranda", "Granjas de Techo", "Bavaria", "Modelia"
				, "Toberin", "Los Cedros", "Usaquen", "Country Club", "Santa Barbara", "San Jose de Bavana", "Britalia", "La Alhambra"
				, "Los Andes", "Doce de Octubre", "Casablanca", "Niza", "La Floresta", "Las Ferias", "Suba", "El Minuto de Dios", "Boyaca Real" 
				, "Santa Cecilia", "Sosiego", "Ciudad Jardin", "San Jose", "Santa Isabel", "Restrepo", "Quiroga", "Ciudad Montes", "Muzu", "Venecia"
				, "San Rafael", "Americas", "Carvajal", "Castilla", "Kennedy Central", "Timiza", "Apogeo", "Tunjuelito", "Bovilia", "Garces Navas" 
				, "Corabastos", "El Refugio", "Prado Rubio", "Sagrado Corazon", "La Macarena", "Las Nieves", "La Candelaria", "Las Cruces" 
				, "Chico Lago", "Los Alcazares", "Chapinero", "Prado" };
		upz = listaUpz[(int)(Math.floor(Math.random()*((listaUpz.length-1)-0+1)+0))];
		return upz;
	}
	/**
	 * Método para generar los datos del cliente 
	 * @return un objeto de la clase cliente
	 */
	public static Client datosCliente() {
		System.out.print("\nNombre: ");
		String nombre = nomAleatorioCliente();
		System.out.print(nombre);
		System.out.print("\nIdentificacion: ");
		int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
		System.out.println(id);
		
		Client cl = new Client(id,nombre);
		return cl;
	}
	/**
	 * Método para generar una lista de domiciliarios
	 */
	public static void listaDomic() {
		System.out.println("¿Cuantos domiciliarios estan inscritos?");
		int n = leerDato.nextInt();
		Domicili domi = null;
		for (int i = 0; i < n; i++) {
			System.out.print("\n\nDomiciliario " + (i+1));
			System.out.print("\nIdentificacion: ");
			int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
			System.out.print(id);
			System.out.print("\nNombre: ");
			String nombre = nomAleatorioDomici();
			System.out.print(nombre);
			System.out.print("\nFecha de nacimiento: ");
			String fechaNac = fechaNacAlea();
			System.out.print(fechaNac);
			System.out.print("\nNacionalidad:");
			String nacionalidad = nacionalidad();
			System.out.print(nacionalidad);
			System.out.print("\nUPZ: ");
			String upz = UPZ();
			System.out.println(upz);
			domi = new Domicili(id,nombre,fechaNac,nacionalidad,upz);
			listaDomi.add(domi);
		}
	}
	/**
	 * Método para generar una lista de repartos cada día
	 * @param dia de la semana
	 * @param número de la semana 
	 */
	public static void repartos(String dia, int semana) {
		listaReparto.clear();
		System.out.println("¿Cuantos repartos del dia " + dia + "?");
		int n = leerDato.nextInt();
		Repart re = null;
		for (int i = 0; i < n; i++) {
			System.out.print("\nNumero del reparto: ");
			int nReparto = nR;
			System.out.print(nReparto);
			nR++;
			System.out.print("\nUPZ: ");
			String upz = UPZ();
			System.out.print(upz);
			System.out.print("\nCliente: ");
			Client cl = datosCliente();
			System.out.print("");
			re = new Repart(nReparto,upz,cl);
			listaReparto.add(re);
			re.setFecha(dia);
			re.setSemana(semana);
		}
	}
	/**
	 * Método para asignar un reparto a un domiciliario y añadirlo a la lista de domicilios
	 * @param dia de la semana
	 * @param número de la semana 
	 */
	public static void domiciliosSS(String dia,int semana) {
		// Se trae el método repartos que genera una lista de repartos del día
		repartos(dia,semana);
		// Se trae el método para ordenar la lista de domiciliarios por la Upz
		orDomiUpz();
		for (int i = 0; i < listaReparto.size(); i++) {
			String upzR =listaReparto.get(i).getUPZ();
			System.out.print("\nEntregado: ");
			int e = (int) (Math.random()*(1-0+1)+0);
			boolean estado = false;
			if(e==1) {
				estado = true;
			}else{
				estado = false;
			}
			System.out.print(estado);
			Optional<Domicili> domiE = listaDomi.stream().filter(p->p.getUpz().equals(upzR)).findFirst();
			if(domiE.isPresent()) {
				Repart re =listaReparto.get(i);
				Domicili dom = domiE.get();
				Domicilio domi = new Domicilio(estado,re,dom);
				listaDomicilios.add(domi);
				// Búsqueda del domiciliario cuya Upz sea igual a la Upz del reparto
				System.out.print("\nEl reparto fue asignado a " + dom.getId());
			}else {
				// Si no, búsqueda del domiciliario cuya Upz sea la siguiente a la Upz del reparto
				Optional<Domicili> domiRe = listaDomi.stream().filter(p->p.getUpz().compareTo(upzR)>0).findFirst();
				if(domiRe.isPresent()) {
					System.out.print("\nEl reparto se asigna al domicilirio con upz mas cercano");
					Repart re =listaReparto.get(i);
					Domicilio domicilio = new Domicilio(estado,re,domiRe.get());
					listaDomicilios.add(domicilio);
					System.out.print(", asignado a " +domiRe.get().getId() + ", UPZ:"+ domiRe.get().getUpz());
				}else {
					// De lo contrario, se obtiene el domiciliario cuya Upz sea la anterior a la Upz del reparto
					Domicili domiR = listaDomi.get(listaDomi.size()-1);
					System.out.print("\nEl reparto se asigna al domicilirio con upz mas cercano");
					Repart re =listaReparto.get(i);
					Domicilio domicili = new Domicilio(estado,re,domiR);
					listaDomicilios.add(domicili);
					System.out.print(", asignado a " +domiR.getId() + ", UPZ:"+ domiR.getUpz());
				}
			}
		}
	}
	/**
	 * Método para evaluar el estado de cada domicilio de la lista
	 * @param dia de la semana 
	 * @param número de la semana
	 */
	public static void listaDomicilios(String dia,int semana) {
		// Se trae el método que asigna un reparto a un domiciliario
		domiciliosSS(dia,semana);
		boolean estado = false;
		Domicili domi = null;
		for (int i = 0; i < listaDomicilios.size(); i++) {
			estado = listaDomicilios.get(i).isEntregado();
			domi = listaDomicilios.get(i).getDomi();
			int id = domi.getId();
			// Se trae el método para evaluar diferentes datos de cada domicilio 
			estado(estado, domi, id);
		}
	}
	/**
	 * Método para ordenar la lista de domiciliarios según la Upz
	 */
	public static void orDomiUpz() {
		listaDomi.sort(Comparator.comparing(Domicili::getUpz));
	}
	/**
	 * Método para establecer el número de domicilios entregados y no entregados, el valor devengado y el valor descontado
	 * @param estado del domicilio
	 * @param domi domiciliario
	 * @param id del domiciliario
	 */
	public static void estado(boolean estado, Domicili domi, int id) {
		if(estado) {
			int nv = nVeces(id);
			int nvn = nVecesN(id);
			domi.setnDomicilioP(estado,nv);
			domi.setnDomicilioN(estado, nvn);
			domi.setValorDeven(estado, nv);
			domi.setValorDes(nvn);
		}else{
			int nv = nVeces(id);
			int nvn = nVecesN(id);
			domi.setnDomicilioP(estado,nv);
			domi.setnDomicilioN(estado, nvn);
			domi.setValorDeven(estado,nv);
			domi.setValorDes(nvn);
		}
	}
	/**
	 * Método para contabilizar el número de entregas realizadas por el domiciliario en la semana
	 * @param id del domiciliario 
	 * @return el número de entregas realizas
	 */
	public static int nVeces(int id) {
		int n=0;
		for (int i = 0; i < listaDomicilios.size(); i++) {
			if(listaDomicilios.get(i).getDomi().getId()==id && listaDomicilios.get(i).isEntregado()) {
				n++;
			}
		}
		return n;
	}
	/**
	 * Método para contablizar el número de semanas en la que esta inscrito el domiciliario 
	 * @param id del domiciliario 
	 * @return el número de semanas
	 */
	public static int nSemanas(int id) {
		int n=0;
		Optional<Domicilio> semana1 = listaDomicilios.stream().filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getSemana()==1).findFirst();
		if(semana1.isPresent()) {
			n++;
		}
		Optional<Domicilio> semana2 = listaDomicilios.stream().filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getSemana()==2).findFirst();
		if(semana2.isPresent()) {
			n++;
		}
		Optional<Domicilio> semana3 = listaDomicilios.stream().filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getSemana()==3).findFirst();
		if(semana3.isPresent()) {
			n++;
		}
		Optional<Domicilio> semana4 = listaDomicilios.stream().filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getSemana()==4).findFirst();
		if(semana4.isPresent()) {
			n++;
		}
		return n;
	}
	/**
	 * Método que contabiliza el número de entregas no realizadas por el domiciliario en la semana 
	 * @param id del domiciliario
	 * @return el número de entrgas no realizadas 
	 */
	public static int nVecesN(int id) {
		int n=0;
		for (int i = 0; i < listaDomicilios.size(); i++) {
			if(listaDomicilios.get(i).getDomi().getId()==id && listaDomicilios.get(i).isEntregado()==false) {
				n++;
			}
		}
		return n;
	}
	/**
	 * Mêtodo para determinar el numero de entregas realizadas en la semana por un domiciliario
	 * @param id del domiciliario 
	 * @return el numero de entregas realizadas en la semana por un domiciliario
	 */
	public static String entregasDia(int id) {
		int conL = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Lunes")).count();
		int conM = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Martes")).count();
		int conMi = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Miercoles")).count();
		int conJ = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Jueves")).count();
		int conV = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Viernes")).count();
		int conS = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Sabado")).count();
		int conD = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getDomi().getId()==id).filter(p->p.getRe().getFecha().equals("Domingo")).count();
		String conteo = new String();
		conteo = "Lunes:" + conL + ", Martes:" + conM + ", Miercoles:" + conMi + ", Jueves:" + conJ + ", Viernes:" + conV + ", Sabado:" + conS + ", Domingo:" + conD;
		return conteo;
	}
	/**
	 * Metodo para imprimir la lista de domicilios
	 */
	public static void imprimir() {
		listaDomicilios.forEach(System.out::println);
	}
	/**
	 * Metodo para generar dos listas segun la id y upz del domiciliario
	 */
	public static void listas() {
		System.out.println();
		System.out.println("Lista de domicilios ordenados por la identificacion del domiciliario: ");
		listaDomicilios.sort((p1,p2)->Integer.compare(p1.getDomi().getId(),p2.getDomi().getId()));
		listaDomi.sort((p1,p2)->Integer.compare(p1.getId(),p2.getId()));
		for (int i = 0; i < listaDomi.size(); i++) {
			List<Domicilio> idDo = null;
			int j = listaDomi.get(i).getId();
			idDo = listaDomicilios.stream().filter(p->p.getDomi().getId()==j).collect(Collectors.toList());
			Optional<Domicilio> idDomi =idDo.stream().max((p1,p2)->Integer.compare(p1.getDomi().getSalario(),p2.getDomi().getSalario()));
			if(idDomi.isPresent()) {
				String dias = entregasDia(j);
				System.out.print("\n* Domiciliario: "+ idDomi.get().getDomi() + "\n  " + dias + " \n  Valor devengado: " + idDomi.get().getDomi().getValorDeven() + "\n  Descuento: " + 40000*nSemanas(idDomi.get().getDomi().getId()));
				if(idDomi.get().getDomi().getnDomicilioN()>0) {
					System.out.print("\n  Debido a que no entrego " + idDomi.get().getDomi().getnDomicilioN() + " entregas, se le descuenta " + idDomi.get().getDomi().getValorDes());
				}
				System.out.print(" \n  Salario: "+ idDomi.get().getDomi().getSalario());
			}else {
				System.out.print("\n- Domiciliario " + j + " sin repartos asignados");
			}
		}
		System.out.println("\n\nLista de domicilios ordenados por la UPZ: ");
		listaDomicilios.sort((p1,p2)->p1.getDomi().getUpz().compareTo(p2.getDomi().getUpz()));
		listaDomi.sort((p1,p2)->p1.getUpz().compareTo(p2.getUpz()));
		for (int i = 0; i < listaDomi.size(); i++) {
			List<Domicilio> idDo = null;
			int j = listaDomi.get(i).getId();
			idDo = listaDomicilios.stream().filter(p->p.getDomi().getId()==j).collect(Collectors.toList());
			Optional<Domicilio> idDomi =idDo.stream().max((p1,p2)->Integer.compare(p1.getDomi().getSalario(),p2.getDomi().getSalario()));
			if(idDomi.isPresent()) {
				System.out.print("\n* Domiciliario: "+ idDomi.get().getDomi() + " \n  Salario: "+ idDomi.get().getDomi().getSalario());
			}else {
				System.out.print("\n- Domiciliario " + j + " sin repartos asignados");
			}
		}
	}
	/**
	 * Metodo  para ordenar la lista de domicilios segun la id del domiciliario
	 */
	public static void orderId() {
		System.out.println();
		System.out.println("Lista de domicilios ordenados por la identificacion del domiciliario: ");
		Comparator<Domicilio> ordId = (p1,p2)->Integer.compare(p1.getDomi().getId(),p2.getDomi().getId());
		listaDomicilios.sort(ordId);
		List<Domicili> listaDo = listaDomicilios.stream().map(p->p.getDomi()).collect(Collectors.toList());
		List<Repart> listaRe = listaDomicilios.stream().map(p->p.getRe()).collect(Collectors.toList());
		for (int i = 0; i < listaDomicilios.size(); i++) {
			Boolean ent = listaDomicilios.get(i).isEntregado();
			int re = listaRe.get(i).getnReparto();
			Domicili dom = listaDo.get(i);
			String domicil = new String();
			domicil = "[Id= " + dom.getId() + ", Nombre = " + dom.getNombre() + ", Lleva " + dom.getnDomicilioP() + " domicilios]";
			System.out.println("Estado: " + ent + ", N° reparto: " + re + ", Domiciliario: " + domicil);			
		}
	}
	/**
	 * Metodo para ordenar la lista de domicilios segun la upz del domiciliario
	 */
	public static void orderUpz() {
		System.out.println("\nLista ordenada por UPZ:");
		listaDomicilios.sort((p1,p2)->p1.getDomi().getUpz().compareTo(p2.getDomi().getUpz()));
		List<Domicili> listaDo = listaDomicilios.stream().map(p->p.getDomi()).collect(Collectors.toList());
		List<Repart> listaRe = listaDomicilios.stream().map(p->p.getRe()).collect(Collectors.toList());
		for (int i = 0; i < listaDomicilios.size(); i++) {
			Boolean ent = listaDomicilios.get(i).isEntregado();
			int re = listaRe.get(i).getnReparto();
			Domicili dom = listaDo.get(i);
			String domicil = new String();
			domicil = "[Id= " + dom.getId() + ", Nombre = " + dom.getNombre() + ", Lleva " + dom.getnDomicilioP() + " domicilios]";
			System.out.println("Estado: " + ent + ", N° reparto: " + re + ", Domiciliario: " + domicil);			
		}
	}
	/**
	 * Metodo para realizar el conteo de entregas realizadas en el dia
	 * @param dia de la semana
	 * @param numero de la semana
	 */
	public static void conteoTrueDia(String dia,int semana) {
		int conteo = (int)listaDomicilios.stream().filter(p->p.isEntregado()).filter(p->p.getRe().getSemana()==semana).filter(p->p.getRe().getFecha().equals(dia)).count();
		System.out.println("\n\nN° de repartos entregados: " + conteo);
	}
	/**
	 * Metodo para realizar el conteo del salario de cada domiciliario 
	 * @param numero de semanas
	 */
	public static void conteoSalario(int semana) {
		for (int i = 0; i < listaDomicilios.size(); i++) {
			int ns= nSemanas(listaDomicilios.get(i).getDomi().getId());
			int valorDeven = listaDomicilios.get(i).getDomi().getValorDeven();
			int valorDes = listaDomicilios.get(i).getDomi().getValorDes();
			listaDomicilios.get(i).getDomi().setSalario(valorDeven, valorDes, ns);
		}
	}
	/**
	 * Metodo de opciones de cada semana
	 * @param dia de la semana
	 * @param nDias numero de dias registrados
	 * @param numero de la semana 
	 */
	public static void opciones(String dia, int nDias, int semana) {
		int op1 = 0;
		do {
			System.out.println("\nSemana " + semana + " -------------------------");
			System.out.println("1. Lunes");
			System.out.println("2. Martes");
			System.out.println("3. Miercoles");
			System.out.println("4. Jueves");
			System.out.println("5. Viernes");
			System.out.println("6. Sabado");
			System.out.println("7. Domingo");
			System.out.println("8. Data semana");
			System.out.println("9. Volver");
			op1 = leerDato.nextInt();
			switch(op1) {
			case 1:
				dia="Lunes";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 2:
				dia="Martes";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 3:
				dia="Miercoles";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 4:
				dia="Jueves";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 5:
				dia="Viernes";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 6:
				dia="Sabado";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 7:
				dia="Domingo";
				listaDomicilios(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 8:
				if(nDias==7) {
					System.out.println(listaDomicilios.size());
					System.out.println("Semana completa");
					conteoSalario(semana);
					//obtenerSaldo();
					System.out.println();
					listas();
					System.out.println();
				}else {
					int rest=7-nDias;
					System.out.println("Semana incompleta, faltan " +  rest + " dias por registrar");		
					System.out.println();
					orderId();
					System.out.println();
					orderUpz();
				}
				break;
			default:
				System.out.println("Se vuelve al menu inicial");
			}
		}while(op1>=1 && op1<=8);
	}
	/**
	 * Metodo para obtener el saldo de cada domiciliario 
	 */
	/*public static void obtenerSaldo() {
		for (int i = 0; i < listaDomi.size(); i++) {
			List<Domicilio> idDo = null;
			int j = listaDomi.get(i).getId();
			idDo = listaDomicilios.stream().filter(p->p.getDomi().getId()==j).collect(Collectors.toList());
			Optional<Domicilio> idDomi =idDo.stream().max((p1,p2)->Integer.compare(p1.getDomi().getSalario(),p2.getDomi().getSalario()));
			if(idDomi.isPresent()) {
				System.out.println("Saldo domiciliario "+ j + " : "+ idDomi.get().getDomi().getSalario());
			}else {
				System.out.println("Domiciliario " + j + " sin repartos asignados");
			}
		}
	}*/
	/**
	 * Metodo run para ejecutar los diferentes metodos de la clase
	 */
	public static void run() {
		int op=0;
		int nDias=0;
		System.out.println("Bienvenido a Repartos Bogota S.A.");
		System.out.println("----------------------------------------------");
		do {
			System.out.println("\n1. Inscripcion domiciliarios");
			System.out.println("2. Semana 1");
			System.out.println("3. Semana 2");
			System.out.println("4. Semana 3");
			System.out.println("5. Semana 4");
			System.out.println("6. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			String dia=null;
			switch(op) {
				case 1:
					listaDomic();
					break;
				case 2:
					int semana = 1;
					opciones(dia,nDias,semana);
					break;
				case 3:
					nDias=0;
					semana = 2;
					opciones(dia,nDias,semana);
					break;
				case 4:
					nDias=0;
					semana = 3;
					opciones(dia,nDias,semana);
					break;
				case 5:
					nDias=0;
					semana = 4;
					opciones(dia,nDias,semana);
					break;
				default:
					System.out.println("Digite un numero entre 1 y 4");
					op=5;
					break;
			}
			
		}while(op>=1 && op<=5);
		System.out.println("___________");
		System.out.println(" ");
	}
	/**
	 * Metodo main para ejecutar el metodo run
	 * @param args
	 */
	public static void main(String[] args) {
		run();
	}
}
