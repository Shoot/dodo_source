package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
/* compiled from: KmsAeadKeyManager.java */
/* renamed from: bh5  reason: default package */
/* loaded from: classes2.dex */
public class bh5 extends yf5<zg5> {

    /* compiled from: KmsAeadKeyManager.java */
    /* renamed from: bh5$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, zg5> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(zg5 zg5Var) throws GeneralSecurityException {
            String N = zg5Var.O().N();
            return dh5.a(N).b(N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bh5() {
        super(zg5.class, new a(l9.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        kc9.k(new bh5(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, zg5> f() {
        return new b(ah5.class);
    }

    @Override // defpackage.yf5
    public we5.c g() {
        return we5.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // defpackage.yf5
    /* renamed from: l */
    public zg5 h(h hVar) throws InvalidProtocolBufferException {
        return zg5.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(zg5 zg5Var) throws GeneralSecurityException {
        zvb.c(zg5Var.P(), k());
    }

    /* compiled from: KmsAeadKeyManager.java */
    /* renamed from: bh5$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<ah5, zg5> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public zg5 a(ah5 ah5Var) throws GeneralSecurityException {
            return zg5.Q().y(ah5Var).z(bh5.this.k()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public ah5 d(h hVar) throws InvalidProtocolBufferException {
            return ah5.O(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(ah5 ah5Var) throws GeneralSecurityException {
        }
    }
}
