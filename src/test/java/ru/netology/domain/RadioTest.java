package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio myRadio = new Radio();

    @Test
    public void shouldSetStationInRangeDefaultClass() {
        myRadio.setCurrentStation(4);
        int actual = myRadio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationInRangeAnyClass() {
        Radio myRadio = new Radio(200);
        myRadio.setCurrentStation(184);
        int actual = myRadio.getCurrentStation();
        int expected = 184;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMinimum() {
        myRadio.setCurrentStation(0);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMaximumDefaultClass() {
        myRadio.setCurrentStation(9);
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMaximumDefaultClass() {
        myRadio.setCurrentStation(10);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnMaximumAnyClass() {
        Radio myRadio = new Radio(54);
        myRadio.setCurrentStation(53);
        int actual = myRadio.getCurrentStation();
        int expected = 53;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMaximumAnyClass() {
        Radio myRadio = new Radio(100);
        myRadio.setCurrentStation(100);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderMinimum() {
        myRadio.setCurrentStation(-10);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInRange() {
        myRadio.setCurrentVolume(50);
        int actual = myRadio.getCurrentVolume();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMaximum() {
        myRadio.setCurrentVolume(100);
        int actual = myRadio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnMinimum() {
        myRadio.setCurrentVolume(0);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverMaximum() {
        myRadio.setCurrentVolume(101);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMinimum() {
        myRadio.setCurrentVolume(-5);
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationInRangeDefaultClass() {
        myRadio.setCurrentStation(8);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationInRangeAnyClass() {
        Radio myRadio = new Radio(100);
        myRadio.setCurrentStation(98);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMinimum() {
        myRadio.setCurrentStation(0);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMaximumDefaultClass() {
        myRadio.setCurrentStation(9);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOnMaximumAnyClass() {
        Radio myRadio = new Radio(100);
        myRadio.setCurrentStation(99);
        myRadio.nextStation();
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationInRangeDefaultClass() {
        myRadio.setCurrentStation(1);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationInRangeAnyClass() {
        Radio myRadio = new Radio(80);
        myRadio.setCurrentStation(55);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 54;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMinimumDefaultClass() {
        myRadio.setCurrentStation(0);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMinimumAnyClass() {
        Radio myRadio = new Radio(80);
        myRadio.setCurrentStation(0);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 79;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMaximumDefaultClass() {
        myRadio.setCurrentStation(9);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOverMaximumDefaultClass() {
        myRadio.setCurrentStation(10);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOnMaximumAnyClass() {
        Radio myRadio = new Radio(80);
        myRadio.setCurrentStation(79);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 78;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOverMaximumAnyClass() {
        Radio myRadio = new Radio(80);
        myRadio.setCurrentStation(80);
        myRadio.prevStation();
        int actual = myRadio.getCurrentStation();
        int expected = 79;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInRange() {
        myRadio.setCurrentVolume(43);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 44;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMinimum() {
        myRadio.setCurrentVolume(0);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnMaximum() {
        myRadio.setCurrentVolume(100);
        myRadio.increaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInRange() {
        myRadio.setCurrentVolume(6);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMinimum() {
        myRadio.setCurrentVolume(0);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOnMaximum() {
        myRadio.setCurrentVolume(10);
        myRadio.decreaseVolume();
        int actual = myRadio.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}