package link.duplex;


public class Tester {

    public static void main(String[] args) {
        List duplexNodeList = new List();

        duplexNodeList.add(4).add(3).add(5);
        duplexNodeList.delete(1);

        System.out.println("DuplexNode");
        System.out.println("size : " + duplexNodeList.size());
        for (Integer temp = 0; temp < duplexNodeList.size(); temp++) {
            System.out.println("[" + temp + "] : " + duplexNodeList.get(temp));
        }
    }

}
