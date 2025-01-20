package ru.netology.hw9radio.radio;

public class Radio {
    private int amountRadioStations = 10;
    private int maxNumberRadioStation = 9;
    private int currentNumberRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int newAmountRadioStations) {
        this.amountRadioStations = newAmountRadioStations;
        maxNumberRadioStation = amountRadioStations - 1;
    }

    public Radio() {
        this.amountRadioStations = amountRadioStations;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < 0) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public int next() {
        if (currentNumberRadioStation < maxNumberRadioStation) {
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
            currentNumberRadioStation = maxNumberRadioStation;
        }
        return currentNumberRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setVolume(int newCurrentVolume){
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}
