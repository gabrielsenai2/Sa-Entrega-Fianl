package br.senai.Controller;

import br.senai.model.Comentario;
import br.senai.service.ComentarioService;
import br.senai.service.ComentarioServiceImpl;
import br.senai.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComentarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/comentario/add")
    public String add(Model model){
        model.addAttribute("comentario", new Comentario());
        return "comentario/add";
    }


    @GetMapping("/comentario/edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        model.addAttribute("comentario", comentarioService.findById(id));
        return "comentario/edit";
    }



    @GetMapping("/evento/delete/{id}")
    public String delete(@PathVariable long id){
        try{
            comentarioService.deleteById(id);
            return "redirect:/evento/list";
        } catch (Exception e){
            System.out.println(e.getMessage());
            //TODO criar uma página de erro com a mensagem
            return "redirect:/evento/list";
        }

    }





    @PostMapping("/comentario/save")
    public String save(Comentario comentario, Model model){
        try{
            Comentario newComentario = comentarioService.save(comentario);
            model.addAttribute("comentario", newComentario);
            model.addAttribute("isSave", true);
            model.addAttribute("isError", false);
            model.addAttribute("clientes", usuarioService.findAll());
            return "/comentario/add";
        }catch (Exception e){
            model.addAttribute("comentario", comentario);
            model.addAttribute("isSave", false);
            model.addAttribute("isError", true);
            model.addAttribute("usuarios", usuarioService.findAll());
            return "/comentario/add";
        }
    }

}




