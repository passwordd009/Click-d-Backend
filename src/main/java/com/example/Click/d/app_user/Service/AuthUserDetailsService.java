//package com.example.Click.d.app_user.Service;
//
//import com.example.Click.d.app_user.Model.AppUser;
//import com.example.Click.d.app_user.Repository.AppUserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.swing.text.html.Option;
//import java.util.Optional;
//
//@Service
//@AllArgsConstructor
//public class AuthUserDetailsService implements UserDetailsService {
//
//    private final AppUserRepository appUserRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<AppUser> appUser = appUserRepository.findByEmail(email.toLowerCase());
//        if (!appUser.isPresent()) {
//            throw new UsernameNotFoundException(email);
//        } else {
//            return User.builder()
//                    .username(appUser.get().getEmail())
//                    .password(appUser.get().getPassword())
//                    .build();
//        }
//    }
//}
