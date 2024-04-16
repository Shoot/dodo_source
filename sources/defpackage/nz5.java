package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: LottieCompositionFactory.java */
/* renamed from: nz5  reason: default package */
/* loaded from: classes.dex */
public class nz5 {
    private static final Map<String, o<ez5>> a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    private static boolean A(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private static Boolean B(fh0 fh0Var) {
        try {
            fh0 peek = fh0Var.peek();
            for (byte b2 : b) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            ox5.b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(String str, AtomicBoolean atomicBoolean, Throwable th) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yz5 D(ez5 ez5Var) throws Exception {
        return new yz5(ez5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, ez5 ez5Var) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yz5 H(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yz5 I(Context context, String str, String str2) throws Exception {
        yz5<ez5> c = oi5.d(context).c(str, str2);
        if (str2 != null && c.b() != null) {
            fz5.b().c(str2, c.b());
        }
        return c;
    }

    private static String J(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if (A(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    private static o<ez5> h(final String str, Callable<yz5<ez5>> callable) {
        final ez5 a2;
        if (str == null) {
            a2 = null;
        } else {
            a2 = fz5.b().a(str);
        }
        if (a2 != null) {
            return new o<>(new Callable() { // from class: iz5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    yz5 D;
                    D = nz5.D(ez5.this);
                    return D;
                }
            });
        }
        if (str != null) {
            Map<String, o<ez5>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        o<ez5> oVar = new o<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oVar.d(new sz5() { // from class: jz5
                @Override // defpackage.sz5
                public final void onResult(Object obj) {
                    nz5.E(str, atomicBoolean, (ez5) obj);
                }
            });
            oVar.c(new sz5() { // from class: kz5
                @Override // defpackage.sz5
                public final void onResult(Object obj) {
                    nz5.C(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                a.put(str, oVar);
            }
        }
        return oVar;
    }

    private static rz5 i(ez5 ez5Var, String str) {
        for (rz5 rz5Var : ez5Var.j().values()) {
            if (rz5Var.b().equals(str)) {
                return rz5Var;
            }
        }
        return null;
    }

    public static o<ez5> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static o<ez5> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: lz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yz5 m;
                m = nz5.m(applicationContext, str, str2);
                return m;
            }
        });
    }

    public static yz5<ez5> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static yz5<ez5> m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return o(context.getAssets().open(str), str2);
            }
            return y(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new yz5<>(e);
        }
    }

    public static o<ez5> n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: hz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yz5 o;
                o = nz5.o(inputStream, str);
                return o;
            }
        });
    }

    public static yz5<ez5> o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    private static yz5<ez5> p(InputStream inputStream, String str, boolean z) {
        try {
            return q(xb5.q(c77.c(c77.j(inputStream))), str);
        } finally {
            if (z) {
                fvb.c(inputStream);
            }
        }
    }

    public static yz5<ez5> q(xb5 xb5Var, String str) {
        return r(xb5Var, str, true);
    }

    private static yz5<ez5> r(xb5 xb5Var, String str, boolean z) {
        try {
            try {
                ez5 a2 = oz5.a(xb5Var);
                if (str != null) {
                    fz5.b().c(str, a2);
                }
                yz5<ez5> yz5Var = new yz5<>(a2);
                if (z) {
                    fvb.c(xb5Var);
                }
                return yz5Var;
            } catch (Exception e) {
                yz5<ez5> yz5Var2 = new yz5<>(e);
                if (z) {
                    fvb.c(xb5Var);
                }
                return yz5Var2;
            }
        } catch (Throwable th) {
            if (z) {
                fvb.c(xb5Var);
            }
            throw th;
        }
    }

    public static o<ez5> s(Context context, int i) {
        return t(context, i, J(context, i));
    }

    public static o<ez5> t(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: mz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yz5 H;
                H = nz5.H(weakReference, applicationContext, i, str);
                return H;
            }
        });
    }

    public static yz5<ez5> u(Context context, int i) {
        return v(context, i, J(context, i));
    }

    public static yz5<ez5> v(Context context, int i, String str) {
        try {
            fh0 c = c77.c(c77.j(context.getResources().openRawResource(i)));
            if (B(c).booleanValue()) {
                return y(new ZipInputStream(c.z()), str);
            }
            return o(c.z(), str);
        } catch (Resources.NotFoundException e) {
            return new yz5<>(e);
        }
    }

    public static o<ez5> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static o<ez5> x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: gz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yz5 I;
                I = nz5.I(context, str, str2);
                return I;
            }
        });
    }

    public static yz5<ez5> y(ZipInputStream zipInputStream, String str) {
        try {
            return z(zipInputStream, str);
        } finally {
            fvb.c(zipInputStream);
        }
    }

    private static yz5<ez5> z(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ez5 ez5Var = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    ez5Var = r(xb5.q(c77.c(c77.j(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (ez5Var == null) {
                return new yz5<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                rz5 i = i(ez5Var, (String) entry.getKey());
                if (i != null) {
                    i.f(fvb.l((Bitmap) entry.getValue(), i.e(), i.c()));
                }
            }
            for (Map.Entry<String, rz5> entry2 : ez5Var.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new yz5<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                fz5.b().c(str, ez5Var);
            }
            return new yz5<>(ez5Var);
        } catch (IOException e) {
            return new yz5<>(e);
        }
    }
}
