package control;
import modelo.Auto;
import modelo.Coleccion;
import control.Controlador_borrar_un_auto_GUI;
import vista.Agregar_autos_GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//Esta clase podria verse como Gestiona_coleccion

public class Controlador_agregar_autos_GUI implements ActionListener {
    //atributos
    private Agregar_autos_GUI vista_agregar_autos;
    private Coleccion mi_coleccion;
    
    //Metodos
    //Metodo constructor
    public void Controlador_agregar_autos(){
        //inicializacion de la vista y el objeto coleccion
        vista_agregar_autos= new Agregar_autos_GUI();
        mi_coleccion= new Coleccion();
        
        //ejecutar la vista cada que se llame al controlador
        this.vista_agregar_autos.setVisible(true);
        
        //hacer que se registre como una accion el apretar los botones de la vista agegar_autos_GUI
        this.vista_agregar_autos.jbtn_agregar_auto_a_la_coleccion.addActionListener(this);
        this.vista_agregar_autos.jbtn_borrar_auto_de_la_coleccion.addActionListener(this);
        this.vista_agregar_autos.jbtn_mostrar_coleccion.addActionListener(this);
        this.vista_agregar_autos.jbtn_buscar_auto_en_la_coleccion.addActionListener(this);
    }
    

    //Clase en la que van a llegar los eventos de la vista principal y reaccionara a ellos
    @Override
    public void actionPerformed(ActionEvent e) {
        //reaccion a si se oprime el boton agregar autos a la coleccion/////////////////////////////////////////////
        if (e.getSource()== this.vista_agregar_autos.jbtn_agregar_auto_a_la_coleccion){
               
            //creacion objeto auto
            Auto un_auto= new Auto();
            
            //llenado de los atributos del auto con el contenido de los text field de la vista
            un_auto.set_ano_serie(Integer.parseInt(this.vista_agregar_autos.jtf_ano_serie.getText()));
            un_auto.set_cant_total_serie(Integer.parseInt(this.vista_agregar_autos.jtf_cant_total_serie.getText()));
            un_auto.set_numero_de_serie(Integer.parseInt(this.vista_agregar_autos.jtf_numero_de_serie.getText()));
            un_auto.set_marca(this.vista_agregar_autos.jtf_marca.getText());
            un_auto.set_color(this.vista_agregar_autos.jtf_color.getText());
   
            //validacion de que los campos para agregar un auto a la coleccion no se encuentren vacios
            if (this.vista_agregar_autos.jtf_ano_serie != null && this.vista_agregar_autos.jtf_cant_total_serie != null && this.vista_agregar_autos.jtf_numero_de_serie != null && this.vista_agregar_autos.jtf_marca != null && this.vista_agregar_autos.jtf_color != null){
                mi_coleccion.agregar_auto(un_auto);
            }
            else{
                JOptionPane.showMessageDialog(null,"Por favor rellene el campo de año de serie", "El campo de el año de serie está vacio", 2);
            }
            
        }
        //reaccion a si se oprime el boton borrar autos de la coleccion/////////////////////////////////////////////
        if (e.getSource()== this.vista_agregar_autos.jbtn_borrar_auto_de_la_coleccion){
            Controlador_borrar_un_auto_GUI borrar_auto= new Controlador_borrar_un_auto_GUI();
            borrar_auto.Controlador_borrar_un_auto_GUI();
            
        }
        
        //reaccion a si se oprime el boton agregar Mostrar la coleccion/////////////////////////////////////////////
        if (e.getSource()== this.vista_agregar_autos.jbtn_mostrar_coleccion){
            
            
        }
     
        
        //reaccion a si se oprime el boton buscar un auto en la coleccion/////////////////////////////////////////////
        if (e.getSource()== this.vista_agregar_autos.jbtn_buscar_auto_en_la_coleccion){
            
            
        }
    }

    

}
