package org.iesbelen.videoclub.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="socio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_socio")
    private long id;

    private String dni;

    private String nombre;

    private String apellido;

    @OneToOne
    @JoinColumn(name = "tarjeta_id", referencedColumnName = "id_tarjeta")
    private Tarjeta tarjeta;
}
