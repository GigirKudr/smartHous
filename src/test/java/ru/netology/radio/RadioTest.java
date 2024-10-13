package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        int expected = 100;
        int actual = radio.increaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        int expected = 0;
        int actual = radio.decreaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        int expected = 3;
        int actual = radio.increaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWithOutRange() {
        Radio radio = new Radio();
        radio.currentVolume = -1;
        int expected = 100;
        int actual = radio.increaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 80;
        int expected = 79;
        int actual = radio.decreaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeWithOutRange() {
        Radio radio = new Radio();
        radio.currentVolume = 120;
        int expected = 0;
        int actual = radio.decreaseVolume();
        System.out.println("expected: " + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.numberStation = 1;
        int expected = 2;
        int actual = radio.next();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationInMax() {
        Radio radio = new Radio();
        radio.numberStation = 9;
        int expected = 0;
        int actual = radio.next();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationWithOutRange() {
        Radio radio = new Radio();
        radio.numberStation = -1;
        int expected = 0;
        int actual = radio.next();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.numberStation = 9;
        int expected = 8;
        int actual = radio.prev();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationInMin() {
        Radio radio = new Radio();
        radio.numberStation = 0;
        int expected = 9;
        int actual = radio.prev();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationWithOutRange() {
        Radio radio = new Radio();
        radio.numberStation = 11;
        int expected = 9;
        int actual = radio.prev();
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.setNumberStation(9);
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationWithOutRangeMin() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.setNumberStation(-1);
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationWithOutRangeMax() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.setNumberStation(11);
        System.out.println("expected:" + expected + ", actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
