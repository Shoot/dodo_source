package defpackage;
/* compiled from: Bracket.java */
/* renamed from: of0  reason: default package */
/* loaded from: classes3.dex */
public class of0 {
    public final g9b a;
    public final int b;
    public final boolean c;
    public final of0 d;
    public final lu2 e;
    public boolean f = true;
    public boolean g = false;

    private of0(g9b g9bVar, int i, of0 of0Var, lu2 lu2Var, boolean z) {
        this.a = g9bVar;
        this.b = i;
        this.c = z;
        this.d = of0Var;
        this.e = lu2Var;
    }

    public static of0 a(g9b g9bVar, int i, of0 of0Var, lu2 lu2Var) {
        return new of0(g9bVar, i, of0Var, lu2Var, true);
    }

    public static of0 b(g9b g9bVar, int i, of0 of0Var, lu2 lu2Var) {
        return new of0(g9bVar, i, of0Var, lu2Var, false);
    }
}
