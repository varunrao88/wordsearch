package io.vbrains;

import java.util.Arrays;
import java.util.List;

public class WordSearchApp {
    public static void main(String[] args){
        List<String> words = Arrays.asList("ONE","TWO","THREE");
        Grid grid = new Grid(10);
        grid.fillGrid(words);
        grid.displayGrid();
    }
}
