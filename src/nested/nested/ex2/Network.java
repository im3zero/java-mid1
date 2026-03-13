package nested.nested.ex2;

public class Network {
    //Network.NetworkMessage 외부에서 사용할 떄는 이렇게 사용해야됨
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    //외부에서는 접근할 수 없음
    //내부 중첩
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
