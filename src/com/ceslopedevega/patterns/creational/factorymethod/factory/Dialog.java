package com.ceslopedevega.patterns.creational.factorymethod.factory;

import com.ceslopedevega.patterns.creational.factorymethod.buttons.Button;

/**
 * Clase factoria. En realidad el nombre de la clase puede ser cualquiera
 * y puede contener también parte del núcleo de la lógica de negocio
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... otro código de la clase ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Las subclases sobrescribirán este método para poder crear
     * los tipos de objetos más concretos. 
     */
    public abstract Button createButton();
}