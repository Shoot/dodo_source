package defpackage;

import java.security.SecureRandom;
/* renamed from: a82  reason: default package */
/* loaded from: classes3.dex */
public class a82 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final SecureRandom e;

    public a82(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public SecureRandom d() {
        return this.e;
    }

    public int e() {
        return this.c;
    }

    public a82(int i, int i2, int i3, SecureRandom secureRandom, int i4) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = i4;
        this.e = secureRandom;
    }
}
