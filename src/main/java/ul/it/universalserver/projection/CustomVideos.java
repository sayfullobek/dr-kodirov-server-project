package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Videos;

import java.util.UUID;

@Projection(types = Videos.class, name = "customVideos")
public interface CustomVideos {
    UUID getId();

    String getNameUz();

    String getNameEn();

    String getNameRu();

    String getVideos();

    String getImg();
}
