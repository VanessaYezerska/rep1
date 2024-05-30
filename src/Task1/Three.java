package Task1;

class Three extends One {
    public Three(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void bca() {
        System.out.println(b + c + a);
    }
}