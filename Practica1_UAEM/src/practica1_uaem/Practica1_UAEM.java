package practica1_uaem;

import javax.swing.*;

/**
 *
 * @author Administrador
 */

public class Practica1_UAEM extends JFrame{
    //Objetos de la ventana
    JLabel lbl_usuario, lbl_contrasena;
    JTextField txt_usuario;
    JPasswordField psw_contrasena;
    JButton btn_nuevo,btn_acceder;
    
    //Creacion de la ventana
    public Practica1_UAEM(){
        setTitle("Practica 1");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    //Creacion de Objetos
    public void componentes() {
        lbl_usuario=new JLabel("Usuario:");
        lbl_usuario.setBounds(50, 50, 100, 30);
        txt_usuario=new JTextField();
        txt_usuario.setBounds(150, 50, 100, 20);
        lbl_contrasena=new JLabel("Contraseña:");
        lbl_contrasena.setBounds(50, 80, 100, 30);
        psw_contrasena=new JPasswordField();
        psw_contrasena.setBounds(150, 80, 100, 20);
        btn_nuevo=new JButton("Nuevo");
        btn_nuevo.setBounds(100,200, 80, 20);
        btn_acceder=new JButton("Acceder");
        btn_acceder.setBounds(250,200, 100, 20);
        add(lbl_usuario);
        add(txt_usuario);
        add(psw_contrasena);
        add(lbl_contrasena);
        add(btn_nuevo);
        add(btn_acceder);
    }
}
