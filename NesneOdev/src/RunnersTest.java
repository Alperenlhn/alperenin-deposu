public class RunnersTest {
    public static void main(String[] args) {
        int[] numbers ={273,278,329,445,402,243,388,270,341,334,412,393,299,343,317,265};
        String[] names={"Kadir","Gökhan","Hakan","Suzan","Pınar","Fırat","Ali","Emel","Mehmet","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        Runners runners=new Runners(numbers, names);
        runners.firstMinute();
        runners.secondMinute();
        runners.thirdMinute();
        runners.topThree();
        runners.finishTimecompare();


    }
}
