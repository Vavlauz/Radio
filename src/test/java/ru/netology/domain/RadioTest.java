package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrentStation() {


        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationThird() {


        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationFourth() {


        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {


        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testNextSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {


        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testPrevSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {


        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeSecond() {


        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeThird() {


        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeFourth() {


        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {


        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.setIncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeSecond() {


        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.setIncreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testRefuseVolume() {


        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setRefuseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testRefuseVolumeSecond() {


        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.setRefuseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }
}

