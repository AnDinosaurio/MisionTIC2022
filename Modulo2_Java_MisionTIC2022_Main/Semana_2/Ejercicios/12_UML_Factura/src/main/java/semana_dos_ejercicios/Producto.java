package semana_dos_ejercicios;

public class Producto {
    
    private int codigo;
    private String descripcion;
    private Float precio;

    //Constructor
    public Producto(){
    }

    //Constructor
    public Producto(int c, String d, float p){
        setCodigo(c);
        setDescripcion(d);
        setPrecio(p);
    }
    
    //setter
    public void setCodigo(int val){
        this.codigo = val;
    }
    public void setDescripcion(String val){
        this.descripcion = val;
    }
    public void setPrecio(Float val){
        this.precio = val;
    }
    
    //getter
    public int getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Float getPrecio(){
        return precio;
    }
}