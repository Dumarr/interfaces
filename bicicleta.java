package interfaz;

public class bicicleta  implements rueda,silla{
	
	public void rueda() {
		
	}
	@Override
	public void avanzar() {
		System.out.println("la bicicleta avanza");
		
	}

	@Override
	public void detenerse() {
		System.out.println("la bicicleta se detiene");

	}

	@Override
	public void sentarse() {
		System.out.println("se sienta la persona");		
	}
	

}
