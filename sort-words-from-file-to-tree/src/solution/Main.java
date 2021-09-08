package solution;

import java.io.File;

public class Main {
    public static void main(String[]args){
        File file = new File("src\\resources\\files\\sort_tree_helper");
        SortTreeWordsFromFile.addWordsFromFile(file);
        SortTreeWordsFromFile.treeList(SortTreeWordsFromFile.root);
    }
}
