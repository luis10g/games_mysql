package luishenrique.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import luishenrique.repositories.GeneroRepository;

@Controller
@RequestMapping("/generos")
public class GenerosController {
    @Autowired
    private GeneroRepository generosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("generos", this.generosRepo.findAll());
        return "/generos/list";
    }
    @RequestMapping("insert")
    public String insert() {
        return "/generos/list";
    }
}