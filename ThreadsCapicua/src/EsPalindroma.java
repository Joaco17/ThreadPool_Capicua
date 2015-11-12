
public class EsPalindroma implements Runnable {
	private String palabras;
	
	
	public EsPalindroma(String p){
		this.palabras=p;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(esCapicua(palabras)){
			System.out.println("La palabra "+palabras+" es palindroma");
		}else{
			System.out.println("La palabra "+palabras+" no es palindroma");
		}
		
	}
	
	public boolean esCapicua(String cadena){
		
		    boolean valor=true;
		    int i,ind;    
		    String cadena2="";
		    	
		    	//QUITAMOS LOS ESPACIOS
			    for (int x=0; x<cadena.length(); x++) {
			        if (cadena.charAt(x) != ' ')
			            cadena2 += cadena.charAt(x);
			    }
			    //VOLVEMOS A ASIGNAR LAS VARIABLES
			    cadena=cadena2;    
			    ind=cadena.length();
			    
			    //REALIZAMOS LA COMPARACIÓN DE CADENAS
			    for (i= 0 ;i < (cadena.length()); i++){        
			       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
			           //SI ALGUNA LETRA NO CORRESPONDE NO ES UN PALÍNDROMO
			           //SALE DEL BUCLE CON VALOR FALSO
			            valor=false;
			            break;
			       }
			       else{
			    	   valor = true;
			       }
			       ind--;
			    }
			    return valor;
		
		}
}

