public class sample {
    public static void main(String args[]) {
        String name1 = "akku";
        String name2 = "appu";
        String name3 = name1 + " " + name2;
        System.out.println(name1 + " " + name2);
        System.out.println(name3.length());
        System.out.print(name3.charAt(4));
        String name4 = name1.replace('a', 'b') + " " + name2.replace('a', 'b');
        System.out.print(name4);

    }
}