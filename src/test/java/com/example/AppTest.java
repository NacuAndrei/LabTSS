package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
    // TESTE PENTRU 1. a)
    @Test
    public void testValidNumber1a() {
        String input = "88881\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: DA\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }
    
    @Test
    public void testInvalidNumber1a() {
        String input = "99992\n"; 
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: NU\n";

        // Redirect the input and output streams to simulate the test
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberOutOfLowerRange1a() {
        String input = "10\n";
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: Numarul nu este valid\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberOutOfUpperRange1a() {
        String input = "123456\n";
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: Numarul nu este valid\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    // TESTE PENTRU 1. b)
    @Test
    public void testInvalidNumberSmall1b() {
        String input = "9999\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: Numarul nu este valid\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberExactlyAtLowerLimit1b() {
        String input = "10000\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: NU\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberExactlyAtUpperLimit1b() {
        String input = "99999\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: NU\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testInvalidNumberAboveLimit1b() {
        String input = "100000\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: Numarul nu este valid\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testSpecialCase1b() {
        String input = "10002\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: DA\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    // TESTE PENTRU 1. c)
    @Test
    public void testNumberE11c() {
        String input = "100\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: Numarul nu este valid\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberE21c() {
        String input = "24681\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: DA\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testNumberE31c() {
        String input = "13572\n";  
        String expectedOutput = "Introduceti un numar intre 10000 si 99999: NU\n";  

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }


}
