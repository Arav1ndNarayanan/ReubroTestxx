package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categories {
    @SerializedName("category_name")
    @Expose
    private String category_name;
    @SerializedName("category_image")
    @Expose
    private String  image;

    public Categories(String category_name, String image) {
        this.category_name = category_name;
        this.image = image;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getImage() {
        return image;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
