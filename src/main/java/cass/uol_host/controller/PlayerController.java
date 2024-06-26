package cass.uol_host.controller;

import cass.uol_host.model.Player;
import cass.uol_host.model.dtos.PlayerDTO;
import cass.uol_host.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService service;

    public PlayerController(PlayerService playerService) {
        this.service = playerService;
    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDTO dto) {
        var newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Player>> listPlayers() {
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }
}
