public class D {
    
    private int D1;
    private int D2;

    public D(int d1, float d2) {
        D1 = d1;
        D2 = d2;
    }

    public void setD1(int meuD1) {
        D1 = meuD1;
    }

    public void setD2(float meuD2) {
        D2 = meuD2;
    }

    public int getD1() {
        return D1;
    }

    public int getD2() {
        return D2;
    }

    public boolean MD1() {
        return D1 == D2;
    }

    public int MD2() {
        int soma = 0;
        soma = D1 + D2;
        return soma;
    }

}