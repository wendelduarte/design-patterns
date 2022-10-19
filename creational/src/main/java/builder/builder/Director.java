package builder.builder;

import builder.entity.User;
import builder.payload.UserDTO;

public class Director {

    public UserDTO directBuildFromUser(UserDTOBuilder userDTOBuilder, User user){
        return userDTOBuilder.withName(user.getName())
                .withAddress(user.getAddress().getStreet() + ", " + user.getAddress().getNumber())
                .ageWithBirthDate(user.getBirthDate())
                .build();
    }
}
