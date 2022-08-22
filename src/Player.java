import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;


public class Player {

    static Random random = new Random();

    int id;
    String job;
    String gender;
    int age;
    String orientation;
    String fertility;
    String health;
    String phobia;
    String character;
    String hobby;
    String info;
    String bag;
    ArrayList<String> activeCards;

    public Player(
            int id,
            String job,
            String gender,
            int age,
            String orientation,
            String fertility,
            String health,
            String phobia,
            String character,
            String hobby,
            String info,
            String bag,
            ArrayList<String> activeCards
    ) {
        this.id = id;
        this.job = job;
        this.gender = gender;
        this.age = age;
        this.orientation = orientation;
        this.fertility = fertility;
        this.health = health;
        this.phobia = phobia;
        this.character = character;
        this.hobby = hobby;
        this.info = info;
        this.bag = bag;
        this.activeCards = activeCards;
    }


    @Override
    public String toString() {
        return "Ід : " + id + "\nПрофесія : " + job + "\nСтать : " + gender + "\nВік : " + age +
                "\nСексуальна орієнтація : " + orientation + "\nПлодовитість : " + fertility + "\nСтан здоров'я : " +
                health + "\nФобія : " + phobia + "\nРиса характеру : " + character + "\nХобі : " + hobby +
                "\nДод. інформація : " + info + "\nБагаж : " + bag + "\nКартка дій №1 : " + activeCards.get(0) +
                "\nКартка дій №2 : " + activeCards.get(1) + "\n";
    }

    static ArrayList<Player> generatePlayers(int amount) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < amount; i++) {

            players.add(
                    new Player(
                            i,
                            generateJob(),
                            generateGender(),
                            generateAge(),
                            generateOrientation(),
                            generateFertility(),
                            generateHealth(),
                            generatePhobia(),
                            generateCharacter(),
                            generateHobby(),
                            generateInformation(),
                            generateBag(),
                            generateActiveCards()
                    )
            );
        }
        return players;
    }

    static String generateJob() {
        String job = Data.jobs.get(random.nextInt(Data.jobs.size()));
        Data.jobs.remove(job);

        return job;
    }

    static String generateGender() {
        return Data.gender.get(random.nextInt(Data.gender.size()));
    }

    static int generateAge() {
        return (int) (random() * (64) + 16);
    }

    static String generateOrientation() {
        return Data.orientation.get(random.nextInt(Data.orientation.size()));
    }

    static String generateFertility() {
        return Data.fertility.get(random.nextInt(Data.fertility.size()));
    }

    static String generateHealth() {
        String health = Data.health.get(random.nextInt(Data.health.size()));
        String deadline = "";
        if (Data.health.indexOf(health) >= 88) {
            deadline = Data.deadline.get(random.nextInt(Data.deadline.size()));
        }
        Data.health.remove(health);
        return health + deadline;
    }

    static String generatePhobia() {
        String phobia = Data.phobia.get(random.nextInt(Data.phobia.size()));
        Data.phobia.remove(phobia);
        return phobia;
    }

    static String generateCharacter() {
        String character = Data.character.get(random.nextInt(Data.character.size()));
        Data.character.remove(character);
        return character;
    }

    static String generateHobby() {
        String hobby = Data.hobby.get(random.nextInt(Data.hobby.size()));
        Data.hobby.remove(hobby);
        return hobby;
    }

    static String generateInformation() {
        String information = Data.information.get(random.nextInt(Data.information.size()));
        Data.information.remove(information);
        return information;
    }

    static String generateBag() {
        String bag = Data.bag.get(random.nextInt(Data.bag.size()));
        Data.bag.remove(bag);
        return bag;
    }

    static ArrayList<String> generateActiveCards() {
        ArrayList<String> activeCards = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            activeCards.add(Data.activeCards.get(random.nextInt(Data.activeCards.size())));
            Data.activeCards.remove(activeCards.get(j));
        }
        return activeCards;
    }

    public void toFile() throws IOException {
        String fileName = id + ".txt";
        Path path = Path.of(fileName);
        Files.writeString(path, this.toString());
    }
}
