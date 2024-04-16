package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: y4d  reason: default package */
/* loaded from: classes2.dex */
public final class y4d {
    private static final Uri f = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.google.android.gms.chimera").build();
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    private final boolean e;

    public y4d(String str, String str2, int i, boolean z) {
        gh8.f(str);
        this.a = str;
        gh8.f(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }

    public final int a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.a != null) {
            Intent intent = null;
            if (this.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.a);
                try {
                    bundle = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
                }
            }
            if (intent == null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return intent;
        }
        return new Intent().setComponent(this.c);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4d)) {
            return false;
        }
        y4d y4dVar = (y4d) obj;
        if (m57.a(this.a, y4dVar.a) && m57.a(this.b, y4dVar.b) && m57.a(this.c, y4dVar.c) && this.d == y4dVar.d && this.e == y4dVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m57.b(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str == null) {
            gh8.j(this.c);
            return this.c.flattenToString();
        }
        return str;
    }
}
