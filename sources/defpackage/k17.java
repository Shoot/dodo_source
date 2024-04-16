package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NotificationCompat.java */
/* renamed from: k17  reason: default package */
/* loaded from: classes.dex */
public class k17 {

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$a */
    /* loaded from: classes.dex */
    public static class a {
        final Bundle a;
        private IconCompat b;
        private final nd9[] c;
        private final nd9[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.j(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        @NonNull
        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.j(null, "", i);
            }
            return this.b;
        }

        public nd9[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, nd9[] nd9VarArr, nd9[] nd9VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.i = iconCompat.l();
            }
            this.j = e.j(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = nd9VarArr;
            this.d = nd9VarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$b */
    /* loaded from: classes.dex */
    public static class b extends g {
        private Bitmap e;
        private IconCompat f;
        private boolean g;
        private CharSequence h;
        private boolean i;

        /* compiled from: NotificationCompat.java */
        /* renamed from: k17$b$a */
        /* loaded from: classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: k17$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0406b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: k17$b$c */
        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // defpackage.k17.g
        public void b(m07 m07Var) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(m07Var.a()).setBigContentTitle(this.b).bigPicture(this.e);
            if (this.g) {
                IconCompat iconCompat = this.f;
                Context context = null;
                if (iconCompat == null) {
                    a.a(bigPicture, null);
                } else if (i >= 23) {
                    if (m07Var instanceof k27) {
                        context = ((k27) m07Var).f();
                    }
                    C0406b.a(bigPicture, this.f.w(context));
                } else if (iconCompat.o() == 1) {
                    a.a(bigPicture, this.f.k());
                } else {
                    a.a(bigPicture, null);
                }
            }
            if (this.d) {
                a.b(bigPicture, this.c);
            }
            if (i >= 31) {
                c.b(bigPicture, this.i);
                c.a(bigPicture, this.h);
            }
        }

        @Override // defpackage.k17.g
        @NonNull
        protected String k() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @NonNull
        public b q(Bitmap bitmap) {
            IconCompat f;
            if (bitmap == null) {
                f = null;
            } else {
                f = IconCompat.f(bitmap);
            }
            this.f = f;
            this.g = true;
            return this;
        }

        @NonNull
        public b r(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        @NonNull
        public b s(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        @NonNull
        public b t(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.d = true;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$c */
    /* loaded from: classes.dex */
    public static class c extends g {
        private CharSequence e;

        @Override // defpackage.k17.g
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
        }

        @Override // defpackage.k17.g
        public void b(m07 m07Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(m07Var.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // defpackage.k17.g
        @NonNull
        protected String k() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @NonNull
        public c q(CharSequence charSequence) {
            this.e = e.j(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$d */
    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$f */
    /* loaded from: classes.dex */
    public static class f extends g {
        private RemoteViews q(RemoteViews remoteViews, boolean z) {
            int min;
            int i = 0;
            RemoteViews c = c(true, lz8.c, false);
            c.removeAllViews(qy8.L);
            List<a> s = s(this.a.b);
            if (z && s != null && (min = Math.min(s.size(), 3)) > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(qy8.L, r(s.get(i2)));
                }
            } else {
                i = 8;
            }
            c.setViewVisibility(qy8.L, i);
            c.setViewVisibility(qy8.I, i);
            d(c, remoteViews);
            return c;
        }

        private RemoteViews r(a aVar) {
            boolean z;
            int i;
            if (aVar.k == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.a.a.getPackageName();
            if (z) {
                i = lz8.b;
            } else {
                i = lz8.a;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat d = aVar.d();
            if (d != null) {
                remoteViews.setImageViewBitmap(qy8.J, h(d, this.a.a.getResources().getColor(iw8.a)));
            }
            remoteViews.setTextViewText(qy8.K, aVar.j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(qy8.H, aVar.k);
            }
            remoteViews.setContentDescription(qy8.H, aVar.j);
            return remoteViews;
        }

        private static List<a> s(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                if (!aVar.j()) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        @Override // defpackage.k17.g
        public void b(m07 m07Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                m07Var.a().setStyle(l17.a());
            }
        }

        @Override // defpackage.k17.g
        @NonNull
        protected String k() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // defpackage.k17.g
        public RemoteViews m(m07 m07Var) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews c = this.a.c();
            if (c == null) {
                c = this.a.e();
            }
            if (c == null) {
                return null;
            }
            return q(c, true);
        }

        @Override // defpackage.k17.g
        public RemoteViews n(m07 m07Var) {
            if (Build.VERSION.SDK_INT >= 24 || this.a.e() == null) {
                return null;
            }
            return q(this.a.e(), false);
        }

        @Override // defpackage.k17.g
        public RemoteViews o(m07 m07Var) {
            RemoteViews e;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews g = this.a.g();
            if (g != null) {
                e = g;
            } else {
                e = this.a.e();
            }
            if (g == null) {
                return null;
            }
            return q(e, true);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        protected e a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        private int e() {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(sw8.i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(sw8.j);
            float f = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f) * dimensionPixelSize) + (f * dimensionPixelSize2));
        }

        private static float f(float f, float f2, float f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }

        private Bitmap g(int i, int i2, int i3) {
            return i(IconCompat.i(this.a.a, i), i2, i3);
        }

        private Bitmap i(@NonNull IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable r = iconCompat.r(this.a.a);
            if (i2 == 0) {
                i3 = r.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = r.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            r.setBounds(0, 0, i3, i2);
            if (i != 0) {
                r.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            r.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap j(int i, int i2, int i3, int i4) {
            int i5 = hx8.a;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap g = g(i5, i4, i2);
            Canvas canvas = new Canvas(g);
            Drawable mutate = this.a.a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return g;
        }

        private void l(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(qy8.k0, 8);
            remoteViews.setViewVisibility(qy8.i0, 8);
            remoteViews.setViewVisibility(qy8.h0, 8);
        }

        public void a(@NonNull Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String k = k();
            if (k != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", k);
            }
        }

        public abstract void b(m07 m07Var);

        /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
        @androidx.annotation.NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.k17.g.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            l(remoteViews);
            int i = qy8.R;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(qy8.S, 0, e(), 0, 0);
        }

        Bitmap h(@NonNull IconCompat iconCompat, int i) {
            return i(iconCompat, i, 0);
        }

        protected abstract String k();

        public RemoteViews m(m07 m07Var) {
            return null;
        }

        public RemoteViews n(m07 m07Var) {
            return null;
        }

        public RemoteViews o(m07 m07Var) {
            return null;
        }

        public void p(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.J(this);
                }
            }
        }
    }

    public static int a(@NonNull Notification notification) {
        return notification.color;
    }

    public static Bundle b(@NonNull Notification notification) {
        return notification.extras;
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: k17$e */
    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;
        public Context a;
        public ArrayList<a> b;
        @NonNull
        public ArrayList<xz7> c;
        ArrayList<a> d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        Bitmap j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        boolean p;
        g q;
        CharSequence r;
        CharSequence s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;

        public e(@NonNull Context context, @NonNull String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence j(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        private Bitmap k(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(sw8.b);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(sw8.a);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private void w(int i, boolean z) {
            if (z) {
                Notification notification = this.S;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i) & notification2.flags;
        }

        @NonNull
        public e A(int i, int i2, int i3) {
            int i4;
            Notification notification = this.S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 != 0 && i3 != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public e B(boolean z) {
            this.A = z;
            return this;
        }

        @NonNull
        public e C(int i) {
            this.l = i;
            return this;
        }

        @NonNull
        public e D(boolean z) {
            w(8, z);
            return this;
        }

        @NonNull
        public e E(int i) {
            this.m = i;
            return this;
        }

        @NonNull
        public e F(boolean z) {
            this.n = z;
            return this;
        }

        @NonNull
        public e G(boolean z) {
            this.T = z;
            return this;
        }

        @NonNull
        public e H(int i) {
            this.S.icon = i;
            return this;
        }

        @NonNull
        public e I(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @NonNull
        public e J(g gVar) {
            if (this.q != gVar) {
                this.q = gVar;
                if (gVar != null) {
                    gVar.p(this);
                }
            }
            return this;
        }

        @NonNull
        public e K(CharSequence charSequence) {
            this.S.tickerText = j(charSequence);
            return this;
        }

        @NonNull
        public e L(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        @NonNull
        public e M(int i) {
            this.G = i;
            return this;
        }

        @NonNull
        public e N(long j) {
            this.S.when = j;
            return this;
        }

        @NonNull
        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Notification b() {
            return new k27(this).c();
        }

        public RemoteViews c() {
            return this.J;
        }

        public int d() {
            return this.F;
        }

        public RemoteViews e() {
            return this.I;
        }

        @NonNull
        public Bundle f() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews g() {
            return this.K;
        }

        public int h() {
            return this.m;
        }

        public long i() {
            if (this.n) {
                return this.S.when;
            }
            return 0L;
        }

        @NonNull
        public e l(boolean z) {
            w(16, z);
            return this;
        }

        @NonNull
        public e m(@NonNull String str) {
            this.L = str;
            return this;
        }

        @NonNull
        public e n(int i) {
            this.F = i;
            return this;
        }

        @NonNull
        public e o(RemoteViews remoteViews) {
            this.S.contentView = remoteViews;
            return this;
        }

        @NonNull
        public e p(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        @NonNull
        public e q(CharSequence charSequence) {
            this.f = j(charSequence);
            return this;
        }

        @NonNull
        public e r(CharSequence charSequence) {
            this.e = j(charSequence);
            return this;
        }

        @NonNull
        public e s(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @NonNull
        public e t(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @NonNull
        public e u(int i) {
            Notification notification = this.S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public e v(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public e x(String str) {
            this.x = str;
            return this;
        }

        @NonNull
        public e y(boolean z) {
            this.y = z;
            return this;
        }

        @NonNull
        public e z(Bitmap bitmap) {
            this.j = k(bitmap);
            return this;
        }

        @Deprecated
        public e(@NonNull Context context) {
            this(context, null);
        }
    }
}
