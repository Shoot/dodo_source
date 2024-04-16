package defpackage;
/* compiled from: Delimiter.java */
/* renamed from: lu2  reason: default package */
/* loaded from: classes3.dex */
public class lu2 implements nu2 {
    public final g9b a;
    public final char b;
    public final boolean c;
    public final boolean d;
    public lu2 e;
    public lu2 f;
    public int g = 1;
    public int h = 1;

    public lu2(g9b g9bVar, char c, boolean z, boolean z2, lu2 lu2Var) {
        this.a = g9bVar;
        this.b = c;
        this.c = z;
        this.d = z2;
        this.e = lu2Var;
    }

    @Override // defpackage.nu2
    public boolean a() {
        return this.d;
    }

    @Override // defpackage.nu2
    public int b() {
        return this.h;
    }

    @Override // defpackage.nu2
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.nu2
    public int length() {
        return this.g;
    }
}
