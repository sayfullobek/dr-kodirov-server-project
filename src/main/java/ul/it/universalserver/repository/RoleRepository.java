package ul.it.universalserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Role;
import ul.it.universalserver.entity.enums.RoleName;

import java.util.List;

@CrossOrigin
public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findRoleByRoleName(RoleName roleName);
}
