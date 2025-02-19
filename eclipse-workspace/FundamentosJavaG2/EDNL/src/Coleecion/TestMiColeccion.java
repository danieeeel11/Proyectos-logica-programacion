package Coleecion;

public class TestMiColeccion {
private MiColeccion mc;
	
	public TestMiColeccion() {
		this.mc = new MiColeccion();
	}
	
	public void procesarDatos() {
		 System.out.println("Mi Coleccion Maps");
	       
		 //insertar al final de la lista
	        mc.anexarRegistro("120",new Estudiante("Flor","Caceres"));
	        mc.anexarRegistro("121",new Estudiante("Eduardo","Rey"));    
	        mc.anexarRegistro("122",new Estudiante("Martha","Rios"));
	        mc.anexarRegistro("123",new Estudiante("Luis","Navas"));
	        mc.anexarRegistro("124",new Estudiante("Oscar","Perez"));
	        mc.anexarRegistro("125",new Estudiante("Carlos","Rodriguez"));
	        mc.anexarRegistro("126",new Estudiante("Julieth","Hernandez"));
	           
	        //imprimir colección
	        mc.mostrarColeccion();
	        
	        //borrar un elementos
	        mc.borrarRegistro("122");
	        
	        //imprimir colección
	        mc.imprimirColeccionEstudiante1();;
	        
	             
	      //actualizar o sobreescribir datos de la colección
	        mc.actualizarRegistro("123",new Estudiante("Luis Alfredo","Navas Ruiz"));
	        mc.imprimirColeccion();
	       
	        //imprimir colección
	        mc.imprimirColeccionEstudiante2();
	      
	}

    public static void main(String[] args) {
      TestMiColeccion tm = new TestMiColeccion();
      tm.procesarDatos();
       
    }
}
