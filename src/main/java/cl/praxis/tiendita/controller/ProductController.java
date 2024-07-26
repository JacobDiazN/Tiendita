package cl.praxis.tiendita.controller;

import cl.praxis.tiendita.model.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){

        model.addAttribute("products", service.getAll());

        return "index";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){

        model.addAttribute("product", service.getOne(id));

        return "productView";
    }

    @GetMapping("/list")
    public String listProduct(Model model){
        model.addAttribute("products", service.getAll());

        return "productList";
    }

    @GetMapping("/edit/{id}")
    public String listProductOne(@PathVariable("id") int id, Model model){

        model.addAttribute("product", service.getOne(id));

        return "productEdit";
    }

    @PostMapping
    public String editProduct(){

        return "productlist";
    }


}
