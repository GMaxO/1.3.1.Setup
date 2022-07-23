import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirFile2 {
    String nameDir;
    String nameFile;
    StringBuilder note = new StringBuilder();

    public DirFile2(String nameDir) {
        this.nameDir = nameDir;
    }

    public DirFile2(String nameDir, String nameFile) {
        this.nameDir = nameDir;
        this.nameFile = nameFile;
    }

    public void createDir(String nameDir) {
        File dir = new File(nameDir);
        if (dir.mkdir()) {
            note.append(" Каталог создан " + dir.getName());
            System.out.println(" Каталог создан " + dir.getName());
        }
    }

    public void createFile(String nameDir, String nameFile) {
        File file = new File(nameDir, nameFile);
        try {
            if (file.createNewFile()) {
                note.append(" Файл создан ").append(file.getName());
                System.out.println(" Файл создан " + file.getName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt", true)) {
            writer.write(String.valueOf(note));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

