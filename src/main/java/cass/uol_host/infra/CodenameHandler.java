package cass.uol_host.infra;

import cass.uol_host.model.GroupType;
import cass.uol_host.service.CodenameService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CodenameHandler {

    private final CodenameService codenameService;

    public CodenameHandler(CodenameService codenameService) {
        this.codenameService = codenameService;
    }

    public String findCodenameByGroupType(GroupType groupType) {
        if (groupType == groupType.AVENGERS) {

            //random codename
            List<String> avengersCodenameList = codenameService.getAvengersCodenameList();
            Collections.shuffle(avengersCodenameList);


            String firstMatch = codenameService.getAvengersCodenameList().stream().findFirst().orElseThrow();
            this.codenameService.getAvengersCodenameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = codenameService.getJusticeLeagueList().stream().findFirst().orElseThrow();
        List<String> justiceLeagueList = codenameService.getJusticeLeagueList();
        Collections.shuffle(justiceLeagueList);
        this.codenameService.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
