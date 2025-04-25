import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDateTime present = LocalDateTime.now();

        System.out.println(present.getDayOfMonth());

        LocalDate noel = LocalDate.of(2024, 12, 25);

        System.out.println(noel.getDayOfMonth());

        if (present.getMonth() == Month.APRIL){
            System.out.println("on est en avril yay ");
        }

        if (present.getMonth().getValue() == 4) {
            System.out.println("Oui, nous sommes en avril");
        }

        LocalDateTime futur = present.withYear(2027);
        System.out.println(futur.getYear());
        System.out.println(present.getYear());


        System.out.println(present.getDayOfYear()); // compte le nombre de jours depuis le premier janvier dans l'annee

        LocalDateTime futurProche = present.plusDays(2);

        System.out.println(futurProche.getDayOfYear());

        LocalDate date = LocalDate.now();

        DateTimeFormatter monFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy"); // pour l'affichage de la date

        String texte = date.format(monFormat);
        System.out.println(texte);



    }
}