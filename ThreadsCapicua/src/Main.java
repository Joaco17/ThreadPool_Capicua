import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		
		String palabras[] = new String[]{"ala","sopa","azar", "portatil","metem", "sacar", "lobezno","nueve","ejectutar",
				"muertos","cansado","coronas","colubi", "cargador", "comamoc","etilico", "dieciseis", "alabama",
				"tigres","pepino","finestreta","veintiuno", "espacio","preeguntas","reloj","ocarina"};
		
		
		for(int i=0;i<palabras.length;i++){
			EsPalindroma esCapicua = new EsPalindroma(palabras[i]);
			threadPool.execute(esCapicua);
			System.out.println("EN COLA: "+ threadPool.getQueue().size()+i );
			
		}

	}

	
}
