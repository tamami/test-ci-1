package lab.phb.testci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping(value = "/")
    public String getIndex() {
        return "index";
    }

}