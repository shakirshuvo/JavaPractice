package enumDemo;

public enum Country {
    CANADA("Canada", "Ottawa", "English-French", 34000000),
    USA("United States of America", "Washington DC", "English", 330000000),
    TURKEY("Turkey", "Ankara", "Turkish", 82000000),
    BANGLADESH("Bangladesh", "Dhaka", "Bangla", 160000000),
    PAKISTAN("Pakistan", "Islamabad", "Urdu", 180000000);

    Country(String name, String capital, String language, long population) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.population = population;
    }

    private String name;
    private String capital;
    private String language;
    private long population;

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getLanguage() {
        return language;
    }

    public long getPopulation() {
        return population;
    }
}
