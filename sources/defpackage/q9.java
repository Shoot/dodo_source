package defpackage;

import defpackage.t9;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: AesCmacKey.java */
/* renamed from: q9  reason: default package */
/* loaded from: classes2.dex */
public final class q9 extends d46 {
    private final t9 a;
    private final o2a b;
    private final Integer c;

    private q9(t9 t9Var, o2a o2aVar, Integer num) {
        this.a = t9Var;
        this.b = o2aVar;
        this.c = num;
    }

    public static q9 d(t9 t9Var, o2a o2aVar, Integer num) throws GeneralSecurityException {
        if (o2aVar.b() == 32) {
            if (t9Var.e() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (!t9Var.e() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            return new q9(t9Var, o2aVar, num);
        }
        throw new GeneralSecurityException("Invalid key size");
    }

    @Override // defpackage.d46
    public mk0 b() {
        if (this.a.d() == t9.a.e) {
            return mk0.a(new byte[0]);
        }
        if (this.a.d() != t9.a.d && this.a.d() != t9.a.c) {
            if (this.a.d() == t9.a.b) {
                return mk0.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParameters.Variant: " + this.a.d());
        }
        return mk0.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
    }

    @Override // defpackage.d46
    /* renamed from: e */
    public t9 c() {
        return this.a;
    }
}
