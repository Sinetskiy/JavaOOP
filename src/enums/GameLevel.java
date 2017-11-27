package enums;

public enum GameLevel {

    BEGINNER(0, "Beginer"),
    PROFESSIONAL(1, "Professional"),
    HARD(0, "Hard");

    private int index;
    private String name;

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    GameLevel(int index, String name) {
        this.index = index;
        this.name = name;
    }

}
