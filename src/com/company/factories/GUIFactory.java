package com.company.factories;
import com.company.buttons.*;
import com.company.checkboxes.*;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
