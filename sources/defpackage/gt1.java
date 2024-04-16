package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;
/* compiled from: ContentCaptureSessionCompat.java */
/* renamed from: gt1  reason: default package */
/* loaded from: classes.dex */
public class gt1 {
    private final Object a;
    private final View b;

    /* compiled from: ContentCaptureSessionCompat.java */
    /* renamed from: gt1$a */
    /* loaded from: classes.dex */
    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    /* renamed from: gt1$b */
    /* loaded from: classes.dex */
    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private gt1(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    @NonNull
    public static gt1 f(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new gt1(contentCaptureSession, view);
    }

    public AutofillId a(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a2 = et1.a(this.a);
            j40 a3 = uyb.a(this.b);
            Objects.requireNonNull(a3);
            return b.a(a2, a3.a(), j);
        }
        return null;
    }

    public q0c b(@NonNull AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q0c.f(b.c(et1.a(this.a), autofillId, j));
        }
        return null;
    }

    public void c(@NonNull AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(et1.a(this.a), autofillId, charSequence);
        }
    }

    public void d(@NonNull List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            c.a(et1.a(this.a), list);
        } else if (i >= 29) {
            ViewStructure b2 = b.b(et1.a(this.a), this.b);
            a.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(et1.a(this.a), b2);
            for (int i2 = 0; i2 < list.size(); i2++) {
                b.d(et1.a(this.a), ft1.a(list.get(i2)));
            }
            ViewStructure b3 = b.b(et1.a(this.a), this.b);
            a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(et1.a(this.a), b3);
        }
    }

    public void e(@NonNull long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession a2 = et1.a(this.a);
            j40 a3 = uyb.a(this.b);
            Objects.requireNonNull(a3);
            b.f(a2, a3.a(), jArr);
        } else if (i >= 29) {
            ViewStructure b2 = b.b(et1.a(this.a), this.b);
            a.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(et1.a(this.a), b2);
            ContentCaptureSession a4 = et1.a(this.a);
            j40 a5 = uyb.a(this.b);
            Objects.requireNonNull(a5);
            b.f(a4, a5.a(), jArr);
            ViewStructure b3 = b.b(et1.a(this.a), this.b);
            a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(et1.a(this.a), b3);
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    /* renamed from: gt1$c */
    /* loaded from: classes.dex */
    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        }
    }
}
