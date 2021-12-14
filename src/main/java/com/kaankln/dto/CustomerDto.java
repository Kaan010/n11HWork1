package com.kaankln.dto;

import javax.persistence.Column;

public class CustomerDto {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String telephone;

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CustomerDto() {
    }

    public CustomerDto(Long id, String name, String lastname, String email, String telephone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
    }
}
