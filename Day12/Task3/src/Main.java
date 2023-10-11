import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Создать класс Музыкальная группа(MusicBand) с полями name и year.
Создать 10 или более экземпляров класса MusicBand, добавить их в список.
Перемешать список. Создать второй список , в который скопировать группы из первого списка,
основанные после 2000 года. Вывести в консоль оба списка.
 */
public class Main {
    public static void main(String[] args) {
        MusicBand ms1 = new MusicBand("Blink182", 1992);
        MusicBand ms2 = new MusicBand("Nirvana", 1987);
        MusicBand ms3 = new MusicBand("AC/DC", 1973);
        MusicBand ms4 = new MusicBand("Metallica", 1981);
        MusicBand ms5 = new MusicBand("Rammstein", 1994);
        MusicBand ms6 = new MusicBand("Subways", 2002);
        MusicBand ms7 = new MusicBand(" Arctic Monkeys", 2002);
        MusicBand ms8 = new MusicBand("The Killers", 2001);
        MusicBand ms9 = new MusicBand("Franz Ferdinand", 2002);
        MusicBand ms10 = new MusicBand("Nine Inch Nails", 1988);

        List<MusicBand> listBand = new ArrayList<>();
        listBand.add(ms1);
        listBand.add(ms2);
        listBand.add(ms3);
        listBand.add(ms4);
        listBand.add(ms5);
        listBand.add(ms6);
        listBand.add(ms7);
        listBand.add(ms8);
        listBand.add(ms9);
        listBand.add(ms10);
        System.out.println(listBand);

        Collections.shuffle(listBand);

        System.out.println(listBand);

        List<MusicBand> listBandAfter2000 = new ArrayList<>();
        for (MusicBand band : listBand) {
            if (band.getYear() > 2000) {
                listBandAfter2000.add(band);
            }
        }
        System.out.println(listBandAfter2000);


    }
}