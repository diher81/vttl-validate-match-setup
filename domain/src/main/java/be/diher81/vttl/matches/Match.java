package be.diher81.vttl.matches;

import be.diher81.vttl.clubs.Club;

import javax.inject.Named;
import java.time.LocalDate;

@Named
public class Match {

    private String matchId;
    private String season;
    private Week week;
    private LocalDate date;
    private Club homeClub;
    private Club awayClub;
    private TeamSetup homePlayers;
    private TeamSetup awayPlayers;



}
