public class CurrentTime {
    public static void main(String[] args){
        long tmsec = System.currentTimeMillis();
        long tsec = tmsec/1000; //total milliseconds
        long csec = tsec%60; //current milliseconds
        long tmin = tsec/60; //total minutes
        long cmin = tmin%60; //current minutes
        long thour = tmin/60; //total hours
        long chour = thour%24; //current hours
        System.out.println("Current time is " + chour + ":" + cmin + ":" + csec + " GMT");
    }
}
