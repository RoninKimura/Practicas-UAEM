package practica4_uaem;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author You
 */
public class Practica4_UAEM extends JFrame {

    JLabel lbl_nombre,lbl_direccion,lbl_sexo,lbl_telefono,lbl_numero;
    JLabel lbl_foto,lbl_img;
    JTextField txt_nombre,txt_direccion,txt_numero;
    JComboBox cbx_sexo;
    JCheckBox chx_movil,chx_casa;
    JFileChooser fcr_archivo;
    JButton btn_nuevo,btn_agregar;
    ImageIcon imagen;
    
    public Practica4_UAEM(){
        setTitle("Practica4_UAEM");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        lbl_nombre=new JLabel("Nombre:");
        lbl_nombre.setBounds(20, 20, 90, 20);
        lbl_direccion=new JLabel("Direccion:");
        lbl_direccion.setBounds(20, 50, 90, 20);
        lbl_sexo=new JLabel("Sexo:");
        lbl_sexo.setBounds(20, 80, 90, 20);
        lbl_telefono=new JLabel("Telefono:");
        lbl_telefono.setBounds(20, 110, 90, 20);
        lbl_numero=new JLabel("Numero:");
        lbl_numero.setBounds(20, 140, 90, 20);
        lbl_foto=new JLabel("Fotografia:");
        lbl_foto.setBounds(20, 230, 90, 20);
        
        //Se crea primero la imagen
        imagen=new ImageIcon(getClass().getResource("/practica4_uaem/imagen.jpg"));
        imagen.getImage();//Obtenermos la imagen
        
        //Se creo la etiquete que llevara la imagen
        lbl_img=new JLabel();
        lbl_img.setBounds(230, 20, 245, 140);
        lbl_img.setIcon(imagen);//Se le coloca la imagen

        
        txt_nombre=new JTextField();
        txt_nombre.setBounds(100, 20, 120, 20);
        txt_direccion=new JTextField();
        txt_direccion.setBounds(100, 50, 120, 20);
        txt_numero=new JTextField();
        txt_numero.setBounds(100, 140, 120, 20);
        
        cbx_sexo=new JComboBox();
        cbx_sexo.addItem("Femenino");
        cbx_sexo.addItem("Masculino");
        cbx_sexo.setBounds(100, 80, 120, 20);
        
        chx_movil=new JCheckBox("Movil");
        chx_movil.setBounds(100, 110, 60, 20);
        chx_casa=new JCheckBox("Casa");
        chx_casa.setBounds(170, 110, 54, 20);
        
        fcr_archivo=new JFileChooser();
        fcr_archivo.setBounds(100, 160, 370, 150);
        
        btn_nuevo=new JButton("Nuevo");
        btn_nuevo.setBounds(125, 320, 90, 20);
        btn_agregar=new JButton("Agregar");
        btn_agregar.setBounds(250, 320, 90, 20);
        
        add(lbl_nombre);
        add(lbl_direccion);
        add(lbl_sexo);
        add(lbl_telefono);
        add(lbl_numero);
        add(lbl_foto);
        add(lbl_img);
        
        add(txt_nombre);
        add(txt_direccion);
        add(txt_numero);
        
        add(cbx_sexo);
        
        add(chx_movil);
        add(chx_casa);
        
        add(fcr_archivo);
        
        add(btn_nuevo);
        add(btn_agregar);
    }
}
