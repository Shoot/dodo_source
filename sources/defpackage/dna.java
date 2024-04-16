package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* renamed from: dna  reason: default package */
/* loaded from: classes.dex */
public class dna implements k36 {
    private static final Bitmap.Config[] d;
    private static final Bitmap.Config[] e;
    private static final Bitmap.Config[] f;
    private static final Bitmap.Config[] g;
    private static final Bitmap.Config[] h;
    private final c a = new c();
    private final si4<b, Bitmap> b = new si4<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: dna$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: dna$b */
    /* loaded from: classes.dex */
    public static final class b implements df8 {
        private final c a;
        int b;
        private Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.df8
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || !vub.e(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.b * 31;
            Bitmap.Config config = this.c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return dna.i(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: dna$c */
    /* loaded from: classes.dex */
    public static class c extends r70<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.r70
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b b = b();
            b.b(i, config);
            return b;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = k(bitmap.getConfig());
        Integer num2 = k.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                k.remove(num);
                return;
            } else {
                k.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b h(int i, Bitmap.Config config) {
        Bitmap.Config[] j;
        b e2 = this.a.e(i, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer ceilingKey = k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e2;
                        }
                    } else if (config2.equals(config)) {
                        return e2;
                    }
                }
                this.a.c(e2);
                return this.a.e(ceilingKey.intValue(), config2);
            }
        }
        return e2;
    }

    static String i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return e;
            }
        }
        int i = a.a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : h;
                }
                return g;
            }
            return f;
        }
        return d;
    }

    private NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // defpackage.k36
    public String a(Bitmap bitmap) {
        return i(vub.i(bitmap), bitmap.getConfig());
    }

    @Override // defpackage.k36
    public Bitmap b() {
        Bitmap f2 = this.b.f();
        if (f2 != null) {
            g(Integer.valueOf(vub.i(f2)), f2);
        }
        return f2;
    }

    @Override // defpackage.k36
    public void c(Bitmap bitmap) {
        b e2 = this.a.e(vub.i(bitmap), bitmap.getConfig());
        this.b.d(e2, bitmap);
        NavigableMap<Integer, Integer> k = k(bitmap.getConfig());
        Integer num = k.get(Integer.valueOf(e2.b));
        Integer valueOf = Integer.valueOf(e2.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    @Override // defpackage.k36
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        b h2 = h(vub.h(i, i2, config), config);
        Bitmap a2 = this.b.a(h2);
        if (a2 != null) {
            g(Integer.valueOf(h2.b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    @Override // defpackage.k36
    public String e(int i, int i2, Bitmap.Config config) {
        return i(vub.h(i, i2, config), config);
    }

    @Override // defpackage.k36
    public int f(Bitmap bitmap) {
        return vub.i(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
