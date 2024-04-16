package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.m0;
import com.google.crypto.tink.shaded.protobuf.t.b;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* loaded from: classes2.dex */
public final class t<T extends b<T>> {
    private static final t d = new t(true);
    private final b1<T, Object> a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.b.values().length];
            b = iArr;
            try {
                iArr[j1.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j1.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j1.b.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j1.b.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j1.b.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j1.b.i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j1.b.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[j1.b.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[j1.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[j1.b.k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[j1.b.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[j1.b.o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[j1.b.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[j1.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[j1.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[j1.b.t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[j1.b.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[j1.c.values().length];
            a = iArr2;
            try {
                iArr2[j1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[j1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[j1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[j1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[j1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[j1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[j1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[j1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[j1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes2.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        boolean j();

        j1.b l();

        j1.c m();

        boolean n();

        m0.a y(m0.a aVar, m0 m0Var);
    }

    private t() {
        this.a = b1.s(16);
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

    static int d(j1.b bVar, int i, Object obj) {
        int U = CodedOutputStream.U(i);
        if (bVar == j1.b.l) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(j1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((m0) obj);
            case 10:
                if (obj instanceof z) {
                    return CodedOutputStream.B((z) obj);
                }
                return CodedOutputStream.G((m0) obj);
            case 11:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.T((String) obj);
            case 12:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof y.c) {
                    return CodedOutputStream.l(((y.c) obj).e());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        j1.b l = bVar.l();
        int e = bVar.e();
        if (bVar.j()) {
            int i = 0;
            if (bVar.n()) {
                for (Object obj2 : (List) obj) {
                    i += e(l, obj2);
                }
                return CodedOutputStream.U(e) + i + CodedOutputStream.J(i);
            }
            for (Object obj3 : (List) obj) {
                i += d(l, e, obj3);
            }
            return i;
        }
        return d(l, e, obj);
    }

    public static <T extends b<T>> t<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.m() == j1.c.MESSAGE && !key.j() && !key.n()) {
            if (value instanceof z) {
                return CodedOutputStream.z(entry.getKey().e(), (z) value);
            }
            return CodedOutputStream.D(entry.getKey().e(), (m0) value);
        }
        return f(key, value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.m() == j1.c.MESSAGE) {
            if (key.j()) {
                for (m0 m0Var : (List) entry.getValue()) {
                    if (!m0Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof m0) {
                    if (!((m0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof z) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean q(j1.b bVar, Object obj) {
        y.a(obj);
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
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof y.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof m0) || (obj instanceof z)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof z) {
            value = ((z) value).f();
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
        } else if (key.m() == j1.c.MESSAGE) {
            Object i2 = i(key);
            if (i2 == null) {
                this.a.put(key, c(value));
                return;
            }
            this.a.put(key, key.y(((m0) i2).b(), (m0) value).a());
        } else {
            this.a.put(key, c(value));
        }
    }

    public static <T extends b<T>> t<T> v() {
        return new t<>();
    }

    private void x(T t, Object obj) {
        if (q(t.l(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.e()), t.l().a(), obj.getClass().getName()));
    }

    public void a(T t, Object obj) {
        List list;
        if (t.j()) {
            x(t, obj);
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
    public t<T> clone() {
        t<T> v = v();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<T, Object> l = this.a.l(i);
            v.w(l.getKey(), l.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            v.w(entry.getKey(), entry.getValue());
        }
        v.c = this.c;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.a.equals(((t) obj).a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.c) {
            return new z.c(this.a.j().iterator());
        }
        return this.a.j().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        if (obj instanceof z) {
            return ((z) obj).f();
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
    public boolean m() {
        return this.a.isEmpty();
    }

    public boolean n() {
        return this.b;
    }

    public boolean o() {
        for (int i = 0; i < this.a.m(); i++) {
            if (!p(this.a.l(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.o()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        if (this.c) {
            return new z.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void s() {
        if (this.b) {
            return;
        }
        this.a.r();
        this.b = true;
    }

    public void t(t<T> tVar) {
        for (int i = 0; i < tVar.a.m(); i++) {
            u(tVar.a.l(i));
        }
        for (Map.Entry<T, Object> entry : tVar.a.o()) {
            u(entry);
        }
    }

    public void w(T t, Object obj) {
        if (t.j()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    x(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            x(t, obj);
        }
        if (obj instanceof z) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private t(boolean z) {
        this(b1.s(0));
        s();
    }

    private t(b1<T, Object> b1Var) {
        this.a = b1Var;
        s();
    }
}
