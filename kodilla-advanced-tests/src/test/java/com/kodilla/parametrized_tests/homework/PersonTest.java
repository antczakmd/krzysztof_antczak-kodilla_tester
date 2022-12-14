package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataSources#provideDataForTesting")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}