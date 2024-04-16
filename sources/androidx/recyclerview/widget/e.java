package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class e {
    private static final Comparator<d> a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.a - dVar2.a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {
        private final int[] a;
        private final int b;

        c(int i) {
            int[] iArr = new int[i];
            this.a = iArr;
            this.b = iArr.length / 2;
        }

        int[] a() {
            return this.a;
        }

        int b(int i) {
            return this.a[i + this.b];
        }

        void c(int i, int i2) {
            this.a[i + this.b] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final int b;
        public final int c;

        d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        int a() {
            return this.a + this.c;
        }

        int b() {
            return this.b + this.c;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0047e {
        private final List<d> a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        C0047e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            this.e = bVar.getOldListSize();
            this.f = bVar.getNewListSize();
            this.g = z;
            a();
            e();
        }

        private void a() {
            d dVar;
            if (this.a.isEmpty()) {
                dVar = null;
            } else {
                dVar = this.a.get(0);
            }
            if (dVar == null || dVar.a != 0 || dVar.b != 0) {
                this.a.add(0, new d(0, 0, 0));
            }
            this.a.add(new d(this.e, this.f, 0));
        }

        private void d(int i) {
            int i2;
            int size = this.a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                d dVar = this.a.get(i4);
                while (i3 < dVar.b) {
                    if (this.c[i3] == 0 && this.d.areItemsTheSame(i, i3)) {
                        if (this.d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.b[i] = (i3 << 4) | i2;
                        this.c[i3] = (i << 4) | i2;
                        return;
                    }
                    i3++;
                }
                i3 = dVar.b();
            }
        }

        private void e() {
            int i;
            for (d dVar : this.a) {
                for (int i2 = 0; i2 < dVar.c; i2++) {
                    int i3 = dVar.a + i2;
                    int i4 = dVar.b + i2;
                    if (this.d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.b[i3] = (i4 << 4) | i;
                    this.c[i4] = (i3 << 4) | i;
                }
            }
            if (this.g) {
                f();
            }
        }

        private void f() {
            int i = 0;
            for (d dVar : this.a) {
                while (i < dVar.a) {
                    if (this.b[i] == 0) {
                        d(i);
                    }
                    i++;
                }
                i = dVar.a();
            }
        }

        private static f g(Collection<f> collection, int i, boolean z) {
            f fVar;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = it.next();
                    if (fVar.a == i && fVar.c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                f next = it.next();
                if (z) {
                    next.b--;
                } else {
                    next.b++;
                }
            }
            return fVar;
        }

        public void b(@NonNull gr5 gr5Var) {
            w90 w90Var;
            int i;
            if (gr5Var instanceof w90) {
                w90Var = (w90) gr5Var;
            } else {
                w90Var = new w90(gr5Var);
            }
            int i2 = this.e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.e;
            int i4 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d dVar = this.a.get(size);
                int a = dVar.a();
                int b = dVar.b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        f g = g(arrayDeque, i6, false);
                        if (g != null) {
                            int i7 = (i2 - g.b) - 1;
                            w90Var.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                w90Var.onChanged(i7, 1, this.d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new f(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        w90Var.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        f g2 = g(arrayDeque, i9, true);
                        if (g2 == null) {
                            arrayDeque.add(new f(i4, i2 - i3, false));
                        } else {
                            w90Var.onMoved((i2 - g2.b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                w90Var.onChanged(i3, 1, this.d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        w90Var.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.a;
                int i11 = dVar.b;
                for (i = 0; i < dVar.c; i++) {
                    if ((this.b[i10] & 15) == 2) {
                        w90Var.onChanged(i10, 1, this.d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.a;
                i4 = dVar.b;
            }
            w90Var.a();
        }

        public void c(@NonNull RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class f {
        int a;
        int b;
        boolean c;

        f(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {
        int a;
        int b;
        int c;
        int d;

        public g() {
        }

        int a() {
            return this.d - this.c;
        }

        int b() {
            return this.b - this.a;
        }

        public g(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        h() {
        }

        int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }

        boolean b() {
            if (this.d - this.b != this.c - this.a) {
                return true;
            }
            return false;
        }

        boolean c() {
            if (this.d - this.b > this.c - this.a) {
                return true;
            }
            return false;
        }

        @NonNull
        d d() {
            if (b()) {
                if (this.e) {
                    return new d(this.a, this.b, a());
                }
                if (c()) {
                    return new d(this.a, this.b + 1, a());
                }
                return new d(this.a + 1, this.b, a());
            }
            int i = this.a;
            return new d(i, this.b, this.c - i);
        }
    }

    private static h a(g gVar, b bVar, c cVar, c cVar2, int i) {
        boolean z;
        int b2;
        int i2;
        int i3;
        int i4;
        if ((gVar.b() - gVar.a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int b3 = gVar.b() - gVar.a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 != i5 && (i6 == i || cVar2.b(i6 + 1) >= cVar2.b(i6 - 1))) {
                b2 = cVar2.b(i6 - 1);
                i2 = b2 - 1;
            } else {
                b2 = cVar2.b(i6 + 1);
                i2 = b2;
            }
            int i7 = gVar.d - ((gVar.b - i2) - i6);
            if (i != 0 && i2 == b2) {
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            while (i2 > gVar.a && i7 > gVar.c && bVar.areItemsTheSame(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            cVar2.c(i6, i2);
            if (z && (i4 = b3 - i6) >= i5 && i4 <= i && cVar.b(i4) >= i2) {
                h hVar = new h();
                hVar.a = i2;
                hVar.b = i7;
                hVar.c = b2;
                hVar.d = i3;
                hVar.e = true;
                return hVar;
            }
        }
        return null;
    }

    @NonNull
    public static C0047e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static C0047e c(@NonNull b bVar, boolean z) {
        g gVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i);
        c cVar2 = new c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar2 = (g) arrayList2.remove(arrayList2.size() - 1);
            h e = e(gVar2, bVar, cVar, cVar2);
            if (e != null) {
                if (e.a() > 0) {
                    arrayList.add(e.d());
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                } else {
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.a = gVar2.a;
                gVar.c = gVar2.c;
                gVar.b = e.a;
                gVar.d = e.b;
                arrayList2.add(gVar);
                gVar2.b = gVar2.b;
                gVar2.d = gVar2.d;
                gVar2.a = e.c;
                gVar2.c = e.d;
                arrayList2.add(gVar2);
            } else {
                arrayList3.add(gVar2);
            }
        }
        Collections.sort(arrayList, a);
        return new C0047e(bVar, arrayList, cVar.a(), cVar2.a(), z);
    }

    private static h d(g gVar, b bVar, c cVar, c cVar2, int i) {
        int b2;
        int i2;
        int i3;
        boolean z = true;
        if (Math.abs(gVar.b() - gVar.a()) % 2 != 1) {
            z = false;
        }
        int b3 = gVar.b() - gVar.a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || cVar.b(i5 + 1) <= cVar.b(i5 - 1))) {
                b2 = cVar.b(i5 - 1);
                i2 = b2 + 1;
            } else {
                b2 = cVar.b(i5 + 1);
                i2 = b2;
            }
            int i6 = (gVar.c + (i2 - gVar.a)) - i5;
            int i7 = (i != 0 && i2 == b2) ? i6 - 1 : i6;
            while (i2 < gVar.b && i6 < gVar.d && bVar.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            cVar.c(i5, i2);
            if (z && (i3 = b3 - i5) >= i4 + 1 && i3 <= i - 1 && cVar2.b(i3) <= i2) {
                h hVar = new h();
                hVar.a = b2;
                hVar.b = i7;
                hVar.c = i2;
                hVar.d = i6;
                hVar.e = false;
                return hVar;
            }
        }
        return null;
    }

    private static h e(g gVar, b bVar, c cVar, c cVar2) {
        if (gVar.b() >= 1 && gVar.a() >= 1) {
            int b2 = ((gVar.b() + gVar.a()) + 1) / 2;
            cVar.c(1, gVar.a);
            cVar2.c(1, gVar.b);
            for (int i = 0; i < b2; i++) {
                h d2 = d(gVar, bVar, cVar, cVar2, i);
                if (d2 != null) {
                    return d2;
                }
                h a2 = a(gVar, bVar, cVar, cVar2, i);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
