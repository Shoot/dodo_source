package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HuffmanTreeGroup.java */
/* renamed from: ar4  reason: default package */
/* loaded from: classes3.dex */
public final class ar4 {
    private int a;
    int[] b;
    int[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ar4 ar4Var, ob0 ob0Var) {
        int length = ar4Var.c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            ar4Var.c[i2] = i;
            po2.n(ar4Var.a, ar4Var.b, i, ob0Var);
            i += 1080;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ar4 ar4Var, int i, int i2) {
        ar4Var.a = i;
        ar4Var.b = new int[i2 * 1080];
        ar4Var.c = new int[i2];
    }
}
