package defpackage;

import androidx.preference.Preference;
import androidx.preference.d;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: DebugUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/preference/Preference;", "T", "Landroidx/preference/d;", "", Action.KEY_ATTRIBUTE, "a", "(Landroidx/preference/d;I)Landroidx/preference/Preference;", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: lo2  reason: default package */
/* loaded from: classes4.dex */
public final class lo2 {
    public static final <T extends Preference> T a(d dVar, int i) {
        z65.h(dVar, "<this>");
        T t = (T) dVar.sa(dVar.getString(i));
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("This preference doesn't exist".toString());
    }
}
