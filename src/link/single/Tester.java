package link.single;

public class Tester {

    public static void main(String[] args) {
        List singleNodeList = new List();

        singleNodeList.add(4).add(3).add(5);
        singleNodeList.delete(1);

        System.out.println("SingleNode");
        System.out.println("size : " + singleNodeList.size());
        for (Integer temp = 0; temp < singleNodeList.size(); temp++) {
            System.out.println("[" + temp + "] : " + singleNodeList.get(temp));
        }
    }

}
