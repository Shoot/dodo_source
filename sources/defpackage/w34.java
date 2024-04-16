package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
/* compiled from: FontsContractCompat.java */
/* renamed from: w34  reason: default package */
/* loaded from: classes.dex */
public class w34 {

    /* compiled from: FontsContractCompat.java */
    /* renamed from: w34$a */
    /* loaded from: classes.dex */
    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: w34$b */
    /* loaded from: classes.dex */
    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        @Deprecated
        public b(@NonNull Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) kh8.f(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(@NonNull Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        @NonNull
        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: w34$c */
    /* loaded from: classes.dex */
    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(@NonNull Context context, CancellationSignal cancellationSignal, @NonNull b[] bVarArr) {
        return hob.b(context, cancellationSignal, bVarArr, 0);
    }

    @NonNull
    public static a b(@NonNull Context context, CancellationSignal cancellationSignal, @NonNull n34 n34Var) throws PackageManager.NameNotFoundException {
        return m34.e(context, n34Var, cancellationSignal);
    }

    public static Typeface c(@NonNull Context context, @NonNull n34 n34Var, int i, boolean z, int i2, @NonNull Handler handler, @NonNull c cVar) {
        om0 om0Var = new om0(cVar, handler);
        if (z) {
            return o34.e(context, n34Var, om0Var, i, i2);
        }
        return o34.d(context, n34Var, i, null, om0Var);
    }
}
