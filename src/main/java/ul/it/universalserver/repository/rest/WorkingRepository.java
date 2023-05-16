package ul.it.universalserver.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Working;
import ul.it.universalserver.projection.CustomWorking;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "working", collectionResourceRel = "list", excerptProjection = CustomWorking.class)
public interface WorkingRepository extends JpaRepository<Working, UUID> {
}
