
package com.example.FirstProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/HelloUser")
    public String Hi(Model model){
        model.addAttribute("Username","동호");
        return "greetings";//브라우저로 전송시켜줌
    }
    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("nickname","동호");
        return "goodbye";//브라우저로 전송시켜줌
    }
}
//모델이라는 프레임 워크를 가져옴