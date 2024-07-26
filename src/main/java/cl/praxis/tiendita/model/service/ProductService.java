package cl.praxis.tiendita.model.service;

import cl.praxis.tiendita.model.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        products.add(new Product(1, "Motorola", "Motorola G34 256 GB Verde Oceano 8 GB RAM", 159990, "https://http2.mlstatic.com/D_NQ_NP_601186-MLA73927862841_012024-O.webp"));
        products.add(new Product(2, "Huawei", "Smartphone Huawei Nova 12s 8+256gb Celular Azul", 364990, "https://http2.mlstatic.com/D_NQ_NP_617828-MLU76683451140_062024-O.webp"));
        products.add(new Product(3, "Samsung", "Samsung Galaxy A05 Dual SIM 128 GB negro 4 GB RAM", 89990, "https://http2.mlstatic.com/D_NQ_NP_823381-MLA73953581906_012024-O.webp"));
        products.add(new Product(4, "Xiaomi", "Xiaomi Redmi 13C Dual SIM 256 GB midnight black 8 GB RAM", 135990, "https://http2.mlstatic.com/D_NQ_NP_780144-MLA72668121499_112023-O.webp"));
        products.add(new Product(5, "Motorola", "Celular Moto G24 Power 4+256gb", 129990, "https://http2.mlstatic.com/D_NQ_NP_853526-MLC77658021723_072024-O.webp"));
    }

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAll(){
        return products;
    }

    public Product getOne(int id){
        return  products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
