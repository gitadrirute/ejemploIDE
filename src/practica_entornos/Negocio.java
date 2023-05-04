
package practica_entornos;


public class Negocio {

    private int cantidad;//cantidad de articulos
    private String articulo;
    private int precio;//precio de articulos

    Negocio(int cant, String art, int price) {

        this.articulo = art;
        this.cantidad = cant;
        this.precio = price;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void comprar(int cuanto) { //compra al proveedor

        cantidad = cantidad + cuanto;
        System.out.println("Hay en tienda " +cantidad+" "+articulo);

    }

    public void vender(int cuanto) {

        if (cuanto > cantidad) {
            System.out.println("No tengo tanto para vender");

        } else {
            cantidad = cantidad - cuanto;
            System.out.println("Has vendido " + cuanto + " "+articulo+" y tienes " + cantidad);
        }

    }

    public int contabilidad() {

        int cant = cantidad * precio;
        System.out.println("Actualmente tienes " + cant + "€");
        return cant;
    }
}
