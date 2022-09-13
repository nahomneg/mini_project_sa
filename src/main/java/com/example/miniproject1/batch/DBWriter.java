package com.example.miniproject1.batch;

import com.example.miniproject1.entity.Student;
import com.example.miniproject1.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DBWriter implements ItemWriter<Student> {
    final
    StudentRepository repository;

    public DBWriter(StudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public void write(List<? extends Student> list) throws Exception {
        System.out.println("Data is being saved to db");
        repository.saveAll(list);
    }
}
