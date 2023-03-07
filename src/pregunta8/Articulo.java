package pregunta8;

public class Articulo {

	private int referencia;
	private String nombre;
	private double precio;
	
	public Articulo(int referencia, String nombre, double precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	public Articulo(String nombre, double precio) {
		this.referencia = (int) (Math.random()*100+1);
		this.nombre = nombre;
		this.precio = precio;
	}
	public Articulo(int referencia, double precio) {
		this.referencia = referencia;
		this.nombre = "X";
		this.precio = precio;
	}
	public Articulo(int referencia, String nombre) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = Math.round((Math.random()*1000+1)*100)/100.0;
	}
	public Articulo(String nombre) {
		this.referencia = (int) (Math.random()*100+1);
		this.nombre = nombre;
		this.precio = Math.round((Math.random()*1000+1)*100)/100.0;
	}
	public Articulo(double precio) {
		this.referencia = (int) (Math.random()*100+1);
		this.nombre = "X";
		this.precio = precio;
	}
	public Articulo(int referencia) {
		this.referencia = referencia;
		this.nombre = "X";
		this.precio = Math.round((Math.random()*1000+1)*100)/100.0;
	}
	public Articulo() {
		this.referencia = (int) (Math.random()*100+1);
		this.nombre = "X";
		this.precio = Math.round((Math.random()*1000+1)*100)/100.0;
	}
	
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
