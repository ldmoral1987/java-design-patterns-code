package com.ceslopedevega.patterns.creational.factorymethod.factory;

import com.ceslopedevega.patterns.creational.factorymethod.buttons.Button;
import com.ceslopedevega.patterns.creational.factorymethod.buttons.HtmlButton;

/**
 * Esta clase produce botones HTML
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}