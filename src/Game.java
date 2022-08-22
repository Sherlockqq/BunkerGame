import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    void start() {
        int choice = GameUi.startMenu();
        switch (choice) {
            case 1 -> {
                Data.ps.print("Введіть кількість гравців: ");
                int playersAmount = Data.sc.nextInt();

                Data.ps.println(Plot.getPlot());

                players = Player.generatePlayers(playersAmount);

                writePlayersToFile();

                changeChoiceListener();

            }
            case 2 -> {
                Data.ps.println("Пизда русні!");
                System.exit(0);
            }
            default -> Data.ps.println("Упсс..");
        }

    }
    void changeChoiceListener() {
        int choice = GameUi.changeChoiceMenu();

        switch (choice) {
            case 1 -> changeListener(1);
            case 2 -> changeListener(2);
            case 3 -> start();
        }
    }
    void changeListener(int flag) {
        // if flag = 1 -> change all
        // if flag = 2 -> change only one player
        int choice = GameUi.changeMenu();

        switch (choice) {
            case 1 -> changeJob(flag);
            case 2 -> changeGender(flag);
            case 3 -> changeAge(flag);
            case 4 -> changeOrientation(flag);
            case 5 -> changeFertility(flag);
            case 6 -> changeHealth(flag);
            case 7 -> changePhobia(flag);
            case 8 -> changeCharacter(flag);
            case 9 -> changeHobby(flag);
            case 10 -> changeInformation(flag);
            case 11 -> changeBag(flag);
            case 12 -> changeChoiceListener();
        }
        writePlayersToFile();
        changeChoiceListener();
    }
    void changeJob(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.job = Player.generateJob();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).job = Player.generateJob();
            }
        }
    }

    void changeGender(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.gender = Player.generateGender();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).gender = Player.generateGender();
            }
        }
    }

    void changeAge(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.age = Player.generateAge();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).age = Player.generateAge();
            }
        }
    }

    void changeOrientation(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.orientation = Player.generateOrientation();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).orientation = Player.generateOrientation();
            }
        }
    }

    void changeFertility(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.fertility = Player.generateFertility();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).fertility = Player.generateFertility();
            }
        }
    }

    void changeHealth(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.health = Player.generateHealth();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).health = Player.generateHealth();
            }
        }
    }
    void changePhobia(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.phobia = Player.generatePhobia();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).phobia = Player.generatePhobia();
            }
        }
    }
    void changeCharacter(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.character = Player.generateCharacter();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).character = Player.generateCharacter();
            }
        }
    }
    void changeHobby(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.hobby = Player.generateHobby();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).hobby = Player.generateHobby();
            }
        }
    }
    void changeInformation(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.info = Player.generateInformation();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).info = Player.generateInformation();
            }
        }
    }
    void changeBag(int flag) {
        switch (flag) {
            case 1 -> {
                //change all
                for (Player player : players) {
                    player.bag = Player.generateBag();
                }
            }
            case 2 -> {
                //change one player
                Data.ps.println("Введіть id гравця");
                int playerId = Data.sc.nextInt();
                players.get(playerId).bag = Player.generateBag();
            }
        }
    }
    void writePlayersToFile() {
        try {
            for (Player player : players) {
                player.toFile();
            }
        } catch (Exception ignored) {
            Data.ps.print("Не вийшло записати у файл!");
        }
    }
}
