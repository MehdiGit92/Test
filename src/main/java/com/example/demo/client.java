package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Getter
@Setter @ToString
public class client {

    @Id
    private Long id;

    private String name ;

    private String address ;

}
