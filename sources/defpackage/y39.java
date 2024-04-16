package defpackage;

import java.security.spec.KeySpec;
/* renamed from: y39  reason: default package */
/* loaded from: classes3.dex */
public class y39 implements KeySpec {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public y39(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.a;
    }

    public short[] b() {
        return this.c;
    }

    public short[][] c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }
}
