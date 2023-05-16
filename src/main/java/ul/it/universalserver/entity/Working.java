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
public class Working extends AbsNameEntity {
    @Column(length = 10000)
    private String descriptionUz;
    
    @Column(length = 10000)
    private String descriptionEn;

    @Column(length = 10000)
    private String descriptionRu;

    @Column(length = 10000)
    private String img;
}
