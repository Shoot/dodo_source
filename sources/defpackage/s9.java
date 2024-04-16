package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.uf5;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AesCmacKeyManager.java */
/* renamed from: s9  reason: default package */
/* loaded from: classes2.dex */
public final class s9 extends yf5<p9> {

    /* compiled from: AesCmacKeyManager.java */
    /* renamed from: s9$a */
    /* loaded from: classes2.dex */
    class a extends qj8<y36, p9> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public y36 a(p9 p9Var) throws GeneralSecurityException {
            return new nj8(new lj8(p9Var.P().h0()), p9Var.Q().O());
        }
    }

    /* compiled from: AesCmacKeyManager.java */
    /* renamed from: s9$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<r9, p9> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<r9>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("AES_CMAC", new yf5.a.C0751a(r9.Q().y(32).z(u9.P().y(16).a()).a(), bVar));
            hashMap.put("AES256_CMAC", new yf5.a.C0751a(r9.Q().y(32).z(u9.P().y(16).a()).a(), bVar));
            hashMap.put("AES256_CMAC_RAW", new yf5.a.C0751a(r9.Q().y(32).z(u9.P().y(16).a()).a(), uf5.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public p9 a(r9 r9Var) throws GeneralSecurityException {
            return p9.S().A(0).y(h.u(a49.c(r9Var.O()))).z(r9Var.P()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public r9 d(h hVar) throws InvalidProtocolBufferException {
            return r9.R(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(r9 r9Var) throws GeneralSecurityException {
            s9.q(r9Var.P());
            s9.r(r9Var.O());
        }
    }

    s9() {
        super(p9.class, new a(y36.class));
    }

    public static void o(boolean z) throws GeneralSecurityException {
        kc9.k(new s9(), z);
        z9.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(u9 u9Var) throws GeneralSecurityException {
        if (u9Var.O() >= 10) {
            if (u9Var.O() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i) throws GeneralSecurityException {
        if (i == 32) {
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, p9> f() {
        return new b(r9.class);
    }

    @Override // defpackage.yf5
    public we5.c g() {
        return we5.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public p9 h(h hVar) throws InvalidProtocolBufferException {
        return p9.T(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: p */
    public void j(p9 p9Var) throws GeneralSecurityException {
        zvb.c(p9Var.R(), m());
        r(p9Var.P().size());
        q(p9Var.Q());
    }
}
