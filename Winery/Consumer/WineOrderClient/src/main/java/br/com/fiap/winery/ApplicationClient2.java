package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Tinto", 5);
        System.out.println("order: " + order);

        URL url2 = new URL("http://localhost:8085/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn();
        System.out.println("warn: " + warn);
    }
}
