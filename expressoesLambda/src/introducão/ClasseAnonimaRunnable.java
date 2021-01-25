package introduc�o;

public class ClasseAnonimaRunnable {
	

	public static void main(String[] args) {
		
		System.out.println("=== inicio do teste======");
		
		//Implementa��o da classe anonima Runnable
//===========================Lambda forma antiga==================================
		Runnable r1 = new Runnable() {
			@Override
			public void run() {				
				System.out.println("Estudando as express�es Lambda forma antiga");				
			}			
		};
		
		r1.run();
		
//===========================Lambda forma melhorada============================================
		Runnable r2 = () -> System.out.println("Estudando as express�es Lambda forma melhorda");		
		r2.run();

		
		
		
		
		
	}

}
