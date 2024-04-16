package defpackage;

import defpackage.oca;
import defpackage.te5;
/* compiled from: KeySerializer.java */
/* renamed from: rf5  reason: default package */
/* loaded from: classes2.dex */
public abstract class rf5<KeyT extends te5, SerializationT extends oca> {
    private final Class<KeyT> a;
    private final Class<SerializationT> b;

    /* compiled from: KeySerializer.java */
    /* renamed from: rf5$a */
    /* loaded from: classes2.dex */
    class a extends rf5<KeyT, SerializationT> {
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.c = bVar;
        }
    }

    /* compiled from: KeySerializer.java */
    /* renamed from: rf5$b */
    /* loaded from: classes2.dex */
    public interface b<KeyT extends te5, SerializationT extends oca> {
    }

    /* synthetic */ rf5(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends te5, SerializationT extends oca> rf5<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.a;
    }

    public Class<SerializationT> c() {
        return this.b;
    }

    private rf5(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
