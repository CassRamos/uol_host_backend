package cass.uol_host.model;

import cass.uol_host.model.dtos.PlayerDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phone;
    private String codename;
    private GroupType groupType;

    public Player(PlayerDTO dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.phone = dto.phone();
        this.groupType = dto.groupType();
    }
}
