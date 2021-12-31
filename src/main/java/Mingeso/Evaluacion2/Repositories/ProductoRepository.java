package Mingeso.Evaluacion2.Repositories;

import Mingeso.Evaluacion2.Models.Producto;

import java.util.List;


public interface ProductoRepository {
    public List<Producto> getAllProductos();
    public Producto addProducto(Producto producto);
    public void deleteAllProductos();
    public Producto getProductoById(int id);
    public void deleteProductoById(int id);
}