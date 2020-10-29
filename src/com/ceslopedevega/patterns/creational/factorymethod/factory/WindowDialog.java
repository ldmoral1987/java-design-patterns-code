package com.ceslopedevega.patterns.creational.factorymethod.factory;

import com.ceslopedevega.patterns.creational.factorymethod.buttons.Button;
import com.ceslopedevega.patterns.creational.factorymethod.buttons.WindowButton;

/**
 * Esta clase produce botones de tipo Window
 */
public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}