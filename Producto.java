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
 *//**
 * Producto
 */
public class Producto {

    private int codigo;
    private String descripcion;
    private double precio;
    
    public   Producto(
        int codigo,
        String descripcion,
        double precio
    ){
        this.codigo = codigo; 
        this.descripcion = descripcion; 
        this.precio = precio; 
    }


    public int codigo(){
        return this.codigo;
    }
    public String descripcion(){
        return this.descripcion;
    }
    public double precio(){
        return this.precio;
    }
    
}
