/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.erroreagle;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fernandes
 */
public class TesteConexao {

  public static void main(String[] args) {
    Database conexao = new Database();
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o seu email");
    String email = sc.nextLine();
    System.out.println("Digite a sua senha");
    String senha = sc.nextLine();
    JdbcTemplate con = conexao.getConexaoDoBanco();
    List<Funcionario> listaDeFuncionarios = con.query(String.format("select * from Funcionario where email = '%s' and senha = '%s';", email, senha),
            new BeanPropertyRowMapper(Funcionario.class));

    System.out.println(listaDeFuncionarios.size());
    if (listaDeFuncionarios.size() == 1) {
      System.out.println("Funcionario encontrado");
    } else if (listaDeFuncionarios.size() != 1) {
      System.out.println("Funcionario invalido");
    }
  }
}
