package com.example.miniproject1.commandRunner;

import com.example.miniproject1.entity.Role;
import com.example.miniproject1.entity.User;
import com.example.miniproject1.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class CommandRunner implements CommandLineRunner {
    @Autowired private UserService userRepo;
    @Override
    public void run(String... args) throws Exception {
        User user=new User(0,"abdel","abdel","000",new ArrayList<>());
        Role role_student=new Role(0,"student",null);
        Role role_admin=new Role(0,"admin",null);

        role_student.setUser(user);
        role_admin.setUser(user);
        System.out.println("here are the entities");
        user.setRoles(Arrays.asList(role_student,role_admin));
        userRepo.addUser(user);
    }
}
