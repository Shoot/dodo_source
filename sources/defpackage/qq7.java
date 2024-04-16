package defpackage;

import java.security.SecureRandom;
/* renamed from: qq7  reason: default package */
/* loaded from: classes3.dex */
public class qq7 implements v71 {
    private SecureRandom a;
    private v71 b;

    public qq7(v71 v71Var, SecureRandom secureRandom) {
        this.a = b32.c(secureRandom);
        this.b = v71Var;
    }

    public v71 a() {
        return this.b;
    }

    public SecureRandom b() {
        return this.a;
    }
}
