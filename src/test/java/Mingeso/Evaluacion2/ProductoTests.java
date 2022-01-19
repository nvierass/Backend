package Mingeso.Evaluacion2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import Mingeso.Evaluacion2.Models.Producto;

class ProductoTests{

    Producto dummy;

    @DisplayName("Test de verificación de precio como String")
    @Test
    void precioAsString(){
        this.dummy = new Producto();
        dummy.setPrecio(1500);
        String expectedValue = "1500";
        String actualValue = dummy.getPrecioAsString();
        assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Test de verificación de setCategoria, para producto Importado")
    @Test
    void categoriaImportadoTest(){
        this.dummy = new Producto();
        dummy.setCategoria("Importado");
        Boolean expectedValue = true;
        Boolean actualValue = dummy.isImportado();
        assertEquals(expectedValue, actualValue);
    }

    @DisplayName("Test de verificación de setCategoria, para producto Nacional")
    @Test
    void categoriaNacionalTest(){
        this.dummy = new Producto();
        dummy.setCategoria("Nacional");
        Boolean expectedValue = true;
        Boolean actualValue = dummy.isNacional();
        assertEquals(expectedValue, actualValue);
    }
}