package br.com.faculdade.my_trainning;

public class ItemData {
    private String name;
    private String description;
    private int imageResource;

    public ItemData(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
