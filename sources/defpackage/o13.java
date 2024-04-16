package defpackage;

import defpackage.rj8;
import defpackage.yn6;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* compiled from: DeterministicAeadWrapper.java */
/* renamed from: o13  reason: default package */
/* loaded from: classes2.dex */
public class o13 implements uj8<m13, m13> {
    private static final Logger a = Logger.getLogger(o13.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeterministicAeadWrapper.java */
    /* renamed from: o13$a */
    /* loaded from: classes2.dex */
    public static class a implements m13 {
        private final rj8<m13> a;
        private final yn6.a b;
        private final yn6.a c;

        public a(rj8<m13> rj8Var) {
            this.a = rj8Var;
            if (rj8Var.i()) {
                yn6 a = sq6.b().a();
                eo6 a2 = jo6.a(rj8Var);
                this.b = a.a(a2, "daead", "encrypt");
                this.c = a.a(a2, "daead", "decrypt");
                return;
            }
            yn6.a aVar = jo6.a;
            this.b = aVar;
            this.c = aVar;
        }

        @Override // defpackage.m13
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] a = nk0.a(this.a.e().a(), this.a.e().f().a(bArr, bArr2));
                this.b.a(this.a.e().c(), bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.b.b();
                throw e;
            }
        }

        @Override // defpackage.m13
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (rj8.c<m13> cVar : this.a.f(copyOf)) {
                    try {
                        byte[] b = cVar.f().b(copyOfRange, bArr2);
                        this.c.a(cVar.c(), copyOfRange.length);
                        return b;
                    } catch (GeneralSecurityException e) {
                        Logger logger = o13.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (rj8.c<m13> cVar2 : this.a.h()) {
                try {
                    byte[] b2 = cVar2.f().b(bArr, bArr2);
                    this.c.a(cVar2.c(), bArr.length);
                    return b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    o13() {
    }

    public static void e() throws GeneralSecurityException {
        kc9.m(new o13());
    }

    @Override // defpackage.uj8
    public Class<m13> a() {
        return m13.class;
    }

    @Override // defpackage.uj8
    public Class<m13> b() {
        return m13.class;
    }

    @Override // defpackage.uj8
    /* renamed from: f */
    public m13 c(rj8<m13> rj8Var) {
        return new a(rj8Var);
    }
}
