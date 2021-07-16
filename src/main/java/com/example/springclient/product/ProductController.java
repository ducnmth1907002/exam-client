package com.example.springclient.product;

import com.example.springclient.Product;
import com.example.springclient.ProductService;
import com.example.springclient.ProductServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    ProductServiceService productServiceService = new ProductServiceService();
    ProductService service = productServiceService.getProductServicePort();

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("product", service.getAllProducts());
        return "product/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "product/form";
    }
    @RequestMapping( method = RequestMethod.POST)
    public String store(Product product, BindingResult result) {
        service.addProduct(product);
        return "redirect:/product";
    }
}
