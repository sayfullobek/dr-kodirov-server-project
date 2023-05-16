package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Working;

import java.util.UUID;

@Projection(types = Working.class, name = "customWorking")
public interface CustomWorking {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getDescriptionUz();

    String getDescriptionEn();

    String getDescriptionRu();

    String getImg();
}
