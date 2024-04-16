package defpackage;
/* renamed from: vac  reason: default package */
/* loaded from: classes3.dex */
public class vac implements v71 {
    private ux a;
    private ux b;
    private ux c;

    public vac(ux uxVar, ux uxVar2, ux uxVar3) {
        if (uxVar != null) {
            boolean z = uxVar instanceof r9c;
            if (!z && !(uxVar instanceof k9c)) {
                throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
            }
            if (uxVar2 != null) {
                if (uxVar.getClass().isAssignableFrom(uxVar2.getClass())) {
                    if (uxVar3 == null) {
                        if (uxVar2 instanceof r9c) {
                            uxVar3 = ((r9c) uxVar2).b();
                        } else {
                            uxVar3 = ((k9c) uxVar2).b();
                        }
                    } else if ((uxVar3 instanceof s9c) && !z) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    } else {
                        if ((uxVar3 instanceof l9c) && !(uxVar instanceof k9c)) {
                            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                        }
                    }
                    this.a = uxVar;
                    this.b = uxVar2;
                    this.c = uxVar3;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
            }
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        throw new NullPointerException("staticPrivateKey cannot be null");
    }

    public ux a() {
        return this.b;
    }

    public ux b() {
        return this.a;
    }
}
