package defpackage;

import java.security.SecureRandom;
/* renamed from: va3  reason: default package */
/* loaded from: classes3.dex */
public class va3 extends ff5 {
    private la3 c;

    public va3(la3 la3Var, SecureRandom secureRandom) {
        super(secureRandom, la3Var.e().bitLength());
        this.c = la3Var;
    }

    public la3 c() {
        return this.c;
    }
}
