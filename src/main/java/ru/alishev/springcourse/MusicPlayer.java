package ru.alishev.springcourse;



import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public List<Music> getGenres() {
        return genres;
    }

    public void setGenres(List<Music> genres) {
        this.genres = genres;
    }

    public void playMusic(){
        Random random = new Random();
        System.out.println(genres.get(random.nextInt(genres.size())).getSong());
    }
}
