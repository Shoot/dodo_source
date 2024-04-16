package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import java.util.List;
import java.util.Queue;
/* compiled from: ListPreloader.java */
/* renamed from: fr5  reason: default package */
/* loaded from: classes.dex */
public class fr5<T> implements AbsListView.OnScrollListener {
    private final int a;
    private final d b;
    private final h c;
    private final a<T> d;
    private final b<T> e;
    private int f;
    private int g;
    private int i;
    private int h = -1;
    private boolean j = true;

    /* compiled from: ListPreloader.java */
    /* renamed from: fr5$a */
    /* loaded from: classes.dex */
    public interface a<U> {
        @NonNull
        List<U> a(int i);

        g<?> b(@NonNull U u);
    }

    /* compiled from: ListPreloader.java */
    /* renamed from: fr5$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        int[] a(@NonNull T t, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPreloader.java */
    /* renamed from: fr5$d */
    /* loaded from: classes.dex */
    public static final class d {
        final Queue<c> a;

        d(int i) {
            this.a = vub.g(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.offer(new c());
            }
        }

        public c a(int i, int i2) {
            c poll = this.a.poll();
            this.a.offer(poll);
            poll.b = i;
            poll.a = i2;
            return poll;
        }
    }

    public fr5(@NonNull h hVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i) {
        this.c = hVar;
        this.d = aVar;
        this.e = bVar;
        this.a = i;
        this.b = new d(i + 1);
    }

    private void a() {
        for (int i = 0; i < this.b.a.size(); i++) {
            this.c.m(this.b.a(0, 0));
        }
    }

    private void b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f, i);
            min = i2;
        } else {
            min = Math.min(this.g, i);
            i3 = i2;
        }
        int min2 = Math.min(this.i, min);
        int min3 = Math.min(this.i, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                d(this.d.a(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                d(this.d.a(i5), i5, false);
            }
        }
        this.g = min3;
        this.f = min2;
    }

    private void c(int i, boolean z) {
        int i2;
        if (this.j != z) {
            this.j = z;
            a();
        }
        if (z) {
            i2 = this.a;
        } else {
            i2 = -this.a;
        }
        b(i, i2 + i);
    }

    private void d(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            e(list.get(i3), i, i3);
        }
    }

    private void e(T t, int i, int i2) {
        int[] a2;
        g<?> b2;
        if (t == null || (a2 = this.e.a(t, i, i2)) == null || (b2 = this.d.b(t)) == null) {
            return;
        }
        b2.D0(this.b.a(a2[0], a2[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.i == 0 && i3 == 0) {
            return;
        }
        this.i = i3;
        int i4 = this.h;
        if (i > i4) {
            c(i2 + i, true);
        } else if (i < i4) {
            c(i, false);
        }
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPreloader.java */
    /* renamed from: fr5$c */
    /* loaded from: classes.dex */
    public static final class c implements n6b<Object> {
        int a;
        int b;
        private ii9 c;

        c() {
        }

        @Override // defpackage.n6b
        public void c(@NonNull kna knaVar) {
            knaVar.d(this.b, this.a);
        }

        @Override // defpackage.n6b
        public ii9 h() {
            return this.c;
        }

        @Override // defpackage.n6b
        public void j(ii9 ii9Var) {
            this.c = ii9Var;
        }

        @Override // defpackage.mp5
        public void g() {
        }

        @Override // defpackage.mp5
        public void onDestroy() {
        }

        @Override // defpackage.mp5
        public void onStart() {
        }

        @Override // defpackage.n6b
        public void a(Drawable drawable) {
        }

        @Override // defpackage.n6b
        public void b(Drawable drawable) {
        }

        @Override // defpackage.n6b
        public void i(Drawable drawable) {
        }

        @Override // defpackage.n6b
        public void l(@NonNull kna knaVar) {
        }

        @Override // defpackage.n6b
        public void d(@NonNull Object obj, dlb<? super Object> dlbVar) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
