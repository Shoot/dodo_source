package defpackage;

import java.util.ArrayList;
/* compiled from: ParseErrorList.java */
/* renamed from: ar7  reason: default package */
/* loaded from: classes3.dex */
public class ar7 extends ArrayList<zq7> {
    private final int a;
    private final int b;

    ar7(int i, int i2) {
        super(i);
        this.a = i;
        this.b = i2;
    }

    public static ar7 w() {
        return new ar7(0, 0);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        if (size() < this.b) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.b;
    }
}
