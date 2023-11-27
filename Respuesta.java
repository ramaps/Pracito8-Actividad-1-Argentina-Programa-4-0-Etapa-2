package veterinaria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Respuesta")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespuesta;

    @Column(name = "respuesta")
    private String valor;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;

    @ManyToMany(mappedBy = "respuestas")
    private List<FichaMedica> fichasMedicas;
}
