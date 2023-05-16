package ul.it.universalserver.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Carusel;
import ul.it.universalserver.projection.CustomCarusel;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "carusel", collectionResourceRel = "list", excerptProjection = CustomCarusel.class)
public interface CaruselRepository extends JpaRepository<Carusel, UUID> {
}
