package customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Customer implements ServiceAble{
    private String  name;
    private String  fullName;
    private Country country ;
    private LocalDate localDatel;
    private String email;

    public Customer(String name, String fullName, Country country, LocalDate localDatel, String email) {
        this.name = name;
        this.fullName = fullName;
        this.country = country;
        this.localDatel = localDatel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getLocalDatel() {
        return localDatel;
    }

    public void setLocalDatel(LocalDate localDatel) {
        this.localDatel = localDatel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", country=" + country +
                ", localDatel=" + localDatel +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int local() {
        return LocalDate.now().getYear() - localDatel.getYear();
    }

    @Override
    public Customer[] customer(Customer[] customers) {
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
       int coun = 0;
        for (Customer customer : customers) {
            if (customer.country.name().equals(str.toUpperCase())){
                coun++;
            }
        }
        int index = 0;
        Customer[] customers1 = new Customer[coun];
        for (Customer customer : customers) {
            if (customer.country.name().equals(str.toUpperCase())){
                customers1[index] = customer;
                index++;
            }

        }
        return customers1;
    }

    @Override
    public Country[] country(Country[] countries) {
   return new Country[0];
    }

    @Override
    public Customer[] customer2(Customer[] customers) {
        return new Customer[0];
    }
}
