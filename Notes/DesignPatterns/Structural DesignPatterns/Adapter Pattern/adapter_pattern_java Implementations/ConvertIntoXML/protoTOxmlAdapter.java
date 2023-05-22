package structural_design_patterns.adapter;

public class protoTOxmlAdapter implements IAdapter{
    private Proto_buff proto_buff;

    public protoTOxmlAdapter(Proto_buff proto_buff){
        this.proto_buff = proto_buff;
    }

    
    @Override
    public <T> XML convert(T type) {
        return this.proto_buff.convertToXML();
    }


}
