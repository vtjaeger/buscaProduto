public record Produto(int id,String title, int price) {
    @Override
    public String toString() {
        return String.format("Produto: %s%n" +
                "Preço: %d.99%n", title, price);
    }
}
