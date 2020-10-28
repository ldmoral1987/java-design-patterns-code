package com.ceslopedevega.patrones.creacionales.factorymethod.buttons;

/**
 * Producto concreto - Botón HTML
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Botón HTML</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("¡Botón HTML pulsado!");
    }
}