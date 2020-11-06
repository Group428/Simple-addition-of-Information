import java.util.ArrayList;

public class WarData {
    
    private ArrayList<String> _infoWar = new ArrayList<String>();

    public void addInfoItem(String militaryUnitName){
        _infoWar.add(militaryUnitName);
    }

    public void printListInfo(){
        System.out.println("*****INFO*****");
        for(int i = 0; i < _infoWar.size(); i++){
            System.out.println((i + 1) + ". " + _infoWar.get(i));
        }
    }
}
