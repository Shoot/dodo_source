package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
/* compiled from: Operation.java */
/* renamed from: ua7  reason: default package */
/* loaded from: classes.dex */
public interface ua7 {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0686b b = new b.C0686b();

    /* compiled from: Operation.java */
    /* renamed from: ua7$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* renamed from: ua7$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {
            private final Throwable a;

            public a(@NonNull Throwable th) {
                this.a = th;
            }

            @NonNull
            public Throwable a() {
                return this.a;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: ua7$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0686b extends b {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0686b() {
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: ua7$b$c */
        /* loaded from: classes.dex */
        public static final class c extends b {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}
