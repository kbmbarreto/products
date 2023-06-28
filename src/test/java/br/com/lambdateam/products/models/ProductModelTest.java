package br.com.lambdateam.products.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductModelTest {

    private ProductModel product;

    @BeforeEach
    public void setUp() {
        product = new ProductModel();
        product.setId(UUID.randomUUID());
        product.setName("Product 1");
        product.setValue(new BigDecimal("10.99"));
    }

    @Test
    public void testGetId() {
        UUID expectedId = UUID.randomUUID();
        product.setId(expectedId);
        UUID actualId = product.getId();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetName() {
        String expectedName = "Product 1";
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        String expectedName = "Updated Product";
        product.setName(expectedName);
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetValue() {
        BigDecimal expectedValue = new BigDecimal("10.99");
        BigDecimal actualValue = product.getValue();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSetValue() {
        BigDecimal expectedValue = new BigDecimal("19.99");
        product.setValue(expectedValue);
        BigDecimal actualValue = product.getValue();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
