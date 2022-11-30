import customer.Country;
import customer.Customer;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Customer[] customer = {
                new Customer("Temirlan","Zhuzukulov", Country.ITALIA, LocalDate.of(2002,10,14),"temirlan@gmail.com"),
                new Customer("Zhanyshbek","Akbalaev",Country.USA,LocalDate.of(2004,2,27),"zhanyshbek@gmail.com"),
                new Customer("Zhanyshbek","Akbalaev",Country.USA,LocalDate.of(2004,2,27),"zhanyshbek@gmail.com"),
                new Customer("Kuban","Kelsinbekov",Country.KAZAKSTAN,LocalDate.of(2004,2,27),"kuban@gmail.com"),
                new Customer("Alumbek","Alybekov",Country.KYRGYZSTAN,LocalDate.of(2004,2,27),"alym@gmail.com"),
        };
//        for (Customer customer1 : customer) {
//            System.out.println(customer1.local() + " Age "+customer1.getName());
//        }


        for (Customer customer1 : customer) {
            System.out.println(Arrays.toString(customer1.customer(customer)));
        }
    }
}