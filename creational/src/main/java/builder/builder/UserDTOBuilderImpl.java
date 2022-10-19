package builder.builder;

import builder.payload.UserDTO;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOBuilderImpl implements UserDTOBuilder{
    private String name;
    private String address;
    private int age;

    @Override
    public UserDTOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTOBuilder ageWithBirthDate(LocalDate birthDate) {
        Period ageInYears = Period.between(birthDate, LocalDate.now());
        age = ageInYears.getYears();
        return this;
    }

    @Override
    public UserDTO build() {
        return new UserDTO(name, address, age);
    }
}
