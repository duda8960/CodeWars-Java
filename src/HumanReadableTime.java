public class HumanReadableTime {
                         /*
    Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59
    The maximum time never exceeds 359999 (99:59:59)

    You can find some examples in the test fixtures.
                          */

    public static String makeReadable(int segundos) {

        int horas;
        int minutos;

        minutos = segundos/60;
        segundos = segundos%60;
        horas = minutos/60;
        minutos = minutos%60;
        String n = ""+ String.format ("%02d", horas)+":"+ String.format ("%02d",minutos)+":"+String.format ("%02d",segundos);

        return n;
    }
}
