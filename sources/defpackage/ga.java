package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.we5;
import defpackage.yf5;
import java.security.GeneralSecurityException;
/* compiled from: AesCtrKeyManager.java */
/* renamed from: ga  reason: default package */
/* loaded from: classes2.dex */
public class ga extends yf5<ea> {

    /* compiled from: AesCtrKeyManager.java */
    /* renamed from: ga$a */
    /* loaded from: classes2.dex */
    class a extends qj8<e05, ea> {
        a(Class cls) {
            super(cls);
        }

        @Override // defpackage.qj8
        /* renamed from: c */
        public e05 a(ea eaVar) throws GeneralSecurityException {
            return new da(eaVar.Q().h0(), eaVar.R().O());
        }
    }

    /* compiled from: AesCtrKeyManager.java */
    /* renamed from: ga$b */
    /* loaded from: classes2.dex */
    class b extends yf5.a<fa, ea> {
        b(Class cls) {
            super(cls);
        }

        @Override // defpackage.yf5.a
        /* renamed from: f */
        public ea a(fa faVar) throws GeneralSecurityException {
            return ea.T().z(faVar.Q()).y(h.u(a49.c(faVar.P()))).A(ga.this.l()).a();
        }

        @Override // defpackage.yf5.a
        /* renamed from: g */
        public fa d(h hVar) throws InvalidProtocolBufferException {
            return fa.S(hVar, o.b());
        }

        @Override // defpackage.yf5.a
        /* renamed from: h */
        public void e(fa faVar) throws GeneralSecurityException {
            zvb.a(faVar.P());
            ga.this.o(faVar.Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga() {
        super(ea.class, new a(e05.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(ha haVar) throws GeneralSecurityException {
        if (haVar.O() >= 12 && haVar.O() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // defpackage.yf5
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.yf5
    public yf5.a<?, ea> f() {
        return new b(fa.class);
    }

    @Override // defpackage.yf5
    public we5.c g() {
        return we5.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // defpackage.yf5
    /* renamed from: m */
    public ea h(h hVar) throws InvalidProtocolBufferException {
        return ea.U(hVar, o.b());
    }

    @Override // defpackage.yf5
    /* renamed from: n */
    public void j(ea eaVar) throws GeneralSecurityException {
        zvb.c(eaVar.S(), l());
        zvb.a(eaVar.Q().size());
        o(eaVar.R());
    }
}
