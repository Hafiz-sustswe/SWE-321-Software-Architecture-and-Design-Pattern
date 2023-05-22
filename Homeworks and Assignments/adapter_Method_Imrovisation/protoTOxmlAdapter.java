package structural_design_patterns;

import structural_design_patterns.adapter.IAdapter;
import structural_design_patterns.adapter.JSON;
import structural_design_patterns.adapter.XML;

public class protoTOxmlAdapter implements IAdapter{
    private Proto_buff proto_buff;

    public protoTOxmlAdapter(Proto_buff proto_buff){
        this.proto_buff = proto_buff;
    }

    @Override
    public Proto_buff convert(Proto_buff proto_buff) {
        return this.proto_buff.convertToXML();
    }

    @Override
    public Proto_buff convert(Proto_buff proto_buff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convert'");
    }

    @Override
    public XML convert(JSON json) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convert'");
    }
}
