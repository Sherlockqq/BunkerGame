import java.util.ArrayList;
import java.util.Random;

public class Plot {
    String catastrophe;
    int destruction;
    int survivors;
    String location;
    String time;
    String food;
    ArrayList<String> items;
    ArrayList<String> equipments;
    String condition;

    public Plot(
            String catastrophe,
            int destruction,
            int survivors,
            String location,
            String time,
            String food,
            ArrayList<String> items,
            ArrayList<String> equipments,
            String condition
    ) {
        this.catastrophe = catastrophe;
        this.destruction = destruction;
        this.survivors = survivors;
        this.location = location;
        this.time = time;
        this.food = food;
        this.items = items;
        this.equipments = equipments;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Катастрофа : " + catastrophe + "\nВідсоток руйнування поверхні планети : " + destruction +
                "\nКількість населення планети, що вижило : " + survivors + "\nРозташування бункера : " + location +
                "\nЧас перебування у бункері : " + time + "\nПовне харчування на : " + food + "\n" + "\n В бункері є "
                + items.get(0) + "\n В бункері є " + items.get(1) + "\n Обладнання: " + equipments.get(0) + "\n Обладнення: "
                + equipments.get(1) + "\nДоп умова " + condition;
    }

    static Plot getPlot() {
        Random random = new Random();

        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> equipments = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            items.add(Data.items.get(random.nextInt(Data.items.size())));
            Data.items.remove(items.get(i));
        }

        for (int i = 0; i < 2; i++) {
            equipments.add(Data.equipments.get(random.nextInt(Data.equipments.size())));
            Data.equipments.remove(equipments.get(i));
        }

        return new Plot(
                Data.catastrophe.get(random.nextInt(Data.catastrophe.size())),
                random.nextInt(90 - 10) + 10,
                random.nextInt(50 - 1) + 1,
                Data.location.get(random.nextInt(Data.location.size())),
                Data.time.get(random.nextInt(Data.time.size())),
                Data.food.get(random.nextInt(Data.food.size())),
                items,
                equipments,
                Data.conditions.get(random.nextInt(Data.conditions.size()))
        );
    }
}
