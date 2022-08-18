package ru.pro.sky.Internet.Shop;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import java.util.HashMap;

@Repository
@SessionScope
public class Basket {
   protected HashMap<Integer, String> goodsBasket;
   public Basket(){
      this.goodsBasket = new HashMap<>();
   }

}
