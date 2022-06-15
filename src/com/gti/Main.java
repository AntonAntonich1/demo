package com.gti;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wfororld !!!!");
        Song song = new Song();
        song.addString("Nothing else matters");
        song.addString("So close no matter how far");
        System.out.println(song.getStrings());
    }
}
