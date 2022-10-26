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
 * TP3Consigna
 */
public class TP3Consigna {

    public static void main(String[] args) {
     
       
       

       ListaProductos lista = new ListaProductos();

    

       lista.add(new Producto(1, "Primer", 23.2));     
       lista.add(new Producto(4, "Cuarto", 55.3));    
       lista.add(new Producto(2, "Segundo", 50.5));
       lista.add(new Producto(3, "Tercero", 75.3));       
       lista.add(new Producto(2, "Segundo", 100.5));
       lista.add(new Producto(5, "Quinto", 200.5));
       lista.add(new Producto(1, "Primer", 600.2));
       System.out.println("-------");
       System.out.println("Etapa 1(uno): Insertar");
       System.out.println("-------");

     
       while (lista.hasNext()) {
        Producto p = lista.next().info;
        System.out.println(p.codigo()+" "+p.descripcion()+" "+p.precio());
       }
       System.out.println("-------");
       System.out.println("Etapa 2(dos): Editar");
       System.out.println("-------");

       lista.edit(new Producto(1, "Primer modificado", 600.2));
       lista.edit(new Producto(5, "Quinto modificado", 500.2));

       while (lista.hasNext()) {
        Producto p = lista.next().info;
        System.out.println(p.codigo()+" "+p.descripcion()+" "+p.precio());
       }

       System.out.println("-------");
       System.out.println("Etapa 3(Tres) eliminar (se elimina codigo 3)");
       System.out.println("-------");
       
       lista.delete(3);

        while (lista.hasNext()) {
        Producto p = lista.next().info;
        System.out.println(p.codigo()+" "+p.descripcion()+" "+p.precio());
       }

       System.out.println("-------");
       System.out.println("Sentido inverso");
       System.out.println("-------");
       lista.revers();

       while (lista.hasPrevious()) {
        Producto p = lista.prev().info;
        System.out.println(p.codigo()+" "+p.descripcion()+" "+p.precio());
       }

       System.out.println("-------");
       System.out.println("Sentido normal");
       System.out.println("-------");
       lista.normal();

       while (lista.hasNext()) {
        Producto p = lista.next().info;
        System.out.println(p.codigo()+" "+p.descripcion()+" "+p.precio());
       }


    }



}