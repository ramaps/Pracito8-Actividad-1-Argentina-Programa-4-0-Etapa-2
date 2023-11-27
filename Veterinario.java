package veterinaria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Medico_Veterinario")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinario;

    @Column(name = "nombreVeterinaro")
    private String nombre;

    @Column(name = "especialidad")
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "idVeterinaria")
    private Veterinaria veterinaria;

    @OneToMany(mappedBy = "medicoVeterinario")
    private List<FichaMedica> fichasMedicas;


}
