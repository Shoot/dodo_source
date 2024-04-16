package defpackage;

import android.content.Context;
import android.view.MenuItem;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.navigation.NavigationView;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ContactSupportBottomSheetDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001b"}, d2 = {"Lis1;", "Lp53;", "", "visible", "", "l", "k", "Lcom/google/android/material/navigation/NavigationView;", "b", "Lk79;", "i", "()Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "j", "()Landroid/view/MenuItem;", "phoneButton", Image.TYPE_HIGH, "chatButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "onContactSupportByPhoneClick", "onContactSupportByChatClick", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: is1  reason: default package */
/* loaded from: classes.dex */
public final class is1 extends p53 {
    static final /* synthetic */ je5<Object>[] c = {bc9.f(new ar8(is1.class, "navigationView", "getNavigationView()Lcom/google/android/material/navigation/NavigationView;", 0))};
    private final k79 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(Context context, final Function0<Unit> function0, final Function0<Unit> function02) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(function0, "onContactSupportByPhoneClick");
        z65.h(function02, "onContactSupportByChatClick");
        this.b = kb0.b(this, ux8.navigation);
        d(rz8.contact_support_dialog);
        i().setNavigationItemSelectedListener(new NavigationView.c() { // from class: hs1
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                boolean g;
                g = is1.g(Function0.this, function02, menuItem);
                return g;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Function0 function0, Function0 function02, MenuItem menuItem) {
        z65.h(function0, "$onContactSupportByPhoneClick");
        z65.h(function02, "$onContactSupportByChatClick");
        z65.h(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == ux8.contact_via_call_button) {
            function0.invoke();
            return true;
        } else if (itemId == ux8.contact_via_chat_button) {
            function02.invoke();
            return true;
        } else {
            return true;
        }
    }

    private final MenuItem h() {
        return i().getMenu().findItem(ux8.contact_via_chat_button);
    }

    private final NavigationView i() {
        return (NavigationView) this.b.a(this, c[0]);
    }

    private final MenuItem j() {
        return i().getMenu().findItem(ux8.contact_via_call_button);
    }

    public final void k(boolean z) {
        h().setVisible(z);
    }

    public final void l(boolean z) {
        j().setVisible(z);
    }
}
