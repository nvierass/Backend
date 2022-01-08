package Mingeso.Evaluacion2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Mingeso.Evaluacion2.Models.Producto;

public class ProductoTests{

    Producto dummy;

    @Test
    public void precioAsString(){
        this.dummy = new Producto();
        dummy.setPrecio(1500);
        String expectedValue = "1500";
        String actualValue = dummy.getPrecioAsString();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void categoriaImportadoTest(){
        this.dummy = new Producto();
        dummy.setCategoria("Importado");
        Boolean expectedValue = true;
        Boolean actualValue = dummy.isImportado();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void categoriaNacionalTest(){
        this.dummy = new Producto();
        dummy.setCategoria("Nacional");
        Boolean expectedValue = true;
        Boolean actualValue = dummy.isNacional();
        assertEquals(expectedValue, actualValue);
    }
}