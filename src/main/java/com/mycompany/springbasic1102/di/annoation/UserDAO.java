package com.mycompany.springbasic1102.di.annoation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "singleton")
public class UserDAO {
    //DAO DataBase Access Object
    private Users users;
    
    public Users queryUsers(){
        return  users;
    }
    
    public Boolean existByName(String name){
        return users.getNames().stream().filter( s -> s.equals(name)).findFirst().isPresent();
    }
}
