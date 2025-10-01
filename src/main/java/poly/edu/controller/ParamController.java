package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ParamController {

    @RequestMapping("/param/form")
    public String form() {
        return "poly/form"; 
    }

    // nhận dữ liệu từ form
    @RequestMapping("/param/save/{x}")
    public String save(
    		//lấy từ URL path: /save/{x}
            @PathVariable("x") String x,    
            // lấy từ form input name="y"
            @RequestParam("y") String y,    
            Model model) {

        model.addAttribute("x", x);
        model.addAttribute("y", y);

        return "poly/form"; // load lại form và hiển thị kết quả
    }
}
