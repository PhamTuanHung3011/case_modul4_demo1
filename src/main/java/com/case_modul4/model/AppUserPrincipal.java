package com.case_modul4.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AppUserPrincipal implements UserDetails {

    private int idAppUser;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }



    public AppUserPrincipal(int idAppUser, String email, String password, Collection<? extends GrantedAuthority> roles) {
        this.idAppUser = idAppUser;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public static AppUserPrincipal build(AppUser appUser) {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        Set<Role> roles = (Set<Role>) appUser.getRoles();
        for (Role r: roles) {
            grantedAuthorityList.add(new SimpleGrantedAuthority(r.getNameRole()));
        }
        return new AppUserPrincipal(
                appUser.getIdAppUser(),
                appUser.getEmail(),
                appUser.getPassword(),
                grantedAuthorityList
        );
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
