package EmpresaRepartos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Distribucion {
	public static ArrayList<Reparto> listaRepartos = new ArrayList<Reparto>();
	public static Integer nR = 1;
	static Scanner leerDato =new Scanner(System.in);
	
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
	
	public static String fechaNacAlea() {
		String fechaNac = new String();
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
				"Junio", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		Integer[] dia = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31 };
		Integer[] año = { 1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999 };
		fechaNac = mes[(int)(Math.floor(Math.random()*((mes.length-1)-0+1)+0))] + " "+ dia[(int)(Math.floor(Math.random()*((dia.length-1)-0+1)+0))] + " "+ año[(int)(Math.floor(Math.random()*((año.length-1)-0+1)+0))];
		return fechaNac;
	}
	
	public static String nacionalidad() {
		String nacion = new String();
		String[] naciones = { "colombiano", "paraguayo", "venezolano", "argentino", "chileno",
				"beliceño", "panameño", "ecuatoriano", "brasileño" };
		nacion = naciones[(int)(Math.floor(Math.random()*((naciones.length-1)-0+1)+0))];
		return nacion;
	}
	
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
	
	public static Domiciliario inscripcionDomi() {
		System.out.print("\nIdentificacion: ");
		int id = leerDato.nextInt();
		//int true = listaRepartos.stream().map(p->p.getDomi().getId()==id);
		Domiciliario domici;
		Domiciliario domi = null;
		boolean encontrado = false;
		for (int i = 0; i < listaRepartos.size(); i++) {
			if(listaRepartos.get(i).getDomi().getId()==id) {
				encontrado = true;
				domici = listaRepartos.get(i).getDomi();
				System.out.print("\nIdentificacion: ");
				System.out.print(id);
				System.out.print("\nNombre: ");
				String nombre = domici.getNombre();
				System.out.print(nombre);
				System.out.print("\nFecha de nacimiento: ");
				String fechaNaci = domici.getFechaNac();
				System.out.print(fechaNaci);
				System.out.print("\nNacionalidad:");
				String nacionalidad = domici.getNacionalidad();
				System.out.println(nacionalidad);
				//Domiciliario domi = new Domiciliario(id,nombre,fechaNaci,nacionalidad);
				domi = new Domiciliario(id,nombre,fechaNaci,nacionalidad);
				//domi.setnDomicilioP();
				//domi.setValorDeven();
				break;
			}
		}
		if(!encontrado) {
			System.out.print("\nNombre: ");
			String nombre = nomAleatorioDomici();
			//String nombre = leerDato.next();
			System.out.print(nombre);
			System.out.print("\nIdentificacion: ");
			//int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
			//int id = leerDato.nextInt();
			System.out.print(id);
			System.out.print("\nFecha de nacimiento: ");
			String fechaNac = fechaNacAlea();
			//String fechaNac = leerDato.next();
			System.out.print(fechaNac);
			System.out.print("\nNacionalidad:");
			String nacionalidad = nacionalidad();
			System.out.println(nacionalidad);
			//Domiciliario domi = new Domiciliario(id,nombre,fechaNac,nacionalidad);
			domi = new Domiciliario(id,nombre,fechaNac,nacionalidad);
			//domi.setnDomicilioPP();
			//domi.setValorDevenn();
		}
		//boolean estado = listaRepartos.contains(id);
		//int i = listaRepartos.indexOf(id);
		//if(i!=-1) {
		//	System.out.print(22);
		//}
		/*if(estado) {
			System.out.println(22);
		}*/
		/*for (Reparto reparto : listaRepartos) {
			if(reparto.getDomi().getId()==id) {
				
			}
		}*/
		/*System.out.print("\nNombre: ");
		String nombre = nomAleatorioDomici();
		//String nombre = leerDato.next();
		System.out.print(nombre);
		//System.out.print("\nIdentificacion: ");
		//int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
		//int id = leerDato.nextInt();
		System.out.print(id);
		System.out.print("\nFecha de nacimiento: ");
		String fechaNac = fechaNacAlea();
		//String fechaNac = leerDato.next();
		System.out.print(fechaNac);
		System.out.print("\nNacionalidad:");
		String nacionalidad = nacionalidad();
		System.out.println(nacionalidad);
		Domiciliario domi = new Domiciliario(id,nombre,fechaNac,nacionalidad);*/
		return domi;
	}
	
	public static Cliente datosCliente() {
		System.out.print("\nNombre: ");
		String nombre = nomAleatorioCliente();
		System.out.print(nombre);
		System.out.print("\nIdentificacion: ");
		int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
		System.out.println(id);
		
		Cliente cl = new Cliente(id,nombre);
		return cl;
	}
	
	public static String fechaA() {
		String fechas = new String();
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		fechas = dias[(int)(Math.floor(Math.random()*((dias.length-1)-0+1)+0))];
		return fechas;
	}
	
	public static String fecha() {
		//int numero = 0;
        Random aleatorio = new Random();
        Calendar unaFecha = Calendar.getInstance();
        unaFecha.set(aleatorio.nextInt(1)+2020, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
	}
	
	public static Reparto reparto() {
		System.out.print("Numero del reparto: ");
		int nReparto = nR;
		System.out.print(nReparto);
		nR++;
		System.out.print("\nDomiciliario: ");
		Domiciliario dom = inscripcionDomi();
		System.out.print(dom);
		System.out.print("\nUPZ: ");
		String upz = UPZ();
		System.out.print(upz);
		//System.out.print("\nFecha: ");
		//String fecha = fechaA();
		//String fecha = fecha();
		//System.out.print(fecha);
		System.out.print("\nCliente: ");
		Cliente cl = datosCliente();
		System.out.print(cl);
		System.out.print("\nEntregado: ");
		int e = (int) (Math.random()*(1-0+1)+0);
		boolean estado = true;
		if(e==1) {
			estado = true;
		}else{
			estado = false;
		}
		System.out.println(estado);
		System.out.println();
		if(estado) {
			//dom.setnDomicilioP();
			//dom.setValorDeven();
			
			//dom.setnDomicilioP();
			//dom.setValorDeven();
			
			//int n = dom.getnDomicilioP()+1;
			//System.out.println(n);
			//dom.setnDomicilioP(n);
			//dom.setValorDeven(n);
			//System.out.println(dom.getnDomicilioP());
		}else {
			//dom.setnDomicilioPP();
			//dom.setValorDevenn();
			
			//int n = dom.getnDomicilioP();
			//dom.setnDomicilioP(n);
			//dom.setValorDeven();
			//int a = dom.getnDomicilioP();
			//dom.setValorDeven(a);
		}
		Reparto re = new Reparto(nReparto,upz,cl,estado,dom);
		/*if(estado) {
			int n = dom.getnDomicilioP()+1;
			System.out.println(n);
			dom.setnDomicilioP(n);
			dom.setValorDeven(n);
			//System.out.println(dom.getnDomicilioP());
		}*/
		/*if(estado) {
			int n = re.getNumeroDomi()+1;
			re.setNumeroDomi(n);
		}*/
		return re;
	}
	
	
	
	public static Reparto repartoO() {
		System.out.print("\nNumero del reparto: ");
		int nReparto = nR;
		System.out.print(nReparto);
		nR++;
		System.out.print("\nEntregado: ");
		int e = (int) (Math.random()*(1-0+1)+0);
		boolean estado = true;
		if(e==1) {
			estado = true;
			//domi.setnDomicilioP();
			//domi.setValorDeven();
		}else{
			estado = false;
			//domi.setnDomicilioPP();
			//domi.setValorDevenn();
		}
		System.out.print(estado);
		//System.out.println();
		
		System.out.print("\nDomiciliario: ");
		
		System.out.print("\nIdentificacion: ");
		int id = leerDato.nextInt();
		//int true = listaRepartos.stream().map(p->p.getDomi().getId()==id);
		Domiciliario domici;
		Domiciliario domi = null;
		boolean encontrado = false;
		for (int i = 0; i < listaRepartos.size(); i++) {
			if(listaRepartos.get(i).getDomi().getId()==id) {
				encontrado = true;
				domici = listaRepartos.get(i).getDomi();
				System.out.print("Identificacion: ");
				System.out.print(id);
				System.out.print("\nNombre: ");
				String nombre = domici.getNombre();
				System.out.print(nombre);
				System.out.print("\nFecha de nacimiento: ");
				String fechaNaci = domici.getFechaNac();
				System.out.print(fechaNaci);
				System.out.print("\nNacionalidad:");
				String nacionalidad = domici.getNacionalidad();
				System.out.println(nacionalidad);
				//Domiciliario domi = new Domiciliario(id,nombre,fechaNaci,nacionalidad);
				domi = new Domiciliario(id,nombre,fechaNaci,nacionalidad);
				//if(estado) {
					//int n = domi.getnDomicilioP();
					//domi.setnDomicilioP(estado);
					//domi.setValorDeven(estado);
				//}else{
					//domi.setnDomicilioP(estado);
					//domi.setValorDeven(estado);
					///int n = domi.getnDomicilioP();
					//domi.setnDomicilioP(n);
					//domi.setValorDeven(estado);
					//int n = domi.getnDomicilioP();
					//domi.setValorDeven(n);
				//}
				//domi.setnDomicilioP();
				//domi.setValorDeven();
				break;
			}
		}
		if(!encontrado) {
			System.out.print("Nombre: ");
			String nombre = nomAleatorioDomici();
			//String nombre = leerDato.next();
			System.out.print(nombre);
			System.out.print("\nIdentificacion: ");
			//int id = (int) (Math.random()*(1999999999-1000000000+1)+1000000000);
			//int id = leerDato.nextInt();
			System.out.print(id);
			System.out.print("\nFecha de nacimiento: ");
			String fechaNac = fechaNacAlea();
			//String fechaNac = leerDato.next();
			System.out.print(fechaNac);
			System.out.print("\nNacionalidad:");
			String nacionalidad = nacionalidad();
			System.out.println(nacionalidad);
			//Domiciliario domi = new Domiciliario(id,nombre,fechaNac,nacionalidad);
			domi = new Domiciliario(id,nombre,fechaNac,nacionalidad);
			//domi.setnDomicilioPP();
			//domi.setValorDevenn();
			
		}
		/*if(estado) {
			int n=1;
			if(n>1) {
				domi.setnDomicilioP(estado);
				domi.setValorDeven(estado, n);
				n--;
			}else {
			domi.setnDomicilioP(estado);
			int nv = nVeces(id);
			domi.setValorDeven(estado, nv);
			}
			//int n = domi.getnDomicilioP();
			
			//domi.setnDomicilioP(estado);
			//domi.setValorDeven(estado);
		}else{
			domi.setnDomicilioP(estado);
			domi.setValorDeven(estado);
		}*/
		//estado(estado, domi, id);
		//domi;
		
		
		//Domiciliario dom = inscripcionDomi();
		//System.out.print(domi);
		System.out.print("UPZ: ");
		String upz = UPZ();
		System.out.print(upz);
		//System.out.print("\nFecha: ");
		//String fecha = fechaA();
		//System.out.print(fecha);
		System.out.print("\nCliente: ");
		Cliente cl = datosCliente();
		//System.out.print(cl);
		/*System.out.print("\nEntregado: ");
		int e = (int) (Math.random()*(1-0+1)+0);
		boolean estado = true;
		if(e==1) {
			estado = true;
			//domi.setnDomicilioP();
			//domi.setValorDeven();
		}else{
			estado = false;
			//domi.setnDomicilioPP();
			//domi.setValorDevenn();
		}
		System.out.println(estado);
		System.out.println();*/
		/*if(estado) {
			domi.setnDomicilioP();
			domi.setValorDeven();
			
			//dom.setnDomicilioP();
			//dom.setValorDeven();
			
			//int n = dom.getnDomicilioP()+1;
			//System.out.println(n);
			//dom.setnDomicilioP(n);
			//dom.setValorDeven(n);
			//System.out.println(dom.getnDomicilioP());
		}else {
			domi.setnDomicilioPP();
			domi.setValorDevenn();
			//int n = dom.getnDomicilioP();
			//dom.setnDomicilioP(n);
			//dom.setValorDeven();
			//int a = dom.getnDomicilioP();
			//dom.setValorDeven(a);
		}*/
		Reparto re = new Reparto(nReparto,upz,cl,estado,domi);
		/*if(estado) {
			int n = dom.getnDomicilioP()+1;
			System.out.println(n);
			dom.setnDomicilioP(n);
			dom.setValorDeven(n);
			//System.out.println(dom.getnDomicilioP());
		}*/
		/*if(estado) {
			int n = re.getNumeroDomi()+1;
			re.setNumeroDomi(n);
		}*/
		return re;
	}
	
	public static void estado(boolean estado, Domiciliario domi, int id) {
		if(estado) {
			
			//domi.setnDomicilioP(estado);
			int nv = nVeces(id);
			domi.setnDomicilioP(estado,nv);
			domi.setValorDeven(estado, nv);
			
			//int n = domi.getnDomicilioP();
			
			//domi.setnDomicilioP(estado);
			//domi.setValorDeven(estado);
		}else{
			//domi.setnDomicilioP(estado);
			int nv = nVeces(id);
			domi.setnDomicilioP(estado,nv);
			domi.setValorDeven(estado,nv);
		}
	}
	
	public static ArrayList<Reparto> listadoDomi() {
		Reparto re = reparto();
		listaRepartos.add(re);
		return listaRepartos;
	}
	
	public static int nVeces(int id) {
		int n=0;
		for (int i = 0; i < listaRepartos.size(); i++) {
			if(listaRepartos.get(i).getDomi().getId()==id && listaRepartos.get(i).isEntregado()) {
				n++;
			}
		}
		return n;
		
	}
	
	public static void imprimir() {
		listaRepartos.forEach(System.out::println);
	}
	
	public static void listadoDomicilios() {
		System.out.println("Cuantos domiciliarios estan inscritos? ");
		int n = leerDato.nextInt();
		for (int i = 0; i < n; i++) {
			Reparto re = reparto();
			listaRepartos.add(re);
		}
	}
	
	public static void listadoDomiciliosS(String dia,int semana) {
		System.out.println("Cuantos domiciliarios estan inscritos? ");
		int n = leerDato.nextInt();
		for (int i = 0; i < n; i++) {
			Reparto re = repartoO();
			listaRepartos.add(re);
			re.setFecha(dia);
			re.setSemana(semana);
			boolean estado = re.isEntregado();
			Domiciliario domi = re.getDomi();
			int id = domi.getId();
			estado(estado, domi, id);
			//listaRepartos.add(re);
		}
	}
	
	public static void orderId() {
		System.out.println("Lista de repartos ordenados por la identificacion del domiciliario: ");
		Comparator<Reparto> ordId = (p1,p2)->Integer.compare(p1.getDomi().getId(),p2.getDomi().getId());
		listaRepartos.sort(ordId);
		imprimir();
	}
	
	public static void orderUpz() {
		System.out.println("Lista de repartos ordenados por la UPZ: ");
		listaRepartos.sort(Comparator.comparing(Reparto::getUPZ));
		imprimir();
	}
	
	public static void conteoTrueDia(String dia,int semana) {
		int conteo = (int)listaRepartos.stream().filter(p->p.isEntregado()).filter(p->p.getSemana()==semana).filter(p->p.getFecha().equals(dia)).count();
		System.out.println("\n\nN° de repartos entregados: " + conteo);
	}
	
	public static void conteoSalario(int semana) {
		for (int i = 0; i < listaRepartos.size(); i++) {
			Reparto re = listaRepartos.get(i);
			int valorDeven = re.getDomi().getValorDeven();
			re.getDomi().setSalario(valorDeven,semana);
		}
	}
	
	public static void runi() {
		int op=0;
		int nDias=0;
		boolean salir = false;
		System.out.println("Bienvenido a Repartos Bogota S.A.");
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Lunes");
			System.out.println("2. Martes");
			System.out.println("3. Miercoles");
			System.out.println("4. Jueves");
			System.out.println("5. Viernes");
			System.out.println("6. Sabado");
			System.out.println("7. Domingo");
			System.out.println("8. Data semana");
			System.out.println("9. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			String dia;
			switch(op) {
				case 1:
					dia="Lunes";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					//a = conteoTrue();
					//System.out.println(a);
					break;
				case 2:
					dia="Martes";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					//b = conteoTrue();
					//System.out.println(b-a);
					break;
				case 3:
					dia="Miercoles";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					break;
				case 4:
					dia="Jueves";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					break;
				case 5:
					dia="Viernes";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					break;
				case 6:
					dia="Sabado";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					break;
				case 7:
					dia="Domingo";
					//listadoDomiciliosS(dia);
					//conteoTrueDia(dia);
					nDias++;
					break;
				case 8:
					if(nDias==7) {
						System.out.println("Semana completa");
						//conteoSalario();
						System.out.println();
						orderId();
						System.out.println();
						orderUpz();
					}else {
						int rest=7-nDias;
						System.out.println("Semana incompleta, faltan " +  rest + " dias por registrar");
						System.out.println();
						orderId();
						System.out.println();
						orderUpz();
					}
					break;
				case 9:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 9");
					break;
			}
			System.out.println("___________");
			System.out.println(" ");
		}
	}
	
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
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 2:
				dia="Martes";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 3:
				dia="Miercoles";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 4:
				dia="Jueves";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 5:
				dia="Viernes";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 6:
				dia="Sabado";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 7:
				dia="Domingo";
				listadoDomiciliosS(dia,semana);
				conteoTrueDia(dia,semana);
				nDias++;
				break;
			case 8:
				if(nDias==7) {
					System.out.println("Semana completa");
					conteoSalario(semana);
					obtenerSaldo();
					System.out.println();
					orderId();
					System.out.println();
					orderUpz();
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
				//break;
			}
		}while(op1>=1 && op1<=8);
	}
	
	public static void obtenerSaldo() {
		List<Integer> listaId = new ArrayList<Integer>();
		for (int i = 0; i < listaRepartos.size(); i++) {
			int id=listaRepartos.get(i).getDomi().getId();
			Optional<Integer> idD = listaId.stream().filter(p->p==id).findFirst();
			if(idD.isPresent()) {
				break;
			}else {
				listaId.add(id);
		}
			//for (int j = 0; j < listaId.size(); j++) {
			//	if(listaId.get(i)==id) {
			//		listaId.add(id);
			//	}
			//}
			
			//if(listaId.get(i)==id) {
			//	listaId.add(id);
			//}
		}
		for (int i = 0; i < listaId.size(); i++) {
			List<Reparto> idDo = null;
			int j = listaId.get(i);
			idDo = listaRepartos.stream().filter(p->p.getDomi().getId()==j).collect(Collectors.toList());
			Optional<Reparto> idDomi =idDo.stream().max((p1,p2)->Integer.compare(p1.getDomi().getSalario(),p2.getDomi().getSalario()));
			if(idDomi.isPresent()) {
				System.out.println("Saldo domiciliario "+ j + " : "+ idDomi.get().getDomi().getSalario());
			}else {
				System.out.println("No se han encontrado personas que cumplan el requisito");
			}
		}
		
		/*List<Reparto> idDo = null;
		idDo = listaRepartos.stream().filter(p->p.getDomi().getId()==1).collect(Collectors.toList());
		Optional<Reparto> idDomi =idDo.stream().max((p1,p2)->Integer.compare(p1.getDomi().getSalario(),p2.getDomi().getSalario()));
		if(idDomi.isPresent()) {
			System.out.println("Saldo domiciliario 1: " + idDomi.get().getDomi().getSalario());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}*/
	}
	
	public static void run() {
		int op=0;
		int nDias=0;
		//boolean salir = false;
		System.out.println("Bienvenido a Repartos Bogota S.A.");
		System.out.println("----------------------------------------------");
		do {
			System.out.println("1. Semana 1");
			System.out.println("2. Semana 2");
			System.out.println("3. Semana 3");
			System.out.println("4. Semana 4");
			System.out.println("5. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			String dia=null;
			switch(op) {
				case 1:
					int semana = 1;
					opciones(dia,nDias,semana);
					break;
				case 2:
					nDias=0;
					semana = 2;
					opciones(dia,nDias,semana);
					break;
				case 3:
					nDias=0;
					semana = 3;
					opciones(dia,nDias,semana);
					break;
				case 4:
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
	
	public static void main(String[] args) {
		//run();
		run();
	}

}
