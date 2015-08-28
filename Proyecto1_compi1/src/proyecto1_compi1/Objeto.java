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
    public void CamPoc(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
}
