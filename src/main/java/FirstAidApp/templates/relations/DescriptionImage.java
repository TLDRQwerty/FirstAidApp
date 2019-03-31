package FirstAidApp.templates.relations;

import java.io.File;

public class DescriptionImage {

    public File image;
    public String description;

    public DescriptionImage(String description, String pathToImage) {
        this.description = description;
        this.image = new File(pathToImage);
    }

    public File getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
