package br.com.fiap.winery;

import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    List<Vinho> vinhos = new ArrayList<>();

    public WineStockServiceImplementation() {
        vinhos.add(new Vinho("Vinho Tinto do Porto", 120, "Touriga Nacional"));
        vinhos.add(new Vinho("Chardonnay Reserva", 150, "Chardonnay"));
        vinhos.add(new Vinho("Merlot Clássico", 80, "Merlot"));
        vinhos.add(new Vinho("Cabernet Sauvignon Premium", 200, "Cabernet Sauvignon"));
        vinhos.add(new Vinho("Pinot Noir Elegante", 90, "Pinot Noir"));
    }

    @Override
    public String getMenu() {
        StringBuilder msg = new StringBuilder("Menu de vinhos: \n");
        for (Vinho vinho : vinhos) {
            msg.append("\nNome: ").append(vinho.getNome())
               .append(", Preço: R$ ").append(vinho.getPreco())
               .append(", Tipo de Uva: ").append(vinho.getTipoUva());
        }
        return msg.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
