package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Human;

public class Doctor extends Human {
    public Doctor(String sofiNumber) {
        super(sofiNumber);
    }

    protected String getSofiNumber() {
        return super.getSofiNumber();
    }
}
