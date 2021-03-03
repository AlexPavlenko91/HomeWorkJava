package Task5;

import com.sun.source.tree.LambdaExpressionTree;

public class App5 {
    public static void main(String[] args) {
        Book book = new Book(
                "Head First Java",
                "Kathy Sierra and Bert Bates",
                2005,
                "O'Reilly Media",
                "Programming",
                720  );
        book.Show();
        book.Show("Alex");
    }
}
