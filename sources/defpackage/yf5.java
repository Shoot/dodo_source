package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.m0;
import defpackage.fhb;
import defpackage.uf5;
import defpackage.we5;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: KeyTypeManager.java */
/* renamed from: yf5  reason: default package */
/* loaded from: classes2.dex */
public abstract class yf5<KeyProtoT extends m0> {
    private final Class<KeyProtoT> a;
    private final Map<Class<?>, qj8<?, KeyProtoT>> b;
    private final Class<?> c;

    /* compiled from: KeyTypeManager.java */
    /* renamed from: yf5$a */
    /* loaded from: classes2.dex */
    public static abstract class a<KeyFormatProtoT extends m0, KeyProtoT extends m0> {
        private final Class<KeyFormatProtoT> a;

        /* compiled from: KeyTypeManager.java */
        /* renamed from: yf5$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0751a<KeyFormatProtoT> {
            public KeyFormatProtoT a;
            public uf5.b b;

            public C0751a(KeyFormatProtoT keyformatprotot, uf5.b bVar) {
                this.a = keyformatprotot;
                this.b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public final Class<KeyFormatProtoT> b() {
            return this.a;
        }

        public Map<String, C0751a<KeyFormatProtoT>> c() throws GeneralSecurityException {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT d(h hVar) throws InvalidProtocolBufferException;

        public abstract void e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public yf5(Class<KeyProtoT> cls, qj8<?, KeyProtoT>... qj8VarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (qj8<?, KeyProtoT> qj8Var : qj8VarArr) {
            if (!hashMap.containsKey(qj8Var.b())) {
                hashMap.put(qj8Var.b(), qj8Var);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + qj8Var.b().getCanonicalName());
            }
        }
        if (qj8VarArr.length > 0) {
            this.c = qj8VarArr[0].b();
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public fhb.b a() {
        return fhb.b.a;
    }

    public final Class<?> b() {
        return this.c;
    }

    public final Class<KeyProtoT> c() {
        return this.a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        qj8<?, KeyProtoT> qj8Var = this.b.get(cls);
        if (qj8Var != null) {
            return (P) qj8Var.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract we5.c g();

    public abstract KeyProtoT h(h hVar) throws InvalidProtocolBufferException;

    public final Set<Class<?>> i() {
        return this.b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot) throws GeneralSecurityException;
}
