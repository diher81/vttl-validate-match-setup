package be.diher81.vttl.gui;

import be.diher81.vttl.gui.components.SearchForm;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI
@Theme("valo")
public class ValidationUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new SearchForm());
    }
}
