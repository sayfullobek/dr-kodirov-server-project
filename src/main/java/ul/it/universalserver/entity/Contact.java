package ul.it.universalserver.entity;

import it.revo.dr_kodirov.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact extends AbsEntity {
    @NotNull
    private String address;

    @NotNull
    private String email;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String workAddress;

    @Column(nullable = false, length = 100000)
    private String malumotlarim;
}
