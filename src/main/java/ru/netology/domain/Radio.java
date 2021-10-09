package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        }
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }

    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        } else {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume--;
        }

    }
}
