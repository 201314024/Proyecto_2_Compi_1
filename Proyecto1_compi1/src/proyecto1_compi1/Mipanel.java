package proyecto1_compi1;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Mipanel extends javax.swing.JPanel {

    public ImageIcon imagenFondo = new ImageIcon(getClass().getResource("fondo.jpg"));
    public Mipanel(int x,int y){   
        this.setSize(x,y);
    }
    public void cimg(String path)
    {
        imagenFondo = new ImageIcon(getClass().getResource(path));
        repaint();
    }
        
    @Override
    public void paint(Graphics g){
        Dimension tamanio = getSize();      
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);   
        setOpaque(false);
        super.paintComponent(g);
}
    
}