package ru.netology.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class Radio {
    @Getter
    private int currentStation;
    private int currentVolume;
    private int qualityStation = 10;

    public Radio(int qualityStation) {
        this.qualityStation = qualityStation;

    }

//    public Radio() {
//
//    }

//    public int getCurrentStation() {
//        return currentStation;
//
//    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >= qualityStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == (qualityStation - 1)) {
            currentStation = 0;
        } else {
            setCurrentStation(currentStation + 1);
        }

    }

    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = (qualityStation - 1);
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
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume > 99) {
            currentVolume = 100;
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


//    public Radio() {
//    }

//    public Radio(int qualityStation) {
//        this.qualityStation = qualityStation;
//
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//
//    }
//
//    public void setCurrentStation(int currentStation) {
//        if (currentStation < 0) {
//            return;
//        }
//        if (currentStation >= qualityStation) {
//            return;
//        }
//        this.currentStation = currentStation;
//    }
//
//    public void setNextStation() {
//        if (currentStation == (qualityStation - 1)) {
//            currentStation = 0;
//        } else {
//            setCurrentStation(currentStation + 1);
//        }
//
//    }
//
//    public void setPrevStation() {
//        if (currentStation == 0) {
//            currentStation = (qualityStation - 1);
//        } else {
//            setCurrentStation(currentStation - 1);
//        }
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume < 0) {
//            currentVolume = 0;
//        }
//        if (currentVolume > 100) {
//            currentVolume = 100;
//        }
//        this.currentVolume = currentVolume;
//    }
//
//    public void setIncreaseVolume() {
//        if (currentVolume > 99) {
//            currentVolume = 100;
//        } else {
//            setCurrentVolume(currentVolume + 1);
//        }
//
//    }
//
//    public void setRefuseVolume() {
//        if (currentVolume <= 0) {
//            currentVolume = 0;
//        } else {
//            setCurrentVolume(currentVolume - 1);
//        }
//    }
//}




