package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.fhb;
import defpackage.uf5;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AesCtrHmacAeadKeyManager.java */
/* renamed from: ca  reason: default package */
/* loaded from: classes2.dex */
public final class ca extends yf5<aa> {

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    /* renamed from: ca$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, aa> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(aa aaVar) throws GeneralSecurityException {
            return new fh3((e05) new ga().e(aaVar.P(), e05.class), (y36) new uo4().e(aaVar.Q(), y36.class), aaVar.Q().R().Q());
        }
    }

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    /* renamed from: ca$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ba, aa> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<ba>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            bn4 bn4Var = bn4.SHA256;
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", ca.m(16, 16, 32, 16, bn4Var, bVar));
            uf5.b bVar2 = uf5.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", ca.m(16, 16, 32, 16, bn4Var, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", ca.m(32, 16, 32, 32, bn4Var, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", ca.m(32, 16, 32, 32, bn4Var, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public aa a(ba baVar) throws GeneralSecurityException {
            return aa.S().y(new ga().f().a(baVar.O())).z(new uo4().f().a(baVar.P())).A(ca.this.n()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ba d(h hVar) throws InvalidProtocolBufferException {
            return ba.R(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ba baVar) throws GeneralSecurityException {
            new ga().f().e(baVar.O());
            new uo4().f().e(baVar.P());
            zvb.a(baVar.O().P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca() {
        super(aa.class, new a(l9.class));
    }

    private static ba l(int i, int i2, int i3, int i4, bn4 bn4Var) {
        return ba.Q().y(fa.R().z(ha.P().y(i2).a()).y(i).a()).z(to4.R().z(vo4.R().y(bn4Var).z(i4).a()).y(i3).a()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5.a.C0751a<ba> m(int i, int i2, int i3, int i4, bn4 bn4Var, uf5.b bVar) {
        return new yf5.a.C0751a<>(l(i, i2, i3, i4, bn4Var), bVar);
    }

    public static void p(boolean z) throws GeneralSecurityException {
        kc9.k(new ca(), z);
    }

    @Override // defpackage.yf5
    public fhb.b a() {
        return fhb.b.b;
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, aa> f() {
        return new b(ba.class);
    }

    @Override // defpackage.yf5
    public we5.c g() {
        return we5.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // defpackage.yf5
    /* renamed from: o */
    public aa h(h hVar) throws InvalidProtocolBufferException {
        return aa.T(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: q */
    public void j(aa aaVar) throws GeneralSecurityException {
        zvb.c(aaVar.R(), n());
        new ga().j(aaVar.P());
        new uo4().j(aaVar.Q());
    }
}
