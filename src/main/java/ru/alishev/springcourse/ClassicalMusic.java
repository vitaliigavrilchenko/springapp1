package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSongList() {
        return Arrays.asList("Bah", "Betkhoven", "Motsart");
    }
}
