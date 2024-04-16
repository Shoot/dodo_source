package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mv9;
import kotlin.Metadata;
/* compiled from: PizzeriaView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/PizzeriaView;", "Lru/dodopizza/app/presentation/checkout/details/views/a;", "", "pizzeriaAddress", "Lmv9$a;", "todaySchedule", "", "i", "l", "k", "", "errorResId", Image.TYPE_HIGH, "j", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PizzeriaView extends a {
    public PizzeriaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void h(String str, mv9.a aVar, int i) {
        z65.h(str, "pizzeriaAddress");
        z65.h(aVar, "todaySchedule");
        i(str, aVar);
        e(i);
    }

    public final void i(String str, mv9.a aVar) {
        z65.h(str, "pizzeriaAddress");
        z65.h(aVar, "todaySchedule");
        String string = getContext().getString(r09.pizzeria_schedule_description, aVar.b(), aVar.c());
        z65.g(string, "getString(...)");
        c(str, string);
    }

    public final void j(String str, mv9.a aVar, int i) {
        z65.h(str, "pizzeriaAddress");
        z65.h(aVar, "todaySchedule");
        i(str, aVar);
        String b = aVar.b();
        z65.g(b, "getFrom(...)");
        g(i, b);
    }

    public final void k(String str, mv9.a aVar) {
        z65.h(str, "pizzeriaAddress");
        z65.h(aVar, "todaySchedule");
        i(str, aVar);
        f();
    }

    public final void l() {
        d(r09.checkout_select_pizzeria);
        n1c.e(getIconsContainer(), getArrowIcon());
    }
}
