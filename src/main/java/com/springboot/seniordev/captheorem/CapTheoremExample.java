package com.springboot.seniordev.captheorem;
/**
 * @author prabhakar, @Date 20-03-2025
 */
public class CapTheoremExample {

    public static void main(String[] args) throws InterruptedException {
        // AP Example
        APNode apNode1 = new APNode("APNode1");
        APNode apNode2 = new APNode("APNode2");

        apNode1.put("key1", "value1"); // Initial write

        // Simulate partition
        System.out.println("\n--- AP System Partition ---");
        apNode1.put("key1", "value2"); // Write during partition
        System.out.println("AP Node 2 Get during partition: " + apNode2.get("key1")); // Read during partition (old value)

        System.out.println("\n--- AP System Recovery ---");
        System.out.println("AP Node 2 Get after recovery: " + apNode2.get("key1")); // Read after recovery (eventually consistent)

        // CP Example
        CPNode cpNode1 = new CPNode("CPNode1");
        CPNode cpNode2 = new CPNode("CPNode2");

        cpNode1.put("key1", "value1");

        System.out.println("\n--- CP System Partition ---");
        //Simulate that Node 1 has the lock.
        System.out.println("CP Node 1 Put: ");
        cpNode1.put("key1", "value2");
        if(cpNode2.isLockAvailable()){
            System.out.println("CP Node 2 Put: ");
            cpNode2.put("key1", "value3"); // Blocked (simulated lock) or throws error in real implementation
        }
        else{
            System.out.println("CP Node 2 cannot Put, Lock not available");
        }

        System.out.println("CP Node 2 Get during partition: " + cpNode2.get("key1")); //  Cannot get, Lock is held.

        System.out.println("\n--- CP System Recovery ---");
        System.out.println("CP Node 2 Get after recovery: " + cpNode2.get("key1")); //  Gets the value.
    }
}