

package practica1_edd;


public class Lista {
    
    public Nodo Inicio;
    public Nodo Fin;
    public Lista()
    {
        Inicio=new Nodo();
        Fin= Inicio;
    }
    
    public void Insertar(Objeto o)
    {
        Nodo nuevo=new Nodo();
        Nodo aux=Inicio;
        Nodo aux2=aux;
        nuevo.o=o;
        while(aux != null)
        {
            if(aux.next.equals(null))
            {
                
            }
        }
    }
    
}
