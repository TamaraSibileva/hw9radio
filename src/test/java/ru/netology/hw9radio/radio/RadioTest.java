package ru.netology.hw9radio.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCorrectNumberRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(3);

        int expected = 3;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getMaxNumberRadioStation());
    }

    @Test
    public void shouldSetNumberStationBelowMin() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAboveMax() {
        Radio radio = new Radio(13);

        radio.setNumberRadioStation(radio.getMaxNumberRadioStation() + 1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationMin() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationMax() {
        Radio radio = new Radio(15);

        radio.setNumberRadioStation(radio.getMaxNumberRadioStation());

        int expected = radio.getMaxNumberRadioStation();
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
    public void shouldSetNextNumberStationToMax() {
        Radio radio = new Radio(17);

        radio.setNumberRadioStation(radio.getMaxNumberRadioStation() - 1);

        int expected = radio.getMaxNumberRadioStation();
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStationAfterMax() {
        Radio radio = new Radio(19);

        radio.setNumberRadioStation(radio.getMaxNumberRadioStation());

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(radio.getMaxNumberRadioStation());

        int expected = radio.getMaxNumberRadioStation() - 1;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationTo1() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(1);

        int expected = 0;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationTo0() {
        Radio radio = new Radio(21);

        radio.setNumberRadioStation(0);

        int expected = radio.getMaxNumberRadioStation();
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCorrectVolume() {
        Radio radio = new Radio();

        radio.setVolume(52);

        int expected = 52;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();

        radio.setVolume(radio.getMinVolume());

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(radio.getMinVolume() - 1);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio(14);

        radio.setVolume(radio.getMaxVolume());

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio(16);

        radio.setVolume(radio.getMaxVolume() + 1);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(radio.getMinVolume());

        int expected = radio.getMinVolume() + 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio radio = new Radio();

        radio.setVolume(radio.getMaxVolume() - 1);

        int expected = radio.getMaxVolume();
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(radio.getMaxVolume());

        int expected = radio.getMaxVolume();
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio(18);

        radio.setVolume(radio.getMaxVolume());

        int expected = radio.getMaxVolume() - 1;
        int actual = radio.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeToMin() {
        Radio radio = new Radio(20);

        radio.setVolume(radio.getMinVolume() + 1);

        int expected = radio.getMinVolume();
        int actual = radio.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeBelowMin() {
        Radio radio = new Radio(22);

        radio.setVolume(radio.getMinVolume());

        int expected = radio.getMinVolume();
        int actual = radio.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}
