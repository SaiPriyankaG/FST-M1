package activities;

public class Activity3 {
    public static void main(String[] args){
        double sec=1000000000;
        double earthSeconds=31557600;
        double mercurySeconds=0.2408467;
        double venusSeconds=0.61519726;
        double marsSeconds=1.8808158 ;
        double jupiterSeconds=11.862615;
        double saturnSeconds=29.447498;
        double uranusSeconds=84.016846;
        double neptuneSeconds=164.79132;

        System.out.println("Age on Mercury: " + sec / earthSeconds / mercurySeconds);
        System.out.println("Age on Venus: " + sec / earthSeconds / venusSeconds);
        System.out.println("Age on Earth: " + sec / earthSeconds);
        System.out.println("Age on Mars: " + sec / earthSeconds / marsSeconds);
        System.out.println("Age on Jupiter: " + sec / earthSeconds / jupiterSeconds);
        System.out.println("Age on Saturn: " + sec / earthSeconds / saturnSeconds);
        System.out.println("Age on Uranus: " + sec / earthSeconds / uranusSeconds);
        System.out.println("Age on Neptune: " + sec / earthSeconds / neptuneSeconds);




    }
}
