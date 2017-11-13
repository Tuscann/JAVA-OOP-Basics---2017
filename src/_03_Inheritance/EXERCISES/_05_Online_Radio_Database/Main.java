package _03_Inheritance.EXERCISES._05_Online_Radio_Database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer count = Integer.parseInt(scan.nextLine());
        Integer counter = 0;
        Integer totalTime = 0;

        for (int i = 0; i < count; i++) {

            try {
                String[] currentSong = scan.nextLine().split(";");

                String artistName = currentSong[0];
                String songName = currentSong[1];
                String[] time = currentSong[2].split(":");
                Integer minutes = Integer.parseInt(time[0]);
                Integer seconds = Integer.parseInt(time[1]);

                Song song = new Song(artistName, songName, minutes, seconds);
                counter++;
                totalTime += minutes * 60 + seconds;

                System.out.println("Song added.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Integer leftHours = totalTime / 3600;
        Integer leftMinutes = (totalTime % 3600) / 60;
        Integer leftSeconds = totalTime % 60;

        System.out.println("Songs added: " + counter);
        System.out.printf("Playlist length: %dh %dm %ds", leftHours,leftMinutes ,leftSeconds );
    }
}
