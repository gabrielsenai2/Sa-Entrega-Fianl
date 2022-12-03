package br.senai.Controller;

import br.senai.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Usuario/login";
    }

    @GetMapping("/Usuario/registro")
    public String registro(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Usuario/registro";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(){
        return "perfil";
    }


    @GetMapping("/publicar")
    public String publicar() {
        return "publicar";
    }

    @GetMapping("/search")
    public String search(){
        return "search"; 
    }

    @GetMapping("/perfis/perfil1")
    public String perfil1(Model model){
        return "/perfis/perfil1";
    }

    @GetMapping("/perfis/perfil2")
    public String perfil2(Model model){
        return "/perfis/perfil2";
    }

    @GetMapping("/perfis/perfil3")
    public String perfil3(){
        return "/perfis/perfil3";
    }

    @GetMapping("/perfis/perfil4")
    public String perfil4(){
        return "/perfis/perfil4";
    }

        @GetMapping("/perfis/editarPerfil")
    public String editarPerfil() {
        return "/perfis/editarPerfil";
        }

        @GetMapping("/sobre")
        public String sobre(){
        return "sobre";
        }

        @GetMapping("/perfis/sobre1")
        public String sobre1(){
        return "perfis/sobre1";
        }

    @GetMapping("/perfis/sobre2")
    public String sobre2(){
        return "perfis/sobre2";
    }

    @GetMapping("/perfis/sobre3")
    public String sobre3(){
        return "perfis/sobre3";
    }


}
