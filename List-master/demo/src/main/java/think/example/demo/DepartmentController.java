package think.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam int department){
        return service.maxSalary(department);
    }
    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam int department){
        return service.minSalary(department);
    }
    @GetMapping("/all")
    public Collection<Employee> allByDepartment(@RequestParam int department){
        return service.allByDepartment(department);
    }
    @GetMapping("/all")
    public Map<Integer, List<Employee>> allEmployees(){
        return service.allEmployees();
    }

}
