package br.senai.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 300)
    private String imagem;


    @NotNull
    @Size(max = 200)
    private String descricao;


    @ManyToMany
    private List<Usuario> usuario_publicacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Usuario> getUsuario_publicacao() {
        return usuario_publicacao;
    }

    public void setUsuario_publicacao(List<Usuario> usuario_publicacao) {
        this.usuario_publicacao = usuario_publicacao;
    }


    @Override
    public String toString() {
        return "Publicacao{" +
                "id=" + id +
                ", imagem='" + imagem + '\'' +
                ", descricao='" + descricao + '\'' +
                ", usuario_publicacao=" + usuario_publicacao +
                '}';
    }
}
