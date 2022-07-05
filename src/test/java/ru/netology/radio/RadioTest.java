package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void setCurrentStationTest(int set, int expected) {
        Radio radioService = new Radio();
        // вызываем целевой метод:
        radioService.setCurrentStation(0);
        //Предварительно обнуляем значение
        radioService.setCurrentStation(set);
        //Выставляем значение
        int actual = radioService.getCurrentStation();
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "8,9",
            "9,0",
            "0,1"
    })
    public void nextStationTest(int set, int expected) {
        Radio radioService = new Radio();
        // вызываем целевой метод:
        radioService.setCurrentStation(set);
        //Выставляем значение
        radioService.nextStation();
        int actual = radioService.getCurrentStation();
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "9,8",
            "0,9",
            "1,0"
    })
    public void prevStationTest(int set, int expected) {
        Radio radioService = new Radio();
        // вызываем целевой метод:
        radioService.setCurrentStation(set);
        //Выставляем значение
        radioService.prevStation();
        int actual = radioService.getCurrentStation();
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "9,10",
            "10,10"
    })
    public void increaseVolumeTest(int set, int expected) {
        Radio radioService = new Radio();
        // вызываем целевой метод:
        radioService.setCurrentVolume(set);
        //Выставляем значение
        radioService.increaseVolume();
        int actual = radioService.getCurrentVolume();
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,0",
            "10,9",
            "9,8"
    })
    public void decreaseVolumeTest(int set, int expected) {
        Radio radioService = new Radio();
        // вызываем целевой метод:
        radioService.setCurrentVolume(set);
        //Выставляем значение
        radioService.decreaseVolume();
        int actual = radioService.getCurrentVolume();
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}