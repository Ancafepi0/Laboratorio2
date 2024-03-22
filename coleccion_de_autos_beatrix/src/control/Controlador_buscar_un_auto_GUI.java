package control;
import modelo.Auto;
import modelo.Coleccion;
import vista.Buscar_un_auto_GUI;
import vista.Agregar_autos_GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_buscar_un_auto_GUI implements ActionListener{
    //atributos
    private Buscar_un_auto_GUI vista_buscar_un_auto;
    private Agregar_autos_GUI vista_agregar_autos;
    private Coleccion mi_coleccion;
    
     
    //Metodos///////////////////////////////////////////
     //meotdo constructor 
    public void Controlador_buscar_un_auto_GUI(){
        //inicializacion de las vistas y el objeto coleccion
        vista_buscar_un_auto= new Buscar_un_auto_GUI();
        vista_agregar_autos= new Agregar_autos_GUI();
        mi_coleccion= new Coleccion();
         
        //ejecutar la vista cada que se llame al controlador
        this.vista_buscar_un_auto.setVisible(true);
        
        //hacer que se registre como una accion el apretar el boton de la vista borrar_un_auto_GUI
        this.vista_buscar_un_auto.jbtn_buscar_auto.addActionListener(this);

    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.vista_buscar_un_auto.jtf_ano_serie.setText(this.vista_agregar_autos.jtf_ano_serie.getText());
        this.vista_buscar_un_auto.jtf_numero_del_auto_en_la_serie.setText(this.vista_agregar_autos.jtf_numero_de_serie.getText());
        
        int ano_serie= Integer.parseInt(this.vista_buscar_un_auto.jtf_ano_serie.getText());
        int numero_de_serie= Integer.parseInt(this.vista_buscar_un_auto.jtf_numero_del_auto_en_la_serie.getText()); 
        
        if (e.getSource()== this.vista_buscar_un_auto.jbtn_buscar_auto){
            String datos_auto=mi_coleccion.buscar_un_auto(ano_serie, numero_de_serie);
            
            this.vista_buscar_un_auto.jta_informacion_del_auto.setText(datos_auto);
                 
        }
        
    }
}
