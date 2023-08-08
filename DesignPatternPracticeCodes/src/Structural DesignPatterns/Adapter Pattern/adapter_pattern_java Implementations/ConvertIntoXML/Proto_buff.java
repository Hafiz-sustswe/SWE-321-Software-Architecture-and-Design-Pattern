package structural_design_patterns.adapter;

public class Proto_buff {
    public Proto_buff(){};
    public Proto_buff(String data){}
    XML convertToXML(){
        // logic to convert the data to XML
        return new XML("Stringified Proto-buff data");
    }
}
