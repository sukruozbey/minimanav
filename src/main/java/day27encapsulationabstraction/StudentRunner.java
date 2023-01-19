package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student myStd=new Student();
        String stdId=myStd.getStdId();
        System.out.println(stdId);
        myStd.setGpa(4.0);
        System.out.println("myStd.getGpa() = " + myStd.getGpa());

        //bir objeden farklı farklı objeler yapıyoruz

        //Student 1
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);


    }

}
