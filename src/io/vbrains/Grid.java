package io.vbrains;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {
    private int gridSize;
    char[][] contents;

    public Grid(int gridSize){
        this.gridSize = gridSize;
        this.contents = new char[gridSize][gridSize];

        for(int i=0;i<gridSize;i++)
            for(int j=0; j<gridSize;j++)
                contents[i][j] = '_';
    }

    public void fillGrid(List<String> words){
        for(String word: words){
            if(word.length() >= gridSize)
                continue;
            int x = ThreadLocalRandom.current().nextInt(0,gridSize);
            int y = ThreadLocalRandom.current().nextInt(0,gridSize);
            for(char c: word.toCharArray()){
                contents[x][y++] = c;
            }
        }
    }

    public void displayGrid(){
        for(int i=0;i<gridSize;i++){
            for(int j=0; j<gridSize;j++){
                System.out.print(contents[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
