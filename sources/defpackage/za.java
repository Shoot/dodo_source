package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.uf5;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AesSivKeyManager.java */
/* renamed from: za  reason: default package */
/* loaded from: classes2.dex */
public final class za extends yf5<xa> {

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: za$a */
    /* loaded from: classes2.dex */
    class a extends qj8<m13, xa> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public m13 a(xa xaVar) throws GeneralSecurityException {
            return new wa(xaVar.O().h0());
        }
    }

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: za$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ya, xa> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<ya>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new yf5.a.C0751a(ya.O().y(64).a(), uf5.b.TINK));
            hashMap.put("AES256_SIV_RAW", new yf5.a.C0751a(ya.O().y(64).a(), uf5.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public xa a(ya yaVar) throws GeneralSecurityException {
            return xa.Q().y(h.u(a49.c(yaVar.N()))).z(za.this.k()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ya d(h hVar) throws InvalidProtocolBufferException {
            return ya.P(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ya yaVar) throws GeneralSecurityException {
            if (yaVar.N() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + yaVar.N() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public za() {
        super(xa.class, new a(m13.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        kc9.k(new za(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, xa> f() {
        return new b(ya.class);
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
    public xa h(h hVar) throws InvalidProtocolBufferException {
        return xa.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(xa xaVar) throws GeneralSecurityException {
        zvb.c(xaVar.P(), k());
        if (xaVar.O().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + xaVar.O().size() + ". Valid keys must have 64 bytes.");
    }
}
