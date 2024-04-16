package defpackage;
/* renamed from: bb6  reason: default package */
/* loaded from: classes3.dex */
public class bb6 extends za6 {
    private int c;
    private int d;
    private ka4 e;
    private we8 f;
    private wy7 g;
    private ia4 h;
    private we8[] i;

    public bb6(int i, int i2, ka4 ka4Var, we8 we8Var, ia4 ia4Var, wy7 wy7Var, String str) {
        super(true, str);
        this.c = i;
        this.d = i2;
        this.e = ka4Var;
        this.f = we8Var;
        this.h = ia4Var;
        this.g = wy7Var;
        this.i = new ye8(ka4Var, we8Var).c();
    }

    public ka4 c() {
        return this.e;
    }

    public we8 d() {
        return this.f;
    }

    public ia4 e() {
        return this.h;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.c;
    }

    public wy7 h() {
        return this.g;
    }

    public bb6(int i, int i2, ka4 ka4Var, we8 we8Var, wy7 wy7Var, String str) {
        this(i, i2, ka4Var, we8Var, rh4.a(ka4Var, we8Var), wy7Var, str);
    }
}
