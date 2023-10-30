package com.talowski.pokemonapivaadinspringbootb;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/hello")
@StyleSheet("/css/style.css")
public class HelloGUI extends VerticalLayout {



    public HelloGUI() {
        TextField textFieldName = new TextField("podaj imie");
        Button buttonName = new Button("Hello",
                new Icon(VaadinIcon.ACADEMY_CAP));
        Label labelName = new Label();

        buttonName.addClickListener(clickEvent -> {
            labelName.setText("Hello " + textFieldName.getValue());
            add(new Image("https://media.tenor.com/yCFHzEvKa9MAAAAi/hello.gif", "nie ma obrazu"));
        });
        add(textFieldName, buttonName, labelName);
    }
}
