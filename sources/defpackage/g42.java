package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import defpackage.c42;
import java.util.ArrayList;
/* compiled from: CustomTabsIntent.java */
/* renamed from: g42  reason: default package */
/* loaded from: classes.dex */
public final class g42 {
    @NonNull
    public final Intent a;
    public final Bundle b;

    /* compiled from: CustomTabsIntent.java */
    /* renamed from: g42$a */
    /* loaded from: classes.dex */
    public static final class a {
        private ArrayList<Bundle> c;
        private Bundle d;
        private ArrayList<Bundle> e;
        private SparseArray<Bundle> f;
        private Bundle g;
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final c42.a b = new c42.a();
        private int h = 0;
        private boolean i = true;

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            yh0.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        @NonNull
        public g42 a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            return new g42(this.a, this.d);
        }

        @NonNull
        public a b(@NonNull c42 c42Var) {
            this.g = c42Var.a();
            return this;
        }

        @NonNull
        public a d(int i) {
            if (i >= 0 && i <= 2) {
                this.h = i;
                if (i == 1) {
                    this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                } else if (i == 2) {
                    this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                } else {
                    this.a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        @NonNull
        public a e(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        @NonNull
        public a f(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }
    }

    g42(@NonNull Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(@NonNull Context context, @NonNull Uri uri) {
        this.a.setData(uri);
        iu1.l(context, this.a, this.b);
    }
}
