package ru.alishev.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList() {
        List<Music> list = new ArrayList<>();
        list.add(rockMusic());
        list.add(classicalMusic());
        list.add(rapMusic());
        return list;
    }
}
