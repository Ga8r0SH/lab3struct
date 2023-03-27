import java.io.BufferedReader;
import java.io.IOException;
import java.util.Formatter;


public class Goods {
    private String name;
    private TypeOfGood type;
    private String info;
    private int price;
    private int value;
    private int number;

    public Goods() {
        name = "None";
        info = "None";
        price = 0;
        value = 0;
        number = 0;
    }

    public Goods(Goods object) {
        name = object.name;
        type = object.type;
        info = object.info;
        price = object.price;
        value = object.value;
        number = object.number;
    }
    public  int getID(){
        return number;
    }
    public  TypeOfGood getTypeofGood(){
        return  type;
    }
    public String toString(){
        return (name + " " + type + " " + info + " " + price + " "  + value + " " + number);
    }

    public Goods clone() {
        return new Goods(this);
    }

    public boolean equal(Goods object) {
        return (name.equals(object.name) &&
                type.equals((object.type))&&
                info.equals(object.info) &&
                price == object.price &&
                value == object.value &&
                number == object.number);
    }

    public void readingFile(BufferedReader reader) throws
            IOException {
        String line = reader.readLine();
        String[] fields = line.split(",");

        name = fields[0];
        type = TypeOfGood.getTypeOfGood(Integer.parseInt(fields[1]));
        info = fields[2];
        price = Integer.parseInt(fields[3]);
        value = Integer.parseInt(fields[4]);
        number = Integer.parseInt(fields[5]);
    }
    public void writeElement(){
        System.out.println(
                name +","+
                        info + ","+
                        price + ","+
                        value + ","+
                        number);
    }
    public void writeTable(Formatter formatter) {
        formatter.format("%-15s %-15s %-20s %-10d %-10d %-4d\n", name, type, info, price, value, number);
    }
}