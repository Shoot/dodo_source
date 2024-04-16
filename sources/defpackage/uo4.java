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
import javax.crypto.spec.SecretKeySpec;
/* compiled from: HmacKeyManager.java */
/* renamed from: uo4  reason: default package */
/* loaded from: classes2.dex */
public final class uo4 extends yf5<so4> {

    /* compiled from: HmacKeyManager.java */
    /* renamed from: uo4$a */
    /* loaded from: classes2.dex */
    class a extends qj8<y36, so4> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public y36 a(so4 so4Var) throws GeneralSecurityException {
            bn4 P = so4Var.R().P();
            SecretKeySpec secretKeySpec = new SecretKeySpec(so4Var.Q().h0(), "HMAC");
            int Q = so4Var.R().Q();
            int i = c.a[P.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return new nj8(new mj8("HMACSHA512", secretKeySpec), Q);
                            }
                            throw new GeneralSecurityException("unknown hash");
                        }
                        return new nj8(new mj8("HMACSHA384", secretKeySpec), Q);
                    }
                    return new nj8(new mj8("HMACSHA256", secretKeySpec), Q);
                }
                return new nj8(new mj8("HMACSHA224", secretKeySpec), Q);
            }
            return new nj8(new mj8("HMACSHA1", secretKeySpec), Q);
        }
    }

    /* compiled from: HmacKeyManager.java */
    /* renamed from: uo4$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<to4, so4> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        public Map<String, yf5.a.C0751a<to4>> c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            bn4 bn4Var = bn4.SHA256;
            uf5.b bVar = uf5.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", uo4.m(32, 16, bn4Var, bVar));
            uf5.b bVar2 = uf5.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", uo4.m(32, 16, bn4Var, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", uo4.m(32, 32, bn4Var, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", uo4.m(32, 32, bn4Var, bVar2));
            bn4 bn4Var2 = bn4.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", uo4.m(64, 16, bn4Var2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", uo4.m(64, 16, bn4Var2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", uo4.m(64, 32, bn4Var2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", uo4.m(64, 32, bn4Var2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", uo4.m(64, 64, bn4Var2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", uo4.m(64, 64, bn4Var2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public so4 a(to4 to4Var) throws GeneralSecurityException {
            return so4.T().A(uo4.this.n()).z(to4Var.Q()).y(h.u(a49.c(to4Var.P()))).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public to4 d(h hVar) throws InvalidProtocolBufferException {
            return to4.S(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(to4 to4Var) throws GeneralSecurityException {
            if (to4Var.P() >= 16) {
                uo4.r(to4Var.Q());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HmacKeyManager.java */
    /* renamed from: uo4$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bn4.values().length];
            a = iArr;
            try {
                iArr[bn4.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[bn4.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[bn4.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[bn4.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[bn4.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public uo4() {
        super(so4.class, new a(y36.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5.a.C0751a<to4> m(int i, int i2, bn4 bn4Var, uf5.b bVar) {
        return new yf5.a.C0751a<>(to4.R().z(vo4.R().y(bn4Var).z(i2).a()).y(i).a(), bVar);
    }

    public static void p(boolean z) throws GeneralSecurityException {
        kc9.k(new uo4(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(vo4 vo4Var) throws GeneralSecurityException {
        if (vo4Var.Q() >= 10) {
            int i = c.a[vo4Var.P().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (vo4Var.Q() > 64) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (vo4Var.Q() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (vo4Var.Q() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (vo4Var.Q() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (vo4Var.Q() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // defpackage.yf5
    public fhb.b a() {
        return fhb.b.b;
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, so4> f() {
        return new b(to4.class);
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
    public so4 h(h hVar) throws InvalidProtocolBufferException {
        return so4.U(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: q */
    public void j(so4 so4Var) throws GeneralSecurityException {
        zvb.c(so4Var.S(), n());
        if (so4Var.Q().size() >= 16) {
            r(so4Var.R());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
