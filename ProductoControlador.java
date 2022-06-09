public class ProductoControlador {

    private Producto producto[];

    private int contador;

    public ProductoControlador(int size)
    {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void crear(String nombres, int codigo, int precio)
    {
        this.producto[this.contador] = new Producto(nombres, codigo, precio);

        this.contador++;
    }

    public Producto buscarNombres(String nombres)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.producto[i].getNombres().equals(nombres))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.producto[i];
        }
    }

    public Producto buscarCodigo(int codigo)
    {
        int j;

        for(j=0; j<this.contador; j++)
        {
            if(this.producto[j].getCodigo() == (codigo))
            {
                break;
            }
        }

        if(j == this.contador)
        {
            return null;

        } else 
        {

            return this.producto[j];
        }
    }

    public Producto buscarPrecio(int precio)
    {
        int j;

        for(j=0; j<this.contador; j++)
        {
            if(this.producto[j].getPrecio() == (precio))
            {
                break;
            }
        }

        if(j == this.contador)
        {
            return null;

        } else 
        {

            return this.producto[j];
        }
    }

    public Producto[] listar()
    {
        return this.producto;
    }



    public void listar2()
    {
        for(int i=0; i<this.contador; i++)
        {
            System.out.println(this.producto[i].getNombres());

            this.producto[i].listarProducto();
        }
        
    }

    

    public void editar()
    {

    }

    public void eliminar()
    {

    }

    
}