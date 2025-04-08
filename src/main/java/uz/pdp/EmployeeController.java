package uz.pdp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    //  localhost:8080/employee
    //  /users
    //   /ketmon
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String bobo() {
        return "employee";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String bobo2() {
        return "employee";
    }


    @RequestMapping("/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value = "/ketmon")
    @ResponseBody
    public String ketmon() {

        return List.of("Oka","Uka","Doda").toString();
    }

}
