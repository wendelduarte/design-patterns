package builder.builder;

import builder.payload.UserDTO;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withName(String name);
    UserDTOBuilder withAddress(String address);
    UserDTOBuilder ageWithBirthDate(LocalDate bithDate);
    UserDTO build();
}
