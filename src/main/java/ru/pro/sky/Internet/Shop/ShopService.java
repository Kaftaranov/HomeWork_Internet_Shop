package ru.pro.sky.Internet.Shop;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Service
@SessionScope
public class ShopService {
    protected Basket basket;
    private final HashMap <Integer, String> PriceList = new HashMap<>(Map.of(1,"CPU Intel Coldstone",
            2,"MotherBoard ASUS Oakboard",3,"HDD 2TB Seagate Pancake",4,"SoundBlaster S3 NightScream",
            5,"Graphics Card ATI Radeon Eyedie",6,"Monitor ACER NitroGlycerin",7,"Case Ironbox",
            8,"Wi-Fi Router Accessdenied",9,"Mouse Deadrat",10,"Keyboard Anykey"));;

    public ShopService(){
        this.basket = new Basket();
    }

    protected String addGoods(String goodsID) {
        for (int i = 0; i < goodsID.split(",").length; i++) {
           try {
             Integer.parseInt(goodsID.split(",")[i]);
           } catch (NumberFormatException e) {
               return ("Please check goods ID. It must be a number.");
           }
           if (!PriceList.containsKey(Integer.parseInt(goodsID.split(",")[i]))){
               return ("Goods ID not found.");
           }else{
               addGoodsToBasket(Integer.parseInt(goodsID.split(",")[i]));
           }
        }
        return "Goods added to your basket.";
    }
    protected void addGoodsToBasket(Integer goodsID) {
        basket.goodsBasket.put(goodsID,PriceList.get(goodsID));
    }
    protected String getBasket() {
        return ("Your current basket contains:" + basket.goodsBasket.entrySet());
    }
}
