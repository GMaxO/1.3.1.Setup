//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class DirFile {
//    StringBuilder note = new StringBuilder();
//    public static void createDir(String nameDir) {
//
////        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt", true)) {
//            File dir = new File(nameDir);
//            if (dir.mkdir()) {
////                System.out.println("Каталог создан " + dir.getName());
//                note.append("Каталог создан " + dir.getName());
//                String text = note.toString();
//                System.out.println(text);
////                writer.write("Каталог создан " + dir.getName());
//            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//
//
//        public static void createFile (String nameDir, String nameFile){
//            File file = new File(nameDir, nameFile);
//            try {
//                if (file.createNewFile()) {
//                    System.out.println("Файл создан " + file.getName());
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
////        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt", true)) {
////            writer.write(String.valueOf(note));
////    }
//    }