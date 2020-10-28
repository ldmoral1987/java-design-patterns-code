package com.ceslopedevega.patrones.creacionales.factorymethod.factory;

import com.ceslopedevega.patrones.creacionales.factorymethod.buttons.Button;
import com.ceslopedevega.patrones.creacionales.factorymethod.buttons.WindowButton;

/**
 * Esta clase produce botones de tipo Window
 */
public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}