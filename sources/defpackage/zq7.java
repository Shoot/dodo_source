package defpackage;
/* compiled from: ParseError.java */
/* renamed from: zq7  reason: default package */
/* loaded from: classes3.dex */
public class zq7 {
    private int a;
    private String b;
    private String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zq7(lw0 lw0Var, String str) {
        this.a = lw0Var.Q();
        this.b = lw0Var.w();
        this.c = str;
    }

    public String toString() {
        return "<" + this.b + ">: " + this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zq7(lw0 lw0Var, String str, Object... objArr) {
        this.a = lw0Var.Q();
        this.b = lw0Var.w();
        this.c = String.format(str, objArr);
    }
}
