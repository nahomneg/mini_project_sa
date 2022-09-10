package com.example.miniproject1.batch;

import com.example.miniproject1.entity.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CSVItemProcessor implements ItemProcessor<StudentCSV,Student> {


    @Override
    public Student process(StudentCSV student) throws Exception {
        Student st = new Student();
        st.setFirstName(student.getFirst_name());
        st.setLastName(student.getLast_name());
        st.setGpa(student.getGpa());
        st.setId(student.getId());
        st.setDob(LocalDate.of(LocalDate.now().getYear(),1,1).minusYears(student.getAge())  );
        return st;
    }
}
