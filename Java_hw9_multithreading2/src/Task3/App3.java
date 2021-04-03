package Task3;


public class App3 {
    public static void main(String[] args) {
        CopyDirectoryContent obj = new CopyDirectoryContent();
        obj.inputPath();
        new Thread(() -> {
            try {  //Если папка назначения существует, будет выброшено FileAlreadyExistsException
                System.out.println("There were copied: " +
                        obj.copyFolder(obj.getSource(), obj.getDestination()) +
                        " objects and folders. " + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
}
