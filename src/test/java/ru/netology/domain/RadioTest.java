package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetStationInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(4);
        int actual = myRadio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOverMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(10);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(0);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOverMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(11);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(1);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOverMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(9);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(3);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationUnderMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(0);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(0);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(10);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(6);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeOnMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(0);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}