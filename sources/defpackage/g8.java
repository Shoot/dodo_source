package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: AddressFormValidationCodes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lm54;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "errorCode", "", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: g8  reason: default package */
/* loaded from: classes4.dex */
public final class g8 {
    public static final String a(m54 m54Var, Context context, int i) {
        z65.h(m54Var, "<this>");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (i == 1) {
            String string = context.getString(R.string.form_error_field_is_mandatory, m54Var.c().getName());
            z65.g(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(R.string.form_error_unknown_error);
        z65.g(string2, "getString(...)");
        return string2;
    }
}
