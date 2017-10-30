package com.kent.wicket.MyWicketApp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

public class SamplePanel extends Panel {
	
	private List<String> genderChoices = new ArrayList<String>();

	public SamplePanel(String id) {
		super(id);
		
		genderChoices.add("Male");
		genderChoices.add("Female");
		final UserModel userModel = new UserModel();
		
		Form<?> form = new Form("form");
		
		final TextField<String> text = new TextField<String>("text", new PropertyModel<String>(userModel, "name"));
		text.setOutputMarkupId(true); //add only for ajax scenario
		
		final DropDownChoice<String> gender = new DropDownChoice<String>("gender",
				new PropertyModel<String>(userModel, "gender"),genderChoices);
		gender.setOutputMarkupId(true); //add only for ajax scenario
		
//		Convention way of initalizing button
//		Button button = new Button("submit") {
//			@Override
//			public void onSubmit() {
//				super.onSubmit();
//				
//				System.out.println("Name: " + userModel.getName() + "\n Gender: " + userModel.getGender());
//			}
//		};
		
		AjaxButton button = new AjaxButton("submit") {
			
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				super.onSubmit(target, form);
				text.setEnabled(false);
				gender.setEnabled(false);
				
				target.add(text);
				target.add(gender);
			}
		};
		
		add(form);
		form.add(text);
		form.add(gender);
		form.add(button);
		
		
	}

	 
}
