package model;

import java.util.Arrays;

public class SlagWord {

    private String slag;
    private String[] word;


    public SlagWord(String slag, String[] word) {
        this.slag = slag;
        this.word = word;
    }

    public SlagWord() {
    }

    public String getSlag() {
        return slag;
    }

    public void setSlag(String slag) {
        this.slag = slag;
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "SlagWord{" +
                "slag='" + slag + '\'' +
                ", word=" + Arrays.toString(word) +
                '}';
    }
}
