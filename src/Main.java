import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022,7,18);


        Date finDeCursada = new Date(2022,11,5);
        Date fechaParcial = new Date(2022,8,29);

        Player jugador = new Player("joebiden","arquero");
        Player suplente = new Player("mccain","panchero");
        Team profespoo = new Team("profes POO");

        profespoo.addPlayer(jugador);
        profespoo.addPlayer(suplente);
        Team estudiantespoo = new Team("estudiantes POO");
        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );


        Match primerparcial = new Match("aula 116", fechaParcial,profespoo,estudiantespoo);



    }
}
