package com.junit.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    private Rectangle r;
    @BeforeEach
    public void init(){
        r=new Rectangle(2,2);
    }

    @Test
    @DisplayName("To calculate area")
    public void testCalculateArea(){
        assertEquals(4.0, r.calculateArea());
    }

    @Test
    @DisplayName("Checking if Square")
    public void testIsSquare(){
        assertTrue(r.isSquare());
    }
}
