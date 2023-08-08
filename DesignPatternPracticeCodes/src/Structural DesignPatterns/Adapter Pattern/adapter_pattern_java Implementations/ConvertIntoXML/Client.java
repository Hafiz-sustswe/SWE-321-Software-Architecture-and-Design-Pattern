package structural_design_patterns.adapter;

public class Client {
    JSON json = new JSON("json data");
    IAdapter iAdapter = new JsonToXmlAdapter(json);
    XML xml = iAdapter.convert(json);


    // here is the code of implementing a new Type conversion- Proto-buff to XML

    Proto_buff proto_buff = new Proto_buff("Proto-Buff data"); // Creates a new Proto-buff type object
    
    // then we need to use Adapter to pass this object and convert it into an XML Object

    IAdapter iAdapter2 = new protoTOxmlAdapter(proto_buff); // passing the proto-buff object

    XML xml2 = iAdapter2.convert(proto_buff); // idapter2 has a method called convert(), but it doesn't know the conversion logic, 

    // ACTUALLY , the conversion logic is defined in the protobuff class itself,so the adapter simply calls that method
    //(Which  ,by the way, means - we are calling an apater method , and this method calls the actual required method- working like a translator
    // and also , the client class don't have to have the logic behind the actual code  )


}
