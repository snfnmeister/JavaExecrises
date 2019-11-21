/*
 *
 * garbage collector (gc) working demonstration
 *
 */

class FDemo {
    int x;

    FDemo(int x) {
        this.x = x;
    }

    //    using before deleting the element
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    //    generate object and delete it immediately
    void generator(int x) {
        FDemo o = new FDemo(x);
    }


}
