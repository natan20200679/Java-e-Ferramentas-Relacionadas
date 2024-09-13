package gfg_jtp_tp.classesGenericas;

public class Ex2<T, U> {

    /* An object of type T */
    T obj1;

    /* An object of type U */
    U obj2;

    Ex2(T obj1, U obj2) {

        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    public static void main(String[] args) {

        Ex2 <String, Integer> obj = new Ex2<>("GfG", 15);

        System.out.println(obj.obj1);
        System.out.println(obj.obj2);
        
    }

}
