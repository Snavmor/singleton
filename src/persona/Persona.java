package persona;

public class Persona {

	private String nombre;
	private static Persona persona;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		System.out.println("Mi nombre es" + this.nombre);
	}
	
	public static Persona getSingletonInstance (String nombre) {
	if (persona == null) {
		persona = new Persona(nombre);
	} else {
		System.out.println("Ya existe el objeto");
	}
	return persona;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the persona
	 */
	public static Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public static void setPersona(Persona persona) {
		Persona.persona = persona;
	}
	
	
}
