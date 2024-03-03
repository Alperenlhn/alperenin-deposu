public class Runners {
    private int[] numbers;
    private String[] names;
    private  String firstperson;
    private String secondperson;
    private String thirdperson;
    public Runners(int[] numbers, String[] names) {
        this.numbers = numbers;
        this.names = names;
    }
    public int firstMinute() {
        int first = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (first > numbers[i]) {
                first = numbers[i];
                firstperson= names[i];
            }
        }
        return first;
    }
    public int secondMinute() {
        int second = Integer.MAX_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            if (second > numbers[j] && numbers[j] != firstMinute()) {
                second = numbers[j];
                secondperson= names[j];
            }
        }
        return second;
    }

    public int thirdMinute() {
        int third =Integer.MAX_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < third && firstMinute() != numbers[j] && secondMinute()!= numbers[j]) {
                third = numbers[j];
                thirdperson= names[j];
            }
        }
      return third;
    }
    public void finishTimecompare() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i : numbers) {
            if (i<300){
                a++;
            } else if (i>=300 && i<400) {
                b++;
            }else
                c++;
        }
        System.out.print("A->");
        System.out.print(a+",");
        System.out.print("B->");
        System.out.print(b+",");
        System.out.print("C->");
        System.out.print(c+"");
   }
    public void topThree(){
        System.out.println("Birinci:"+firstperson+" "+firstMinute()+"'");
        System.out.println("İkinci:"+secondperson+" "+secondMinute()+"'");
        System.out.println("Üçüncü:"+thirdperson+" "+thirdMinute()+"'");
    }














}
