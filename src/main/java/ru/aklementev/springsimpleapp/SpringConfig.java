package ru.aklementev.springsimpleapp;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentSc  an("ru.aklementev.springsimpleapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
//
//    @Bean
//    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(classicalMusic(), rockMusic());
//    }

    @Bean
    public List<Music> musicGenreList() {
//        List<Music> musicGenreList = new ArrayList<Music>();
//        for (Music genre : musicGenreList) {
//            musicGenreList.add(genre);
//        }
        return Arrays.asList(classicalMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenreList());
    }

}
