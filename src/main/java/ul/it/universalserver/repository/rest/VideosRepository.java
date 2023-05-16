package ul.it.universalserver.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Videos;
import ul.it.universalserver.projection.CustomVideos;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "videos", collectionResourceRel = "list", excerptProjection = CustomVideos.class)
public interface VideosRepository extends JpaRepository<Videos, UUID> {
}
