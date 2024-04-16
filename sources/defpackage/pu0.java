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
/* compiled from: ChaCha20Poly1305KeyManager.java */
/* renamed from: pu0  reason: default package */
/* loaded from: classes2.dex */
public class pu0 extends yf5<nu0> {

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    /* renamed from: pu0$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, nu0> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(nu0 nu0Var) throws GeneralSecurityException {
            return new mu0(nu0Var.O().h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pu0() {
        super(nu0.class, new a(l9.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        kc9.k(new pu0(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.yf5
    public yf5.a<?, nu0> f() {
        return new b(ou0.class);
    }

    @Override // defpackage.yf5
    public we5.c g() {
        return we5.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // defpackage.yf5
    /* renamed from: l */
    public nu0 h(h hVar) throws InvalidProtocolBufferException {
        return nu0.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(nu0 nu0Var) throws GeneralSecurityException {
        zvb.c(nu0Var.P(), k());
        if (nu0Var.O().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    /* renamed from: pu0$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ou0, nu0> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<ou0>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new yf5.a.C0751a(ou0.M(), uf5.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new yf5.a.C0751a(ou0.M(), uf5.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public nu0 a(ou0 ou0Var) throws GeneralSecurityException {
            return nu0.Q().z(pu0.this.k()).y(h.u(a49.c(32))).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ou0 d(h hVar) throws InvalidProtocolBufferException {
            return ou0.N(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ou0 ou0Var) throws GeneralSecurityException {
        }
    }
}
