import java.util.ArrayList;
import java.util.List;

public class LogList extends ArrayList<String>{
    // private ArrayList<String> list = new ArrayList<>();


    // public boolean addLog(String newLog){
    //     return this.list.add(newLog);

    //     // return this.addLog(newLog);
    // }

    public void printEveryOther(){
        for(int i = 0; i < this.size(); i += 2){
            System.out.println(this.get(i));
        }
    }
}
