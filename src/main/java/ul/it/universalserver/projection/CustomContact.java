package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Contact;

import java.util.UUID;

@Projection(types = Contact.class, name = "customContact")
public interface CustomContact {
    UUID getId();

    String getAddress();

    String getEmail();

    String getPhoneNumber();

    String getWorkAddress();

    String getMalumotlarim();
}
