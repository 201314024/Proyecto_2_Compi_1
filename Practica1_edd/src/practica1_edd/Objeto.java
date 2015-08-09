
package practica1_edd;

public class Objeto {
    
    public String nombre;
    public int tipo;
    public String img;
    public javax.swing.JLabel imagen=new javax.swing.JLabel();
    
    public Objeto()
    {
        nombre="";
        tipo=0;
        img="";
        imagen.setText("");
    }
    public void imagen(String pic)
    {
        img=pic;
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+pic)));
        imagen.setSize(10, 10);
    }
    
}
