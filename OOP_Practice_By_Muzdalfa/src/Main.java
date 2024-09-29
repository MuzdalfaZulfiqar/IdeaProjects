import java.util.Date;

public class Main {
    public static void main(String[] args)
    {

            Balance b  = new Balance(10000);
            b.deposit(33333);
            b.withdraw(22222);

            Balance b1 = new Balance(b.getBal());
            b1.withdraw(11111);
            b1.deposit(22222);

//        Time t = new Time(1,23,288);
//        t.dis();

//       Marks m = new Marks();
//       m.m1 = 10;
//       m.m2 = 10;
//       m.m3 = 10;
//       System.out.println(m.add());


//        Book3 b3 = new Book3("Car",1000,10);
//        b3.display();
//
//
//        Date d = new Date();
//        d.getDate();
//        System.out.println(d.getDate());
//            Pizza p = new Pizza("small",1,2,2);
//            Pizza p1 = new Pizza("small",1,2,2);
//            PizzaOrder o = new PizzaOrder()
//;
//            o.add(p1);
//            o.add(p);
//            o.calCost();

            //        Address a = new Address();
//        a.setCity("l");
//        a.setCode(1);
//        a.setHome(11);
//        a.setStreet(2);
//        Person p = new Person();
//        p.setAddress(a);
//        p.setName("Muzdalfa");
//        Book1 b = new Book1(p,"n","m");
//        b.display();
//        Date d = new Date(1,12,2002);
//        Date d1 = new Date(11,1,2002);
//        Employee e = new Employee("Muz","s",d,d1);
//        e.display();



//        Book b = new Book();
//        b.author = "Muzdalfa";
//        String [] s = {"M", "U"};
//        b.chapter  = s;
//
//        String [] s1 = {"m","",""};
//        Book b2 = new Book("AS",s1);
//        System.out.println(b2.sameAuthor(b));
//        System.out.println(b2.sameChapter(b).author);


//       Fraction f = new Fraction();
//       f.numerator = 10;
//       f.denominator = 20;
//
//       int frac = 20/40;
//       if(f.equals(frac)){
//           System.out.println("Yes");
//       }
//       else{
//           System.out.println("No");
//       }
//

    }
}