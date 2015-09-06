/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashwork.client.content.system.address.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.validator.BeanValidator;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import hashwork.client.content.system.address.model.SubrubModel;

/**
 *
 * @author Garran
 */
public class SubrubForm extends FormLayout {
    private final SubrubModel bean;
    public final BeanItem<SubrubModel> item;
    public final FieldGroup binder;
    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public SubrubForm() {
        bean = new SubrubModel();
        item = new BeanItem<SubrubModel>(bean);
        binder = new FieldGroup(item);

        TextField name = new TextField("Language");
        name.setNullRepresentation("");


        // Add the bean validator
        name.addValidator(new BeanValidator(SubrubModel.class, "name"));
        name.setImmediate(true);


        // Create a field group and use it to bind the fields in the layout

        binder.bind(name, "name");
        addComponent(name);
        HorizontalLayout buttons = new HorizontalLayout();
        buttons.addComponent(save);
        buttons.addComponent(edit);
        buttons.addComponent(cancel);
        buttons.addComponent(update);
        buttons.addComponent(delete);

        // Determines which properties are shown, and in which order:
        edit.setVisible(false);
        update.setVisible(false);
        delete.setVisible(false);
        addComponent(buttons);
    }
}
