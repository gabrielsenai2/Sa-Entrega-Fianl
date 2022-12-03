package br.senai.Controller;

import br.senai.model.Usuario;
import br.senai.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

//    @GetMapping("/Usuario/registro")
//    public String registro(Model model){
//        model.addAttribute("usuario", new Usuario());
//        return "Usuario/registro";
//    }




    @PostMapping("/usuario/save")
    public String save(Usuario usuario, Model model){
        try{
            usuarioService.save(usuario);
            model.addAttribute("usuario", usuario);
            //model.addAttribute("isSave", true);
            //return "usuario/add";
            return "Usuario/login";
        }catch (Exception e){
            model.addAttribute("usuario", usuario);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", "Usuário já existe");
            //return "usuario/add";
            return "Usuario/registro";
        }
    }

    @GetMapping("/Usuario/login")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Usuario/login";
    }




    @PostMapping("/Usuario/login")
    public String login(Usuario usuario, Model model){
        try{
            System.out.println("Entrou");
            Usuario u = usuarioService.findByUserNameAndSenha(usuario.getUsername(), usuario.getSenha());
            System.out.println("---->>>>>" + u);
            if (u != null) {
                model.addAttribute("usuario", usuario);
                return "redirect:/index";
            }else {
                model.addAttribute("usuario", usuario);
                model.addAttribute("isError", true);
                model.addAttribute("errorMsg", "Usuário já existe");
                return "/Usuario/login";
            }
        } catch (Exception e) {
            System.out.println("erro:" + e.getMessage());
            return "/Usuario/login";
        }
    }

}

