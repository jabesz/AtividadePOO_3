public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%2.f",totalPrice()) + "Custom fee: $" + String.format("%2.f", getCustomsFee()) + ")";
    }

    public Double totalPrice() {
        return totalPrice();
    }
}