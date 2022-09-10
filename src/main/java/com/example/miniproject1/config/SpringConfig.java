package com.example.miniproject1.config;

import com.example.miniproject1.batch.CSVItemProcessor;
import com.example.miniproject1.batch.StudentCSV;
import com.example.miniproject1.entity.Student;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.integration.IntegrationDataSourceScriptDatabaseInitializer;
import org.springframework.boot.sql.init.DatabaseInitializationSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class SpringConfig {

//    @Bean
//    public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
//                   ItemReader<StudentCSV> reader, CSVItemProcessor itemProcessor, ItemWriter writer){
//
//        Step step = stepBuilderFactory.get("csv_file_load").<StudentCSV,Student>chunk(100).reader(reader).processor(itemProcessor).writer(writer).build();
//        return jobBuilderFactory.get("load_csv").incrementer(new RunIdIncrementer()).start(step).build();
//
//    }
//    @Bean
//    public IntegrationDataSourceScriptDatabaseInitializer customIntegrationDataSourceInitializer(DataSource dataSource) {
//        return new IntegrationDataSourceScriptDatabaseInitializer(dataSource, new DatabaseInitializationSettings());
//    }
//    @Bean
//    public FlatFileItemReader<StudentCSV> fileItemReader (@Value("${input}") Resource resource){
//        FlatFileItemReader<StudentCSV> reader = new FlatFileItemReader<>();
//        reader.setResource(resource);
//        reader.setName("csv_reader");
//        reader.setLinesToSkip(1);
//        reader.setLineMapper(lineMapper());
//        return reader;
//    }
//    @Bean
//    public LineMapper<StudentCSV> lineMapper(){
//        DefaultLineMapper<StudentCSV> defaultLineMapper = new DefaultLineMapper<>();
//        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
//        tokenizer.setDelimiter(",");
//        tokenizer.setStrict(false);
//        tokenizer.setNames("id", "first_name","last_names","gpa","age");
//
//        BeanWrapperFieldSetMapper<StudentCSV> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
//        fieldSetMapper.setTargetType(StudentCSV.class);
//        defaultLineMapper.setLineTokenizer(tokenizer);
//        defaultLineMapper.setFieldSetMapper(fieldSetMapper);
//        return defaultLineMapper;
//    }


}
