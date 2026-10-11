package practice1;

public class Task5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы");
            return;
        }
        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
