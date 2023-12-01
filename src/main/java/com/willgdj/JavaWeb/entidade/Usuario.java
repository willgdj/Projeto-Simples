package com.willgdj.JavaWeb.entidade;

import java.io.Serializable;

public class Usuario implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Usuario(){

    }

    public Usuario(Long id, String nome, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Usuario)) return false;
        if (!super.equals(object)) return false;

        Usuario usuario = (Usuario) object;

        if (getId() != null ? !getId().equals(usuario.getId()) : usuario.getId() != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }
}
