package defpackage;
/* renamed from: xi5  reason: default package */
/* loaded from: classes3.dex */
class xi5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(pi5 pi5Var, byte[] bArr, int i, byte[] bArr2) {
        boolean z;
        e23 a = l23.a(pi5Var.b());
        byte[] b = rn1.f().d(bArr).i(i).h(-32640).g(0, 22).b();
        a.update(b, 0, b.length);
        e23 a2 = l23.a(pi5Var.b());
        byte[] b2 = rn1.f().d(bArr).i(i).g(0, a2.getDigestSize() + 23).b();
        q3a q3aVar = new q3a(bArr, bArr2, l23.a(pi5Var.b()));
        q3aVar.d(i);
        q3aVar.c(0);
        int d = pi5Var.d();
        int c = pi5Var.c();
        int g = (1 << pi5Var.g()) - 1;
        for (int i2 = 0; i2 < d; i2++) {
            if (i2 < d - 1) {
                z = true;
            } else {
                z = false;
            }
            q3aVar.a(b2, z, 23);
            mo7.A((short) i2, b2, 20);
            for (int i3 = 0; i3 < g; i3++) {
                b2[22] = (byte) i3;
                a2.update(b2, 0, b2.length);
                a2.doFinal(b2, 23);
            }
            a.update(b2, 23, c);
        }
        byte[] bArr3 = new byte[a.getDigestSize()];
        a.doFinal(bArr3, 0);
        return bArr3;
    }
}
