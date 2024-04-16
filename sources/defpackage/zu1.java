package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: ContextUtils.java */
/* renamed from: zu1  reason: default package */
/* loaded from: classes2.dex */
public class zu1 {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
