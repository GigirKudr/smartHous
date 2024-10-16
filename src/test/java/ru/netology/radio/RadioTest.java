package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(0);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(55);

        int expected = 56;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(80);
        int expected = 79;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMax() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInOutRangeInUp() {
        Radio radio = new Radio();
        radio.setNumberStation(11);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationInOutRangeInDown() {
        Radio radio = new Radio();
        radio.setNumberStation(-5);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setNextStation(1);
        int expected = 2;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxRange() {
        Radio radio = new Radio();
        radio.setNextStation(9);
        int expected = 0;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setPrevStation(5);
        int expected = 4;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinRange() {
        Radio radio = new Radio();
        radio.setPrevStation(0);
        int expected = 9;
        int actual = radio.getNumberStation();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}