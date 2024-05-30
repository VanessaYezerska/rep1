package Task1;
// Батьківський клас One
class One {
    int a;
    int b;
    int c;

    public One(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void abc() {
        System.out.println(a + b + c);
    }

    public void bca() {
        System.out.println(b + c + a);
    }
}

