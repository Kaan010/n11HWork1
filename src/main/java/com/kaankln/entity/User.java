package com.kaankln.entity;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User {
    @SequenceGenerator(name = "generator", sequenceName = "KATEGORI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastname;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "TELEPHONE", nullable = false, length = 50)
    private String telephone;
}
