package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: CoercionConfigs.java */
/* renamed from: ta1  reason: default package */
/* loaded from: classes2.dex */
public class ta1 implements Serializable {
    private static final int e = cy5.values().length;
    protected ra1 a;
    protected final iq6 b;
    protected iq6[] c;
    protected Map<Class<?>, iq6> d;

    public ta1() {
        this(ra1.TryConvert, new iq6(), null, null);
    }

    protected ta1(ra1 ra1Var, iq6 iq6Var, iq6[] iq6VarArr, Map<Class<?>, iq6> map) {
        this.b = iq6Var;
        this.a = ra1Var;
        this.c = iq6VarArr;
        this.d = map;
    }
}
