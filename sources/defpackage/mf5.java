package defpackage;

import defpackage.oca;
import java.security.GeneralSecurityException;
/* compiled from: KeyParser.java */
/* renamed from: mf5  reason: default package */
/* loaded from: classes2.dex */
public abstract class mf5<SerializationT extends oca> {
    private final mk0 a;
    private final Class<SerializationT> b;

    /* compiled from: KeyParser.java */
    /* renamed from: mf5$a */
    /* loaded from: classes2.dex */
    class a extends mf5<SerializationT> {
        final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(mk0 mk0Var, Class cls, b bVar) {
            super(mk0Var, cls, null);
            this.c = bVar;
        }

        @Override // defpackage.mf5
        public te5 d(SerializationT serializationt, q2a q2aVar) throws GeneralSecurityException {
            return this.c.a(serializationt, q2aVar);
        }
    }

    /* compiled from: KeyParser.java */
    /* renamed from: mf5$b */
    /* loaded from: classes2.dex */
    public interface b<SerializationT extends oca> {
        te5 a(SerializationT serializationt, q2a q2aVar) throws GeneralSecurityException;
    }

    /* synthetic */ mf5(mk0 mk0Var, Class cls, a aVar) {
        this(mk0Var, cls);
    }

    public static <SerializationT extends oca> mf5<SerializationT> a(b<SerializationT> bVar, mk0 mk0Var, Class<SerializationT> cls) {
        return new a(mk0Var, cls, bVar);
    }

    public final mk0 b() {
        return this.a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract te5 d(SerializationT serializationt, q2a q2aVar) throws GeneralSecurityException;

    private mf5(mk0 mk0Var, Class<SerializationT> cls) {
        this.a = mk0Var;
        this.b = cls;
    }
}
