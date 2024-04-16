package defpackage;
/* compiled from: BlockStartImpl.java */
/* renamed from: kd0  reason: default package */
/* loaded from: classes3.dex */
public class kd0 extends jd0 {
    private final dd0[] a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;

    public kd0(dd0... dd0VarArr) {
        this.a = dd0VarArr;
    }

    @Override // defpackage.jd0
    public jd0 a(int i) {
        this.c = i;
        return this;
    }

    @Override // defpackage.jd0
    public jd0 b(int i) {
        this.b = i;
        return this;
    }

    @Override // defpackage.jd0
    public jd0 e() {
        this.d = true;
        return this;
    }

    public dd0[] f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        return this.d;
    }
}
