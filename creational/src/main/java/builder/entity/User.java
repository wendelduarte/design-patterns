package builder.entity;

import java.time.LocalDate;

public class User {
    private final String name;
    private final LocalDate birthDate;
    private final String mothersName;
    private final String fathersName;
    private final Address address;

    public User(String name, LocalDate birthDate, String mothersName, String fathersName, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public Address getAddress() {
        return address;
    }
}
