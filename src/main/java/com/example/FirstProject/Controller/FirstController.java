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
    @GetMapping("/articles/new")
    public String newForm(){
        return "articles/header";
    }

    @PostMapping("/articles/create")
    public String createAricle(ArticleFrom from){
        System.out.println(from.toString());
        //1. DTO를 Entity로 변환 !
        Article article = form.toEntity();
        //2. Repository 에게 Entity DB안에 저장하게함 !
        return "articles/header";
    }
}

