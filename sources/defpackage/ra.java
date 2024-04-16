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
/* compiled from: AesGcmKeyManager.java */
/* renamed from: ra  reason: default package */
/* loaded from: classes2.dex */
public final class ra extends yf5<pa> {

    /* compiled from: AesGcmKeyManager.java */
    /* renamed from: ra$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, pa> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(pa paVar) throws GeneralSecurityException {
            return new na(paVar.O().h0());
        }
    }

    /* compiled from: AesGcmKeyManager.java */
    /* renamed from: ra$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<qa, pa> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<qa>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("AES128_GCM", ra.l(16, bVar));
            uf5.b bVar2 = uf5.b.RAW;
            hashMap.put("AES128_GCM_RAW", ra.l(16, bVar2));
            hashMap.put("AES256_GCM", ra.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", ra.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public pa a(qa qaVar) throws GeneralSecurityException {
            return pa.Q().y(h.u(a49.c(qaVar.N()))).z(ra.this.m()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public qa d(h hVar) throws InvalidProtocolBufferException {
            return qa.P(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(qa qaVar) throws GeneralSecurityException {
            zvb.a(qaVar.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ra() {
        super(pa.class, new a(l9.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5.a.C0751a<qa> l(int i, uf5.b bVar) {
        return new yf5.a.C0751a<>(qa.O().y(i).a(), bVar);
    }

    public static void o(boolean z) throws GeneralSecurityException {
        kc9.k(new ra(), z);
    }

    @Override // defpackage.yf5
    public fhb.b a() {
        return fhb.b.b;
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, pa> f() {
        return new b(qa.class);
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
    public pa h(h hVar) throws InvalidProtocolBufferException {
        return pa.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: p */
    public void j(pa paVar) throws GeneralSecurityException {
        zvb.c(paVar.P(), m());
        zvb.a(paVar.O().size());
    }
}
