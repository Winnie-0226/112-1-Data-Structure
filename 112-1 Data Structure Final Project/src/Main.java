import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please type URL:");
        Scanner sc = new Scanner(System.in);

        // 關鍵字
        String keyword = "的";

        while (sc.hasNext()) {
            String urlStr = sc.next();

            WordCounter counter = new WordCounter(urlStr);
            System.out.println(keyword + " appears " + counter.countKeyword(keyword) + " times.");
        }
        sc.close();
    }
}

//http://big5.news.cn/gate/big5/www.news.cn/2023-12/01/c_1212308903.htm
