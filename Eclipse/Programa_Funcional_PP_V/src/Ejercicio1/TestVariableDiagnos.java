package Ejercicio1;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * Clase principal que contiene el main del Ejercicio1, que contiene los metodos contendidos en el run()
 * Se ejecutan operaciones con un listado de la clase Diagnostico
 * @author Laura Sofia Ojeda Leon & Daniel Felipe Velasquez Rincon
 * @version 2
 * @since 13-05-2021
 */
public class TestVariableDiagnos {
	private List<Diagnostico> listaDiagnostico;
	Scanner leerDato =new Scanner(System.in);
	
	//Constructor de la clase TestVariableDiagnos()
	public TestVariableDiagnos(){
		
	}
	//Metodo para extraer los datos del archivo Diabetes y asignarlo a un listado
	public void extraerDiagnostico() {
		System.out.println("Datos de los diagnosticos extraidos");
		try {
			this.listaDiagnostico = Files.lines(Paths.get("./data/Diabetes.txt"))
					.map(l->new Diagnostico(Integer.parseInt(l.split(",")[0]),Integer.parseInt(l.split(",")[1])
							, Integer.parseInt(l.split(",")[2]), Integer.parseInt(l.split(",")[3]), Integer.parseInt(l.split(",")[4])
							, Float.parseFloat(l.split(",")[5]), Float.parseFloat(l.split(",")[6]), Integer.parseInt(l.split(",")[7])
							, l.split(",")[8])).collect(Collectors.toList());
			
		}catch(IOException exc) {
			System.out.println("Error procesando datos: " + exc.getMessage());
		}
	}
	//Metodo para obtener el total de registros en el archivo
	public void totalData() {
		int filaTotal = (int)listaDiagnostico.stream().count();
		System.out.println("Total de datos de diagnosticos en la lista: " + filaTotal);
	}
	//Metodo para calcular la suma total de cada dato de los registros
	public void sumaColumnas() {
		int sumaTotalEm = listaDiagnostico.stream().map(p->p.getnEmbarazo()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de embarazos: " + sumaTotalEm);
		int sumaTotalConGluc = listaDiagnostico.stream().map(p->p.getConGluc()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de concentracion de glucosa de todos los pacientes: " + sumaTotalConGluc);
		int sumaTotalPreArt = listaDiagnostico.stream().map(p->p.getPresionArterial()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de precion arterial de todos los pacientes: " + sumaTotalPreArt);
		int sumaTotalCutaneo = listaDiagnostico.stream().map(p->p.getPliegueCut()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de espesor de pliegue cutaneo de todos los pacientes: " + sumaTotalCutaneo);
		int sumaTotalInsulina = listaDiagnostico.stream().map(p->p.getInsulinaSeric()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de insulina serica de todos los pacientes: " + sumaTotalInsulina);
		int sumaTotalMasaCorp = listaDiagnostico.stream().map(p->(int)p.getMasaCorp()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de masa corporal de todos los pacientes: " + sumaTotalMasaCorp);
		int sumaTotalPedigri = listaDiagnostico.stream().map(p->(int)p.getPedrigriDiab()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de funcion del pedigri de la diabetes de todos los pacientes: " + sumaTotalPedigri);
		int sumaTotalEdad = listaDiagnostico.stream().map(p->p.getEdad()).reduce(0, (e1,e2)->e1+e2);
		System.out.println("Total de edades de todos los pacientes: " + sumaTotalEdad);
		//int positivos = listaDiagnostico.stream().map(p->p.getClase()).reduce(0, (e1,e2)->e1+e2);
		//int positivos = (int)listaDiagnostico.stream().map(p->p.getClase().equals("tested_positive")).count();
		int positivos = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive")).count();
		System.out.println("Total de pacientes con diabetes: " + positivos);
		int negativos = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_negative")).count();
		System.out.println("Total de pacientes sin diabetes: " + negativos);
	}
	//Metodo para obtener el valor maximo de cada dato de los registros
	public void maxColumna() {
		Optional<Diagnostico> mayorNEmb = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getnEmbarazo(),p2.getnEmbarazo()));
		if(mayorNEmb.isPresent()) {
			System.out.println("Valor maximo de embarazos: " + mayorNEmb.get().getnEmbarazo());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorConGluc = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getConGluc(),p2.getConGluc()));
		if(mayorConGluc.isPresent()) {
			System.out.println("Valor maximo de concentracion de glucosa: " + mayorConGluc.get().getConGluc());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorPreArt = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getPresionArterial(),p2.getPresionArterial()));
		if(mayorPreArt.isPresent()) {
			System.out.println("Valor maximo de presion arterial: " + mayorPreArt.get().getPresionArterial());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorCutaneo = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getPliegueCut(),p2.getPliegueCut()));
		if(mayorCutaneo.isPresent()) {
			System.out.println("Valor maximo de espesor del pliegue cutaneo: " + mayorCutaneo.get().getPliegueCut());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorInsulina = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getInsulinaSeric(),p2.getInsulinaSeric()));
		if(mayorInsulina.isPresent()) {
			System.out.println("Valor maximo de insulina serica de 2 horas: " + mayorInsulina.get().getInsulinaSeric());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorMasaCorp = listaDiagnostico.stream().max((p1,p2)->Float.compare(p1.getMasaCorp(),p2.getMasaCorp()));
		if(mayorMasaCorp.isPresent()) {
			System.out.println("Valor maximo de masa corporal: " + mayorMasaCorp.get().getMasaCorp());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorPedigri = listaDiagnostico.stream().max((p1,p2)->Float.compare(p1.getPedrigriDiab(),p2.getPedrigriDiab()));
		if(mayorPedigri.isPresent()) {
			System.out.println("Valor maximo de pedigri de la diabetes: " + mayorPedigri.get().getPedrigriDiab());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> mayorEdad = listaDiagnostico.stream().max((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
		if(mayorEdad.isPresent()) {
			System.out.println("Valor maximo de edad: " + mayorEdad.get().getEdad());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
	}
	//Metodo para obtener el valor minimo de cada dato de los registros
	public void minColumna() {
		Optional<Diagnostico> menorNEmb = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getnEmbarazo(),p2.getnEmbarazo()));
		if(menorNEmb.isPresent()) {
			System.out.println("Valor minimo de embarazos: " + menorNEmb.get().getnEmbarazo());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorConGluc = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getConGluc(),p2.getConGluc()));
		if(menorConGluc.isPresent()) {
			System.out.println("Valor minimo de concentracion de glucosa: " + menorConGluc.get().getConGluc());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorPreArt = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getPresionArterial(),p2.getPresionArterial()));
		if(menorPreArt.isPresent()) {
			System.out.println("Valor minimo de presion arterial: " + menorPreArt.get().getPresionArterial());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorCutaneo = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getPliegueCut(),p2.getPliegueCut()));
		if(menorCutaneo.isPresent()) {
			System.out.println("Valor minimo de espesor del pliegue cutaneo: " + menorCutaneo.get().getPliegueCut());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorInsulina = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getInsulinaSeric(),p2.getInsulinaSeric()));
		if(menorInsulina.isPresent()) {
			System.out.println("Valor minimo de insulina serica de 2 horas: " + menorInsulina.get().getInsulinaSeric());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorMasaCorp = listaDiagnostico.stream().min((p1,p2)->Float.compare(p1.getMasaCorp(),p2.getMasaCorp()));
		if(menorMasaCorp.isPresent()) {
			System.out.println("Valor minimo de masa corporal: " + menorMasaCorp.get().getMasaCorp());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorPedigri = listaDiagnostico.stream().min((p1,p2)->Float.compare(p1.getPedrigriDiab(),p2.getPedrigriDiab()));
		if(menorPedigri.isPresent()) {
			System.out.println("Valor minimo de pedigri de la diabetes: " + menorPedigri.get().getPedrigriDiab());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
		Optional<Diagnostico> menorEdad = listaDiagnostico.stream().min((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
		if(menorEdad.isPresent()) {
			System.out.println("Valor minimo de edad: " + menorEdad.get().getEdad());
		}else {
			System.out.println("No se han encontrado personas que cumplan el requisito");
		}
	}
	//Metodo para obtener el numero total de test positivos del archivo
	public void testPos() {
		int positivos = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive")).count();
		System.out.println("Total de pacientes con diabetes: " + positivos);
	}
	//Metodo para obtener el numero total de test negativos del archivo
	public void testNeg() {
		int negativos = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_negative")).count();
		System.out.println("Total de pacientes sin diabetes: " + negativos);
	}
	//Metodo para obtener el numero total de test positivos cuyas edades estan entre los 20 y 30 años del archivo
	public void testPos20_30() {
		int positivos20_30 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive"))
				.filter(p->p.getEdad()>=20).filter(p->p.getEdad()<=30).count();
		System.out.println("Total de pacientes con diabetes entre los 20 y 30 años: " + positivos20_30);
	}
	//Metodo para obtener el numero total de test positivos cuyas edades estan entre los 31 y 40 años del archivo
	public void testPos31_40() {
		int positivos31_40 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive"))
				.filter(p->p.getEdad()>=31).filter(p->p.getEdad()<=40).count();
		System.out.println("Total de pacientes con diabetes entre los 31 y 40 años: " + positivos31_40);
	}
	//Metodo para obtener el numero total de test negativos cuyas edades estan entre los 20 y 30 años del archivo
	public void testNeg20_30() {
		int negativos20_30 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_negative"))
				.filter(p->p.getEdad()>=20).filter(p->p.getEdad()<=30).count();
		System.out.println("Total de pacientes sin diabetes entre los 20 y 30 años: " + negativos20_30);
	}
	//Metodo para obtener el numero total de test negativos cuyas edades estan entre los 31 y 40 años del archivo
	public void testNeg31_40() {
		int negativos31_40 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_negative"))
				.filter(p->p.getEdad()>=31).filter(p->p.getEdad()<=40).count();
		System.out.println("Total de pacientes sin diabetes entre los 31 y 40 años: " + negativos31_40);
	}
	//Metodo para obtener el numero total de test positivos cuyas edades estan entre los 20 y 30 años, y que tengan cero embarazos del archivo
	public void testPosZeroEmb20_30() {
		int positivosZeroEmb20_30 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive"))
				.filter(p->p.getEdad()>=20).filter(p->p.getEdad()<=30).filter(p->p.getnEmbarazo()==0).count();
		System.out.println("Total de pacientes con diabetes entre los 20 y 30 años de cero embarazos: " + positivosZeroEmb20_30);
	}
	//Metodo para obtener el numero total de test positivos cuyas edades estan entre los 31 y 40 años, y que tengan cero embarazos del archivo
	public void testPosZeroEmb31_40() {
		int positivosZeroEmb31_40 = (int)listaDiagnostico.stream().filter(p->p.getClase().equals("tested_positive"))
				.filter(p->p.getEdad()>=31).filter(p->p.getEdad()<=40).filter(p->p.getnEmbarazo()==0).count();
		System.out.println("Total de pacientes con diabetes entre los 31 y 40 años de cero embarazos: " + positivosZeroEmb31_40);
	}
	//Metodo para obtener los numero de embarazos y ordenarlos de menor a mayor
	public void ordernEmbMenorMayor() {
		System.out.println("Numero de embarazos ordenados de menor a mayor");
		listaDiagnostico.stream().sorted((p1,p2)->Integer.compare(p1.getnEmbarazo(), p2.getnEmbarazo())).map(p->p.getnEmbarazo() + ",").forEach(System.out::print);
	}
	//Metodo donde se aplica el range() para imprimir el listado de diagnosticos con numero de embarazos mayores a 10
	public void range() {
		System.out.println("Listado de diagnosticos con un numero de embarazos mayor que 10: ");
		List<Diagnostico> nEmb = listaDiagnostico.stream().filter(p->p.getnEmbarazo()>10).sorted((p1,p2)->Integer.compare(p1.getnEmbarazo(), p2.getnEmbarazo())).collect(Collectors.toList());
	    IntStream.range(0, nEmb.size()).forEach(index -> System.out.println(nEmb.get(index)));
	}
	//Metodo donde se aplica el distinct para determinar si hay registros repetidos en el archivo
	public void distinct() {
		int diferentes = (int)listaDiagnostico.stream().distinct().count();
		if(diferentes == listaDiagnostico.size()) {
			System.out.println("No hay datos repetidos en el registro");
		}else{
			System.out.println("Hay " + (listaDiagnostico.size()-diferentes) + " registros repetidos");
		}
	}
	//Metodo para obtener la media de cada dato del archivo
	public void mediaValores() {
		OptionalDouble mediaNEmb = listaDiagnostico.stream().mapToInt(p->p.getnEmbarazo()).average();
		if (mediaNEmb.isPresent()) {
			System.out.println("Media de embarazos: " + (float)mediaNEmb.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaConGluc = listaDiagnostico.stream().mapToInt(p->p.getConGluc()).average();
		if (mediaConGluc.isPresent()) {
			System.out.println("Media de concentracion de glucosa: " + (float)mediaConGluc.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaPreArt = listaDiagnostico.stream().mapToInt(p->p.getPresionArterial()).average();
		if (mediaPreArt.isPresent()) {
			System.out.println("Media de presion arterial: " + (float)mediaPreArt.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaCut = listaDiagnostico.stream().mapToInt(p->p.getPliegueCut()).average();
		if (mediaCut.isPresent()) {
			System.out.println("Media de espesor del pliegue cutaneo: " + mediaCut.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaInsulina = listaDiagnostico.stream().mapToInt(p->p.getInsulinaSeric()).average();
		if (mediaInsulina.isPresent()) {
			System.out.println("Media de insulina serica: " + (float)mediaInsulina.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaMasaCorp = listaDiagnostico.stream().mapToInt(p->(int)p.getMasaCorp()).average();
		if (mediaMasaCorp.isPresent()) {
			System.out.println("Media de masa corporal: " + (float)mediaMasaCorp.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaPedigri = listaDiagnostico.stream().mapToInt(p->(int)p.getPedrigriDiab()).average();
		if (mediaPedigri.isPresent()) {
			System.out.println("Media de fuente de pedigri de la diabetes: " + (float)mediaPedigri.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
		
		OptionalDouble mediaEdad = listaDiagnostico.stream().mapToInt(p->p.getEdad()).average();
		if (mediaEdad.isPresent()) {
			System.out.println("Media de edades: " + mediaEdad.getAsDouble());
		}else {
			System.out.println("No se puede calcular la media");
		}
	}
	//Metodo run donde se aplica un menu de opciones donde se implementan los metodos de la clase
	public void run() {
		extraerDiagnostico();
		int op=0;
		boolean salir = false;
		System.out.println("Bienvenido al registro del consultorio");
		System.out.println("----------------------------------------------");
		while(!salir) {
			System.out.println("1. Total de registros");
			System.out.println("2. Totales de cada dato del registro");
			System.out.println("3. Valores maximos de cada dato del registro");
			System.out.println("4. Valores minimos de cada dato del registro");
			System.out.println("5. Estadistica de pacientes con y sin diabetes");
			System.out.println("6. Numero de embarazos ordenados de menor a mayor");
			System.out.println("7. Lista de diagnosticos con numero de embarazos mayores a 10");
			System.out.println("8. Determinar si hay registros repetidos");
			System.out.println("9. Media de cada dato del registro");
			System.out.println("10. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					totalData();
					break;
				case 2:
					sumaColumnas();
					break;
				case 3:
					maxColumna();
					break;
				case 4:
					minColumna();
					break;
				case 5:
					testPos();
					testPos20_30();
					testPos31_40();
					testPosZeroEmb20_30();
					testPosZeroEmb31_40();
					System.out.println();
					testNeg();
					testNeg20_30();
					testNeg31_40();
					break;
				case 6:
					ordernEmbMenorMayor();
					break;
				case 7:
					range();
					break;
				case 8:
					distinct();
					break;
				case 9:
					mediaValores();
					break;
				case 10:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 10");
					break;
			}
			System.out.println("___________");
			System.out.println(" ");
		}
	}
	//Metodo main para ejecutar el metodo run
	public static void main(String[] args) {
		TestVariableDiagnos tVD = new TestVariableDiagnos();
		tVD.run();
	}

}
