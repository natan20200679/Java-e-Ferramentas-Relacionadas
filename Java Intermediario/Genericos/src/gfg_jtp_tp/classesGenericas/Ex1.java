package gfg_jtp_tp.classesGenericas;

public class Ex1<T> {

    T obj;

    Ex1(T obj) {

        this.obj = obj;

    }

    public T getObject() {

        return this.obj;

    }

    public static void main(String[] args) {

        Ex1<Integer> iObj = new Ex1<>(15);
        System.out.println(iObj.getObject());

        Ex1<String> sObj = new Ex1<>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
