package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements l.a {
    private jf8<b> a;
    final ArrayList<b> b;
    final ArrayList<b> c;
    final InterfaceC0045a d;
    Runnable e;
    final boolean f;
    final l g;
    private int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0045a {
        void a(int i, int i2);

        void b(b bVar);

        void c(b bVar);

        void d(int i, int i2);

        void e(int i, int i2, Object obj);

        RecyclerView.d0 f(int i);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        int a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        String a() {
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return CartQueueItemEntity.OPERATION_ADD;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0045a interfaceC0045a) {
        this(interfaceC0045a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z;
        char c;
        int i = bVar.b;
        int i2 = bVar.d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.f(i3) == null && !h(i3)) {
                if (c2 == 1) {
                    v(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    k(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.d) {
            b(bVar);
            bVar = a(2, i, i4, null);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.d.f(i) == null && !h(i)) {
                if (c == 1) {
                    v(a(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            } else {
                if (c == 0) {
                    k(a(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            b(bVar);
            bVar = a(4, i3, i4, obj);
        }
        if (c == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (n(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 != 1 && i2 != 8) {
            int z = z(bVar.b, i2);
            int i3 = bVar.b;
            int i4 = bVar.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < bVar.d; i6++) {
                int z2 = z(bVar.b + (i * i6), bVar.a);
                int i7 = bVar.a;
                if (i7 == 2 ? z2 == z : !(i7 != 4 || z2 != z + 1)) {
                    i5++;
                } else {
                    b a = a(i7, z, i5, bVar.c);
                    l(a, i3);
                    b(a);
                    if (bVar.a == 4) {
                        i3 += i5;
                    }
                    z = z2;
                    i5 = 1;
                }
            }
            Object obj = bVar.c;
            b(bVar);
            if (i5 > 0) {
                b a2 = a(bVar.a, z, i5, obj);
                l(a2, i3);
                b(a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.d.a(bVar.b, bVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.d.e(bVar.b, bVar.d, bVar.c);
                return;
            }
            this.d.d(bVar.b, bVar.d);
            return;
        }
        this.d.g(bVar.b, bVar.d);
    }

    private int z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i5 = bVar.a;
            if (i5 == 8) {
                int i6 = bVar.b;
                int i7 = bVar.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            bVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.b = i6 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        bVar.b = i6 + 1;
                        bVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i6 - 1;
                        bVar.d = i7 - 1;
                    }
                }
            } else {
                int i8 = bVar.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.d;
                    } else if (i5 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.b = i8 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i9 = bVar2.d;
                if (i9 == bVar2.b || i9 < 0) {
                    this.c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                b(bVar2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.l.a
    public b a(int i, int i2, int i3, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.a = i;
        b2.b = i2;
        b2.d = i3;
        b2.c = obj;
        return b2;
    }

    @Override // androidx.recyclerview.widget.l.a
    public void b(b bVar) {
        if (!this.f) {
            bVar.c = null;
            this.a.a(bVar);
        }
    }

    public int e(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = bVar.b;
                        if (i4 == i) {
                            i = bVar.d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (bVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = bVar.b;
                    if (i5 <= i) {
                        int i6 = bVar.d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.c(this.c.get(i));
        }
        x(this.c);
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.d.c(bVar);
                            this.d.a(bVar.b, bVar.d);
                        }
                    } else {
                        this.d.c(bVar);
                        this.d.e(bVar.b, bVar.d, bVar.c);
                    }
                } else {
                    this.d.c(bVar);
                    this.d.h(bVar.b, bVar.d);
                }
            } else {
                this.d.c(bVar);
                this.d.g(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.b);
        this.h = 0;
    }

    void l(b bVar, int i) {
        this.d.b(bVar);
        int i2 = bVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.d.e(i, bVar.d, bVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.d.h(i, bVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i) {
        return n(i, 0);
    }

    int n(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i) {
        if ((i & this.h) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        if (this.b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        if (!this.c.isEmpty() && !this.b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(4, i, i2, obj));
        this.h |= 4;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(1, i, i2, null));
        this.h |= 1;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.b.add(a(8, i, i2, null));
            this.h |= 8;
            if (this.b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(2, i, i2, null));
        this.h |= 2;
        if (this.b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.g.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            d(bVar);
                        }
                    } else {
                        g(bVar);
                    }
                } else {
                    f(bVar);
                }
            } else {
                c(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.b);
        x(this.c);
        this.h = 0;
    }

    a(InterfaceC0045a interfaceC0045a, boolean z) {
        this.a = new lf8(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = interfaceC0045a;
        this.f = z;
        this.g = new l(this);
    }
}
