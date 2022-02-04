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


        Radio radio1 = new Radio(20);

        radio.setCurrentStation(0);


        assertEquals(0, radio1.getCurrentStation());
    }


    @Test
    public void testCurrentStationSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(19);


        assertEquals(19, radio1.getCurrentStation());
    }

    @Test
    public void testCurrentStationThird() {


        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(20);


        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void testCurrentStationFourth() {


        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(-1);


        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void testNextStation() {


        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(19);
        radio1.setNextStation();


        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void testNextSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(11);
        radio1.setNextStation();


        assertEquals(12, radio1.getCurrentStation());
    }

    @Test
    public void testPrevStation() {


        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(0);
        radio1.setPrevStation();


        assertEquals(19, radio1.getCurrentStation());
    }

    @Test
    public void testPrevSecond() {


        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();


        assertEquals(expected, actual);

        Radio radio1 = new Radio(20);

        radio1.setCurrentStation(17);
        radio1.setPrevStation();


        assertEquals(16, radio1.getCurrentStation());
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

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolumeThird() {


        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
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

        radio.setCurrentVolume(101);
        radio.setIncreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeSecond() {


        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.setIncreaseVolume();

        int expected = 56;
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

        radio.setCurrentVolume(67);
        radio.setRefuseVolume();

        int expected = 66;
        int actual = radio.getCurrentVolume();


        assertEquals(expected, actual);
    }
}

