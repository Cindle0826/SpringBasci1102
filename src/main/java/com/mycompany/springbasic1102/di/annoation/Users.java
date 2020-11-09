package com.mycompany.springbasic1102.di.annoation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Users {
    private List<String> names;
    {
        System.out.println("建立users");
        names = new ArrayList<>();
        names.add("Mary");names.add("John");names.add("Helen");names.add("Tom");
    }
    
    public List<String> getNames(){
        return  names;
    }

    @Override
    public String toString() {
        return "Users{" + "names=" + names + '}';
    }
    
    
    
}
