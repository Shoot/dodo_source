package defpackage;
/* renamed from: wac  reason: default package */
/* loaded from: classes3.dex */
public class wac implements v71 {
    private ux a;
    private ux b;

    public wac(ux uxVar, ux uxVar2) {
        if (uxVar != null) {
            if (!(uxVar instanceof s9c) && !(uxVar instanceof l9c)) {
                throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
            }
            if (uxVar2 != null) {
                if (uxVar.getClass().isAssignableFrom(uxVar2.getClass())) {
                    this.a = uxVar;
                    this.b = uxVar2;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
            }
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        throw new NullPointerException("staticPublicKey cannot be null");
    }

    public ux a() {
        return this.b;
    }

    public ux b() {
        return this.a;
    }
}
