package ru.pro.sky.Internet.Shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class ShopController {

    public ShopController(ShopService shopService){
    }
    @GetMapping("/add")
    public String addGoods(@RequestParam("AddGoods") String goodsID){
        ShopService.addGoods();
    }
    @GetMapping("/get")
    public String getBasket(@RequestParam ("GetBasket") String getBasket){
    ShopService.getBasket();
    }

}
