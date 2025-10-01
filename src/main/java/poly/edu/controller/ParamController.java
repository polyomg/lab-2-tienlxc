package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ParamController {

    // load form
    @RequestMapping("/param/form")
    public String form() {
        return "poly/form"; 
    }

    @RequestMapping("/param/save/{x}")
    public String save(
            @PathVariable("x") String x,     
            @RequestParam("y") String y,   
            Model model) {

        model.addAttribute("x", x);
        model.addAttribute("y", y);

        return "poly/form"; // load lại form và hiển thị kết quả
    }
}
