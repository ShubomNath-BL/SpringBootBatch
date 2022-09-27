package com.example.springbootbatch.batch;

import com.example.springbootbatch.entity.Person;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person user) throws Exception {
        return user;
    }
}
