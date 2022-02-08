package persona;

public class MainSingleton {

	public static void main(String[] args) {
	
		Persona Antonio = Persona.getSingletonInstance("Antonio");
		
		System.out.println(Antonio.getNombre());

	}

}
