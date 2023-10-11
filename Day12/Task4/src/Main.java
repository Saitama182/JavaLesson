import java.util.ArrayList;
import java.util.List;

/*
Доработать класс MusicBand из прошлого задания таким обазом , чтобы в группу можно было добавлять
и удалять участников под участниками понимается строка с именем и фамилией.
Реализовать метод слияния групп т.е. все участники группы А переходят в группу В
(участники не могут находиться в двух группах одновременно)
Реализовать метод выводящий список участников в консоль. Проверить состав групп после слияния.

 */
public class Main {
    public static void main(String[] args) {
        MusicBand ms1 = new MusicBand("Blink182", 1992, " Том Делонг");
        MusicBand ms2 = new MusicBand("Nirvana", 1987,"Курт Кобейн");
        MusicBand ms3 = new MusicBand("AC/DC", 1973, " Ангус Янг");
        MusicBand ms4 = new MusicBand("Metallica", 1981," Джеймс Хетфилд");
        MusicBand ms5 = new MusicBand("Rammstein", 1994," Тилль Линдеманн");
        MusicBand ms6 = new MusicBand("Subways", 2002,"Билли Ланн");
        MusicBand ms7 = new MusicBand(" Arctic Monkeys", 2002," Джейми Кук");
        MusicBand ms8 = new MusicBand("The Killers", 2001," Брэндон Флауэрс");
        MusicBand ms9 = new MusicBand("Franz Ferdinand", 2002," Алекс Капранос");
        MusicBand ms10 = new MusicBand("Nine Inch Nails", 1988, " Аттикус Росс");

        List<MusicBand> band1 = new ArrayList<>();

        band1.add(ms1);
        band1.add(ms2);
        band1.add(ms3);
        band1.add(ms4);
        band1.add(ms5);
        band1.add(ms6);
        band1.add(ms7);
        band1.add(ms8);
        band1.add(ms9);
        band1.add(ms10);
        List<MusicBand> band2 = new ArrayList<>();
    }

}