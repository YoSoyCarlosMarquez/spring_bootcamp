package com.bootcamp_spring.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "users")
@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "state")
    Integer state;

}
