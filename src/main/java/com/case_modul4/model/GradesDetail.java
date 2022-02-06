package com.case_modul4.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class GradesDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGradesDetail;

    @NotEmpty
    private String theoretical_point;
    @NotEmpty
    private String practice_point;
    @NotEmpty
    private String average_point;



}
