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
/* compiled from: XChaCha20Poly1305KeyManager.java */
/* renamed from: sac  reason: default package */
/* loaded from: classes2.dex */
public class sac extends yf5<qac> {

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    /* renamed from: sac$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, qac> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(qac qacVar) throws GeneralSecurityException {
            return new pac(qacVar.O().h0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sac() {
        super(qac.class, new a(l9.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        kc9.k(new sac(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.yf5
    public yf5.a<?, qac> f() {
        return new b(rac.class);
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
    public qac h(h hVar) throws InvalidProtocolBufferException {
        return qac.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(qac qacVar) throws GeneralSecurityException {
        zvb.c(qacVar.P(), k());
        if (qacVar.O().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    /* renamed from: sac$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<rac, qac> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<rac>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new yf5.a.C0751a(rac.M(), uf5.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new yf5.a.C0751a(rac.M(), uf5.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public qac a(rac racVar) throws GeneralSecurityException {
            return qac.Q().z(sac.this.k()).y(h.u(a49.c(32))).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public rac d(h hVar) throws InvalidProtocolBufferException {
            return rac.N(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(rac racVar) throws GeneralSecurityException {
        }
    }
}
