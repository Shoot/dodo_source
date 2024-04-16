package defpackage;

import defpackage.uw4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: ImmutableSet.java */
/* renamed from: zw4  reason: default package */
/* loaded from: classes2.dex */
public abstract class zw4<E> extends uw4<E> implements Set<E> {
    private transient ww4<E> b;

    /* compiled from: ImmutableSet.java */
    /* renamed from: zw4$a */
    /* loaded from: classes2.dex */
    public static class a<E> extends uw4.a<E> {
        Object[] d;
        private int e;

        public a() {
            super(4);
        }

        private void h(E e) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int hashCode = e.hashCode();
            int b = cn4.b(hashCode);
            while (true) {
                int i = b & length;
                Object[] objArr = this.d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.e += hashCode;
                    super.b(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    b = i + 1;
                }
            }
        }

        public a<E> f(E e) {
            hh8.i(e);
            if (this.d != null && zw4.H(this.b) <= this.d.length) {
                h(e);
                return this;
            }
            this.d = null;
            super.b(e);
            return this;
        }

        public a<E> g(E... eArr) {
            if (this.d != null) {
                for (E e : eArr) {
                    f(e);
                }
            } else {
                super.c(eArr);
            }
            return this;
        }

        public zw4<E> i() {
            zw4<E> P;
            Object[] objArr;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (this.d == null || zw4.H(i) != this.d.length) {
                        P = zw4.P(this.b, this.a);
                        this.b = P.size();
                    } else {
                        if (zw4.n0(this.b, this.a.length)) {
                            objArr = Arrays.copyOf(this.a, this.b);
                        } else {
                            objArr = this.a;
                        }
                        Object[] objArr2 = objArr;
                        int i2 = this.e;
                        Object[] objArr3 = this.d;
                        P = new pc9<>(objArr2, i2, objArr3, objArr3.length - 1, this.b);
                    }
                    this.c = true;
                    this.d = null;
                    return P;
                }
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                return zw4.h0(obj);
            }
            return zw4.e0();
        }
    }

    /* compiled from: ImmutableSet.java */
    /* renamed from: zw4$b */
    /* loaded from: classes2.dex */
    private static class b implements Serializable {
        final Object[] a;

        b(Object[] objArr) {
            this.a = objArr;
        }

        Object readResolve() {
            return zw4.T(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        hh8.e(z, "collection too large");
        return 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zw4<E> P(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int H = H(i);
                Object[] objArr2 = new Object[H];
                int i2 = H - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object a2 = n47.a(objArr[i5], i5);
                    int hashCode = a2.hashCode();
                    int b2 = cn4.b(hashCode);
                    while (true) {
                        int i6 = b2 & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = a2;
                            objArr2[i6] = a2;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(a2)) {
                            break;
                        } else {
                            b2++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new yma(obj2);
                } else if (H(i4) < H / 2) {
                    return P(i4, objArr);
                } else {
                    if (n0(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new pc9(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return h0(obj3);
        }
        return e0();
    }

    public static <E> zw4<E> Q(Collection<? extends E> collection) {
        if ((collection instanceof zw4) && !(collection instanceof SortedSet)) {
            zw4<E> zw4Var = (zw4) collection;
            if (!zw4Var.u()) {
                return zw4Var;
            }
        }
        Object[] array = collection.toArray();
        return P(array.length, array);
    }

    public static <E> zw4<E> T(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return P(eArr.length, (Object[]) eArr.clone());
            }
            return h0(eArr[0]);
        }
        return e0();
    }

    public static <E> zw4<E> e0() {
        return pc9.i;
    }

    public static <E> zw4<E> h0(E e) {
        return new yma(e);
    }

    public static <E> zw4<E> l0(E e, E e2, E e3) {
        return P(3, e, e2, e3);
    }

    @SafeVarargs
    public static <E> zw4<E> m0(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        hh8.e(z, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return P(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n0(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    public ww4<E> G() {
        ww4<E> ww4Var = this.b;
        if (ww4Var == null) {
            ww4<E> W = W();
            this.b = W;
            return W;
        }
        return ww4Var;
    }

    ww4<E> W() {
        return ww4.x(toArray());
    }

    boolean Z() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zw4) && Z() && ((zw4) obj).Z() && hashCode() != obj.hashCode()) {
            return false;
        }
        return pfa.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return pfa.b(this);
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public abstract yqb<E> iterator();

    @Override // defpackage.uw4
    Object writeReplace() {
        return new b(toArray());
    }
}
