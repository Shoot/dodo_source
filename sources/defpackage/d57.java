package defpackage;
/* compiled from: ObjectIdWriter.java */
/* renamed from: d57  reason: default package */
/* loaded from: classes2.dex */
public final class d57 {
    public final y85 a;
    public final mca b;
    public final y47<?> c;
    public final gc5<Object> d;
    public final boolean e;

    protected d57(y85 y85Var, mca mcaVar, y47<?> y47Var, gc5<?> gc5Var, boolean z) {
        this.a = y85Var;
        this.b = mcaVar;
        this.c = y47Var;
        this.d = gc5Var;
        this.e = z;
    }

    public static d57 a(y85 y85Var, vq8 vq8Var, y47<?> y47Var, boolean z) {
        String c;
        vca vcaVar = null;
        if (vq8Var == null) {
            c = null;
        } else {
            c = vq8Var.c();
        }
        if (c != null) {
            vcaVar = new vca(c);
        }
        return new d57(y85Var, vcaVar, y47Var, null, z);
    }

    public d57 b(boolean z) {
        if (z == this.e) {
            return this;
        }
        return new d57(this.a, this.b, this.c, this.d, z);
    }

    public d57 c(gc5<?> gc5Var) {
        return new d57(this.a, this.b, this.c, gc5Var, this.e);
    }
}
