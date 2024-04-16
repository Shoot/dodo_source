package defpackage;

import com.airbnb.lottie.n;
/* compiled from: Repeater.java */
/* renamed from: jg9  reason: default package */
/* loaded from: classes.dex */
public class jg9 implements xt1 {
    private final String a;
    private final pj b;
    private final pj c;
    private final bk d;
    private final boolean e;

    public jg9(String str, pj pjVar, pj pjVar2, bk bkVar, boolean z) {
        this.a = str;
        this.b = pjVar;
        this.c = pjVar2;
        this.d = bkVar;
        this.e = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new kg9(nVar, v70Var, this);
    }

    public pj b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public pj d() {
        return this.c;
    }

    public bk e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
