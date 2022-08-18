package ru.pro.sky.Internet.Shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@RequestMapping("/store/order")
@SessionScope
public class ShopController {
protected ShopService shopService;
    public ShopController(ShopService shopService){
        this.shopService = shopService;
    }
    @GetMapping("/add")
    public String add(@RequestParam("AddGoods") String goodsID){
        return shopService.addGoods(goodsID);
    }
    @GetMapping("/get")
    public String getBasket(@RequestParam ("GetBasket") String GetBasket){
        return shopService.getBasket();
    }

}
