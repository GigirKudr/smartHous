package ru.netology.radio;

public class Radio {
    public int numberStation;
    public int currentVolume;

    public int increaseVolume() {
        if (currentVolume < 100 && currentVolume > 0) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        } else {
            return 100;
        }
    }

    public int decreaseVolume() {
        if (currentVolume < 100 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        } else {
            return 0;
        }
    }

    public int next() {
        if (numberStation < 9 && numberStation >= 0) {
            numberStation = numberStation + 1;
            return numberStation;
        } else {
            return 0;
        }
    }

    public int prev() {
        if (numberStation <= 9 && numberStation > 0) {
            numberStation = numberStation - 1;
            return numberStation;
        } else {
            return 9;
        }
    }

    public int setNumberStation(int newNumberStation) {
        if (newNumberStation <= 9 && newNumberStation >= 0) {
            return newNumberStation;
        } else {
            return 0;
        }
    }

}



