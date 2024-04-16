package defpackage;

import defpackage.rj8;
import defpackage.yn6;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* compiled from: AeadWrapper.java */
/* renamed from: n9  reason: default package */
/* loaded from: classes2.dex */
public class n9 implements uj8<l9, l9> {
    private static final Logger a = Logger.getLogger(n9.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AeadWrapper.java */
    /* renamed from: n9$b */
    /* loaded from: classes2.dex */
    public static class b implements l9 {
        private final rj8<l9> a;
        private final yn6.a b;
        private final yn6.a c;

        @Override // defpackage.l9
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (rj8.c<l9> cVar : this.a.f(copyOf)) {
                    try {
                        byte[] a = cVar.f().a(copyOfRange, bArr2);
                        this.c.a(cVar.c(), copyOfRange.length);
                        return a;
                    } catch (GeneralSecurityException e) {
                        Logger logger = n9.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                    }
                }
            }
            for (rj8.c<l9> cVar2 : this.a.h()) {
                try {
                    byte[] a2 = cVar2.f().a(bArr, bArr2);
                    this.c.a(cVar2.c(), bArr.length);
                    return a2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // defpackage.l9
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] a = nk0.a(this.a.e().a(), this.a.e().f().b(bArr, bArr2));
                this.b.a(this.a.e().c(), bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.b.b();
                throw e;
            }
        }

        private b(rj8<l9> rj8Var) {
            this.a = rj8Var;
            if (rj8Var.i()) {
                yn6 a = sq6.b().a();
                eo6 a2 = jo6.a(rj8Var);
                this.b = a.a(a2, "aead", "encrypt");
                this.c = a.a(a2, "aead", "decrypt");
                return;
            }
            yn6.a aVar = jo6.a;
            this.b = aVar;
            this.c = aVar;
        }
    }

    n9() {
    }

    public static void e() throws GeneralSecurityException {
        kc9.m(new n9());
    }

    @Override // defpackage.uj8
    public Class<l9> a() {
        return l9.class;
    }

    @Override // defpackage.uj8
    public Class<l9> b() {
        return l9.class;
    }

    @Override // defpackage.uj8
    /* renamed from: f */
    public l9 c(rj8<l9> rj8Var) throws GeneralSecurityException {
        return new b(rj8Var);
    }
}
