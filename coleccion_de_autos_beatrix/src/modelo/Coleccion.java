package modelo;
import java.util.List;
import java.util.ArrayList;

public class Coleccion {
    //atributos
	private List<Auto> autos= new ArrayList<>();

        
	//Metodos
	/*****************************************************************************************/
	//metodo constructor
	public Coleccion(){
        }

	/*metodo para agregar autos**********************************************************************/
	public void agregar_auto(Auto carrito){

		autos.add(carrito);
	}
        
	/*metodo para borrar autos**********************************************************************/
	public int borrar_auto(int ano_serie, int numero_de_serie){

		Auto un_carro= new Auto();

		for(int i=0; i<autos.size(); i++){
			un_carro= autos.get(i);

			System.out.println(un_carro.get_ano_serie());
			System.out.println(un_carro.get_numero_de_serie());

			if(un_carro.get_ano_serie() == ano_serie){
				if(un_carro.get_numero_de_serie() == numero_de_serie){
					autos.remove(i);
					return 1;
				}
			}
		}
		return 0;
	}
	/**Metodo para mostrar la coleccion*************************************************************************/	
	public String listar_coleccion(){

            Auto un_carro= new Auto();
            String coleccion="";

            for(int i=0; i<autos.size(); i++){
		un_carro= autos.get(i);
                	coleccion +="Año Serie: "+un_carro.get_ano_serie()+
                                    " - Marca: "+un_carro.get_marca()+
                                    " - Color: "+un_carro.get_color()+
                                    " - cantTotalSerie: "+un_carro.get_cant_total_serie()+
                                    " - numeroSerie: "+un_carro.get_numero_de_serie()+"\n";
            }
            return coleccion;
	}
        
	/****Metodo para buscar un auto******************************************************************************/
	public String buscar_un_auto(int ano_serie, int numero_de_serie){

		Auto un_carro= new Auto();	
		String datos_auto="El auto no se encuentra";

		for(int i=0; i<autos.size(); i++){
			un_carro= autos.get(i);
			if(un_carro.get_ano_serie() == ano_serie){
				if(un_carro.get_numero_de_serie() == numero_de_serie){
					datos_auto +=	"Año Serie: "+un_carro.get_ano_serie()+"\n"+
							"Marca: "+un_carro.get_marca()+"\n"+
							"Color: "+un_carro.get_color()+"\n"+
							"cantTotalSerie: "+un_carro.get_cant_total_serie()+"\n"+
							"numeroSerie: "+un_carro.get_numero_de_serie()+"\n";
					return datos_auto;
				}
			}
		}
		return datos_auto;
	}
}
