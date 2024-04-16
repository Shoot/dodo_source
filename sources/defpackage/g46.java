package defpackage;

import defpackage.rj8;
import defpackage.yn6;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: MacWrapper.java */
/* renamed from: g46  reason: default package */
/* loaded from: classes2.dex */
class g46 implements uj8<y36, y36> {
    private static final Logger a = Logger.getLogger(g46.class.getName());
    private static final byte[] b = {0};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MacWrapper.java */
    /* renamed from: g46$b */
    /* loaded from: classes2.dex */
    public static class b implements y36 {
        private final rj8<y36> a;
        private final yn6.a b;
        private final yn6.a c;

        @Override // defpackage.y36
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3;
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (rj8.c<y36> cVar : this.a.f(copyOf)) {
                    if (cVar.d().equals(mm7.LEGACY)) {
                        bArr3 = nk0.a(bArr2, g46.b);
                    } else {
                        bArr3 = bArr2;
                    }
                    try {
                        cVar.f().a(copyOfRange, bArr3);
                        this.c.a(cVar.c(), bArr3.length);
                        return;
                    } catch (GeneralSecurityException e) {
                        Logger logger = g46.a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e);
                    }
                }
                for (rj8.c<y36> cVar2 : this.a.h()) {
                    try {
                        cVar2.f().a(bArr, bArr2);
                        this.c.a(cVar2.c(), bArr2.length);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.c.b();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.c.b();
            throw new GeneralSecurityException("tag too short");
        }

        @Override // defpackage.y36
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            if (this.a.e().d().equals(mm7.LEGACY)) {
                bArr = nk0.a(bArr, g46.b);
            }
            try {
                byte[] a = nk0.a(this.a.e().a(), this.a.e().f().b(bArr));
                this.b.a(this.a.e().c(), bArr.length);
                return a;
            } catch (GeneralSecurityException e) {
                this.b.b();
                throw e;
            }
        }

        private b(rj8<y36> rj8Var) {
            this.a = rj8Var;
            if (rj8Var.i()) {
                yn6 a = sq6.b().a();
                eo6 a2 = jo6.a(rj8Var);
                this.b = a.a(a2, "mac", "compute");
                this.c = a.a(a2, "mac", "verify");
                return;
            }
            yn6.a aVar = jo6.a;
            this.b = aVar;
            this.c = aVar;
        }
    }

    g46() {
    }

    public static void f() throws GeneralSecurityException {
        kc9.m(new g46());
    }

    private void g(rj8<y36> rj8Var) throws GeneralSecurityException {
        for (List<rj8.c<y36>> list : rj8Var.c()) {
            for (rj8.c<y36> cVar : list) {
                if (cVar.b() instanceof d46) {
                    d46 d46Var = (d46) cVar.b();
                    mk0 a2 = mk0.a(cVar.a());
                    if (!a2.equals(d46Var.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + d46Var.a() + " has wrong output prefix (" + d46Var.b() + ") instead of (" + a2 + ")");
                    }
                }
            }
        }
    }

    @Override // defpackage.uj8
    public Class<y36> a() {
        return y36.class;
    }

    @Override // defpackage.uj8
    public Class<y36> b() {
        return y36.class;
    }

    @Override // defpackage.uj8
    /* renamed from: h */
    public y36 c(rj8<y36> rj8Var) throws GeneralSecurityException {
        g(rj8Var);
        return new b(rj8Var);
    }
}
