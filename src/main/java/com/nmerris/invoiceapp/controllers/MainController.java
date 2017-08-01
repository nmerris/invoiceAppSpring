package com.nmerris.invoiceapp.controllers;

import com.nmerris.invoiceapp.AddProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


//    @RequestMapping("/addproduct")
//    public AddProduct addProduct(String name) {
//        return new AddProduct("Add a product here");
//    }

    @RequestMapping("/")
    public @ResponseBody String defaultPage() {
        return "Welcome to the Invoice App";
    }

    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct() {
        return "Add a product here";
    }

    @RequestMapping("/listproducts")
    public @ResponseBody String listProducts() {
        return "This is a list of your products";
    }

    @RequestMapping("/thankyou")
    public @ResponseBody String thankYou() {
        return "Thanks for shopping with us!";
    }


}
