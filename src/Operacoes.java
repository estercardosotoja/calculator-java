public class Operacoes {
    int num1;
    int num2;

    public Operacoes(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int soma(){
        return getNum1()+getNum2();
    }
    public int sub(){
        return getNum1()-getNum2();
    }
    public int div(){
        return getNum1()/getNum2();
    }
    public int mul(){
        return getNum1()*getNum2();
    }
}
