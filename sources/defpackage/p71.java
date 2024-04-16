package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
/* compiled from: Chronology.java */
/* renamed from: p71  reason: default package */
/* loaded from: classes3.dex */
public abstract class p71 implements Comparable<p71> {
    public static final w8b<p71> a = new a();
    private static final ConcurrentHashMap<String, p71> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, p71> c = new ConcurrentHashMap<>();
    private static final Method d;

    /* compiled from: Chronology.java */
    /* renamed from: p71$a */
    /* loaded from: classes3.dex */
    class a implements w8b<p71> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public p71 a(q8b q8bVar) {
            return p71.w(q8bVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        d = method;
    }

    private static void E() {
        ConcurrentHashMap<String, p71> concurrentHashMap = b;
        if (concurrentHashMap.isEmpty()) {
            L(t75.e);
            L(ldb.e);
            L(il6.e);
            L(p85.f);
            ko4 ko4Var = ko4.e;
            L(ko4Var);
            concurrentHashMap.putIfAbsent("Hijrah", ko4Var);
            c.putIfAbsent("islamic", ko4Var);
            Iterator it = ServiceLoader.load(p71.class, p71.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                p71 p71Var = (p71) it.next();
                b.putIfAbsent(p71Var.getId(), p71Var);
                String x = p71Var.x();
                if (x != null) {
                    c.putIfAbsent(x, p71Var);
                }
            }
        }
    }

    public static p71 H(String str) {
        E();
        p71 p71Var = b.get(str);
        if (p71Var != null) {
            return p71Var;
        }
        p71 p71Var2 = c.get(str);
        if (p71Var2 != null) {
            return p71Var2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p71 K(DataInput dataInput) throws IOException {
        return H(dataInput.readUTF());
    }

    private static void L(p71 p71Var) {
        b.putIfAbsent(p71Var.getId(), p71Var);
        String x = p71Var.x();
        if (x != null) {
            c.putIfAbsent(x, p71Var);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static p71 w(q8b q8bVar) {
        g95.i(q8bVar, "temporal");
        p71 p71Var = (p71) q8bVar.M(v8b.a());
        if (p71Var == null) {
            return t75.e;
        }
        return p71Var;
    }

    private Object writeReplace() {
        return new hca((byte) 11, this);
    }

    public j71<?> G(q8b q8bVar) {
        try {
            return k(q8bVar).P(gs5.T(q8bVar));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + q8bVar.getClass(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(Map<u8b, Long> map, h71 h71Var, long j) {
        Long l = map.get(h71Var);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Invalid state, field: " + h71Var + " " + l + " conflicts with " + h71Var + " " + j);
        }
        map.put(h71Var, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    public n71<?> P(b55 b55Var, vcc vccVar) {
        return o71.K0(this, b55Var, vccVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(p71 p71Var) {
        return getId().compareTo(p71Var.getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p71) && compareTo((p71) obj) == 0) {
            return true;
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract i71 i(int i, int i2, int i3);

    public abstract i71 k(q8b q8bVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends i71> D o(p8b p8bVar) {
        D d2 = (D) p8bVar;
        if (equals(d2.T())) {
            return d2;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + getId() + ", actual: " + d2.T().getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends i71> k71<D> q(p8b p8bVar) {
        k71<D> k71Var = (k71) p8bVar;
        if (equals(k71Var.o0().T())) {
            return k71Var;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + k71Var.o0().T().getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends i71> o71<D> s(p8b p8bVar) {
        o71<D> o71Var = (o71) p8bVar;
        if (equals(o71Var.o0().T())) {
            return o71Var;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + o71Var.o0().T().getId());
    }

    public String toString() {
        return getId();
    }

    public abstract ek3 u(int i);

    public abstract String x();
}
