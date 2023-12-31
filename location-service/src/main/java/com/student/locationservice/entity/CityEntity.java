package com.student.locationservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @SequenceGenerator(name = "city_id_seq", sequenceName = "city_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_id_seq")
    private Long id;

    @Column(name = "code", nullable = false)
    private String postalCode;

    @Column(name = "name", nullable = false)
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "voivodeship_id", foreignKey = @ForeignKey(name = "fk_city_voivodeship_id"), nullable = false)
    private VoivodeshipEntity voivodeship;

}
