package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.n;
/* compiled from: GradientFill.java */
/* renamed from: xh4  reason: default package */
/* loaded from: classes.dex */
public class xh4 implements xt1 {
    private final di4 a;
    private final Path.FillType b;
    private final qj c;
    private final rj d;
    private final uj e;
    private final uj f;
    private final String g;
    private final pj h;
    private final pj i;
    private final boolean j;

    public xh4(String str, di4 di4Var, Path.FillType fillType, qj qjVar, rj rjVar, uj ujVar, uj ujVar2, pj pjVar, pj pjVar2, boolean z) {
        this.a = di4Var;
        this.b = fillType;
        this.c = qjVar;
        this.d = rjVar;
        this.e = ujVar;
        this.f = ujVar2;
        this.g = str;
        this.h = pjVar;
        this.i = pjVar2;
        this.j = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new yh4(nVar, v70Var, this);
    }

    public uj b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public qj d() {
        return this.c;
    }

    public di4 e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public rj g() {
        return this.d;
    }

    public uj h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
