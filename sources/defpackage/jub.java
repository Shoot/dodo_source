package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.NonNull;
/* compiled from: UserManagerCompat.java */
/* renamed from: jub  reason: default package */
/* loaded from: classes.dex */
public class jub {

    /* compiled from: UserManagerCompat.java */
    /* renamed from: jub$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
