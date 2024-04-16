package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i1;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s.b;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class s<T extends b<T>> {
    private static final s d = new s(true);
    private final a1<T, Object> a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[i1.b.values().length];
            b = iArr;
            try {
                iArr[i1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[i1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[i1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[i1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[i1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[i1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[i1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[i1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[i1.b.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[i1.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[i1.b.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[i1.b.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[i1.b.o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[i1.b.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[i1.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[i1.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[i1.b.t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[i1.b.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[i1.c.values().length];
            a = iArr2;
            try {
                iArr2[i1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[i1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[i1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[i1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[i1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[i1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[i1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[i1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[i1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        l0.a S(l0.a aVar, l0 l0Var);

        int e();

        boolean j();

        i1.b l();

        i1.c m();

        boolean n();
    }

    private s() {
        this.a = a1.s(16);
    }

    static void A(CodedOutputStream codedOutputStream, i1.b bVar, Object obj) throws IOException {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.r0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.z0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.H0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.a1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.F0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.x0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.v0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.C0((l0) obj);
                return;
            case 10:
                codedOutputStream.J0((l0) obj);
                return;
            case 11:
                if (obj instanceof g) {
                    codedOutputStream.p0((g) obj);
                    return;
                } else {
                    codedOutputStream.V0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof g) {
                    codedOutputStream.p0((g) obj);
                    return;
                } else {
                    codedOutputStream.m0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.Y0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.N0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.P0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.R0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.T0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof x.c) {
                    codedOutputStream.t0(((x.c) obj).e());
                    return;
                } else {
                    codedOutputStream.t0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(i1.b bVar, int i, Object obj) {
        int V = CodedOutputStream.V(i);
        if (bVar == i1.b.l) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(i1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((l0) obj);
            case 10:
                if (obj instanceof y) {
                    return CodedOutputStream.B((y) obj);
                }
                return CodedOutputStream.G((l0) obj);
            case 11:
                if (obj instanceof g) {
                    return CodedOutputStream.h((g) obj);
                }
                return CodedOutputStream.U((String) obj);
            case 12:
                if (obj instanceof g) {
                    return CodedOutputStream.h((g) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.S(((Long) obj).longValue());
            case 18:
                if (obj instanceof x.c) {
                    return CodedOutputStream.l(((x.c) obj).e());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        i1.b l = bVar.l();
        int e = bVar.e();
        if (bVar.j()) {
            int i = 0;
            if (bVar.n()) {
                for (Object obj2 : (List) obj) {
                    i += e(l, obj2);
                }
                return CodedOutputStream.V(e) + i + CodedOutputStream.K(i);
            }
            for (Object obj3 : (List) obj) {
                i += d(l, e, obj3);
            }
            return i;
        }
        return d(l, e, obj);
    }

    public static <T extends b<T>> s<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.m() == i1.c.MESSAGE && !key.j() && !key.n()) {
            if (value instanceof y) {
                return CodedOutputStream.z(entry.getKey().e(), (y) value);
            }
            return CodedOutputStream.D(entry.getKey().e(), (l0) value);
        }
        return f(key, value);
    }

    static int m(i1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.i();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.m() == i1.c.MESSAGE) {
            if (key.j()) {
                for (l0 l0Var : (List) entry.getValue()) {
                    if (!l0Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof l0) {
                    if (!((l0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof y) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean r(i1.b bVar, Object obj) {
        x.a(obj);
        switch (a.a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof g) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof x.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof l0) || (obj instanceof y)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof y) {
            value = ((y) value).f();
        }
        if (key.j()) {
            Object i = i(key);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i).add(c(obj));
            }
            this.a.put(key, i);
        } else if (key.m() == i1.c.MESSAGE) {
            Object i2 = i(key);
            if (i2 == null) {
                this.a.put(key, c(value));
                return;
            }
            this.a.put(key, key.S(((l0) i2).b(), (l0) value).a());
        } else {
            this.a.put(key, c(value));
        }
    }

    public static <T extends b<T>> s<T> w() {
        return new s<>();
    }

    private void y(i1.b bVar, Object obj) {
        if (r(bVar, obj)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(CodedOutputStream codedOutputStream, i1.b bVar, int i, Object obj) throws IOException {
        if (bVar == i1.b.l) {
            codedOutputStream.A0(i, (l0) obj);
            return;
        }
        codedOutputStream.W0(i, m(bVar, false));
        A(codedOutputStream, bVar, obj);
    }

    public void a(T t, Object obj) {
        List list;
        if (t.j()) {
            y(t.l(), obj);
            Object i = i(t);
            if (i == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public s<T> clone() {
        s<T> w = w();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<T, Object> l = this.a.l(i);
            w.x(l.getKey(), l.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            w.x(entry.getKey(), entry.getValue());
        }
        w.c = this.c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.a.equals(((s) obj).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.c) {
            return new y.c(this.a.j().iterator());
        }
        return this.a.j().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof y) {
            return ((y) obj).f();
        }
        return obj;
    }

    public int j() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            i += k(this.a.l(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            i += k(entry);
        }
        return i;
    }

    public int l() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            Map.Entry<T, Object> l = this.a.l(i2);
            i += f(l.getKey(), l.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            i += f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i = 0; i < this.a.m(); i++) {
            if (!q(this.a.l(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (this.c) {
            return new y.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void t() {
        if (this.b) {
            return;
        }
        this.a.r();
        this.b = true;
    }

    public void u(s<T> sVar) {
        for (int i = 0; i < sVar.a.m(); i++) {
            v(sVar.a.l(i));
        }
        for (Map.Entry<T, Object> entry : sVar.a.o()) {
            v(entry);
        }
    }

    public void x(T t, Object obj) {
        if (t.j()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    y(t.l(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            y(t.l(), obj);
        }
        if (obj instanceof y) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private s(boolean z) {
        this(a1.s(0));
        t();
    }

    private s(a1<T, Object> a1Var) {
        this.a = a1Var;
        t();
    }
}
