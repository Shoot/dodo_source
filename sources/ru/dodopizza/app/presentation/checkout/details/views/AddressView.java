package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AddressView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/AddressView;", "Lru/dodopizza/app/presentation/checkout/details/views/a;", "", "hasAnyAddress", "", "j", "l", "", "formattedAddress", "comment", Image.TYPE_HIGH, "i", "", "errorResId", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddressView extends a {
    public AddressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void h(String str, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(str2, "comment");
        c(str, str2);
    }

    public final void i(String str, String str2) {
        z65.h(str, "formattedAddress");
        z65.h(str2, "comment");
        h(str, str2);
        f();
    }

    public final void j(boolean z) {
        int i;
        View plusIcon;
        if (z) {
            i = r09.checkout_select_address;
        } else {
            i = r09.checkout_enter_delivery_address;
        }
        d(i);
        ViewGroup iconsContainer = getIconsContainer();
        if (z) {
            plusIcon = getArrowIcon();
        } else {
            plusIcon = getPlusIcon();
        }
        n1c.e(iconsContainer, plusIcon);
    }

    public final void k(String str, String str2, int i) {
        z65.h(str, "formattedAddress");
        z65.h(str2, "comment");
        h(str, str2);
        e(i);
    }

    public final void l() {
        d(r09.checkout_select_address);
        f();
    }
}
