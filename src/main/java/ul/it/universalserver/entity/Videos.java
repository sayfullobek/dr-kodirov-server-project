package ul.it.universalserver.entity;

import it.revo.dr_kodirov.entity.template.AbsNameEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Videos extends AbsNameEntity {
    @Column(nullable = false, length = 10000)
    private String videos;

    @Column(nullable = false, length = 10000)
    private String img;
}
