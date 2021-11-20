package pl.sda.pol92.console;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Names {
    private List<String> names = List.of(
            "Karol",
            "Ewa",
            "Ola",
            "Konrad"
    );

    public String getByIndex(int index){
        return names.get(index);
    }
}
