package structural_design_patterns.adapter;

public class JsonToXmlAdapter implements IAdapter{
    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    // this was the old code


    // @Override
    // public XML convert(JSON json) {
    //     return this.json.convertToXML();
    // }


    // Here is the updated code using Generic Object parameter
    
    @Override
    public <T> XML convert(T type) {
        return this.json.convertToXML();
    }
}
