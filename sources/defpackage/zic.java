package defpackage;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: zic  reason: default package */
/* loaded from: classes2.dex */
public final class zic extends sic {
    private final b c;

    public zic(b bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.c = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends tk9, A>> T a(@NonNull T t) {
        return (T) this.c.n(t);
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper c() {
        return this.c.s();
    }
}
