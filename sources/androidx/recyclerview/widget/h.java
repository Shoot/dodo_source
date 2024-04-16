package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class h implements Runnable {
    static final ThreadLocal<h> e = new ThreadLocal<>();
    static Comparator<c> f = new a();
    long b;
    long c;
    ArrayList<RecyclerView> a = new ArrayList<>();
    private ArrayList<c> d = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = cVar.d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (cVar2.d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z3 = cVar.a;
            if (z3 != cVar2.a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {
        int a;
        int b;
        int[] c;
        int d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.d;
                    int i4 = i3 * 2;
                    int[] iArr = this.c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i4 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 4];
                        this.c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.c;
                    iArr4[i4] = i;
                    iArr4[i4 + 1] = i2;
                    this.d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && pVar != null && pVar.A0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.p()) {
                        pVar.z(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    pVar.y(this.a, this.b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > pVar.m) {
                    pVar.m = i;
                    pVar.n = z;
                    recyclerView.mRecycler.K();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        c() {
        }

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    private void b() {
        c cVar;
        boolean z;
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.d;
            }
        }
        this.d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.d.size()) {
                        cVar = new c();
                        this.d.add(cVar);
                    } else {
                        cVar = this.d.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.a = z;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.d, f);
    }

    private void c(c cVar, long j) {
        long j2;
        if (cVar.a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.d0 i = i(cVar.d, cVar.e, j2);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            h(i.mNestedRecyclerView.get(), j);
        }
    }

    private void d(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            c cVar = this.d.get(i);
            if (cVar.d != null) {
                c(cVar, j);
                cVar.a();
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                ujb.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                ujb.b();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 I = wVar.I(i, false, j);
            if (I != null) {
                if (I.isBound() && !I.isInvalid()) {
                    wVar.B(I.itemView);
                } else {
                    wVar.a(I, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return I;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i, i2);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ujb.a("RV Prefetch");
            if (!this.a.isEmpty()) {
                int size = this.a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                    this.b = 0L;
                    ujb.b();
                }
            }
        } finally {
            this.b = 0L;
            ujb.b();
        }
    }
}
