/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasoli.usuariomb.com;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Helio
 */
@ManagedBean
public class UsuarioMB {
    private String CPF;
    private String usuario;
    private String senha;
    private String conf_senha;
    private String email;
    private String nome;
    
    public String Cadastrar(){
        
    return null;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
            
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConf_senha() {
        return conf_senha;
    }

    public void setConf_senha(String conf_senha) {
        this.conf_senha = conf_senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
