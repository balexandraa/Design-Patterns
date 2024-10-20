package factory;

import buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        // ....

        Button okButton = createButton();
        okButton.render();
    }

    // subclases will override this method
    public abstract Button createButton();
}
