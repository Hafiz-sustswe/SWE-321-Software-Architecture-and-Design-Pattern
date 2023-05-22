package structural_design_patterns;

public class Proto_buff {
    public Proto_buff(){};
    public Proto_buff(String data){}
    Proto_buff convertToXML(){
        // logic to convert the data to XML
        return new Proto_buff("Stringified Proto-buff data");
    }
}
