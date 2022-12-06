//наслідування People
package com.company;

public class Peo extends People {
    Peo(int customers,int security, int cashier,String chief_cashier, String chief_security) {
        super(customers, security, cashier, chief_cashier, chief_security);
    }

    public Peo(){
    }
    void methodPeople (){
        new_price();
        System.out.println("Клієнтів : "+customers+", Касирів : "+cashier+", Охоронців : "+security);
    }
    void test(){
        People people = new People();
        people.people(10);
    }
    class People {
        void people(int c){
            System.out.println("Кількість жінок в будівлі : "+ c);
        }
    }

}
