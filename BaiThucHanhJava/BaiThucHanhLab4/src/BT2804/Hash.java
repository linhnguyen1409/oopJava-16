package BT2804;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        String name ;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Wilson");
        hashSetString.add("nike");
        hashSetString.add("volvo");
        hashSetString.add("kia");
        hashSetString.add("lenovo");
        hashSetString.add("lenovo");
        System.out.println("cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("nhap phan tu can xoa: ");
        name = sc.nextLine();
        if (hashSetString.contains(name))
        {
            hashSetString.remove(name);
            System.out.println("xoa thanh cong! ");
            System.out.println("cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        }
        else
        {
            System.out.println("xoa khong thanh cong! ");
        }
    }
}
