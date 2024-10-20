package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * abstract factory knows about all (abstract) product types
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
