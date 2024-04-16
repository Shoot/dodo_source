package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: tza  reason: default package */
/* loaded from: classes2.dex */
public class tza {
    private final Resources a;
    private final String b;

    public tza(@NonNull Context context) {
        gh8.j(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(v09.a);
    }

    public String a(@NonNull String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
