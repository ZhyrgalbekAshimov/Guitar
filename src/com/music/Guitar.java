package com.music;

import Services.TuneService;

public class Guitar implements TuneService {

    private String color;
    private int stringCount = 6;
    private int[] tensions = new int[stringCount];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
        this.tensions = new int[stringCount];
    }

    public int[] getTensions() {
        return tensions;
    }

    @Override
    public void tune() {

        for (int i = 0; i < tensions.length; i++) {
            tensions[i] = 5;
        }
    }

    @Override
    public void play() {

        System.out.println( "Белый снег, серый лёд\n" +
                            "На растрескавшейся земле\n" +
                            "Одеялом лоскутным на ней\n" +
                            "Город в дорожной петле"
                           );

        unsettle();

    }

    private void unsettle(){

        for (int i = 0; i < tensions.length; i++) {
            tensions[i] = (int) (Math.random() * 4);
        }

    }
}
