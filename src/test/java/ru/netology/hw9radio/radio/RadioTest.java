package ru.netology.hw9radio.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCorrectNumberRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationBelow0() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAbove9() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation0() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation9() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(0);

        int expected = 1;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStationAfter9() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(9);

        int expected = 8;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationTo0() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAbove100() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelow0() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAbove100() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 99;
        int actual = radio.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeBelow0() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

}
