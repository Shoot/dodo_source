package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
/* compiled from: ViewCompatShims.java */
/* renamed from: uyb  reason: default package */
/* loaded from: classes.dex */
public class uyb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompatShims.java */
    /* renamed from: uyb$a */
    /* loaded from: classes.dex */
    public static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* compiled from: ViewCompatShims.java */
    /* renamed from: uyb$b */
    /* loaded from: classes.dex */
    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: ViewCompatShims.java */
    /* renamed from: uyb$c */
    /* loaded from: classes.dex */
    private static class c {
        static void a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    public static j40 a(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j40.b(a.a(view));
        }
        return null;
    }

    public static gt1 b(@NonNull View view) {
        ContentCaptureSession a2;
        if (Build.VERSION.SDK_INT < 29 || (a2 = b.a(view)) == null) {
            return null;
        }
        return gt1.f(a2, view);
    }

    public static void c(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i);
        }
    }
}
