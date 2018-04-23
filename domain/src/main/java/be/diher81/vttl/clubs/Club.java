package be.diher81.vttl.clubs;

import be.diher81.vttl.members.Member;

import javax.inject.Named;
import java.util.List;

@Named
public class Club {

    private String uniqueIndex;
    private String longName;
    private String category;
    private List<Member> members;


}
