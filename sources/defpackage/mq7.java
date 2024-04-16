package defpackage;

import defpackage.oca;
/* compiled from: ParametersParser.java */
/* renamed from: mq7  reason: default package */
/* loaded from: classes2.dex */
public abstract class mq7<SerializationT extends oca> {
    private final mk0 a;
    private final Class<SerializationT> b;

    /* compiled from: ParametersParser.java */
    /* renamed from: mq7$a */
    /* loaded from: classes2.dex */
    class a extends mq7<SerializationT> {
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(mk0 mk0Var, Class cls, b bVar) {
            super(mk0Var, cls, null);
            this.c = bVar;
        }
    }

    /* compiled from: ParametersParser.java */
    /* renamed from: mq7$b */
    /* loaded from: classes2.dex */
    public interface b<SerializationT extends oca> {
    }

    /* synthetic */ mq7(mk0 mk0Var, Class cls, a aVar) {
        this(mk0Var, cls);
    }

    public static <SerializationT extends oca> mq7<SerializationT> a(b<SerializationT> bVar, mk0 mk0Var, Class<SerializationT> cls) {
        return new a(mk0Var, cls, bVar);
    }

    public final mk0 b() {
        return this.a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    private mq7(mk0 mk0Var, Class<SerializationT> cls) {
        this.a = mk0Var;
        this.b = cls;
    }
}
