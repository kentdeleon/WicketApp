package com.kent.wicket.MyWicketApp;


import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class WelcomePage extends WebPage{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5156894244583540578L;
	
	
	
	public WelcomePage() {
		//add(new Label("lbl", new Model<String>("This is my first Wicket Page!")));

		add(new SamplePanel("panel"));
		add(new SamplePanel("panel1"));
	}	
}

