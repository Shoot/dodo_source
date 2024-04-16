package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: t8c  reason: default package */
/* loaded from: classes2.dex */
public class t8c {
    private static t8c b = new t8c();
    private uo7 a = null;

    @NonNull
    public static uo7 a(@NonNull Context context) {
        return b.b(context);
    }

    @NonNull
    public final synchronized uo7 b(@NonNull Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new uo7(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
