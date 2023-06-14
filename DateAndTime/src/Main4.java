import java.time.*;

public class Main4 {

    public static void main(String[] args) {

    /*
        ZoneId zone1 = ZoneId.systemDefault();
        System.out.println(zone1);
        ZoneId zone2 = ZoneId.of("America/Los_Angeles");
        System.out.println(zone2);
        System.out.println("-----");
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }
    */
        /*
        ZoneId offset1 = ZoneId.of("-03:00");
        System.out.println(offset1);

        ZoneId offset2 = ZoneOffset.UTC;
        System.out.println(offset2);

        ZoneId offset3 = ZoneOffset.of("-03:00");
        System.out.println(offset3);

        ZoneId offset4 = ZoneOffset.ofHours(-3);
        System.out.println(offset4);

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        // FUSO HORARIO, VERIFICA A REGRA PARA SABER QUAL SEU OFFSET
        ZoneOffset offsetSaoPaulo = fusoSaoPaulo.getRules()
                .getOffset(LocalDateTime.parse("2018-02-17T00:00:00"));
        System.out.println(offsetSaoPaulo);
        ZoneOffset offsetSaoPaulo2 = fusoSaoPaulo.getRules()
                .getOffset(LocalDateTime.parse("2018-02-18T00:00:00"));
        System.out.println(offsetSaoPaulo2);
         */

        /*
        Instant instant = Instant.now();
        System.out.println(instant);

        ZoneId zone = ZoneId.of("America/Sao_Paulo");

        LocalDateTime dataHora = LocalDateTime.ofInstant(instant, zone);
        System.out.println(dataHora);
         */
        /*
       LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataLosAngeles = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        LocalDateTime dataJapan = LocalDateTime.now(ZoneId.of("Japan"));
        System.out.println(dataAtual);
        System.out.println(dataLosAngeles);
        System.out.println(dataJapan);
         */

        /*
        // ZONEDDATETIME já resolve automaticamente o fusoHorario

        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        System.out.println(dataHoraFusoPadrao);

        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(dataHoraLosAngeles);
         */


        ZonedDateTime dataFestaSaoPaulo = ZonedDateTime
                .parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataFestaSaoPaulo);
        System.out.println(dataFestaLosAngeles);

        // use sempre isEqual
        System.out.println(dataFestaSaoPaulo.isEqual(dataFestaLosAngeles));


/*
        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        LocalDateTime dataHorasemFuso = dataHoraFusoPadrao.toLocalDateTime();
        System.out.println(dataHorasemFuso);
        LocalDateTime localDateTime = LocalDateTime.parse("2023-09-13T20:00:00");
       // ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
*/

    /*
        ZonedDateTime dataHoraFuso = ZonedDateTime
                .parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");

        Instant instant = dataHoraFuso.toInstant();

        LocalDateTime dataHoraLocalLosAngeles = LocalDateTime
                .ofInstant(instant,ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFuso);
        System.out.println(instant);
        System.out.println(dataHoraLocalLosAngeles);


     */

        /*
        Duration duracaoVoo = Duration.parse("PT12H22M");
        ZonedDateTime dataHoraDecolagem = ZonedDateTime
                .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataHoraPouso = dataHoraDecolagem
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
                .plus(duracaoVoo);

        LocalDateTime somenteDataHora = LocalDateTime.from(dataHoraPouso);

        System.out.println(dataHoraDecolagem);
        System.out.println(dataHoraPouso);
        System.out.println(somenteDataHora);

         */

        // OffsetDateTime dataHora = OffsetDateTime.now();
       // OffsetDateTime dataHora = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));

       // System.out.println(dataHora);


    }
}
