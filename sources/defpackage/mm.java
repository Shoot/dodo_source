package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: mm  reason: default package */
/* loaded from: classes2.dex */
public final class mm<O extends a.d> {
    private final int a;
    private final a b;
    private final a.d c;
    private final String d;

    private mm(a aVar, a.d dVar, String str) {
        this.b = aVar;
        this.c = dVar;
        this.d = str;
        this.a = m57.b(aVar, dVar, str);
    }

    @NonNull
    public static <O extends a.d> mm<O> a(@NonNull a<O> aVar, O o, String str) {
        return new mm<>(aVar, o, str);
    }

    @NonNull
    public final String b() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        if (!m57.a(this.b, mmVar.b) || !m57.a(this.c, mmVar.c) || !m57.a(this.d, mmVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
