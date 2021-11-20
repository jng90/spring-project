package pl.sda.pol92.ex1;


import org.springframework.stereotype.Component;

@Component
public class Sumator {
    public double sum(double a, double b){
        return a+b;
    }
}
