package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Carusel;

import java.util.UUID;

@Projection(types = Carusel.class, name = "customCarusel")
public interface CustomCarusel {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getDescriptionUz();

    String getDescriptionEn();

    String getDescriptionRu();

    String getImg();
}
