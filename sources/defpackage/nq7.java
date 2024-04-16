package defpackage;

import defpackage.lq7;
import defpackage.oca;
/* compiled from: ParametersSerializer.java */
/* renamed from: nq7  reason: default package */
/* loaded from: classes2.dex */
public abstract class nq7<ParametersT extends lq7, SerializationT extends oca> {
    private final Class<ParametersT> a;
    private final Class<SerializationT> b;

    /* compiled from: ParametersSerializer.java */
    /* renamed from: nq7$a */
    /* loaded from: classes2.dex */
    class a extends nq7<ParametersT, SerializationT> {
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.c = bVar;
        }
    }

    /* compiled from: ParametersSerializer.java */
    /* renamed from: nq7$b */
    /* loaded from: classes2.dex */
    public interface b<ParametersT extends lq7, SerializationT extends oca> {
    }

    /* synthetic */ nq7(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends lq7, SerializationT extends oca> nq7<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.a;
    }

    public Class<SerializationT> c() {
        return this.b;
    }

    private nq7(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
