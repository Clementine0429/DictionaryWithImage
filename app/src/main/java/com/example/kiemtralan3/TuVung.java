package com.example.kiemtralan3;

public class TuVung {
    String word;
    String definition;
    String image;

    public TuVung() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TuVung(String word, String definition, String image) {
        this.word = word;
        this.definition = definition;
        this.image= image;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}
