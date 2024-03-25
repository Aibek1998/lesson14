public class Main {
    public static void main(String[] args) {
        Classes clas = new Classes(5,"soz", new int[]{3, 5, 4});
        System.out.println();
        System.out.println("number : "+clas.number + "\n"+
                "soz : " +clas.soz);
        System.out.print("array : ");
        for ( int i : clas.array) {
            System.out.print(i + ",");
        }
    }
}