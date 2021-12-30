
class testclass {

    public static void main(String[] args) {
        System.out.println("hello world !");

        omega a = new omega();
        int c = a.omega1(5);
        System.out.println(c);
    }
}

  class omega{
    final int omega1(int a){
        return Math.max(a,6);

    }
}