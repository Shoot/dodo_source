package defpackage;
/* renamed from: sr5  reason: default package */
/* loaded from: classes3.dex */
class sr5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, e23 e23Var) {
        e23Var.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(short s, e23 e23Var) {
        e23Var.update((byte) (s >>> 8));
        e23Var.update((byte) s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int i, e23 e23Var) {
        e23Var.update((byte) (i >>> 24));
        e23Var.update((byte) (i >>> 16));
        e23Var.update((byte) (i >>> 8));
        e23Var.update((byte) i);
    }
}
