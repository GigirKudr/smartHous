package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int currentVolume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume + 1;
    }


    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 0) {
            currentVolume = 0;
            return;
        }

        currentVolume = newCurrentVolume - 1;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation <= 9 && newNumberStation >= 0) {
            numberStation = newNumberStation;
        }
        return;
    }

    public void setNextStation(int newNumberStation) {
        if (newNumberStation == 9) {
            numberStation = 0;
            return;
        }
        numberStation = newNumberStation + 1;
    }

    public void setPrevStation(int newNumberStation) {
        if (newNumberStation == 0) {
            numberStation = 9;
            return;
        }
        numberStation = newNumberStation - 1;
    }
}



