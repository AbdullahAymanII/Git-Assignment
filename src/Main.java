//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("develop v2");
        String [] strings={"sa","dasd","hello"};
        printStrings(strings);
        String [] strings2={"aaaaa","dddd","fffff"};
        printStrings(strings);
    }
    public static void printStrings(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("number: "+arr[i]);
        }
    }
}