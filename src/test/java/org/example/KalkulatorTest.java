package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void penjumlahanNilaiPositif() {
        // Input
        Kalkulator kalk = new Kalkulator(2, 3);

        // Provide expected & actual value
        assertEquals(5, kalk.penjumlahan());
        // Automatically verify result & give alert
    }
    @Test
    void penjumlahanNilaiNegatif() {
        Kalkulator kalk = new Kalkulator(-2, -6);
        assertEquals(-8, kalk.penjumlahan());
    }
}