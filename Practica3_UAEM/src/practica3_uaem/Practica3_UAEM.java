package practica3_uaem;
import java.awt. *;
import javax.swing. *;

/**
 *
 * @author You
 */
public class Practica3_UAEM extends JFrame{
    //Objetos de la ventana
    JLabel lbl_nombre,lbl_edad,lbl_correo,lbl_usuario,lbl_contrasenia,lbl_info;
    JTextField txt_nombre,txt_edad,txt_correo,txt_usuario;
    JPasswordField psw_contrasenia;
    JTextArea txt_area;
    JScrollPane scroll_pane;
//    JScrollBar scroll_bar;
    //Botones de la ventana
    JButton btn_nuevo,btn_agregar;
    
    //Creacion de la ventana
    public Practica3_UAEM(){
        setTitle("Practica 3");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    //Creacion de los objetos de la ventana
    public void componentes(){
        lbl_nombre=new JLabel("Nombre:");
        lbl_nombre.setBounds(30, 30, 70, 30);
        lbl_edad=new JLabel("Edad:");
        lbl_edad.setBounds(30, 70, 50, 30);
        lbl_correo=new JLabel("Correo:");
        lbl_correo.setBounds(30, 110, 50, 30);
        lbl_usuario=new JLabel("Usuario:");
        lbl_usuario.setBounds(30, 150, 50, 30);
        lbl_contrasenia=new JLabel("Contraseña:");
        lbl_contrasenia.setBounds(30, 190, 80, 30);
        lbl_info=new JLabel("Información");
        lbl_info.setBounds(230, 30, 70, 30);
        txt_nombre=new JTextField();
        txt_nombre.setBounds(110, 36, 100, 20);
        txt_edad=new JTextField();
        txt_edad.setBounds(110, 76, 100, 20);
        txt_correo=new JTextField();
        txt_correo.setBounds(110, 116, 100, 20);
        txt_usuario=new JTextField();
        txt_usuario.setBounds(110, 156, 100, 20);
        psw_contrasenia=new JPasswordField();
        psw_contrasenia.setBounds(110, 196, 100, 20);
        txt_area=new JTextArea(50,50);
        txt_area.setBounds(230, 75, 150, 145);
        
//        scroll_bar= new JScrollBar(JScrollBar.VERTICAL);
//        scroll_bar.setBounds(230,75,150,145);
        
        /*Agregamos txt_area al scroll e indicamos que siempre se veran los 
        scroll tanto el vetical como el horizontal*/
        scroll_pane=new JScrollPane(txt_area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll_pane.setBounds(230, 75, 150, 145);
        btn_nuevo=new JButton("Nuevo");
        btn_nuevo.setBounds(90,235,80,20);
        btn_agregar=new JButton("Agregar");
        btn_agregar.setBounds(200, 235, 90, 20);
        
        //Añadimos los objetos
        add(lbl_nombre);
        add(txt_nombre);
        add(lbl_edad);
        add(txt_edad);
        add(lbl_correo);
        add(txt_correo);
        add(lbl_usuario);
        add(txt_usuario);
        add(lbl_contrasenia);
        add(psw_contrasenia);
        add(lbl_info);
//        add(scroll_bar);
//        scroll_bar.add(txt_area);
        add(scroll_pane);
        add(btn_nuevo);
        add(btn_agregar);
        
    }
    
}
