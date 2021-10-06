package io.vbrains;

import java.util.Arrays;
import java.util.List;

public class WordSearchApp {
    public static void main(String[] args){
        List<String> words = Arrays.asList("ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT");
        Grid grid = new Grid(20);
        grid.fillGrid(words);
        grid.displayGrid();
    }
}
