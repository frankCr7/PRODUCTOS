public class Producto 
{
    private String nombres;

    private int codigo;

    private int precio;

    public Producto(String nombres, int codigo, int precio)
    {
        this.nombres = nombres;

        this.codigo = codigo;

        this.precio = precio;
    }

    public String getNombres() {
        return nombres;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio(){
        return precio;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void listarProducto()
    {
        System.out.println("Nombres: "+ this.getNombres());
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Precio: "+ this.getPrecio());

    }
    
}
