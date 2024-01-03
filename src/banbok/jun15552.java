package banbok;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class jun15552 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        StringTokenizer token;

        for (int i = 0; i < num; i++) {
            token = new StringTokenizer(reader.readLine(), " ");
            writer.write((Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken())) + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();

    }

}
