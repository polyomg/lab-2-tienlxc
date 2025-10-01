package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/ctrl")
public class OkController {

    @RequestMapping("/ok")
    public String ok() {
        return "poly/ok";
    }

    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("result", "m1()");
        return "poly/ok";
    }

    @GetMapping("/ok")
    public String m2(Model model) {
        model.addAttribute("result", "m2()");
        return "poly/ok";
    }

    @PostMapping(value = "/ok", params = "x")
    public String m3(Model model) {
        model.addAttribute("result", "m3()");
        return "poly/ok";
    }
}
