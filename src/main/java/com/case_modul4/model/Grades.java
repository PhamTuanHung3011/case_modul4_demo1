package com.case_modul4.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Data
@Entity
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrades;

    @ManyToOne
    private GradesDetail gradesDetail;


    @ManyToMany(fetch = FetchType.EAGER)
    private List<Subject> subjectList;

}
