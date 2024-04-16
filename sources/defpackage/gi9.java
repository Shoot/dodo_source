package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import defpackage.s58;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: Request.java */
/* renamed from: gi9  reason: default package */
/* loaded from: classes3.dex */
public final class gi9 {
    private static final long u = TimeUnit.SECONDS.toNanos(5);
    int a;
    long b;
    int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List<skb> g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final s58.f t;

    /* compiled from: Request.java */
    /* renamed from: gi9$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private Uri a;
        private int b;
        private String c;
        private int d;
        private int e;
        private boolean f;
        private int g;
        private boolean h;
        private boolean i;
        private float j;
        private float k;
        private float l;
        private boolean m;
        private boolean n;
        private List<skb> o;
        private Bitmap.Config p;
        private s58.f q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Uri uri, int i, Bitmap.Config config) {
            this.a = uri;
            this.b = i;
            this.p = config;
        }

        public gi9 a() {
            boolean z = this.h;
            if (z && this.f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.d == 0 && this.e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.q == null) {
                this.q = s58.f.NORMAL;
            }
            return new gi9(this.a, this.b, this.c, this.o, this.d, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
        }

        public b b(int i) {
            if (!this.h) {
                this.f = true;
                this.g = i;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public b c() {
            if (!this.f) {
                this.h = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            if (this.a == null && this.b == 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            if (this.d == 0 && this.e == 0) {
                return false;
            }
            return true;
        }

        public b f() {
            if (this.e == 0 && this.d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.i = true;
            return this;
        }

        public b g(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.d = i;
                    this.e = i2;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public b h(float f) {
            this.j = f;
            return this;
        }

        public b i(@NonNull skb skbVar) {
            if (skbVar != null) {
                if (skbVar.key() != null) {
                    if (this.o == null) {
                        this.o = new ArrayList(2);
                    }
                    this.o.add(skbVar);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }

        public b j(@NonNull List<? extends skb> list) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    i(list.get(i));
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.h == 0 && this.i == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.b;
        if (nanoTime > u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!c() && this.n == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!e() && !b()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.d);
        }
        List<skb> list = this.g;
        if (list != null && !list.isEmpty()) {
            for (skb skbVar : this.g) {
                sb.append(' ');
                sb.append(skbVar.key());
            }
        }
        if (this.f != null) {
            sb.append(" stableKey(");
            sb.append(this.f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(CoreConstants.COMMA_CHAR);
            sb.append(this.i);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.l) {
            sb.append(" centerInside");
        }
        if (this.n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.n);
            if (this.q) {
                sb.append(" @ ");
                sb.append(this.o);
                sb.append(CoreConstants.COMMA_CHAR);
                sb.append(this.p);
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.r) {
            sb.append(" purgeable");
        }
        if (this.s != null) {
            sb.append(' ');
            sb.append(this.s);
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    private gi9(Uri uri, int i, String str, List<skb> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, s58.f fVar) {
        this.d = uri;
        this.e = i;
        this.f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i2;
        this.i = i3;
        this.j = z;
        this.l = z2;
        this.k = i4;
        this.m = z3;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = z4;
        this.r = z5;
        this.s = config;
        this.t = fVar;
    }
}
