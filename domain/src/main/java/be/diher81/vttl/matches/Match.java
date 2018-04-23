package be.diher81.vttl.matches;

import javax.inject.Named;
import java.time.LocalDate;

@Named
public class Match {

    private String matchId;
    private String season;
    private Week week;
    private LocalDate date;
    private String homeClubUniqueIndex;
    private String awayClubUniqueIndex;
    private TeamSetup homePlayers;
    private TeamSetup awayPlayers;



}
