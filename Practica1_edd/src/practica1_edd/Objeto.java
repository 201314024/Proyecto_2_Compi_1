
package practica1_edd;

public class Objeto {
    
    public String nombre;
    public int tipo;
    public String img;
    public javax.swing.JLabel imagen=new javax.swing.JLabel();
    public int x;
    public int y;
    
    public Objeto()
    {
        x=0;
        y=0;
        nombre="";
        tipo=0;
        img="";
        imagen.setText("");
        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMouseClicked(evt);
            }
        });
    }
    public void imagen(String pic)
    {
        img=pic;
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+pic)));
        imagen.setSize(10, 10);
    }
    public void imagenMouseClicked(java.awt.event.MouseEvent evt) {                                     
       System.out.println("("+x+","+y+")");
    }  
    
}
