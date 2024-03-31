package cass.uol_host.model.dtos;

import cass.uol_host.model.GroupType;

public record PlayerDTO(
        String name,
        String email,
        String phone,
        GroupType groupType) {

}
