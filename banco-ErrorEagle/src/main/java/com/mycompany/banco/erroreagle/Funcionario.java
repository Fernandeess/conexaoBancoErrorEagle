/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.erroreagle;

/**
 *
 * @author fernandes
 */
public class Funcionario {

  private Integer id_funcionario;
  private String nome;
  private String email;
  private String senha;
  private String telefone;
  private Integer fk_empresa;
  private Integer fk_supervisor;

  public Funcionario() {
  }

  public Funcionario(Integer id_funcionario, String nome, String email, String senha, String telefone, Integer fk_empresa, Integer fk_supervisor) {
    this.id_funcionario = id_funcionario;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.telefone = telefone;
    this.fk_empresa = fk_empresa;
    this.fk_supervisor = fk_supervisor;
  }

  public Integer getId_funcionario() {
    return id_funcionario;
  }

  public void setId_funcionario(Integer id_funcionario) {
    this.id_funcionario = id_funcionario;
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

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Integer getFk_empresa() {
    return fk_empresa;
  }

  public void setFk_empresa(Integer fk_empresa) {
    this.fk_empresa = fk_empresa;
  }

  public Integer getFk_supervisor() {
    return fk_supervisor;
  }

  public void setFk_supervisor(Integer fk_supervisor) {
    this.fk_supervisor = fk_supervisor;
  }

  @Override
  public String toString() {
    return "Funcionario{" + "id_funcionario=" + id_funcionario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone + ", fk_empresa=" + fk_empresa + ", fk_supervisor=" + fk_supervisor + '}';
  }

}
