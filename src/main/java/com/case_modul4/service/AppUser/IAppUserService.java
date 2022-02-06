package com.case_modul4.service.AppUser;

import com.case_modul4.model.AppUser;
import com.case_modul4.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IAppUserService extends IGeneralService<AppUser>,UserDetailsService {

}
