public class Result implements Comparable<Result> {
    private String name;
    private int points;

    public Result(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Result p) {
        if (this.points > p.points)
            return 1;
        else if (this.points == p.points)
            return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return name + " " + points;
    }
}