package nested.nested.ex1;

public class Network {
    //네트워크 객체
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();

    }
}
