package builder;

import builder.builder.Director;
import builder.builder.UserDTOBuilderImpl;
import builder.entity.Address;
import builder.entity.User;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args){
        var director = new Director();
        var userDTOBuilder = new UserDTOBuilderImpl();

        var userDTO = director.directBuildFromUser(userDTOBuilder, createUser());

        System.out.println("Usuário criado: " + userDTO);
    }

    public static User createUser(){
        var addres = new Address("Rua das Flores", 35, "São Paulo", "SP");
        return new User("João", LocalDate.of(2000, 8, 25),
                "Maria", "Marco", addres);
    }
}