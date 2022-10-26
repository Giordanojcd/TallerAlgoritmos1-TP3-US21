/** 
 * ********************************************************
 * ** Trabajo Practico Nº3 - US21                        **
 * ** Alumnos:                                           **
 * ** -Rodolfo Vizcay Legajo Nº                          **
 * ** -Nicolas Zabala Legajo Nº                          **
 * ** -Juan Marcelo Vila Legajo Nº                       **
 * ** -Franco Gatti Legajo Nº                            **
 * ** -Juan Carlos Daniel Giordano Legajo Nº VINF011535  **
 * ********************************************************
 */
import java.util.Iterator;

/**
 * ListaProductos
 */
public class ListaProductos implements Iterator {
    /**
     * Nodo
     */
    public class Nodo {
        public Producto info;
        public Nodo next,prev; 
    }
    

    private Nodo primero = null;
    private Nodo ultimo = null;
    private Nodo posicion = null;
    

  
    public void add(Producto p){
        try {
           
            if(this.primero == null){
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.info = p;
                nuevoNodo.prev = null;
                nuevoNodo.next = null;
                this.primero = nuevoNodo;
                this.ultimo = nuevoNodo;
                this.posicion = nuevoNodo;
               
            }else{
                if(existe(p.codigo()))
                    throw new Exception("El codigo "+ p.codigo() +" ya existe!");
                    
                
                
                ordenarInsertar(p);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void edit(Producto p){
        try {
            if(!existe(p.codigo()))
                throw new Exception("El codigo "+ p.codigo() +" no existe!");


            Nodo actual = this.primero;
            while (actual != null) {
                if(actual.info.codigo() == p.codigo()){
                    actual.info = p;
                    break;
                }
                actual = actual.next;
            }
         
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int codigo){
        try {
            if(!existe(codigo))
                throw new Exception("El codigo "+ codigo +" no existe");


            Nodo actual = this.primero;
            while (actual != null) {
                if(actual.info.codigo() == codigo){
                    Nodo temp = actual;
                    actual.prev.next = temp.next;
                    actual.next.prev = temp.prev;
                    actual  = null;
                    temp = null;
                    break;
                }
                actual = actual.next;
            }
         
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    

    private boolean existe(int codigo){
        Nodo actual = this.primero;
        while (actual != null) {
            if(actual.info.codigo() == codigo){
                return true;
            }
            actual = actual.next;
        }
        actual = null;
        return false;
    }

    private void ordenarInsertar(Producto p){

        Nodo actual = this.primero;
        while (actual != null) {

            
            if(actual.info.codigo() <  p.codigo() && actual.next ==  null || actual.info.codigo() <  p.codigo() && actual.next.info.codigo() >  p.codigo()){
                Nodo nodo = new Nodo();
                nodo.info = p;
                nodo.next = actual.next;
                nodo.prev = actual;
                
                Nodo next =  actual.next ;
                actual.next = nodo;
                if(next !=null){
                    
                    next.prev = nodo; 
                    
                }else{
                    this.ultimo  = nodo;
                }
            
                break;
            }

           


            actual = actual.next;
                
        } 

        
    }

    public void normal() {
            
        this.posicion = this.primero;
        
    }

    public boolean hasNext() {
        if(this.posicion == null){
            
            this.posicion = this.primero;
            return false;
        }

        return true;
        
    }

    public void revers() {
            
        this.posicion = this.ultimo;
        
    }
    public boolean hasPrevious() {
        if(this.posicion == null){
            
            this.posicion = this.ultimo;
            return false;
        }

        return true;
        
    }



    public Nodo next() {
        Nodo actual = this.posicion;
        this.posicion = actual.next;
        return actual;
    }

    public Nodo prev() {
        Nodo actual = this.posicion;
        
        this.posicion = actual.prev;
        return actual;
    }
}