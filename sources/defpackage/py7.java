package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: PermissionImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lpy7;", "", "Landroid/content/Context;", "", Action.KEY_ATTRIBUTE, "", "vc", "Rg", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: py7  reason: default package */
/* loaded from: classes2.dex */
public interface py7 {

    /* compiled from: PermissionImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: py7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(py7 py7Var, Context context, String str) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            return context.getSharedPreferences("permission_is_granted", 0).getBoolean(str, false);
        }

        public static boolean b(py7 py7Var, Context context, String str) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            return context.getSharedPreferences("permission_pref", 0).getBoolean(str, false);
        }

        public static void c(py7 py7Var, Context context, String str, boolean z) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            SharedPreferences.Editor edit = context.getSharedPreferences("permission_is_granted", 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        }

        public static void d(py7 py7Var, Context context, String str) {
            z65.h(context, "$receiver");
            z65.h(str, Action.KEY_ATTRIBUTE);
            SharedPreferences.Editor edit = context.getSharedPreferences("permission_pref", 0).edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
    }

    boolean Rg(Context context, String str);

    boolean vc(Context context, String str);
}
