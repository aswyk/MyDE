package com.aswyk.myde.core.ui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;

public class Core extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Button temp_btn_DE;
	@AutoGenerated
	private Button temp_button_My;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Core() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// temp_button_My
		temp_button_My = new Button();
		temp_button_My.setCaption("my");
		temp_button_My.setImmediate(false);
		temp_button_My.setWidth("-1px");
		temp_button_My.setHeight("-1px");
		mainLayout.addComponent(temp_button_My, "top:20.0px;left:20.0px;");
		
		// temp_btn_DE
		temp_btn_DE = new Button();
		temp_btn_DE.setCaption("DE");
		temp_btn_DE.setImmediate(false);
		temp_btn_DE.setWidth("-1px");
		temp_btn_DE.setHeight("-1px");
		mainLayout.addComponent(temp_btn_DE, "top:20.0px;left:75.0px;");
		
		return mainLayout;
	}

}
