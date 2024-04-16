package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: m8b  reason: default package */
/* loaded from: classes2.dex */
public class m8b implements a.d {
    @NonNull
    public static final m8b b = a().a();
    private final String a;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* renamed from: m8b$a */
    /* loaded from: classes2.dex */
    public static class a {
        private String a;

        /* synthetic */ a(qic qicVar) {
        }

        @NonNull
        public m8b a() {
            return new m8b(this.a, null);
        }
    }

    /* synthetic */ m8b(String str, ric ricVar) {
        this.a = str;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    @NonNull
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m8b)) {
            return false;
        }
        return m57.a(this.a, ((m8b) obj).a);
    }

    public final int hashCode() {
        return m57.b(this.a);
    }
}
