package tallerweb.springmvc.objetos;



public class persona {
	
	private String nombre;
	private String apellido;
	
	public persona(){
		this.nombre = "Fer";
		this.apellido = "Apaolaza";
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	
	public String getApellido(){
		
		return this.apellido;
	}

}
