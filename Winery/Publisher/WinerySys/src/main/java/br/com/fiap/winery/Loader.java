package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);

        WineWarningService wineWarningService = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8085/WineWarningService", wineWarningService);

        System.out.println("Serviço Publicado!");
    }
}
