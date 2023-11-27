package veterinaria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FichaMedica")
public class FichaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFichaMedica;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idVeterinario")
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "idVeterinaria")
    private Veterinaria veterinaria;

    @ManyToMany
    @JoinTable(
            name = "ficha_medica_respuesta",
            joinColumns = @JoinColumn(name = "idFichaMedica"),
            inverseJoinColumns = @JoinColumn(name = "idRespuesta")
    )
    private List<Respuesta> respuestas;
}


