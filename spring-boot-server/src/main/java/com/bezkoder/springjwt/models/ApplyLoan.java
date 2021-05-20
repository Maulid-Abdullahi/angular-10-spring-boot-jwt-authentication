package com.bezkoder.springjwt.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "appliedLoans",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "idnumber"),
                @UniqueConstraint(columnNames = "email")
        })
public class ApplyLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String firstname;

    @NotBlank
    @Size(max = 40)
    private String lastname;

    @NotBlank
    @Size(max = 30)
    private String idnumber;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;


    public ApplyLoan() {
    }

    public ApplyLoan(Long id, @NotBlank @Size(max = 40) String firstname,
                     @NotBlank @Size(max = 40) String lastname,
                     @NotBlank @Size(max = 30) String idnumber,
                     @NotBlank @Size(max = 50) @Email String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.idnumber = idnumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
