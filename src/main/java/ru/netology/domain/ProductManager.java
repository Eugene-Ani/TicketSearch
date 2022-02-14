package ru.netology.domain;


public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket product) {
        repository.save(product);
    }

    public Ticket[] searchBy(String text) {
        Ticket[] result = new Ticket[0];
        for (Ticket product : repository.findAll()) {
            if (matches(product, text)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Ticket product, String search) {
        if (product.getFrom().contains(search)) {
            return true;
        }
        if (product.getTo().contains(search)) {
            return true;
        }
        else
            return false;
        }

}