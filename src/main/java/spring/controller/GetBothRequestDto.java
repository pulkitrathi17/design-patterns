package spring.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetBothRequestDto {
  Employee employee;
  Teacher teacher;
}
