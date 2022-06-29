package com.junit.junittest;

import static org.junit.jupiter.api.Assertions.*;


//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
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

    @Test
    @RepeatedTest(20)
    @DisplayName("Check assert null")
    public void testassertNull(){
        assertNotNull(r);
    }




    /**
     * Junit test to check  Exception 
     * we have to make  Executable class Object 
     * 
     * Executable exec=()-> BMICalculator.isDietRecommende(h1,W1);
     * assertThrows(ArthmeticException.class,exec);
     */



//Grouped assertions


    // @Test
    // void groupedAssertions() {
    //     // In a grouped assertion all assertions are executed, and all
    //     // failures will be reported together.
    //     assertAll("person",
    //         () -> assertEquals("Jane", person.getFirstName()),
    //         () -> assertEquals("Doe", person.getLastName())
    //     );
    // }



//Dependend assertions


    // @Test
    // void dependentAssertions() {
    //     // Within a code block, if an assertion fails the
    //     // subsequent code in the same block will be skipped.
    //     assertAll("properties",
    //         () -> {
    //             String firstName = person.getFirstName();
    //             assertNotNull(firstName);

    //             // Executed only if the previous assertion is valid.
    //             assertAll("first name",
    //                 () -> assertTrue(firstName.startsWith("J")),
    //                 () -> assertTrue(firstName.endsWith("e"))
    //             );
    //         },
    //         () -> {
    //             // Grouped assertion, so processed independently
    //             // of results of first name assertions.
    //             String lastName = person.getLastName();
    //             assertNotNull(lastName);

    //             // Executed only if the previous assertion is valid.
    //             assertAll("last name",
    //                 () -> assertTrue(lastName.startsWith("D")),
    //                 () -> assertTrue(lastName.endsWith("e"))
    //             );
    //         }
    //     );
    // }



    // @ParameterizedTest
    // @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    // void palindromes(String candidate) {
    //     assertTrue(StringUtils.isPalindrome(candidate));
    // }
    // When executing the above parameterized test method, each invocation will be reported separately. For instance, 
    //the ConsoleLauncher will print output similar to the following.

    // palindromes(String) ✔
    // ├─ [1] candidate=racecar ✔
    // ├─ [2] candidate=radar ✔
    // └─ [3] candidate=able was I ere I saw elba ✔

}


/**
 * 
 * @Disabled
 * @Disablesif and many more
 * @TestMethodOrder 
 *  
 * In order to allow individual test methods to be executed in isolation and to avoid unexpected side effects due
 * to mutable test instance state, JUnit creates a new instance of each test class before executing each test method.
 * 
 * @RepeatedTest(number of times)
 * 
 * @ParameterizedTest
 * @NullSource
 * @EmptySource
 * @ValueSource(String ={})
 * 
 * We have to follow this order itself to pass NullSource EmptySource and than Value Source 
 */

//https://junit.org/junit5/docs/current/user-guide/