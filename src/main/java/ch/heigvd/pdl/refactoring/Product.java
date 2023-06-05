package ch.heigvd.pdl.refactoring;

public class Product {

    public static final int SIZE_NOT_APPLICABLE = -1;

    private final String code;
    private final int color;
    private final int size;
    private final double price;
    private final String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
    public String getColorString() {
        return switch (color) {
            case 1 -> "blue";
            case 2 -> "red";
            case 3 -> "yellow";
            default -> "no color";
        };
    }
    public String getSizeString() {
        return switch (size) {
            case 1 -> "XS";
            case 2 -> "S";
            case 3 -> "M";
            case 4 -> "L";
            case 5 -> "XL";
            case 6 -> "XXL";
            default -> "Invalid Size";
        };
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{" +
            "\"code\": \"" + code + '"' +
            ", \"color\": \"" + getColorString() + '"');
        if (size != SIZE_NOT_APPLICABLE) {
            stringBuilder.append(", \"size\": \"").append(getSizeString()).append('"');
        }
        stringBuilder.append(", \"price\": ").append(price).append(", \"currency\": \"").append(currency).append('"').append('}');
         return stringBuilder.toString();
    }
}
