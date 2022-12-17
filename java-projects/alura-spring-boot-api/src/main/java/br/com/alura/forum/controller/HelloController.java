package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.HelloDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public ResponseEntity<HelloDto> hello() {
        return ResponseEntity.ok().body(new HelloDto("Olá mundo"));
    }

}
