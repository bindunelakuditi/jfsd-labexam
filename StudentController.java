package RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController

public class StudentController {
  @GetMapping("/display")
  public String display()
  {
    return "<b> Display method in SpringBoot RestController </b>";
  }
  @GetMapping("/home")
  public String home()
  {
    return "Welcome to homePage";
  }
  @GetMapping("/display1")
  public int display1()
  {
    return 12345;
  }
  @GetMapping("/display2")
  public String display2(@RequestParam("n1") int x,@RequestParam("n2") int y)
  {
    int z = x+y;
    return "Sum of two values = "+x +" + "+y + " = "  +Integer.toString(z);
  }
  List<Student> students = new ArrayList<Student>();
  @PostMapping("addStudent")
  public String addStudent(@RequestBody Student s)
  {
    students.add(s);
    return "Section-27 Student data inserted successfully";
  }
  @GetMapping("viewStudents")
  public List<Student> viewStudents()
  {
    return students;
  }

}