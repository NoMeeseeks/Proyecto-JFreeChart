package org.example.proyecto.clases;

import java.time.LocalDate;

public class ProductInventory {
    private int productId;
    private int locationId;
    private int shelf;
    private int bin;
    private int quantity;
    private int rowguid;
    private LocalDate modifiedDate;

    public ProductInventory(int productId, int locationId, int shelf, int bin, int quantity, int rowguid,
            LocalDate modifiedDate) {
        this.productId = productId;
        this.locationId = locationId;
        this.shelf = shelf;
        this.bin = bin;
        this.quantity = quantity;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRowguid() {
        return rowguid;
    }

    public void setRowguid(int rowguid) {
        this.rowguid = rowguid;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}