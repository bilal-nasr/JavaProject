package model;

public class Recipe {
    private String name;
    private String imgscr;
    private String chef;
    private String description;

    public void setChef(String chef) {
        this.chef = chef;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImgscr(String imgscr) {
        this.imgscr = imgscr;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getChef() {
        return chef;
    }
    public String getDescription() {
        return description;
    }
    public String getImgscr() {
        return imgscr;
    }
    public String getName() {
        return name;
    }

    
}
