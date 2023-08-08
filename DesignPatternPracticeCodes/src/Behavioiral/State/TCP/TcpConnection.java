package Behavioiral.State.TCP;

public interface TcpConnection {
    void open();
    void close();
    void establish();
    void listen() ;
    void setState(TCPConnectionState state) ;
}
