package com.teste.demo.api;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Boolean done;

    @Column(length = 200, nullable = false)
    private String todo;

    public Lista() {
    }
}
