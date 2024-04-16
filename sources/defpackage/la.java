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
/* compiled from: AesEaxKeyManager.java */
/* renamed from: la  reason: default package */
/* loaded from: classes2.dex */
public final class la extends yf5<ja> {

    /* compiled from: AesEaxKeyManager.java */
    /* renamed from: la$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, ja> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(ja jaVar) throws GeneralSecurityException {
            return new ia(jaVar.P().h0(), jaVar.Q().O());
        }
    }

    /* compiled from: AesEaxKeyManager.java */
    /* renamed from: la$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ka, ja> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<ka>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("AES128_EAX", la.l(16, 16, bVar));
            uf5.b bVar2 = uf5.b.RAW;
            hashMap.put("AES128_EAX_RAW", la.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", la.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", la.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public ja a(ka kaVar) throws GeneralSecurityException {
            return ja.S().y(h.u(a49.c(kaVar.O()))).z(kaVar.P()).A(la.this.m()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ka d(h hVar) throws InvalidProtocolBufferException {
            return ka.R(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ka kaVar) throws GeneralSecurityException {
            zvb.a(kaVar.O());
            if (kaVar.P().O() != 12 && kaVar.P().O() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public la() {
        super(ja.class, new a(l9.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5.a.C0751a<ka> l(int i, int i2, uf5.b bVar) {
        return new yf5.a.C0751a<>(ka.Q().y(i).z(ma.P().y(i2).a()).a(), bVar);
    }

    public static void o(boolean z) throws GeneralSecurityException {
        kc9.k(new la(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, ja> f() {
        return new b(ka.class);
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
    public ja h(h hVar) throws InvalidProtocolBufferException {
        return ja.T(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: p */
    public void j(ja jaVar) throws GeneralSecurityException {
        zvb.c(jaVar.R(), m());
        zvb.a(jaVar.P().size());
        if (jaVar.Q().O() != 12 && jaVar.Q().O() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
