package proyecto1_compi1;

public class Objeto {
    
    public String nombre;
    public String tipo;
    public int puntos;
    public int crecimiento;
    public String path;
    public int tiempo;
    public int x;
    public int y;
    public javax.swing.JLabel imagen=new javax.swing.JLabel();
    public Objeto()
    {
        nombre="";
        tipo="";
        puntos=0;
        crecimiento=0;
        path="";
        tiempo=0;
        x=0;
        y=0;
    }
    public void imagen()
    {
        String temp="";
        for(int i=1;i<path.length()-1;i++)
        {
            temp=temp+path.charAt(i);
        }
        
        if(temp!="")
        {
            imagen.setIcon(new javax.swing.ImageIcon(temp));
            imagen.setSize(10, 10);
        }
        
    }
    public void imagen2()
    {
        imagen.setIcon(new javax.swing.ImageIcon(path));
            imagen.setSize(10, 10);
    }
    public void CamPoc(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
}
