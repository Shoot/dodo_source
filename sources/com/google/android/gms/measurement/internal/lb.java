package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.support.api.entity.core.CommonCode;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class lb {
    private final u5 a;

    public lb(u5 u5Var) {
        this.a = u5Var;
    }

    private final boolean d() {
        if (this.a.E().z.a() > 0) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if (!d() || this.a.b().currentTimeMillis() - this.a.E().z.a() <= this.a.y().y(null, b0.V)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        String str;
        this.a.k().l();
        if (!d()) {
            return;
        }
        if (e()) {
            this.a.E().y.b(null);
            Bundle bundle = new Bundle();
            bundle.putString(KustoStorage.KustoTable.COLUMN_SOURCE, "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            bundle.putLong("_cc", 1L);
            this.a.G().B0("auto", "_cmpx", bundle);
        } else {
            String a = this.a.E().y.a();
            if (TextUtils.isEmpty(a)) {
                this.a.n().H().a("Cache still valid but referrer not found");
            } else {
                long a2 = ((this.a.E().z.a() / CoreConstants.MILLIS_IN_ONE_HOUR) - 1) * CoreConstants.MILLIS_IN_ONE_HOUR;
                Uri parse = Uri.parse(a);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", a2);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.a.G().B0(str, "_cmp", (Bundle) pair.second);
            }
            this.a.E().y.b(null);
        }
        this.a.E().z.b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.a.k().l();
        if (!this.a.o()) {
            if (bundle != null && !bundle.isEmpty()) {
                str = (str == null || str.isEmpty()) ? "auto" : "auto";
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.E().y.b(str2);
                this.a.E().z.b(this.a.b().currentTimeMillis());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.a.E().y.b(null);
        }
    }
}
