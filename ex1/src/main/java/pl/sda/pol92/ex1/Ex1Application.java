package pl.sda.pol92.ex1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Ex1Application implements CommandLineRunner {
    final Scanner scanner;
    final Sumator sumator;

    public Ex1Application(Scanner scanner, Sumator sumator) {
        this.scanner = scanner;
        this.sumator = sumator;
    }


    public static void main(String[] args) {
        SpringApplication.run(Ex1Application.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("podaj liczbe a:");
        final double a = scanner.nextDouble();
        System.out.println("podaj liczbe b:");
        final double b = scanner.nextDouble();
        System.out.println("Wynik: " + sumator.sum(a,b));
    }
    @Bean
    public String password(){
        return "abcd";
    }
}
