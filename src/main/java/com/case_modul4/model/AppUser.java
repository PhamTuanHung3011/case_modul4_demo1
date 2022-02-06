package com.case_modul4.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppUser;
    @Email
    private String email;

    @Size(min=6,max=8,message="Min 6,max 8")
    private String password;

    @Size(min=10,max=12,message="Min 10,max 12")
    private String phone;

    @NotEmpty
    private String fullName;
    @NotEmpty
    private Date dateOfBirth;
    @NotEmpty
    private String address;
    @NotEmpty
    private String identity;


    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;


   @ManyToOne
   private ClassRoom classRoom;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Subject>subjects;
}
