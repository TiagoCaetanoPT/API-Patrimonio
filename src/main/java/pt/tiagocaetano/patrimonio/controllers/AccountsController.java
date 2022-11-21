package pt.tiagocaetano.patrimonio.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountsController {

    @GetMapping
    public String index(){
        return null; // TODO
    }

    @GetMapping
    public String show(){
        return null; // TODO
    }

    @PostMapping
    public String store(){
        return null; // TODO
    }

    @PutMapping
    public String update(){
        return null; // TODO
    }

    @DeleteMapping
    public String delete(){
        //TODO
        return null;
    }

}
