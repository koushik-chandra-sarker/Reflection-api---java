package Modal;

public class Methods {

    private String  display(String string){
        if (string.isEmpty()||string==null){
            return "Display Default.";
        }
        return "Display "+string;
    }
}
