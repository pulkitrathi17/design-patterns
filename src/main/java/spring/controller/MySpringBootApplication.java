package spring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringBootApplication {
  public static void main(String[] args) {
    SpringApplication.run(MySpringBootApplication.class, args);
  }

  @Bean
  Teacher getTeacher(){
    return new Teacher(5, "rathi");
  }

  @Bean
  Employee getEmployee(){
    return new Employee(4, "pulkit");
  }

  @Bean
  GetBothRequestDto getBothRequestDto(Employee employee, Teacher teacher){
    return new GetBothRequestDto(employee, teacher);
  }
}
