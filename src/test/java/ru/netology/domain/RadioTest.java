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
    void shouldSetStationOnMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(0);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOnMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(9);
        int actual = myRadio.getCurrentStation();
        int expected = 9;
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
    void shouldSetStationUnderMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(-10);
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
    void shouldSetVolumeOnMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(10);
        int actual = myRadio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOnMinimum() {
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
    void shouldSetVolumeUnderMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(-5);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    void shouldNextStationInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(8);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(0);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationOnMaximum() {
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
        myRadio.setCurrentStation(1);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMinimum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(0);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationOnMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(9);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeInRange() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(3);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnMinimum() {
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

    @Test
    void shouldDecreaseVolumeOnMaximum() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(10);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}