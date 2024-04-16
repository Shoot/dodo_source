package defpackage;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.l5;
import defpackage.rha;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ActivityCompat.java */
/* renamed from: l5  reason: default package */
/* loaded from: classes.dex */
public class l5 extends iu1 {

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ String[] a;
        final /* synthetic */ Activity b;
        final /* synthetic */ int c;

        a(String[] strArr, Activity activity, int i) {
            this.a = strArr;
            this.b = activity;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.a.length];
            PackageManager packageManager = this.b.getPackageManager();
            String packageName = this.b.getPackageName();
            int length = this.a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.a[i], packageName);
            }
            ((e) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$b */
    /* loaded from: classes.dex */
    static class b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$c */
    /* loaded from: classes.dex */
    static class c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$d */
    /* loaded from: classes.dex */
    public static class d {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$e */
    /* loaded from: classes.dex */
    public interface e {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$f */
    /* loaded from: classes.dex */
    public interface f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: l5$g */
    /* loaded from: classes.dex */
    static class g extends SharedElementCallback {
        private final rha a;

        g(rha rhaVar) {
            this.a = rhaVar;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.h(list, list2, new rha.a() { // from class: m5
                @Override // defpackage.rha.a
                public final void a() {
                    l5.d.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static void o(@NonNull Activity activity) {
        b.a(activity);
    }

    public static void p(@NonNull Activity activity) {
        c.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Activity activity) {
        if (!activity.isFinishing() && !q5.i(activity)) {
            activity.recreate();
        }
    }

    public static void r(@NonNull Activity activity) {
        c.b(activity);
    }

    public static void s(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: k5
                @Override // java.lang.Runnable
                public final void run() {
                    l5.q(activity);
                }
            });
        }
    }

    public static void t(@NonNull Activity activity, @NonNull String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof f) {
                ((f) activity).validateRequestPermissionsRequestCode(i);
            }
            d.b(activity, strArr, i);
        } else if (activity instanceof e) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i));
        }
    }

    public static void u(@NonNull Activity activity, rha rhaVar) {
        g gVar;
        if (rhaVar != null) {
            gVar = new g(rhaVar);
        } else {
            gVar = null;
        }
        c.c(activity, gVar);
    }

    public static void v(@NonNull Activity activity, rha rhaVar) {
        g gVar;
        if (rhaVar != null) {
            gVar = new g(rhaVar);
        } else {
            gVar = null;
        }
        c.d(activity, gVar);
    }

    public static boolean w(@NonNull Activity activity, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.c(activity, str);
        }
        return false;
    }

    public static void x(@NonNull Activity activity, @NonNull Intent intent, int i, Bundle bundle) {
        b.b(activity, intent, i, bundle);
    }

    public static void y(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        b.c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void z(@NonNull Activity activity) {
        c.e(activity);
    }
}
