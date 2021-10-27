package com.github.igorsalgado.citiesapi.states.entities;

import com.github.igorsalgado.citiesapi.countries.entities.Country;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "State")
@Table(name = "estado")
//@TypeDefs({
//        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//})
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;
}
