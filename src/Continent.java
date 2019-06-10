public enum Continent {

    EU("Europe"),
    AS("Asia"),
    AF("Africa"),
    SA("South America");

    private String name;

    Continent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
