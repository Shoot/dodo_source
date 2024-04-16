package defpackage;
/* renamed from: ib6  reason: default package */
/* loaded from: classes3.dex */
public class ib6 extends fb6 {
    private int b;
    private int c;
    private ka4 d;
    private we8 e;
    private ia4 f;
    private wy7 g;
    private wy7 h;
    private ia4 i;
    private we8[] j;

    public ib6(int i, int i2, ka4 ka4Var, we8 we8Var, wy7 wy7Var, wy7 wy7Var2, ia4 ia4Var) {
        super(true, null);
        this.c = i2;
        this.b = i;
        this.d = ka4Var;
        this.e = we8Var;
        this.f = ia4Var;
        this.g = wy7Var;
        this.h = wy7Var2;
        this.i = rh4.a(ka4Var, we8Var);
        this.j = new ye8(ka4Var, we8Var).c();
    }

    public ka4 b() {
        return this.d;
    }

    public we8 c() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public wy7 f() {
        return this.g;
    }

    public wy7 g() {
        return this.h;
    }

    public ia4 h() {
        return this.f;
    }
}
