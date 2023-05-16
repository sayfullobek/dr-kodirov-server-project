package ul.it.universalserver.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Tarmoqlar;
import ul.it.universalserver.projection.CustomTarmoqlar;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "tarmoqlar", collectionResourceRel = "list", excerptProjection = CustomTarmoqlar.class)
public interface TarmoqlarlRepository extends JpaRepository<Tarmoqlar, UUID> {
}
