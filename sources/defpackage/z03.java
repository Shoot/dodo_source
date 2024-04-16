package defpackage;

import java.io.Serializable;
import java.util.HashMap;
/* compiled from: DeserializerCache.java */
/* renamed from: z03  reason: default package */
/* loaded from: classes2.dex */
public final class z03 implements Serializable {
    protected final zi5<y85, na5<Object>> a;
    protected final HashMap<y85, na5<Object>> b;

    public z03() {
        this(2000);
    }

    Object writeReplace() {
        this.b.clear();
        return this;
    }

    public z03(int i) {
        this.b = new HashMap<>(8);
        this.a = new zi5<>(Math.min(64, i >> 2), i);
    }
}
