public class Main {

    public static void main(String args[])
    {
        ProductoControlador productoControlador = new ProductoControlador(3);
        

        productoControlador.crear("CUATES", 45612378, 5 );
        productoControlador.crear("CIFRUT", 45612378, 5 );
        productoControlador.crear("SODA", 45612378, 5 );
        

        productoControlador.listar2();

        System.out.println("------------- BUSCRA NOMBRE DEL PRODUCTO -------------");

        String nombre = "CUATES";

        Producto encontrado;

        encontrado = productoControlador.buscarNombres(nombre);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: "+encontrado.getNombres());

        } else {

            System.out.println("No se encontro: "+nombre);
        }

        System.out.println("---------------BUSCAR PRODUCTO POR EL CODIGO-----------");

        int codigo = 45612378;

        Producto encontradocodigo;

        encontradocodigo = productoControlador.buscarCodigo(codigo);

        if(encontradocodigo != null)
        {
            System.out.println("codigo encontrado: "+encontradocodigo.getCodigo());

        } else {

            System.out.println("No se encontro el codigo del: "+codigo);
        }


        System.out.println("---------------BUSCAR PRODUCTO POR EL PRECIO-----------");

        int precio = 5;

        Producto encontradoprecio;

        encontradoprecio = productoControlador.buscarPrecio(precio);

        if(encontradoprecio != null)
        {
            System.out.println("precio encontrado: "+encontradoprecio.getPrecio());

        } else {

            System.out.println("No se encontro el precio del: "+precio);
        }



    }
}
