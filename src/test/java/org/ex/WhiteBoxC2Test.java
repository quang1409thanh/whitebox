package org.ex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoxC2Test {
    @ParameterizedTest
    @CsvFileSource(resources = "/WhiteBoxC2Test.csv", numLinesToSkip = 1)
    void test(int type, int value, String expected_output) {
        String actual_output = Calculator.calculatePrice(type, value);
        assertEquals(expected_output, actual_output);
    }

}