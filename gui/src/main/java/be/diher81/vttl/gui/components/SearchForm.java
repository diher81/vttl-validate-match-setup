package be.diher81.vttl.gui.components;

import be.diher81.vttl.matches.Week;
import com.vaadin.ui.*;

import java.util.EnumSet;

public class SearchForm extends FormLayout {

    private final ComboBox season;
    private final ComboBox region;
    private final ComboBox club;
    private final ComboBox<Week> weekComboBox;
    private final Button button;

    public SearchForm() {
        season = new ComboBox("Seizoen");
        region = new ComboBox("Provincie");
        club = new ComboBox("Club");
        weekComboBox = createWeekComboBox();
        button = new Button("Go");

        addComponents(season, region, club, weekComboBox, button);
    }

    private ComboBox<Week> createWeekComboBox() {
        ComboBox<Week> weekComboBox = new ComboBox<>("week");
        weekComboBox.setItems(Week.values());
        weekComboBox.setItemCaptionGenerator(Week::getWeek);
        return weekComboBox;
    }


}
