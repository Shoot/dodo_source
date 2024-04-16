package com.google.protobuf;

import com.google.protobuf.h1;
import com.google.protobuf.k0;
import com.google.protobuf.r.b;
import com.google.protobuf.w;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class r<T extends b<T>> {
    private static final r d = new r(true);
    private final z0<T, Object> a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[h1.b.values().length];
            b = iArr;
            try {
                iArr[h1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[h1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[h1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[h1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[h1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[h1.b.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[h1.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[h1.b.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[h1.b.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[h1.b.o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[h1.b.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[h1.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[h1.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[h1.b.t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[h1.b.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[h1.c.values().length];
            a = iArr2;
            try {
                iArr2[h1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[h1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[h1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[h1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[h1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[h1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[h1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[h1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[h1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        boolean j();

        h1.b l();

        h1.c m();

        boolean n();

        k0.a r(k0.a aVar, k0 k0Var);
    }

    private r() {
        this.a = z0.s(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(CodedOutputStream codedOutputStream, h1.b bVar, int i, Object obj) throws IOException {
        if (bVar == h1.b.l) {
            codedOutputStream.w0(i, (k0) obj);
            return;
        }
        codedOutputStream.S0(i, m(bVar, false));
        B(codedOutputStream, bVar, obj);
    }

    static void B(CodedOutputStream codedOutputStream, h1.b bVar, Object obj) throws IOException {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.n0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.v0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.D0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.W0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.B0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.t0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.r0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.h0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.y0((k0) obj);
                return;
            case 10:
                codedOutputStream.F0((k0) obj);
                return;
            case 11:
                if (obj instanceof f) {
                    codedOutputStream.l0((f) obj);
                    return;
                } else {
                    codedOutputStream.R0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof f) {
                    codedOutputStream.l0((f) obj);
                    return;
                } else {
                    codedOutputStream.i0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.U0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.J0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.L0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.N0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.P0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof w.c) {
                    codedOutputStream.p0(((w.c) obj).e());
                    return;
                } else {
                    codedOutputStream.p0(((Integer) obj).intValue());
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
    public static int d(h1.b bVar, int i, Object obj) {
        int T = CodedOutputStream.T(i);
        if (bVar == h1.b.l) {
            T *= 2;
        }
        return T + e(bVar, obj);
    }

    static int e(h1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((k0) obj);
            case 10:
                if (obj instanceof x) {
                    return CodedOutputStream.B((x) obj);
                }
                return CodedOutputStream.G((k0) obj);
            case 11:
                if (obj instanceof f) {
                    return CodedOutputStream.h((f) obj);
                }
                return CodedOutputStream.S((String) obj);
            case 12:
                if (obj instanceof f) {
                    return CodedOutputStream.h((f) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.V(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.O(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.Q(((Long) obj).longValue());
            case 18:
                if (obj instanceof w.c) {
                    return CodedOutputStream.l(((w.c) obj).e());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        h1.b l = bVar.l();
        int e = bVar.e();
        if (bVar.j()) {
            int i = 0;
            if (bVar.n()) {
                for (Object obj2 : (List) obj) {
                    i += e(l, obj2);
                }
                return CodedOutputStream.T(e) + i + CodedOutputStream.V(i);
            }
            for (Object obj3 : (List) obj) {
                i += d(l, e, obj3);
            }
            return i;
        }
        return d(l, e, obj);
    }

    public static <T extends b<T>> r<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.m() == h1.c.MESSAGE && !key.j() && !key.n()) {
            if (value instanceof x) {
                return CodedOutputStream.z(entry.getKey().e(), (x) value);
            }
            return CodedOutputStream.D(entry.getKey().e(), (k0) value);
        }
        return f(key, value);
    }

    static int m(h1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.k();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.m() == h1.c.MESSAGE) {
            if (key.j()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!r(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return r(entry.getValue());
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof bi6) {
            return ((bi6) obj).isInitialized();
        }
        if (obj instanceof x) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(h1.b bVar, Object obj) {
        w.a(obj);
        switch (a.a[bVar.i().ordinal()]) {
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
                if ((obj instanceof f) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof w.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof k0) || (obj instanceof x)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof x) {
            value = ((x) value).f();
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
        } else if (key.m() == h1.c.MESSAGE) {
            Object i2 = i(key);
            if (i2 == null) {
                this.a.put(key, c(value));
                return;
            }
            this.a.put(key, key.r(((k0) i2).b(), (k0) value).a());
        } else {
            this.a.put(key, c(value));
        }
    }

    public static <T extends b<T>> r<T> x() {
        return new r<>();
    }

    private void z(T t, Object obj) {
        if (s(t.l(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.e()), t.l().i(), obj.getClass().getName()));
    }

    public void a(T t, Object obj) {
        List list;
        if (t.j()) {
            z(t, obj);
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
    public r<T> clone() {
        r<T> x = x();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<T, Object> l = this.a.l(i);
            x.y(l.getKey(), l.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            x.y(entry.getKey(), entry.getValue());
        }
        x.c = this.c;
        return x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.a.equals(((r) obj).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.c) {
            return new x.c(this.a.j().iterator());
        }
        return this.a.j().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof x) {
            return ((x) obj).f();
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

    public Iterator<Map.Entry<T, Object>> t() {
        if (this.c) {
            return new x.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void u() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<T, Object> l = this.a.l(i);
            if (l.getValue() instanceof u) {
                ((u) l.getValue()).O();
            }
        }
        this.a.r();
        this.b = true;
    }

    public void v(r<T> rVar) {
        for (int i = 0; i < rVar.a.m(); i++) {
            w(rVar.a.l(i));
        }
        for (Map.Entry<T, Object> entry : rVar.a.o()) {
            w(entry);
        }
    }

    public void y(T t, Object obj) {
        if (t.j()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    z(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            z(t, obj);
        }
        if (obj instanceof x) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private r(boolean z) {
        this(z0.s(0));
        u();
    }

    private r(z0<T, Object> z0Var) {
        this.a = z0Var;
        u();
    }
}
