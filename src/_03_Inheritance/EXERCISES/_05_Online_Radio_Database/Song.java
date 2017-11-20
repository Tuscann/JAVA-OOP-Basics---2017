package _03_Inheritance.EXERCISES._05_Online_Radio_Database;

public class Song {

    private String artistName;

    Song(String artistName, String songName, long minutes, long seconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
       // this.dasda(minutes, seconds);   // "Invalid song length." not work
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    private void dasda(long minutes, long seconds) {
        long totalTime = minutes * 60 + seconds;

        if (totalTime > 899) {
            throw new IllegalArgumentException("Invalid song length.");
        }

    }


    private void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
    }

    private void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
    }

    private void setMinutes(long minutes) {
        if (minutes > 14 || minutes < 0) {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
    }

    private void setSeconds(long seconds) {
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
    }
}
