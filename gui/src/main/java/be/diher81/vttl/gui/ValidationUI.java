package be.diher81.vttl.gui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class ValidationUI extends UI {

    private TextField clubId;
    private TextField divisionId;
    private Button button;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        clubId = new TextField("Club ID");
        divisionId = new TextField("division ID");
        button = new Button("Zoek");

        VerticalLayout mainLayout = new VerticalLayout(clubId, divisionId, button);
        mainLayout.setMargin(true);
        setContent(mainLayout);

    }
}
