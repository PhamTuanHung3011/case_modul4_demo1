package com.case_modul4.repository;

import com.case_modul4.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    List<AppUser> findAllByNameContaining(String name);

    AppUser findByEmail(String email);
}
