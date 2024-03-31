package cass.uol_host.service;

import cass.uol_host.model.Player;
import cass.uol_host.model.dtos.PlayerDTO;
import cass.uol_host.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public Player createPlayer(PlayerDTO dto) {
        var newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
