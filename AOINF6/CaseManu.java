import java.util.Scanner;

public class CaseManu {
    private static Scanner _scanner = new Scanner(System.in);
    private static WarData _warData = new WarData();

    private void showMenu(){
        System.out.println("\n");
        System.out.println("1 - Add new info");
        System.out.println("2 - Show collcetion");
        System.out.println("3 - Exit");
    }

    public void start()
    {
        boolean exit = false;
        int key;

        while(!exit){
            showMenu();
            System.out.println("Enter a choice: ");
            key = _scanner.nextInt();
            _scanner.nextLine();
            
            switch(key){
                case 1:
                    addInfo();
                    break;

                case 2:
                    _warData.printListInfo();
                        break;

                case 3:
                    exit = true;
                    break;
            }
        }
    }

    public static void addInfo()
    {
        System.out.println("Please enter new information about military Unit Name: ");
        _warData.addInfoItem(_scanner.nextLine());
    }
}
