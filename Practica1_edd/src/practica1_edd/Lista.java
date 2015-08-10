package practica1_edd;
public class Lista {
    
    public Nodo Inicio;
    public Nodo Fin;
    public int cont;
    public Lista()
    {
        Inicio=new Nodo();
        Fin=new Nodo();
        
        cont=0;
    }
    
    public Objeto getlast()
    {
        return Fin.back.o;
    }
    public void Insertar(Objeto o)
    {
        Nodo nuevo=new Nodo();
        Nodo aux=Inicio;
        nuevo.o=o;
        while(aux != null)
        {
            if(aux.next==null)
            {
                  cont++;
                  aux.next=nuevo;
                  nuevo.back=aux;
                  Fin=nuevo;
                  aux=null;  
     
            }
            else
            {
                aux=aux.next;
            }
                 
        
        }
    }
    
    public void Eliminar_last()
    {
        Nodo aux=Fin.back;
        Nodo aux2=Fin.back.back;
        
        aux.back=null;
        aux.next=null;
        aux2.next=Fin;
        Fin.back=aux2;
        
        
    }
    public boolean IsEmpty()
    {
        if((Inicio.next==Fin))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void Eliminar(int a)
    {
        Nodo aux=Inicio;
        Nodo aux2=Inicio;
        int i=0;
        
        while(aux != null)
        {
            
            if(i+1==a)
            {
               if(aux.next==Fin)
               {
                   aux.next.back=null;
                   aux.next=null;
               }
               else
               {
                   aux2=aux.next.next;
                   aux2.back=aux;
                   aux.next.back=null;
                   aux.next.next=null;
                   aux.next=aux2;
               }
                aux=null;
            }
            else
            {
                aux=aux.next;
                i++;
            }
                 
        
        }
    }
    public int tamano()
    {
        int i=-1;
        Nodo aux=Inicio;
        while (aux!=null)
        {
            i++;
            aux=aux.next;
        }
        return i;
    }
    public void mostrar()
    {
        Nodo aux=Inicio;
        while(aux != null)
        {
            System.out.println(aux.o.nombre);
            aux=aux.next;
        }
        
    }
    
}
