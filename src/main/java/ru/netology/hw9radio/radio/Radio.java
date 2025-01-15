package ru.netology.hw9radio.radio;

public class Radio {
    private int currentNumberRadioStation;
    private int currentVolume;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < 0) {
            return;
        }
        if (newCurrentNumberRadioStation > 9) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public int next() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            currentNumberRadioStation = 0;
        }
        return currentNumberRadioStation;
    }

    public int prev() {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else {
            currentNumberRadioStation = 9;
        }
        return currentNumberRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume){
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
