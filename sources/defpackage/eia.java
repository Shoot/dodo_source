package defpackage;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: sharedpreferences.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences$Editor;", "", Action.KEY_ATTRIBUTE, "", "value", "b", "Landroid/content/SharedPreferences;", "defaultValue", "a", "persistence_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: eia  reason: default package */
/* loaded from: classes2.dex */
public final class eia {
    public static final double a(SharedPreferences sharedPreferences, String str, double d) {
        z65.h(sharedPreferences, "<this>");
        z65.h(str, Action.KEY_ATTRIBUTE);
        r63 r63Var = r63.a;
        return Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(d)));
    }

    public static final SharedPreferences.Editor b(SharedPreferences.Editor editor, String str, double d) {
        z65.h(editor, "<this>");
        z65.h(str, Action.KEY_ATTRIBUTE);
        editor.putLong(str, Double.doubleToRawLongBits(d));
        return editor;
    }
}
