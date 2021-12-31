package Mingeso.Evaluacion2.Services;

import Mingeso.Evaluacion2.Models.Producto;
import org.springframework.web.bind.annotation.*;

import Mingeso.Evaluacion2.Repositories.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ProductoService {

    private final ProductoRepository productoRepository;

    ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    @GetMapping("/productos/")
    public List<Producto> getAllProductos(){
        return productoRepository.getAllProductos();
    }
    @PostMapping("/productos/")
    public Producto addProducto(@RequestBody Producto producto){
        return productoRepository.addProducto(producto);
    }
    @DeleteMapping("/productos/")
    public String deleteAllProductos(){
        productoRepository.deleteAllProductos();
        return "Se han eliminado todos los productos";
    }
    @GetMapping("/productos/{id}")
    public Producto getProducto(@PathVariable int id){
        return productoRepository.getProductoById(id);
    }
    @DeleteMapping("/productos/{id}")
    public String deleteProducto(@PathVariable int id){
        productoRepository.deleteProductoById(id);
        return String.format("Se ha eliminado el producto con id=%s",id);
    }

}