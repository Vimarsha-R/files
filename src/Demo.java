import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {

//        createDir("demos/demo1");
//        createfile("demos/demo3/file5");
//        getAllfiles("demos/demo2");
//        deleteFile("demos/demo1/file4");
//        getparent("demos/demo1/file3");
//        checkhidden("demos/demo2/file3.java");
//        movefile("demos/demo1/file4","demos/demo3");
//        copyfile("demos/demo2/hello","demos/demo3");
//        findfile("demos/demo2", "hello");
    }

    public static void createDir(String dirname) {
        File file = new File(dirname);
        if (!(file.exists() && file.isDirectory())) {
            file.mkdir();
        } else {
            System.out.println("Directory already exists.");
        }
    }

    private static void createfile(String filename) throws IOException {
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("file already exist in the same dir");
        } else {
            file.createNewFile();
            System.out.println("file created");
        }
    }

    private static void getAllfiles(String dirname) {
        File file = new File(dirname);
        File[] files = file.listFiles();
        for (File value : files) {
            //System.out.println(files[i]);
            System.out.println(value.getName());
        }
    }

    public static void deleteFile(String delfilename) {
        File file = new File(delfilename);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("file not exist");
        }
    }

    public static void getparent(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            System.out.println(file.getParent());
        } else {
            System.out.println("not exist");
        }
    }

    private static void checkhidden(String path) {
        File file = new File(path);
        if (file.isHidden()) {
            System.out.println("this file is hidden");
        } else {
            System.out.println("the file is not hidden");
        }
    }

    private static void movefile(String source, String targ) {
        File file = new File(source);
        File file1 = new File(targ, file.getName());

        if (file.renameTo(file1)) {
            System.out.println("file moved..");
        } else {
            System.out.println("file not moved");
        }
    }

    private static void copyfile(String source, String targ) throws FileNotFoundException {
        File file = new File(source);
        File file1 = new File(targ, file.getName());
        File file2 = new File(targ);
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(file1);
        System.out.println("File copied successfully");
    }

    private static void findfile(String dirname, String filename) {
        File[] files = new File(dirname).listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().contains(filename)) {
                System.out.println("the file named " + filename + " is exist "+file.getAbsolutePath());
            }
            else{
                System.out.println("file not found...!!");
            }
        }
    }


}


