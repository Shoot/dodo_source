package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: SerializationRegistry.java */
/* renamed from: rca  reason: default package */
/* loaded from: classes2.dex */
public final class rca {
    private final Map<d, rf5<?, ?>> a;
    private final Map<c, mf5<?>> b;
    private final Map<d, nq7<?, ?>> c;
    private final Map<c, mq7<?>> d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SerializationRegistry.java */
    /* renamed from: rca$c */
    /* loaded from: classes2.dex */
    public static class c {
        private final Class<? extends oca> a;
        private final mk0 b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || !cVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return this.a.getSimpleName() + ", object identifier: " + this.b;
        }

        private c(Class<? extends oca> cls, mk0 mk0Var) {
            this.a = cls;
            this.b = mk0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SerializationRegistry.java */
    /* renamed from: rca$d */
    /* loaded from: classes2.dex */
    public static class d {
        private final Class<?> a;
        private final Class<? extends oca> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        private d(Class<?> cls, Class<? extends oca> cls2) {
            this.a = cls;
            this.b = cls2;
        }
    }

    public <SerializationT extends oca> te5 e(SerializationT serializationt, q2a q2aVar) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.b.containsKey(cVar)) {
            return this.b.get(cVar).d(serializationt, q2aVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    private rca(b bVar) {
        this.a = new HashMap(bVar.a);
        this.b = new HashMap(bVar.b);
        this.c = new HashMap(bVar.c);
        this.d = new HashMap(bVar.d);
    }

    /* compiled from: SerializationRegistry.java */
    /* renamed from: rca$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Map<d, rf5<?, ?>> a;
        private final Map<c, mf5<?>> b;
        private final Map<d, nq7<?, ?>> c;
        private final Map<c, mq7<?>> d;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public rca e() {
            return new rca(this);
        }

        public <SerializationT extends oca> b f(mf5<SerializationT> mf5Var) throws GeneralSecurityException {
            c cVar = new c(mf5Var.c(), mf5Var.b());
            if (this.b.containsKey(cVar)) {
                mf5<?> mf5Var2 = this.b.get(cVar);
                if (!mf5Var2.equals(mf5Var) || !mf5Var.equals(mf5Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.b.put(cVar, mf5Var);
            }
            return this;
        }

        public <KeyT extends te5, SerializationT extends oca> b g(rf5<KeyT, SerializationT> rf5Var) throws GeneralSecurityException {
            d dVar = new d(rf5Var.b(), rf5Var.c());
            if (this.a.containsKey(dVar)) {
                rf5<?, ?> rf5Var2 = this.a.get(dVar);
                if (!rf5Var2.equals(rf5Var) || !rf5Var.equals(rf5Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.a.put(dVar, rf5Var);
            }
            return this;
        }

        public <SerializationT extends oca> b h(mq7<SerializationT> mq7Var) throws GeneralSecurityException {
            c cVar = new c(mq7Var.c(), mq7Var.b());
            if (this.d.containsKey(cVar)) {
                mq7<?> mq7Var2 = this.d.get(cVar);
                if (!mq7Var2.equals(mq7Var) || !mq7Var.equals(mq7Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.d.put(cVar, mq7Var);
            }
            return this;
        }

        public <ParametersT extends lq7, SerializationT extends oca> b i(nq7<ParametersT, SerializationT> nq7Var) throws GeneralSecurityException {
            d dVar = new d(nq7Var.b(), nq7Var.c());
            if (this.c.containsKey(dVar)) {
                nq7<?, ?> nq7Var2 = this.c.get(dVar);
                if (!nq7Var2.equals(nq7Var) || !nq7Var.equals(nq7Var2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.c.put(dVar, nq7Var);
            }
            return this;
        }

        public b(rca rcaVar) {
            this.a = new HashMap(rcaVar.a);
            this.b = new HashMap(rcaVar.b);
            this.c = new HashMap(rcaVar.c);
            this.d = new HashMap(rcaVar.d);
        }
    }
}
