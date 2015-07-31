
package practica1_edd;
public class Practica1_edd {
    
    public static void main(String[] args) {
        
        Lista L=new Lista();
        Objeto a=new Objeto();
        a.nombre="a";
        Objeto b=new Objeto();
        b.nombre="b";
        Objeto c=new Objeto();
        c.nombre="c";
        L.Insertar(a);
        L.Insertar(b);
        L.Insertar(c);
        L.mostrar();
       // L.Eliminar(a);
        //L.mostrar();
        
    }
    
}
