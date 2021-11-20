package pl.sda.pol92.console;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Config {
    private String author = "CS";
    private int defaultIndex = 0;

    public String getAuthor(){
        return author;
    }

    public int getDefaultIndex(){
        return defaultIndex;
    }

    @Bean
    public Random random(){
        return new Random();
    }
}
