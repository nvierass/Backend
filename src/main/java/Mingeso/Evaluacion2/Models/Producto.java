package Mingeso.Evaluacion2.Models;

import java.sql.Date;

public class Producto {
    
    private int codigoProducto;
    private String nombre;
    private Date fechaVencimiento;
    private String categoria;
    private int precio;


    public int getCodigoProducto(){
        return this.codigoProducto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Date getFechaVencimiento(){
        return this.fechaVencimiento;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setCodigoProducto(int codigoProducto){
        this.codigoProducto = codigoProducto;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaVencimiento(Date fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public String getPrecioAsString(){
        return Integer.toString(this.precio);
    }

    public Boolean isImportado(){
        return(this.categoria.equals("Importado"));
    }

    public Boolean isNacional(){
        return(this.categoria.equals("Nacional"));
    }
}
