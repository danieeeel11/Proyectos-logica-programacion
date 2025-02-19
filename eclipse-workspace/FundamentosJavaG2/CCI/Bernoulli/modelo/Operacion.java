package modelo;

public class Operacion {
	
	double sp = 0;
	/**
	 * Metodo para generar la forma compacta del teorema de bernoulli
	 * @param s espacio muestral
	 * @param n numero eventos exitosos 
	 */
	public void accion(double s, double n) {
		double p = n/s;
		int x = 0;
		sp = s;
		double formula = Math.pow(p, x)*Math.pow((1-p), 1-x);
		
		System.out.println("\nFoma compacta: ");
		System.out.println("f(x)=P(X=x) = p^x * (1-p)^(1-x);   x=0, 1->x~Be(p)");
		System.out.println("\t= (" + simplificar(fraccion(p)) + ")^x * (1-" + simplificar(fraccion(p)) + ")^(1-x);   x=0, 1->x~Be(" + simplificar(fraccion(p)) + ")");
		System.out.println("\t= (" + simplificar(fraccion(p)) + ")^" + x + " * (1-" + simplificar(fraccion(p)) + ")^(1-" + x +") "
				+ "= " + simplificar(fraccion(Math.pow(p, x))) + "*" + simplificar(fraccion(Math.pow((1-p), 1-x))) 
				+ " = " + simplificar(fraccion(formula)) + " ~ " + Math.round(formula*100.0)/100.0);
		
		System.out.println("\nDistribucion de x:");
		System.out.println("Fracaso (0): " + simplificar(fraccion(formula)) + " ~ " + Math.round(formula*100.0)/100.0);
		System.out.println("Exito (1): " + simplificar(fraccion(p)) + " ~ " + Math.round(p*100.0)/100.0);
	}
	
	
	/**
	 * Metodo para convertir decimal a fraccion
	 * @param decimal 
	 */
	public String fraccion(double decimal) {
        if (decimal < 0){
            return "-" + fraccion(-decimal);
        }
        double tolerance = 1.0E-6;
        double num = 1; double h2 = 0;
        double den = 0; double k2 = 1;
        double d = decimal;
        do {
            double a = Math.floor(d);
            double aux = num; num = a*num+h2; h2 = aux;
            aux = den; den = a*den+k2; k2 = aux;
            d = 1/(d-a);
        } while (Math.abs(decimal-num/den) > decimal*tolerance);

        return (int)num+"/"+(int)den;
	}
	
	/**
	 * Metodo para calcular el máximo común divisor por el algoritmo de Euclides                                               
	 * @param fraccion
	 * @return
	 */
    private int mcd(String fraccion) {
    	String[] number = fraccion.split("/");
        int numerador = Integer.parseInt(number[0]);
        int denominador = Integer.parseInt(number[1]);
        if (denominador == 0) {
            return numerador;
        }
        int aux;
        while (denominador != 0) {
            aux = numerador % denominador;
            numerador = denominador;
            denominador = aux;
        }
        return numerador;
    }

    /**
     * Metodo para simplificar fracciones
     * @param fraccion
     * @return fraccion simplificada
     */
    private String simplificar(String fraccion) {
        int n = mcd(fraccion);
        String[] number = fraccion.split("/");
        int num = Integer.parseInt(number[0]) / n;
        int den = Integer.parseInt(number[1]) / n;
        if(num == den) {
        	return "1";
        }
        return num + "/" + den;
    }
    
    /**
     * /*
     * 
     * /*System.out.println("f(x)=P(X=x) = p^x * (1-p)^(1-x);   x=0, 1->x~Be(p)");
		System.out.println("\t= (" + Math.round(p*100.0)/100.0 + ")^x * (1-" + Math.round(p*100.0)/100.0 + ")(1-x);   x=0, 1->x~Be(" + Math.round(p*100.0)/100.0 + ")");
		System.out.println("\t= (" + Math.round(p*100.0)/100.0 + ")^" + x + " * (1-" + Math.round(p*100.0)/100.0 + ")(1-" + x +") "
				+ "= " + Math.round(Math.pow(p, x)*100.0)/100.0 + "*" + Math.round(Math.pow((1-p), 1-x)*100.0)/100.0 + " = " + Math.round(formula*100.0)/100.0);
		"-------------------------------------------------------------"		
				
        boolean t = false;
        //while(!t) {
        	for(double i = 1; i <= sp; i++){
        		if(t) {
        			break;
        		}
	        	for(double j = 1; j <= sp; j++){
	        		aux = String.format("%.2f", i / j);
	        		fr = String.format("%.2f", decimal);
	        		//System.out.println(fr + " " + aux);
	        		if(!aux.equals(fr)) {
	        			aux = String.format("%.2f", ((i / j) - 0.01));
	        		}
	        		if(fr.equals(aux) ) {
	        			//System.out.println((int)i + "/" + (int)j);
	        			fraccion = (int)i + "/" + (int)j;
	        			t = true;
	        			break;
	        		}
	        	}
	        }
        //}
        */
        
        /*String s = String.valueOf(decimal);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
        	decimal *= 10;    
            denom *= 10;
        }

        int num = (int) Math.round(decimal);
        int den = denom;
        
        fraccion = num + "/" + den;
        System.out.println(fraccion);*/
        
        //return fraccion;
	
}
