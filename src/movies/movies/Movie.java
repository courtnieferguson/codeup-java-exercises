package movies;


public class Movie {

    private String name;
    private String category;
    private int year;

    public Movie(String name, String category, int year) {
        this.name = name;
        this.category = category;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGenre(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

