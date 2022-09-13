package com.example.miniproject1.controller;

import com.example.miniproject1.entity.User;
import com.example.miniproject1.service.UserService;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CSVLoadController {
    @Autowired
    JobLauncher jobLauncher;
    @Autowired private UserService userService;
    @Autowired
    Job job;

    @PostMapping("/loadcsv")
    public BatchStatus loadData() throws JobParametersInvalidException, JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobRestartException {
        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution = jobLauncher.run(job,parameters);
        System.out.println("job execution: " + jobExecution.getStatus());
        while (jobExecution.getStatus().isRunning()){
            System.out.println("...");
        }
        System.out.println("finished");
        return jobExecution.getStatus();
    }
    @PostMapping("/user/save/adduser")
    public User saveUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
