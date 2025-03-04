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
@Table(name="tarjeta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarjeta")
    private long id;

    private Date caducidad;

    @OneToOne(mappedBy = "tarjeta")
    private Socio socio;
}
