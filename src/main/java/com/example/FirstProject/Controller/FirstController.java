package com.example.FirstProject.Controller;
import com.example.FirstProject.DTO.ArticleFrom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstController {
    @GetMapping("/HelloUser")
    public String Hi(Model model){
        model.addAttribute("Username","동호");
        return "layouts/greetings";//브라우저로 전송시켜줌
    }
    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("nickname","동호");
        return "layouts/goodbye";//브라우저로 전송시켜줌
    }

}

