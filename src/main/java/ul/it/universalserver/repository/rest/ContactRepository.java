package ul.it.universalserver.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Contact;
import ul.it.universalserver.projection.CustomContact;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "contact", collectionResourceRel = "list", excerptProjection = CustomContact.class)
public interface ContactRepository extends JpaRepository<Contact, UUID> {
}
