package lambdaExpressions;


interface Executable2{
    int execute(int x, int a);
}

class Runner2 {
    public void run(Executable2 e){
        int a = e.execute(10, 4);
        System.out.println(a);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Runner2 runner = new Runner2();

        runner.run(new Executable2() {
            @Override
            public int execute(int x, int a) {
                return x + a;
            }
        });

        runner.run((x, a) -> x + a + 10);
//        runner.run(x -> x + 10);

    }
}
