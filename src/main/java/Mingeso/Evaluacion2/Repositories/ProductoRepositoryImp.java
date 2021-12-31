package Mingeso.Evaluacion2.Repositories;

import Mingeso.Evaluacion2.Models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class ProductoRepositoryImp implements ProductoRepository{
    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Producto> getAllProductos(){
        String sql = "Select * from producto;";
        try(Connection conn = sql2o.open()){
            return conn.createQuery(sql).executeAndFetch(Producto.class);
        }
    }
    @Override
    public Producto addProducto(Producto producto){
        String sql = "insert into producto(nombre,fechaVencimiento,categoria,precio) values (:nombre,:fecha,:categoria,:precio);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .addParameter("nombre", producto.getNombre())
                    .addParameter("fecha", producto.getFechaVencimiento())
                    .addParameter("categoria", producto.getCategoria())
                    .addParameter("precio", producto.getPrecio())
                    .executeUpdate().getKey();
            producto.setCodigoProducto(id);
            return producto;
        }
    }
    @Override
    public void deleteAllProductos(){
        String sql = "delete from producto;";
        try (Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }
    }
    @Override
    public Producto getProductoById(int id){
        String sql = "select * from producto where codigoProducto= :id;";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Producto.class);
        }
    }
    @Override
    public void deleteProductoById(int id){
        String sql = "delete from producto where codigoProducto = :id;";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }
}