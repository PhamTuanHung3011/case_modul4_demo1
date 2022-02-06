package com.case_modul4.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
public class ClassRoom_Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClassRoom_Subject;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<ClassRoom> classRoomList;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Subject> subjects;

}
