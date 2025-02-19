package modeloVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * @author Laura Ojeda & Daniel Velasquez
 *
 */
public class OperacionVA implements IOperacionAlquiler{
	private Scanner in = new Scanner(System.in);
	private Scanner inN;
	private String cadena;
	private String[] cl;
	private String[] vh;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	private ArrayList<Alquiler> vehAlq = new ArrayList<>();
	
	public boolean estado() {
		if(clientes.isEmpty() && vehiculos.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void llenarData() {
		if(estado()) {
			try{
				inN = new Scanner (new File("./data/cliente.txt"));
				while(inN.hasNextLine()) {
					cadena=inN.nextLine();
					genListaClientes(cadena);
				}
				inN = new Scanner(new File("./data/vehiculo.txt"));
				while(inN.hasNextLine()) {
					cadena=inN.nextLine();
					genListaVehiculos(cadena);
				}

			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			System.out.println("Data importada");
		}else {
			System.out.println("Data ya importada");
		}
	}
	
	public void genListaClientes(String cadena) {
		cl = cadena.split(" ");
		clientes.add(new Cliente(cl[0],cl[2]+" "+cl[1],cl[3],new Fecha(cl[4],cl[5]),new Fecha(cl[6],cl[7]),cl[8],cl[9],cl[10]));
	}
	
	public void genListaVehiculos(String cadena) {
		vh = cadena.split(" ");
		vehiculos.add(new Vehiculo(vh[0],vh[1],vh[2],vh[3],vh[4],vh[5],Double.parseDouble(vh[6]),false));
	}

	@Override
	public void alquilar(String id) {
		if(clientes.stream().filter(p->p.getId().equals(id)).findAny().isPresent()) {
			System.out.println("Bienvenido!");
			System.out.println("Autos disponibles:\n");
			consultaAutosDisponibles();
			System.out.print("¿Cual vehiculo desea alquilar?\nDigite la placa:");
			String placa = in.next();
			boolean find = false;
			while(!find) {
				if(vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().isPresent()) {
					Vehiculo vh = vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().get();
					vh.setEnCirculacion(true);
					addAlquiler(id, placa);
					find = true;
				}else {
					System.out.println("Vehiculo no disponible");
				}
			}
			
			System.out.println("\nEl vehiculo de placa " + placa  + " ha sido alquilado");
			
		}else {
			System.out.println("El cliente con id: " + id + " no esta registrado");
		}
		
	}
	
	public void addAlquiler(String id, String placa) {
		//Random r = new Random();
		//int mes = r.nextInt((6-1)-1)+1;
		//int dia = r.nextInt((15-1)-1)+1;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String f = dtf.format(LocalDateTime.now());
		String[] date = f.split(" "); 
        //System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
		
		//String fechaA = dia+"/"+mes+"/21";
		//String hour = r.nextInt(24)+":"+r.nextInt(60);
		Fecha fechaAlq = new Fecha(date[0],date[1]);
		String observacion = "Se entrega en buen estado";
		vehAlq.add(new Alquiler(id,placa,fechaAlq,false,observacion));
	}
	
	@Override
	public void devolver(String id) {
		if(vehAlq.stream().filter(p->p.getCodCliente().equals(id)).findAny().isPresent()) {
			System.out.println("Automoviles a su nombre:");
			List<Alquiler> vehCl = vehAlq.stream().filter(p->p.getCodCliente().equals(id)).collect(Collectors.toList());
			for (int i = 0; i < vehCl.size(); i++) {
				System.out.println("\t" + vehCl.get(i));
			}
			System.out.println("¿Cual vehiculo va a devolver?\nIngrese la placa:");
			String placa = in.next();
			boolean find = false;
			while(!find) {
				if(vehCl.stream().filter(p->p.getCodVh().equals(placa)).findAny().isPresent()) {
					Alquiler alq = vehCl.stream().filter(p->p.getCodVh().equals(placa)).findAny().get();
					remAlquiler(alq);
					Vehiculo vh = vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().get();
					vh.setEnCirculacion(false);
					find = true;
				}else {
					System.out.println("Vehiculo no esta disponible");
				}
			}
			System.out.println("\nEl vehiculo de placa " + placa  + " ha sido devuelto");
			
		}else {
			System.out.println("El cliente con id: " + id + " no esta registrado");
		}
	}
	
	public void remAlquiler(Alquiler alq) {
		Random r = new Random();
		
		String[] obs = {"En buen estado","Vehiculo con llantas desinfladas","Vehiculo rayado"};
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String f = dtf.format(LocalDateTime.now());
		String[] dateDev = f.split(" "); 
		String[] dmaDev = dateDev[0].split("/");
		
		int diaAl = r.nextInt((30-1)-1)+1;
		int day = diaAl + Integer.parseInt(dmaDev[0]);
		int month = Integer.parseInt(dmaDev[1]);
		if(day>30) {
			day = day-30;
			month += 1;
		}
		
		String fechaD = day+"/"+month+"/21";
		String hour = r.nextInt(24)+":"+r.nextInt(60);
		Fecha fechaDev = new Fecha(fechaD,hour);
		
		String daAlq = alq.getFechaAlquiler().getFecha() + " " + alq.getFechaAlquiler().getHora();
		String[] dateAlq = daAlq.split(" ");
		//System.out.println(alq.getFechaAlquiler().getFecha());
		String[] dmaAlq = dateAlq[0].split("/");
		
		int dayF = 0;
		int newD = 0;
		if(Integer.parseInt(dmaAlq[1]) < month) {
			dayF = day + 30;
			newD = dayF - Integer.parseInt(dmaAlq[0]);
		}else {
			dayF = day;
			newD = dayF - Integer.parseInt(dmaAlq[0]);
		}
		
		int hourTotal = newD*24;
		
		
		String[] hAlq = dateAlq[1].split(":");
		int hA = 24 - Integer.parseInt(hAlq[0]);
		int mA = 60 - Integer.parseInt(hAlq[1]);
		
		String[] hDev = dateDev[1].split(":");
		int hD = 24 - Integer.parseInt(hDev[0]);
		int mD = 60 - Integer.parseInt(hDev[1]);
		
		int cantHpMin = (mA+mD)/60;
		hourTotal += hA+hD+cantHpMin;
		
		//int horas = r.nextInt((40-1)-1)+1;
		int km = r.nextInt((800-1)-1)+1;
		Pago pg = new Pago(alq.getCodVh(),hourTotal,km);
		
		int i = r.nextInt(obs.length);
		String observacion = obs[i];
		
		int precio = (int)vehiculos.stream().filter(p->p.getPlaca().equals(alq.getCodVh())).findAny().get().getPrecio();
		
		alq.setTotalH(hourTotal);
		alq.setTotalKm(km);
		alq.setFechaDevolucion(fechaDev);
		alq.setPago(pg);
		alq.setTotalCobro(precio);
		alq.setDevuelto(true);
		alq.setObservaciones(observacion);
	}

	@Override
	public void consultaCliente(String id) {
		if(clientes.stream().filter(p->p.getId().equals(id)).findAny().isPresent()) {
			Cliente cl = clientes.stream().filter(p->p.getId().equals(id)).findAny().get();
			System.out.println("Datos del cliente: ");
			System.out.print("\t");
			System.out.println(cl.toString());
		}else {
			System.out.println("El cliente no esta registrado");
		}
	}

	@Override
	public void consultaAutoPlaca(String placa) {
		if(vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().isPresent()) {
			Vehiculo vh = vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().get();
			System.out.println("Datos del vehiculo: ");
			System.out.print("\t");
			System.out.println(vh.toString());
		}else {
			System.out.println("El vehiculo no esta registrado");
		}
	}

	@Override
	public void consultaAutoMarca(String marca) {
		if(vehiculos.stream().filter(p->p.getMarca().equals(marca)).findAny().isPresent()) {
			System.out.println("Vehiculos  de la marca " + marca + ":");
			List<Vehiculo> veh = vehiculos.stream().filter(p->p.getMarca().equals(marca)).collect(Collectors.toList());
			for (int i = 0; i < veh.size(); i++) {
				System.out.println("\t" + veh.get(i));
			}
		}else {
			System.out.println("La marca no esta registrada");
		}
	}

	@Override
	public void consultaAutoColor(String color) {
		if(vehiculos.stream().filter(p->p.getColor().equals(color)).findAny().isPresent()) {
			System.out.println("Vehiculos  de color " + color + ":");
			List<Vehiculo> veh = vehiculos.stream().filter(p->p.getColor().equals(color)).collect(Collectors.toList());
			for (int i = 0; i < veh.size(); i++) {
				System.out.println("\t" + veh.get(i));
			}
		}else {
			System.out.println("La color no esta registrado");
		}
	}

	@Override
	public void consultaAutosAlquilados() {
		if(!vehAlq.isEmpty()) {
			System.out.println("VEHICULOS ALQUILADOS");
			for (int i = 0; i < vehAlq.size(); i++) {
				System.out.println("\t" + vehAlq.get(i));
			}
		}else {
			System.out.println("No ha sido rentado ningun vehiculo");
		}
	}

	@Override
	public void consultaAutosDisponibles() {
		System.out.println("LISTADO VEHICULOS DISPONIBLES");
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).isEnCirculacion()==false) {
				System.out.println("\t" + vehiculos.get(i));
			}
		}
	}

	@Override
	public void consClientesMorosos() {
		if(vehAlq.stream().filter(p->p.isDevuelto()==false).findAny().isPresent()) {
			System.out.println("Clientes que no han devuelto el vehiculo:");
			List<Alquiler> veh = vehAlq.stream().filter(p->p.isDevuelto()==false).collect(Collectors.toList());
			for (int i = 0; i < veh.size(); i++) {
				String idCl = veh.get(i).getCodCliente();
				Cliente cl = clientes.stream().filter(p->p.getId().equals(idCl)).findAny().get();
				System.out.println("Datos cliente:");
				System.out.println("\tNombre: " + cl.getNombre() + "\n\tDireccion: " + cl.getDomicilio() + "\n\tCodigo: " + cl.getCod());
				String placa = veh.get(i).getCodVh();
				Vehiculo vh = vehiculos.stream().filter(p->p.getPlaca().equals(placa)).findAny().get();
				System.out.println("Datos vehiculo:");
				System.out.println("\tPlaca: " + vh.getPlaca() + "\n\tMarca: " + vh.getMarca() + "\n\tModelo: " + vh.getModelo());
			}
			System.out.println("\n\n");
		}else {
			System.out.println("Todos los vehiculos han sido devueltos");
		}
		
	}

	@Override
	public void actualizarDataCliente(String id) {
		if(clientes.stream().filter(p->p.getId().equals(id)).findAny().isPresent()) {
			Cliente cl = clientes.stream().filter(p->p.getId().equals(id)).findAny().get();
			System.out.println("Datos del cliente: ");
			System.out.println("Id: " + id);
			System.out.println("Nombre: " + cl.getNombre());
			System.out.println("Fecha nacimiento: " + cl.getFechaNac());
			System.out.print("Codigo: ");
			String cod = in.next();
			System.out.print("\nDomicilio: ");
			String dom = in.next();
			
			System.out.print("\nFecha alta: ");
			String day = in.next();
			System.out.print("/");
			String month = in.next();
			System.out.print("/");
			String year = in.next();
			
			System.out.print("\nHora: ");
			String hora = in.next();
			System.out.print(":");
			String min = in.next();
			
			System.out.print("\nNumero tarjeta: ");
			String numTarj = in.next();
			System.out.print("\nTipo tarjeta: ");
			String tipTarj = in.next();
			
			cl.setCod(cod);
			cl.setDomicilio(dom);
			cl.setFechaAlta(new Fecha(day+"-"+month+"-"+year, hora+":"+min));
			cl.setTarjNum(numTarj);
			cl.setTipTarj(tipTarj);
			
			System.out.println("\nEl cliente con id " + id + " ha sido actualizado");
		}else {
			System.out.println("El cliente no esta registrado");
		}
	}
	
	//int[] count = new int[vehiculos.size()];
	ArrayList<Integer> count = new ArrayList<>();
	public void addCount() {
		if(count.isEmpty()) {
			for (int i = 0; i < vehiculos.size(); i++) {
				Vehiculo vh = vehiculos.get(i);
				if(vehAlq.stream().filter(p->p.getCodVh().equals(vh.getPlaca())).findAny().isPresent()) {
					count.add(1);
				}else {
					count.add(0);
				}
			}
		}
		
	}
	
	@Override
	public void mediaAquileres() {
		addCount();
		ArrayList<Integer> countM = (ArrayList<Integer>) count.stream().collect(Collectors.toList());
		double suma = 0;
		//String numerador = "";
		for (int i = 0; i < countM.size(); i++) {
			 suma += countM.get(i);
			 /*if(i!=countM.size()-1) {
				 numerador += countM.get(i) + "+";
			 }else {
				 numerador += countM.get(i) + "";
			 }*/
		}
		System.out.println("MEDIA:");
		//System.out.println("(" + numerador + ")/" + countM.size());
		double media = suma/countM.size();
		System.out.println("La media de vehiculos alquilados \ncon respecto a los vehiculos disponibles es: " + Math.round(media*100.0)/100.0);
	}

	@Override
	public void mediaRecortadaAlquileres() {
		addCount();
		ArrayList<Integer> countR = (ArrayList<Integer>) count.stream().collect(Collectors.toList());
		System.out.println("Media recortada al 10%");
		//int cal = count.length*(10/100);
		int cal = Math.round(countR.size()*(10/100));
		countR.stream().sorted();
		for (int i = 0; i < cal; i++) {
			countR.set(i, 0);
		}
		
		for (int i = countR.size()-1; i > (countR.size()-cal); i--) {
			countR.set(i, 0);
		}
		double suma = 0;
		//String numerador = "";
		for (int i = 0; i < countR.size(); i++) {
			 suma += countR.get(i);
			 /*if(i!=countR.size()-1) {
				 numerador += countR.get(i) + "+";
			 }else {
				 numerador += countR.get(i) + "";
			 }*/
		}
		//System.out.println("(" + numerador + ")/" + countR.size());
		System.out.println("MEDIA RECORTADA:");
		double mediaR = suma/countR.size();
		System.out.println("La media recortada de vehiculos alquilados es: " + Math.round(mediaR*100.0)/100.0);
	}

	@Override
	public void mediaWinzorizadaAlquileres() {
		addCount();
		ArrayList<Integer> countW = (ArrayList<Integer>) count.stream().collect(Collectors.toList());
		System.out.println("MEDIA WINZORIZADA AL 10%");
		countW.stream().sorted();
		int cal = 3;
		int c = 1;
		for (int i = 0; i < cal; i++) {
			for (int j = 0; j < c; j++) {
				countW.set(j, countW.get(i+1));
			}
			for (int j = count.size()-1; j > (countW.size()-c); j--) {
				countW.set(j, countW.get(j-1));
			}
			
			double suma = 0;
			//String numerador = "";
			for (int j = 0; j < countW.size(); j++) {
				 suma += countW.get(j);
				 /*if(j!=countW.size()-1) {
					 numerador += countW.get(j) + "+";
				 }else {
					 numerador += countW.get(j) + "";
				 }*/
			}
			//System.out.println("(" + numerador + ")/" + countW.size());
			double mediaW = suma/countW.size();
			System.out.println("La media winsorizada del nivel " + c  + " es: "+ Math.round(mediaW*100.0)/100.0);
			c++;
		}
	}

	@Override
	public void varianza() {
		addCount();
		double suma = 0;
		for (int i = 0; i < count.size(); i++) {
			 suma += count.get(i);
		}
		double media = suma/count.size();
		double sum = 0;
		for (int i = 0; i < count.size(); i++) {
			sum += Math.pow((count.get(i)-media), 2);
		}
		double var = (sum/count.size());
		System.out.println("VARIANZA: ");
		System.out.println("La varianza es: "+ Math.round(var*100.0)/100.0);
	}
	
	Map<Vehiculo, Double> velocidadesVeh = new HashMap<Vehiculo, Double>();
	@Override
	public void mediaArmonicaVelocidadesAutos() {
		if(velocidadesVeh.isEmpty()) {
			for (int i = 0; i < vehiculos.size(); i++) {
				Random r = new Random();
				int vel = r.nextInt(200);
				velocidadesVeh.put(vehiculos.get(i), (double)vel);
			}
		}
		double sum = 0;
		for (Double value : velocidadesVeh.values()) {
			sum += (1/value);
		}
		
		double roundSuma = Math.round(sum*100.0)/100.0;
		double denominador = (1/Double.valueOf(vehiculos.size()))*(roundSuma);
		double mediaArm = (1/denominador);
		System.out.println("MEDIA ARMONICA DE LAS VELOCIDADES: ");
		System.out.println("La media armonica de las velocidades de los autos es: " + Math.round(mediaArm*100.0)/100.0);
	}

	@Override
	public void imprimirListados() {
		imprimirListClientes();
		imprimirListVeh();
	}
	
	public void imprimirListClientes() {
		System.out.println("LISTADO CLIENTES");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("\t" + clientes.get(i));
		}
	}
	
	public void imprimirListVeh() {
		System.out.println("\nLISTADO VEHICULOS");
		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println("\t" + vehiculos.get(i));
		}
	}
	
	
	
}
