package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Serov Maxim
 */
@Controller
@RequestMapping("/three")
public class ExitController {

    @GetMapping(value = "/exit")
    public String exit() {
        return "three/exit";
    }
}
