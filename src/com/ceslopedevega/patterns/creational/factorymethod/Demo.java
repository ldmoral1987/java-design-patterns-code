package com.ceslopedevega.patterns.creational.factorymethod;

import com.ceslopedevega.patterns.creational.factorymethod.factory.Dialog;
import com.ceslopedevega.patterns.creational.factorymethod.factory.HtmlDialog;
import com.ceslopedevega.patterns.creational.factorymethod.factory.WindowDialog;

/**
 * Clase Demo. Esta clase cliente usa la factoria para 
 * producir diferentes tipos de botones
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * La factoria especializada (HtmlButton o WindowButton)
     * se escoge según la configuración de las opciones de entorno
     * que se configuran en la clase cliente de la factoria.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("ssdfgsdfg2")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Todo el código del cliente funcionará con las factorias y los 
     * productos a través de las interfaces abstractas. De esta forma,
     * No es necesario conocer a priori qué factoría se usará y qué
     * tipo de producto se retornará como resultado.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}