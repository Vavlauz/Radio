package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            setCurrentStation(currentStation + 1);
        }

    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume > 9) {
            currentVolume = 10;
        } else {
            setCurrentVolume(currentVolume + 1);
        }

    }

    public void setRefuseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }
}

