package com.example.apirest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author extends Base{

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="biogradia", length = 1500)
    private String biografia;
}
