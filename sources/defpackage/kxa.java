package defpackage;
/* compiled from: StopLogic.java */
/* renamed from: kxa  reason: default package */
/* loaded from: classes.dex */
public class kxa extends ap6 {
    private lxa a;
    private lsa b;
    private jxa c;

    public kxa() {
        lxa lxaVar = new lxa();
        this.a = lxaVar;
        this.c = lxaVar;
    }

    @Override // defpackage.ap6
    public float a() {
        return this.c.a();
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        lxa lxaVar = this.a;
        this.c = lxaVar;
        lxaVar.c(f, f2, f3, f4, f5, f6);
    }

    public boolean c() {
        return this.c.p();
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.b == null) {
            this.b = new lsa();
        }
        lsa lsaVar = this.b;
        this.c = lsaVar;
        lsaVar.c(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
