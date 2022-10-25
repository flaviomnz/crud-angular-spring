package com.flavio.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {
    
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // para o valor ser gerado automaticamente (chave primária sequencial)
    private Long id;
    
    @Column(length = 200, nullable = false) // not-null 
    private String name;

    @Column(length = 10, nullable = false) //not-null
    private String category;
}
