package ul.it.universalserver.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import ul.it.universalserver.entity.Contact;
import ul.it.universalserver.entity.Role;
import ul.it.universalserver.entity.Tarmoqlar;
import ul.it.universalserver.entity.User;
import ul.it.universalserver.entity.enums.RoleName;
import ul.it.universalserver.repository.AuthRepository;
import ul.it.universalserver.repository.RoleRepository;
import ul.it.universalserver.repository.rest.ContactRepository;
import ul.it.universalserver.repository.rest.TarmoqlarlRepository;

@Configuration
@EnableWebSecurity
public class DataLoader implements CommandLineRunner {
    @Autowired
    AuthRepository authRepository;

    @Autowired
    TarmoqlarlRepository tarmoqlarlRepository;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String initMode;

    @Override
    public void run(String... args) throws Exception {
        if (initMode.equals("create-drop")) {
            roleRepository.save(
                    new Role(
                            RoleName.ADMIN
                    )
            );
            roleRepository.save(
                    new Role(
                            RoleName.USER
                    )
            );
            contactRepository.save(
                    new Contact(
                            "bla bla",
                            "fas@gmail.com",
                            "0987654321",
                            "adasdsadsa",
                            "salomboy qozilar"
                    )
            );
            tarmoqlarlRepository.save(
                    new Tarmoqlar(
                            "instagram",
                            "telegram",
                            "watsapp",
                            "facebook",
                            "google",
                            "youtube"
                    )
            );
            authRepository.save(
                    new User(
                            "Doctor",
                            "Kodirov",
                            "912218588",
                            passwordEncoder.encode("Doctor123"),
                            roleRepository.findAll()
                    )
            );
        }
    }
}
