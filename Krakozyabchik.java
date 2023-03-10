package lab2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Krakozyabchik {
    public static void main(String[] args) {
        engToUa("D:/text.txt", "D:/text_2.txt");
        uaToEng("D:/text_2.txt", "D:/text_3.txt");
    }
    private static void engToUa(String readPath, String writePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(readPath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath, true));
            int ch = bufferedReader.read();
            char symbol_read;
            char symbol_write;
            while (ch != -1) {
                symbol_read= (char) ch;
                symbol_write = switch (symbol_read) {
                    case 'q' -> 'й';
                    case 'w' -> 'ц';
                    case 'e' -> 'у';
                    case 'r' -> 'к';
                    case 't' -> 'е';
                    case 'y' -> 'н';
                    case 'u' -> 'г';
                    case 'i' -> 'ш';
                    case 'o' -> 'щ';
                    case 'p' -> 'з';
                    case '[' -> 'х';
                    case ']' -> 'ї';
                    case 'a' -> 'ф';
                    case 's' -> 'і';
                    case 'd' -> 'в';
                    case 'f' -> 'а';
                    case 'g' -> 'п';
                    case 'h' -> 'р';
                    case 'j' -> 'о';
                    case 'k' -> 'л';
                    case 'l' -> 'д';
                    case ';' -> 'ж';
                    case '\'' -> 'є';
                    case 'z' -> 'я';
                    case 'x' -> 'ч';
                    case 'c' -> 'с';
                    case 'v' -> 'м';
                    case 'b' -> 'и';
                    case 'n' -> 'т';
                    case 'm' -> 'ь';
                    case ',' -> 'б';
                    case '.' -> 'ю';
                    case '/' -> '.';
                    case 'Q' -> 'Й';
                    case 'W' -> 'Ц';
                    case 'E' -> 'У';
                    case 'R' -> 'К';
                    case 'T' -> 'Е';
                    case 'Y' -> 'Н';
                    case 'U' -> 'Г';
                    case 'I' -> 'Ш';
                    case 'O' -> 'Щ';
                    case 'P' -> 'З';
                    case '{' -> 'Х';
                    case '}' -> 'Ї';
                    case 'A' -> 'Ф';
                    case 'S' -> 'І';
                    case 'D' -> 'В';
                    case 'F' -> 'А';
                    case 'G' -> 'П';
                    case 'H' -> 'Р';
                    case 'J' -> 'О';
                    case 'K' -> 'Л';
                    case 'L' -> 'Д';
                    case ':' -> 'Ж';
                    case '\"' -> 'Є';
                    case 'Z' -> 'Я';
                    case 'X' -> 'Ч';
                    case 'C' -> 'С';
                    case 'V' -> 'М';
                    case 'B' -> 'И';
                    case 'N' -> 'Т';
                    case 'M' -> 'Ь';
                    case '<' -> 'Б';
                    case '>' -> 'Ю';
                    default -> symbol_read;
                };
                bufferedWriter.write(symbol_write);
                ch = bufferedReader.read();
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private static void uaToEng(String readPath, String writePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(readPath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath, true));
            int ch = bufferedReader.read();
            char symbol_read;
            char symbol_write;
            while (ch != -1){
                symbol_read= (char) ch;
                symbol_write = switch (symbol_read) {
                    case 'й' -> 'q';
                    case 'ц' -> 'w';
                    case 'у' -> 'e';
                    case 'к' -> 'r';
                    case 'е' -> 't';
                    case 'н' -> 'y';
                    case 'г' -> 'u';
                    case 'ш' -> 'i';
                    case 'щ' -> 'o';
                    case 'з' -> 'p';
                    case 'х' -> '[';
                    case 'ї' -> ']';
                    case 'ф' -> 'a';
                    case 'і' -> 's';
                    case 'в' -> 'd';
                    case 'а' -> 'f';
                    case 'п' -> 'g';
                    case 'р' -> 'h';
                    case 'о' -> 'j';
                    case 'л' -> 'k';
                    case 'д' -> 'l';
                    case 'ж' -> ';';
                    case 'є' -> '\'';
                    case 'я' -> 'z';
                    case 'ч' -> 'x';
                    case 'с' -> 'c';
                    case 'м' -> 'v';
                    case 'и' -> 'b';
                    case 'т' -> 'n';
                    case 'ь' -> 'm';
                    case 'б' -> ',';
                    case 'ю' -> '.';
                    case '.' -> '/';
                    case 'Й' -> 'Q';
                    case 'Ц' -> 'W';
                    case 'У' -> 'E';
                    case 'К' -> 'R';
                    case 'Е' -> 'T';
                    case 'Н' -> 'Y';
                    case 'Г' -> 'U';
                    case 'Ш' -> 'I';
                    case 'Щ' -> 'O';
                    case 'З' -> 'P';
                    case 'Х' -> '[';
                    case 'Ї' -> ']';
                    case 'Ф' -> 'A';
                    case 'І' -> 'S';
                    case 'В' -> 'D';
                    case 'А' -> 'F';
                    case 'П' -> 'G';
                    case 'Р' -> 'H';
                    case 'О' -> 'J';
                    case 'Л' -> 'K';
                    case 'Д' -> 'L';
                    case 'Ж' -> ':';
                    case 'Є' -> '\"';
                    case 'Я' -> 'Z';
                    case 'Ч' -> 'X';
                    case 'С' -> 'C';
                    case 'М' -> 'V';
                    case 'И' -> 'B';
                    case 'Т' -> 'N';
                    case 'Ь' -> 'M';
                    case 'Б' -> '<';
                    case 'Ю' -> '>';
                    default -> symbol_read;
                };
                bufferedWriter.write(symbol_write);
                ch = bufferedReader.read();
            }
            bufferedWriter.close();
            bufferedReader.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

}