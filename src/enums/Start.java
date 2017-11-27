package enums;

public class Start {

    public static void main(String[] args) {

        // получение всех значений enum
        for (int i=0; i < GameLevel.values().length; i++){
            System.out.println("GameLevel.values()[i].getName() = " + GameLevel.values()[i].getName());
        }

        // использование в обьектах
        Game game = new Game();
        game.setGameLevel(GameLevel.BEGINNER);

        System.out.println("game.getGameLevel() = " + game.getGameLevel());

        if(game.getGameLevel() == GameLevel.BEGINNER){
            System.out.println("beginner");
        }

        switch (game.getGameLevel()){
            case BEGINNER:
                System.out.println("game.getGameLevel() = " + game.getGameLevel().getIndex());
                break;
            case HARD:
                System.out.println("game.getGameLevel() = " + game.getGameLevel().getIndex());
                break;
            case PROFESSIONAL:
                System.out.println("game.getGameLevel() = " + game.getGameLevel().getIndex());
                break;
            default:
                System.out.println("default");
        }
    }
}
