package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: BasicDeserializerFactory.java */
/* renamed from: e90  reason: default package */
/* loaded from: classes2.dex */
public abstract class e90 extends a13 implements Serializable {
    private static final Class<?> c = Object.class;
    private static final Class<?> d = String.class;
    private static final Class<?> e = CharSequence.class;
    private static final Class<?> f = Iterable.class;
    private static final Class<?> g = Map.Entry.class;
    private static final Class<?> h = Serializable.class;
    protected static final vq8 i = new vq8("@JsonUnwrapped");
    protected final b13 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public e90(b13 b13Var) {
        this.b = b13Var;
    }
}
