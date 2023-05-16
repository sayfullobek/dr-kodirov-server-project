package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Tarmoqlar;

import java.util.UUID;

@Projection(types = Tarmoqlar.class, name = "customTarmoqlar")
public interface CustomTarmoqlar {
    UUID getId();

    String getInstagram();

    String getTelegram();

    String getWatsapp();

    String getFacebook();

    String getGoogle();

    String getYoutube();
}
