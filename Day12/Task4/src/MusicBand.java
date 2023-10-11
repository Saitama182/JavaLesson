public class MusicBand {
    private String name;
    private int year;

    private String member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MusicBand(String name, int year, String member) {
        this.name = name;
        this.year = year;
        this.member = member;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
