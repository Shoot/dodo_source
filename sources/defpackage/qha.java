package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.ArrayList;
/* compiled from: ShareCompat.java */
/* renamed from: qha  reason: default package */
/* loaded from: classes.dex */
public class qha {
    @NonNull
    private final Context a;
    @NonNull
    private final Intent b;
    private CharSequence c;
    private ArrayList<String> d;
    private ArrayList<String> e;
    private ArrayList<String> f;
    private ArrayList<Uri> g;

    public qha(@NonNull Context context) {
        Activity activity;
        this.a = (Context) kh8.f(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    private void b(String str, ArrayList<String> arrayList) {
        int i;
        String[] stringArrayExtra = this.b.getStringArrayExtra(str);
        if (stringArrayExtra != null) {
            i = stringArrayExtra.length;
        } else {
            i = 0;
        }
        String[] strArr = new String[arrayList.size() + i];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
        }
        this.b.putExtra(str, strArr);
    }

    @NonNull
    public qha a(@NonNull Uri uri) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.add(uri);
        return this;
    }

    @NonNull
    public Intent c() {
        return Intent.createChooser(d(), this.c);
    }

    @NonNull
    public Intent d() {
        ArrayList<String> arrayList = this.d;
        if (arrayList != null) {
            b("android.intent.extra.EMAIL", arrayList);
            this.d = null;
        }
        ArrayList<String> arrayList2 = this.e;
        if (arrayList2 != null) {
            b("android.intent.extra.CC", arrayList2);
            this.e = null;
        }
        ArrayList<String> arrayList3 = this.f;
        if (arrayList3 != null) {
            b("android.intent.extra.BCC", arrayList3);
            this.f = null;
        }
        ArrayList<Uri> arrayList4 = this.g;
        if (arrayList4 != null && arrayList4.size() > 1) {
            this.b.setAction("android.intent.action.SEND_MULTIPLE");
            this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
            pha.b(this.b, this.g);
        } else {
            this.b.setAction("android.intent.action.SEND");
            ArrayList<Uri> arrayList5 = this.g;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.b.putExtra("android.intent.extra.STREAM", this.g.get(0));
                pha.b(this.b, this.g);
            } else {
                this.b.removeExtra("android.intent.extra.STREAM");
                pha.c(this.b);
            }
        }
        return this.b;
    }

    @NonNull
    public qha e(Uri uri) {
        this.g = null;
        if (uri != null) {
            a(uri);
        }
        return this;
    }

    @NonNull
    public qha f(String str) {
        this.b.setType(str);
        return this;
    }

    public void g() {
        this.a.startActivity(c());
    }
}
