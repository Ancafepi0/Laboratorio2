package control;
import modelo.Coleccion;
import vista.Mostrar_coleccion_GUI;
import vista.Agregar_autos_GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_mostrar_coleccion_GUI implements ActionListener{
    //atributos
    private Mostrar_coleccion_GUI vista_mostrar_coleccion;
    private Agregar_autos_GUI vista_agregar_autos;
    private Coleccion mi_coleccion;
    
    //Metodos///////////////////////////////////////////
     //meotdo constructor 

    public void Controlador_mostrar_coleccion_GUI(){
        vista_mostrar_coleccion = new Mostrar_coleccion_GUI();
        vista_agregar_autos = new Agregar_autos_GUI();
        mi_coleccion = new Coleccion();
        
        //ejecutar la vista cada que se llame al controlador
        this.vista_mostrar_coleccion.setVisible(true);
        
        //hacer que se registre como una accion el apretar el boton de la vista borrar_un_auto_GUI
        this.vista_mostrar_coleccion.jbtn_mostrar_coleccion.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== this.vista_mostrar_coleccion.jbtn_mostrar_coleccion){
            String coleccion_completa=mi_coleccion.listar_coleccion();
            
            this.vista_mostrar_coleccion.jta_espacio_coleccion.setText(coleccion_completa);
        }
    }
    
}
