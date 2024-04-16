package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.uf5;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: AesGcmSivKeyManager.java */
/* renamed from: va  reason: default package */
/* loaded from: classes2.dex */
public final class va extends yf5<ta> {

    /* compiled from: AesGcmSivKeyManager.java */
    /* renamed from: va$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, ta> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(ta taVar) throws GeneralSecurityException {
            return new sa(taVar.O().h0());
        }
    }

    /* compiled from: AesGcmSivKeyManager.java */
    /* renamed from: va$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ua, ta> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<ua>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("AES128_GCM_SIV", va.m(16, bVar));
            uf5.b bVar2 = uf5.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", va.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", va.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", va.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public ta a(ua uaVar) {
            return ta.Q().y(h.u(a49.c(uaVar.N()))).z(va.this.n()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ua d(h hVar) throws InvalidProtocolBufferException {
            return ua.P(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ua uaVar) throws GeneralSecurityException {
            zvb.a(uaVar.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public va() {
        super(ta.class, new a(l9.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5.a.C0751a<ua> m(int i, uf5.b bVar) {
        return new yf5.a.C0751a<>(ua.O().y(i).a(), bVar);
    }

    public static void p(boolean z) throws GeneralSecurityException {
        if (l()) {
            kc9.k(new va(), z);
        }
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, ta> f() {
        return new b(ua.class);
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
    public ta h(h hVar) throws InvalidProtocolBufferException {
        return ta.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: q */
    public void j(ta taVar) throws GeneralSecurityException {
        zvb.c(taVar.P(), n());
        zvb.a(taVar.O().size());
    }
}
