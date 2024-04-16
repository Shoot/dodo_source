package defpackage;
/* renamed from: m2c  reason: default package */
/* loaded from: classes3.dex */
public class m2c implements ig8 {
    volatile int a = 4;
    protected int b = -1;
    protected jb3[] c = null;
    protected jb3[] d = null;
    protected jb3 e = null;
    protected int f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int i = this.a;
        if (i > 0) {
            int i2 = i - 1;
            this.a = i2;
            return i2;
        }
        return i;
    }

    public int b() {
        return this.b;
    }

    public jb3[] c() {
        return this.c;
    }

    public jb3[] d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.a;
    }

    public jb3 f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public boolean h() {
        if (this.a <= 0) {
            return true;
        }
        return false;
    }

    public void i(int i) {
        this.b = i;
    }

    public void j(jb3[] jb3VarArr) {
        this.c = jb3VarArr;
    }

    public void k(jb3[] jb3VarArr) {
        this.d = jb3VarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i) {
        this.a = i;
    }

    public void m(jb3 jb3Var) {
        this.e = jb3Var;
    }

    public void n(int i) {
        this.f = i;
    }
}
