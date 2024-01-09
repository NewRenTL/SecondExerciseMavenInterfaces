package org.example.Classes;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.User;

@Getter
@Setter
public class Person implements User {
    private int id;
    private String name;

    @Override
    public void iniciarSession() {

    }

    @Override
    public void cerrarSession() {

    }
}
