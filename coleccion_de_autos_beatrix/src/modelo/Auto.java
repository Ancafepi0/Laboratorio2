package modelo;

public class Auto {
    //atributos
	private int ano_serie;
	private String marca;
	private String color;
	private int cant_total_serie;
	private int numero_de_serie;

	//Constructor
	public Auto(){}

	//Metodos set///////////////////////////////////////////////////////////////

	public void set_ano_serie(int ano_serie){
		this.ano_serie= ano_serie;
	}   
	public void set_marca(String marca){
		this.marca= marca;
	}
	public void set_color(String color){
		this.color= color;
	}
	public void set_cant_total_serie(int cant_total_serie){
		this.cant_total_serie= cant_total_serie;
	}
	public void set_numero_de_serie(int numero_de_serie){
		this.numero_de_serie= numero_de_serie;
	}
	//Metodos get///////////////////////////////////////////////////////////////

	public int get_ano_serie(){
		return this.ano_serie;
	}
	public String get_marca(){
		return this.marca;
	}
	public String get_color(){
		return this.color;
	}
	public int get_cant_total_serie(){
		return this.cant_total_serie;
	}
	public int get_numero_de_serie(){
		return this.numero_de_serie;
	}
}
