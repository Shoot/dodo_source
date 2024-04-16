package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
/* compiled from: KmsEnvelopeAeadKeyManager.java */
/* renamed from: hh5  reason: default package */
/* loaded from: classes2.dex */
public class hh5 extends yf5<fh5> {

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    /* renamed from: hh5$a */
    /* loaded from: classes2.dex */
    class a extends qj8<l9, fh5> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public l9 a(fh5 fh5Var) throws GeneralSecurityException {
            String O = fh5Var.O().O();
            return new eh5(fh5Var.O().N(), dh5.a(O).b(O));
        }
    }

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    /* renamed from: hh5$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<gh5, fh5> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public fh5 a(gh5 gh5Var) throws GeneralSecurityException {
            return fh5.Q().y(gh5Var).z(hh5.this.k()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public gh5 d(h hVar) throws InvalidProtocolBufferException {
            return gh5.Q(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(gh5 gh5Var) throws GeneralSecurityException {
            if (!gh5Var.O().isEmpty() && gh5Var.P()) {
                return;
            }
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hh5() {
        super(fh5.class, new a(l9.class));
    }

    public static void m(boolean z) throws GeneralSecurityException {
        kc9.k(new hh5(), z);
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, fh5> f() {
        return new b(gh5.class);
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
    public fh5 h(h hVar) throws InvalidProtocolBufferException {
        return fh5.R(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(fh5 fh5Var) throws GeneralSecurityException {
        zvb.c(fh5Var.P(), k());
    }
}
