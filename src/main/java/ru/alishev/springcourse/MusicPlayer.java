package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic rockMusic,
                       RockMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicType musicType) {
        Random random = new Random();
        if (musicType == MusicType.CLASSICAL) {
            System.out.println("Playing: " +
                    classicalMusic.getSongList().get(random.nextInt(classicalMusic.getSongList().size())));
        }
        if (musicType == MusicType.ROCK) {
            System.out.println("Playing: " +
                    rockMusic.getSongList().get(random.nextInt(rockMusic.getSongList().size())));
        }
    }
}
