package ru.netology.radio;
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    public Radio(){
        maxStation = 9;
    }
    public Radio(int stations){
        if (stations > 1) {
            this.maxStation = stations - 1;
        }
    }
    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= maxStation) {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}
