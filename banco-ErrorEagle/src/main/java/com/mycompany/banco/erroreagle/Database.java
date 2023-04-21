/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.erroreagle;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author fernandes
 */
public class Database {

  final JdbcTemplate connection;

  public Database() {

    BasicDataSource dataSource = new BasicDataSource();

    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

    dataSource.setUrl("jdbc:mysql://localhost:3306/ErrorEagle");
    dataSource.setUsername("root");
    dataSource.setPassword("Jh%k@S$%5KS"); //Senha do banco

    this.connection = new JdbcTemplate(dataSource);
  }
  public JdbcTemplate getConexaoDoBanco() {
    return connection;
  }
}
