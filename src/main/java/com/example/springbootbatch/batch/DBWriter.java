package com.example.springbootbatch.batch;

import com.example.springbootbatch.entity.Person;
import com.example.springbootbatch.repository.UserRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Person> {
    @Autowired
    private UserRepo userRepo;
    
    @Override
    public void write(List<? extends Person> users) throws Exception {
        System.out.println("Data saved fpr user"+users);
        userRepo.saveAll(users);
    }
}
