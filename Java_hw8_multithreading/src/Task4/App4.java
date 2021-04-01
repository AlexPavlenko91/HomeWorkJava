package Task4;

public class App4 {
    public static void main(String[] args) {
        SearchByWordInFile obj = new SearchByWordInFile();
        obj.inputPathAndWord();
        System.out.println("In the file \"" + obj.getPath() + "\" the word \"" + obj.getWord() + "\" was found:");

        new Thread(()-> obj.getStatistic().forEach((key, value) ->
                System.out.println("Line " + key + ": number of matches = " + value))).start();

    }
}
