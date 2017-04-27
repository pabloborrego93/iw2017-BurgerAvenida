package com.pd.vaadin.home;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@UIScope
@SpringView(name = HomeView.VIEW_ROUTE)
public class HomeView extends VerticalLayout implements View {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6053541745106875920L;
	
	public static final String VIEW_ROUTE = "Home";
	public static final String VIEW_NAME = "Home";

    public HomeView() {
    	 setSizeFull();
         Label header = new Label("Home");
         header.addStyleName(ValoTheme.LABEL_H2);
         addComponent(header);
    }

    @Override
    public void enter(ViewChangeEvent event) {
    }

}