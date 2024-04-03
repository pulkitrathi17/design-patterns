package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserController {
  @Autowired
  private GetBothRequestDto getBothRequestDto;
  @Autowired
  private Employee employee;
  @Autowired
  private Teacher teacher;


  @GetMapping("/emp/{empId}")
  public String getEmp(@RequestBody Employee emp, @PathVariable(value = "empId") Integer empId) {
    return String.format("%s %s %s", employee.toString(), empId, emp.toString());
  }

  @GetMapping("/printBoth")
  public String getBoth(@RequestBody GetBothRequestDto both) {
    return both.getEmployee().toString() + both.getTeacher().toString();
  }

  @GetMapping("/getBoth")
  public String getEmpBean() {
    return getBothRequestDto.toString();
  }
}
