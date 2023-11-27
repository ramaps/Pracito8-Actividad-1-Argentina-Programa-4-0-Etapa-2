package veterinaria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Veterinaria")
public class Veterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinaria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lugar")
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "idVeterinario")
    private Veterinario veterinario;

    @OneToMany(mappedBy = "veterinaria")
    private List<Veterinario> veterinarios;

    @OneToMany(mappedBy = "veterinaria")
    private List<FichaMedica> fichasMedicas;
}