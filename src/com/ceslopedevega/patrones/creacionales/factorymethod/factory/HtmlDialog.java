package com.ceslopedevega.patrones.creacionales.factorymethod.factory;

import com.ceslopedevega.patrones.creacionales.factorymethod.buttons.Button;
import com.ceslopedevega.patrones.creacionales.factorymethod.buttons.HtmlButton;

/**
 * Esta clase produce botones HTML
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}