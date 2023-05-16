package ul.it.universalserver.entity;

import it.revo.dr_kodirov.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tarmoqlar extends AbsEntity {
    @NotNull
    private String instagram;

    @NotNull
    private String telegram;

    @NotNull
    private String watsapp;

    @NotNull
    private String facebook;

    @NotNull
    private String google;

    @NotNull
    private String youtube;
}