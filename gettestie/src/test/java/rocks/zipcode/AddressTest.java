package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AddressTest {

    @Test
    public void compareTo() {
        HashSet<Address> test = new HashSet<>();
        Address a1 = new Address("3 Main Street", "Hershey", "19324", "USA");
        Address a2 = new Address("4 Front Street", "Philadelphia", "19523", "USA");
        Address a3 = new Address("69 Pork Street", "State College", "16801", "USA");

        test.add(a1);
        test.add(a2);
        test.add(a3);

        boolean expected = a1.compareTo(a2) < 0;

        Assert.assertTrue(expected);
        Assert.assertTrue(test.contains(a1));
    }

    @Test
    public void compareTo2(){
        ArrayList<Address> test = new ArrayList<>();
        Address a1 = new Address("3 Main Street", "Hershey", "19324", "USA");
        Address a2 = new Address("4 Front Street", "Philadelphia", "19523", "USA");
        Address a3 = new Address("69 Pork Street", "State College", "16801", "USA");

        test.add(a1);
        test.add(a2);
        test.add(a3);

        boolean expected = a1.compareTo(a2) <0;
        Assert.assertTrue(expected);

        String strExp = "4 Front Street\n" +
            "Philadelphia 19523\n" +
            "USA";
        String actStr = test.get(1).toString();
        System.out.println(strExp);
        Assert.assertEquals(strExp,actStr);
    }

    @Test
    public void compareTo3(){
        HashMap<Integer, Address> test = new HashMap<>();
        Address a1 = new Address("3 Main Street", "Hershey", "19324", "USA");
        Address a2 = new Address("4 Front Street", "Philadelphia", "19523", "USA");
        Address a3 = new Address("69 Pork Street", "State College", "16801", "USA");

        test.put(0, a1);
        test.put(1, a2);
        test.put(2, a3);

        boolean expected = a1.compareTo(a2) <0;
        Assert.assertTrue(expected);

        String strExp = "4 Front Street\n" +
            "Philadelphia 19523\n" +
            "USA";
        String actStr = test.get(1).toString();
        System.out.println(strExp);
        Assert.assertEquals(strExp,actStr);
    }

    @Test
    public void compareTo4(){
        LinkedList<Address> test = new LinkedList<>();
        Address a1 = new Address("3 Main Street", "Hershey", "19324", "USA");
        Address a2 = new Address("4 Front Street", "Philadelphia", "19523", "USA");
        Address a3 = new Address("69 Pork Street", "State College", "16801", "USA");

        test.add(a1);
        test.add(a2);
        test.add(a3);
        boolean expected = test.get(2).compareTo(a2) > 0;
        Assert.assertFalse(expected);

        String strExp = "4 Front Street\n" +
            "Philadelphia 19523\n" +
            "USA";
        String actStr = test.get(1).toString();
        System.out.println(strExp);
        Assert.assertEquals(strExp,actStr);
    }

    @Test
    public void compareTo5() {
        ArrayDeque<Address> test = new ArrayDeque<>();
        Address a1 = new Address("3 Main Street", "Hershey", "19324", "USA");
        Address a2 = new Address("4 Front Street", "Philadelphia", "19523", "USA");
        Address a3 = new Address("69 Pork Street", "State College", "16801", "USA");

        test.add(a1);
        test.add(a2);
        test.add(a3);

        boolean expected = test.getFirst().compareTo(a2) > 0;
        Assert.assertFalse(expected);

        String strExp = "4 Front Street\n" +
            "Philadelphia 19523\n" +
            "USA";
        System.out.println(test.peek());
        test.pop();
        String actStr = test.getFirst().toString();
        System.out.println(strExp);
        Assert.assertEquals(strExp, actStr);
    }
}
