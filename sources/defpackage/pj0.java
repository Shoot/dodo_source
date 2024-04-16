package defpackage;

import java.io.IOException;
/* compiled from: ByteArraySerializer.java */
@o85
/* renamed from: pj0  reason: default package */
/* loaded from: classes2.dex */
public class pj0 extends cxa<byte[]> {
    public pj0() {
        super(byte[].class);
    }

    @Override // defpackage.gc5
    /* renamed from: G */
    public boolean d(bda bdaVar, byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cxa, defpackage.gc5
    /* renamed from: H */
    public void f(byte[] bArr, ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.P(bdaVar.f().j(), bArr, 0, bArr.length);
    }

    @Override // defpackage.gc5
    /* renamed from: K */
    public void i(byte[] bArr, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c g = bobVar.g(ua5Var, bobVar.d(bArr, nc5.VALUE_EMBEDDED_OBJECT));
        ua5Var.P(bdaVar.f().j(), bArr, 0, bArr.length);
        bobVar.h(ua5Var, g);
    }
}
