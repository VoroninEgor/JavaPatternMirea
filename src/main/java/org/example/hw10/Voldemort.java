package org.example.hw10;

import org.springframework.stereotype.Component;

@Component
public class Voldemort implements Magican{
    @Override
    public void doMagic() {
        System.out.println("Avadakidavro!!!");
    }
}
