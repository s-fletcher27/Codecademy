package com.codecademy.java1;

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {
        String[] favouriteSongs = new String[10];
        for (int i = 0; i < favouriteSongs.length; i++) {
            favouriteSongs[i] = "Song " + i;
        }
        System.out.println(favouriteSongs[0] + ", " + favouriteSongs[1] + ", " + favouriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            desertIslandPlaylist.add("Desert song " + i);
        }
        System.out.println(desertIslandPlaylist);

        //not the way of the instructions
        /*
        for(int i = 0; i < favouriteSongs.length; i++){
          desertIslandPlaylist.add(favouriteSongs[i]);
        }
        System.out.println(desertIslandPlaylist);
        */

        desertIslandPlaylist.addAll(Arrays.asList(favouriteSongs));
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.size();
        for (int i = desertIslandPlaylist.size() - 1; i >= 5; i--) {
            System.out.println("Removing: " + desertIslandPlaylist.get(i));
            desertIslandPlaylist.remove(i);
        }
        System.out.println(desertIslandPlaylist);

        int songA = 0;
        int songB = 1;

        String tempA = desertIslandPlaylist.get(songA);

        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);


    }
}
