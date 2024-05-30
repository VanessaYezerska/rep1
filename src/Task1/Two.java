package Task1;

class Two extends One {
    public Two(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void abc() {
        System.out.println(b + a + c);
    }
}