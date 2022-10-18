public class Item {
    public String name;
    public float price;

    public Item (String name, float price) { //конструктор
        if (price < 0) { //проверка цены на отрицательность
            price = 0;
        }
        this.name = name;
        this.price = price;
    }

    public float priceIncrease (float price, float percent) { //повышение цены на определенный процент
        float n, newPrice;         //переменная n нужна, чтобы посчитать процент от числа
        n = (price * percent)/100;
        newPrice = n + price;
        if (newPrice < 0) { //проверка новой цены на отрицательность
            newPrice = 0;
        }
        return newPrice;

    }

    public float priceDrop (float price, float percent) { //уменьшение цены на определенный процент
        float n, newPrice;         //переменная n нужна, чтобы посчитать процент от числа
        n = (price * percent)/100;
        newPrice = price - n;
        if (newPrice < 0) { //проверка новой цены на отрицательность
            newPrice = 0;
        }
        return newPrice;
    }
}
