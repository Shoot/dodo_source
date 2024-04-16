package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import defpackage.p34;
import defpackage.w34;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: pob  reason: default package */
/* loaded from: classes.dex */
public class pob {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, p34.c> a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: pob$a */
    /* loaded from: classes.dex */
    public class a implements b<w34.b> {
        a() {
        }

        @Override // defpackage.pob.b
        /* renamed from: c */
        public int b(w34.b bVar) {
            return bVar.e();
        }

        @Override // defpackage.pob.b
        /* renamed from: d */
        public boolean a(w34.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: pob$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        boolean a(T t);

        int b(T t);
    }

    private static <T> T e(T[] tArr, int i, b<T> bVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(bVar.b(t2) - i2) * 2;
            if (bVar.a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    public Typeface a(Context context, p34.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, @NonNull w34.b[] bVarArr, int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e = qob.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!qob.d(e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File e = qob.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!qob.c(e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w34.b f(w34.b[] bVarArr, int i) {
        return (w34.b) e(bVarArr, i, new a());
    }
}
