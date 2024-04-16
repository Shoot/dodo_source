package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import defpackage.jc;
import java.util.Locale;
/* compiled from: CrashlyticsAnalyticsListener.java */
/* renamed from: r02  reason: default package */
/* loaded from: classes2.dex */
class r02 implements jc.b {
    private tc a;
    private tc b;

    private static void b(tc tcVar, @NonNull String str, @NonNull Bundle bundle) {
        if (tcVar == null) {
            return;
        }
        tcVar.b(str, bundle);
    }

    private void c(@NonNull String str, @NonNull Bundle bundle) {
        tc tcVar;
        if ("clx".equals(bundle.getString("_o"))) {
            tcVar = this.a;
        } else {
            tcVar = this.b;
        }
        b(tcVar, str, bundle);
    }

    @Override // defpackage.jc.b
    public void a(int i, Bundle bundle) {
        String string;
        rx5.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString(Action.NAME_ATTRIBUTE)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(tc tcVar) {
        this.b = tcVar;
    }

    public void e(tc tcVar) {
        this.a = tcVar;
    }
}
