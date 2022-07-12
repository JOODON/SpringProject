package com.example.FirstProject.Controller;

import com.example.FirstProject.DTO.ArticleFrom;
import com.example.FirstProject.Entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newForm(){

        return "articles/header";
    }
    @PostMapping("/articles/create")
    public String createAricle(ArticleFrom from){
        System.out.println(from.toString());
        //1. DTO를 Entity로 변환 !
        Article article=from.toEntity();
        //2. Repository 에게 Entity DB안에 저장하게함 !
        return "articles/header";
    }

}
