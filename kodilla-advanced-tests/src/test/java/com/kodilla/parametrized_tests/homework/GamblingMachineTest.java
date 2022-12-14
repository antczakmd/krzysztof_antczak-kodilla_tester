package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    //przypadki, w których ma rzucić wyjątek
    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToFail.csv")
    public void shouldThrowExceptionWithInvalidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        Set<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toSet());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        GamblingMachine gamblingMachine = new GamblingMachine();
        int result = gamblingMachine.howManyWins(numbersToValidate);
        System.out.println("Data to throw exception on validateNumbers(): " + expectedParsed);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbersToValidate));
    }

    //przypadki, w których ma przejść
    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldPassValidatingMethodWithValidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        Set<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toSet());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        System.out.println("Data to pass validateNumbers(): " + expectedParsed);
        GamblingMachine gamblingMachine = new GamblingMachine();
        int result = gamblingMachine.howManyWins(numbersToValidate);
        assertNotEquals(0,expectedParsed.size());
        assertTrue(result >= 0 & result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToFail.csv")
    public void shouldNotCountWinsWithInvalidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        System.out.println("Data to throw exception on howManyWins(): " + expectedParsed);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expectedParsed));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/randomNumbersToPass.csv")
    public void shouldCountWinsWithValidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        System.out.println("Data to pass howManyWins(): " + expectedParsed);
        System.out.println("Number of wins: " + gamblingMachine.howManyWins(expectedParsed));
        assertNotNull(gamblingMachine.howManyWins(expectedParsed));
    }
}