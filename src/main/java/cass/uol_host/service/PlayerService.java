package cass.uol_host.service;

import cass.uol_host.infra.CodenameHandler;
import cass.uol_host.model.GroupType;
import cass.uol_host.model.Player;
import cass.uol_host.model.dtos.PlayerDTO;
import cass.uol_host.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository repository;
    private final CodenameHandler codenameHandler;

    public PlayerService(PlayerRepository repository, CodenameHandler codenameHandler) {
        this.repository = repository;
        this.codenameHandler = codenameHandler;
    }

    public Player createPlayer(PlayerDTO dto) {
        Player newPlayer = new Player(dto);
        String codename = getCodename(dto.groupType());
        newPlayer.setCodename(codename);
        return repository.save(newPlayer);
    }

    private String getCodename(GroupType groupType) {
        return codenameHandler.findCodenameByGroupType(groupType);
    }

}
