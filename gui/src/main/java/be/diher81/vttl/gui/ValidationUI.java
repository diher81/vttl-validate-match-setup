package be.diher81.vttl.gui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI
@Theme("valo")
public class ValidationUI extends UI {

    private ComboBox<String> season;
    private ComboBox<String> region;
    private ComboBox<String> club;
    private ComboBox<String> week;
    private Button button;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        season = new ComboBox("Seizoen");
        region = new ComboBox("Provincie");
        club = new ComboBox("Club");
        week = new ComboBox("Week");
        button = new Button("Go");

        VerticalLayout mainLayout = new VerticalLayout(season, region, club, week, button);
        mainLayout.setMargin(true);
        setContent(mainLayout);

    }
}
