package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: ProfileWidgetConverter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0016"}, d2 = {"Lyo8;", "", "Lgub;", "data", "", "isFirstConverting", "La28;", DateTokenConverter.CONVERTER_KEY, "b", "", "historyCount", c.a, "addressCount", "a", "", "Lq4c;", e.a, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yo8  reason: default package */
/* loaded from: classes4.dex */
public final class yo8 {
    private final Context a;

    public yo8(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    private final a28 a(int i) {
        String string;
        c28 c28Var = c28.d;
        String string2 = this.a.getString(R.string.delivery_addresses);
        z65.g(string2, "getString(...)");
        if (i > 0) {
            string = this.a.getResources().getQuantityString(R.plurals.address_counts, i, Integer.valueOf(i));
        } else {
            string = this.a.getString(R.string.address_empty);
        }
        String str = string;
        z65.e(str);
        return new a28(c28Var, string2, str, null, false, 24, null);
    }

    private final a28 b() {
        c28 c28Var = c28.c;
        String string = this.a.getString(R.string.referral_system_faq_enter_code_button);
        z65.g(string, "getString(...)");
        String string2 = this.a.getString(R.string.profile_widget_referral_system_action_title);
        z65.g(string2, "getString(...)");
        return new a28(c28Var, string, string2, null, false, 24, null);
    }

    private final a28 c(int i) {
        String string;
        c28 c28Var = c28.e;
        String string2 = this.a.getString(R.string.orders_history);
        z65.g(string2, "getString(...)");
        if (i > 0) {
            string = this.a.getResources().getQuantityString(R.plurals.order_counts, i, Integer.valueOf(i));
        } else {
            string = this.a.getString(R.string.order_empty);
        }
        String str = string;
        z65.e(str);
        return new a28(c28Var, string2, str, null, false, 24, null);
    }

    private final a28 d(gub gubVar, boolean z) {
        String str;
        boolean z2;
        c28 c28Var = c28.b;
        String string = this.a.getString(R.string.profile_widget_referral_system_title);
        z65.g(string, "getString(...)");
        String string2 = this.a.getString(R.string.profile_widget_referral_system_action_title);
        z65.g(string2, "getString(...)");
        if (gubVar.c().g()) {
            str = this.a.getString(R.string.wow_label);
        } else {
            str = null;
        }
        String str2 = str;
        if (gubVar.c().e() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new a28(c28Var, string, string2, str2, z2);
    }

    public final List<q4c> e(gub gubVar, boolean z) {
        List o;
        z65.h(gubVar, "data");
        ArrayList arrayList = new ArrayList();
        if (gubVar.c().c()) {
            String string = this.a.getString(R.string.profile_loyalty_balance_title);
            z65.g(string, "getString(...)");
            String a = eb1.a.a(gubVar.b().k());
            String string2 = this.a.getString(R.string.dodocoin_action);
            o = kc1.o(Integer.valueOf((int) R.drawable.coin_bottom), Integer.valueOf((int) R.drawable.coin_shadow), Integer.valueOf((int) R.drawable.coin_top));
            arrayList.add(new c36(string, a, string2, o, gubVar.c().a()));
            if (gubVar.c().f()) {
                arrayList.add(d(gubVar, z));
            }
            if (gubVar.c().b()) {
                arrayList.add(b());
            }
        }
        arrayList.add(c(gubVar.b().l()));
        arrayList.add(a(gubVar.a()));
        return arrayList;
    }
}
