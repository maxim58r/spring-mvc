package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Serov Maxim
 */
@Controller
public class OwnerController {

    @GetMapping(value = "/owner")
    public String getOwners() {
        return "two/owner";
    }
}
