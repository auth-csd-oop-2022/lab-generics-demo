// Java program to show working
// of user-defined Generic classes

// We use < > to specify Parameter type
class Test4<T> {
    // An object of type T is declared
    T obj;

    Test4(T obj) {
        this.obj = obj;
    } // constructor

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        // instance of Integer type
        Test4<Integer> iObj = new Test4<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test4<String> sObj = new Test4<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        iObj = sObj; // This results an error
    }
}