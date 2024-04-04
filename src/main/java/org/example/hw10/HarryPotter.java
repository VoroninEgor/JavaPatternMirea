package org.example.hw10;

import org.springframework.stereotype.Component;

@Component(value = "potter")
public class HarryPotter implements Magican{
    @Override
    public void doMagic() {
        System.out.println("expecto patroooonuuuus!!!");
    }
}
