package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* compiled from: SharedPrefKeysetWriter.java */
/* renamed from: xha  reason: default package */
/* loaded from: classes2.dex */
public final class xha implements vg5 {
    private final SharedPreferences.Editor a;
    private final String b;

    public xha(Context context, String str, String str2) {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // defpackage.vg5
    public void a(jh3 jh3Var) throws IOException {
        if (this.a.putString(this.b, go4.b(jh3Var.h())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }

    @Override // defpackage.vg5
    public void b(qg5 qg5Var) throws IOException {
        if (this.a.putString(this.b, go4.b(qg5Var.h())).commit()) {
            return;
        }
        throw new IOException("Failed to write to SharedPreferences");
    }
}
