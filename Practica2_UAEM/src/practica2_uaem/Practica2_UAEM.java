
package practica2_uaem;
import javax.swing.*;
/**
 *
 * @author Administrador
 */
public class Practica2_UAEM extends JFrame{
    //Componentes
    JMenuBar mb_principal;
    JMenu mn_option1, mn_option2,mn_option3;
    JMenuItem mi_nuevo,mi_consultar,mi_eliminar,mi_modificar,mi_archivo1;
    JMenuItem mi_archivo2,mn_option4;
    ImageIcon img_fondo;//imagen
    JLabel lbl_img;//para mostrar la imagen

    
    //Creacion de la Ventana
    public Practica2_UAEM(){
        setTitle("Practica 2");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    
    public void componentes(){
        //Cuerpo del munu
        mb_principal=new JMenuBar();
        //Opciones del menu
        mn_option1=new JMenu("Archivo");
        mn_option2=new JMenu("Editar");
        mn_option3=new JMenu("Reporte");
        mn_option4=new JMenuItem("Salir");
        //Agrega las opciones al menu principal
        mb_principal.add(mn_option1);
        mb_principal.add(mn_option2);
        mb_principal.add(mn_option3);
        mb_principal.add(mn_option4);
        //Mini opciones de opcion1
        mi_nuevo=new JMenuItem("Nuevo");
        mi_consultar=new JMenuItem("Consultar");
        mi_eliminar=new JMenuItem("Eliminar");
        //Agrega las mini-opciones de opcion1
        mn_option1.add(mi_nuevo);
        mn_option1.add(mi_consultar);
        mn_option1.add(mi_eliminar);
        //Mini opcion de opcion2
        mi_modificar=new JMenuItem("Modificar");
        mn_option2.add(mi_modificar);//Agrega la mini opcion de opcion2
        //Mini opciones de opcion3
        mi_archivo1=new JMenuItem("Archivo PDF");
        mi_archivo2=new JMenuItem("Archivo Txt");
        mn_option3.add(mi_archivo1);//Agregamos las mini opciones
        mn_option3.add(mi_archivo2);
        //Evento para hacer valido el JOptionPane en la opcion 4
        mn_option4.addActionListener(e ->{
            JOptionPane.showMessageDialog(null,"OK, Bye");
            System.exit(0);//Cierra el sistema o la ventana
        });
        
        setJMenuBar(mb_principal);//mostramos el menu principal
        //Obtenemos la imagen del fondo
        img_fondo = new ImageIcon(getClass().getResource("/IMG/Eliud_Fondo.png"));
        lbl_img=new JLabel();
        lbl_img.setBounds(0, 0, 64, 64);
        lbl_img.setIcon(img_fondo);//colocamos la imgane en el label
        
        add(lbl_img);//agregamos el label para que se muestre
    }
}
