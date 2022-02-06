package com.case_modul4.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClassRoom;

    @NotEmpty
    private String nameClassRoom;


}
