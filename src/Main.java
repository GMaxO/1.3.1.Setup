import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //С помощью статитического метода
//        DirFile.createDir("D://Games");
//        DirFile.createDir("D://Games/src");
//        DirFile.createDir("D://Games/temp");
//        DirFile.createDir("D://Games/savegames");
//        DirFile.createDir("D://Games/res");
//        DirFile.createDir("D://Games/src/main");
//        DirFile.createDir("D://Games/src/test");
//        DirFile.createDir("D://Games/res/vectors");
//        DirFile.createDir("D://Games/res/drawables");
//        DirFile.createDir("D://Games/res/icons");
//        DirFile.createFile("D://Games/src/main","Main.java");
//        DirFile.createFile("D://Games/src/main","Utils.java");
//        DirFile.createFile("D://Games/temp","temp.txt");

// С помощью объекта класса
        DirFile2 dirFile2 = new DirFile2("D://Games");
        dirFile2.createDir("D://Games");
        dirFile2.createDir("D://Games/src");
        dirFile2.createDir("D://Games/temp");
        dirFile2.createDir("D://Games/savegames");
        dirFile2.createDir("D://Games/res");
        dirFile2.createDir("D://Games/src/main");
        dirFile2.createDir("D://Games/src/test");
        dirFile2.createDir("D://Games/res/vectors");
        dirFile2.createDir("D://Games/res/drawables");
        dirFile2.createDir("D://Games/res/icons");
        dirFile2.createFile("D://Games/src/main","Main.java");
        dirFile2.createFile("D://Games/src/main","Utils.java");
        dirFile2.createFile("D://Games/temp","temp.txt");
    }
}