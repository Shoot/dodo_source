package defpackage;

import java.security.SecureRandom;
/* renamed from: w72  reason: default package */
/* loaded from: classes3.dex */
public class w72 extends ff5 {
    private b82 c;

    public w72(SecureRandom secureRandom, b82 b82Var) {
        super(secureRandom, b82Var.b().bitLength() - 1);
        this.c = b82Var;
    }

    public b82 c() {
        return this.c;
    }
}
