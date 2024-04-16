package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: FoodValuePopupView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001b\u0010 \u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001b\u0010#\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u0010\u0018R\u001b\u0010;\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u0018¨\u0006@"}, d2 = {"Lt44;", "Landroid/widget/RelativeLayout;", "", "a", Action.NAME_ATTRIBUTE, "", "setName", "calories", "setEnergyValue", "proteins", "setProteinsValue", "fats", "setFatsValue", "carbohydrates", "setCarbohydratesValue", "weight", "setWeightValue", c.a, "allergens", "allergensCanContain", "b", "Landroid/widget/TextView;", "Lk79;", "getNameValue", "()Landroid/widget/TextView;", "nameValue", "getEnergyValue", "energyValue", "getProteinsValue", "proteinsValue", DateTokenConverter.CONVERTER_KEY, "getFatsValue", "fatsValue", e.a, "getCarbohydratesValue", "carbohydratesValue", "Landroid/widget/FrameLayout;", "f", "getWeightInfo", "()Landroid/widget/FrameLayout;", "weightInfo", "g", "getWeightValue", "weightValue", "Landroid/view/View;", Image.TYPE_HIGH, "getSeparator", "()Landroid/view/View;", "separator", "Landroid/view/ViewGroup;", "i", "getAllergensContainer", "()Landroid/view/ViewGroup;", "allergensContainer", "j", "getAllergensValue", "allergensValue", "k", "getAllergensCanContainValue", "allergensCanContainValue", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t44  reason: default package */
/* loaded from: classes2.dex */
public final class t44 extends RelativeLayout {
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(t44.class, "nameValue", "getNameValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "energyValue", "getEnergyValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "proteinsValue", "getProteinsValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "fatsValue", "getFatsValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "carbohydratesValue", "getCarbohydratesValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "weightInfo", "getWeightInfo()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(t44.class, "weightValue", "getWeightValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "separator", "getSeparator()Landroid/view/View;", 0)), bc9.f(new ar8(t44.class, "allergensContainer", "getAllergensContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(t44.class, "allergensValue", "getAllergensValue()Landroid/widget/TextView;", 0)), bc9.f(new ar8(t44.class, "allergensCanContainValue", "getAllergensCanContainValue()Landroid/widget/TextView;", 0))};
    public static final int m = 8;
    private final k79 a;
    private final k79 b;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;

    public t44(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(gz8.food_value_content_item, this);
        this.a = kb0.d(this, gy8.x1);
        this.b = kb0.d(this, gy8.energy_value);
        this.c = kb0.d(this, gy8.proteins_value);
        this.d = kb0.d(this, gy8.fats_value);
        this.e = kb0.d(this, gy8.carbohydrates_value);
        this.f = kb0.d(this, gy8.weight_info);
        this.g = kb0.d(this, gy8.weight_value);
        this.h = kb0.d(this, gy8.e4);
        this.i = kb0.d(this, gy8.allergens_layout);
        this.j = kb0.d(this, gy8.allergens_value);
        this.k = kb0.d(this, gy8.allergens_can_contain_value);
    }

    private final String a(String str) {
        Object i;
        String F;
        i = j0b.i(str);
        if (i == null) {
            i = Float.valueOf(0.0f);
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator(CoreConstants.COMMA_CHAR);
        String format = new DecimalFormat("#####0.0", decimalFormatSymbols).format(i);
        z65.g(format, "format(...)");
        F = l0b.F(format, ",0", "", false, 4, null);
        return F;
    }

    private final TextView getAllergensCanContainValue() {
        return (TextView) this.k.a(this, l[10]);
    }

    private final ViewGroup getAllergensContainer() {
        return (ViewGroup) this.i.a(this, l[8]);
    }

    private final TextView getAllergensValue() {
        return (TextView) this.j.a(this, l[9]);
    }

    private final TextView getCarbohydratesValue() {
        return (TextView) this.e.a(this, l[4]);
    }

    private final TextView getEnergyValue() {
        return (TextView) this.b.a(this, l[1]);
    }

    private final TextView getFatsValue() {
        return (TextView) this.d.a(this, l[3]);
    }

    private final TextView getNameValue() {
        return (TextView) this.a.a(this, l[0]);
    }

    private final TextView getProteinsValue() {
        return (TextView) this.c.a(this, l[2]);
    }

    private final View getSeparator() {
        return (View) this.h.a(this, l[7]);
    }

    private final FrameLayout getWeightInfo() {
        return (FrameLayout) this.f.a(this, l[5]);
    }

    private final TextView getWeightValue() {
        return (TextView) this.g.a(this, l[6]);
    }

    public final void b(String str, String str2) {
        boolean y;
        boolean y2;
        z65.h(str, "allergens");
        z65.h(str2, "allergensCanContain");
        Context context = getContext();
        if (context != null) {
            if (str.length() == 0 && str2.length() == 0) {
                un3.o(getAllergensContainer(), false);
                return;
            }
            TextView allergensValue = getAllergensValue();
            y = l0b.y(str);
            un3.o(allergensValue, !y);
            getAllergensValue().setText(context.getString(r09.allergens_format, str));
            TextView allergensCanContainValue = getAllergensCanContainValue();
            y2 = l0b.y(str2);
            un3.o(allergensCanContainValue, !y2);
            getAllergensCanContainValue().setText(context.getString(r09.allergens_can_contain_format, str2));
        }
    }

    public final void c() {
        getSeparator().setVisibility(0);
    }

    public final void setCarbohydratesValue(String str) {
        z65.h(str, "carbohydrates");
        Context context = getContext();
        if (context != null) {
            getCarbohydratesValue().setText(context.getString(r09.nutrition_format, a(str)));
        }
    }

    public final void setEnergyValue(String str) {
        z65.h(str, "calories");
        Context context = getContext();
        if (context != null) {
            getEnergyValue().setText(context.getString(r09.energy_value_format, a(str)));
        }
    }

    public final void setFatsValue(String str) {
        z65.h(str, "fats");
        Context context = getContext();
        if (context != null) {
            getFatsValue().setText(context.getString(r09.nutrition_format, a(str)));
        }
    }

    public final void setName(String str) {
        int i;
        z65.h(str, Action.NAME_ATTRIBUTE);
        getNameValue().setText(str);
        TextView nameValue = getNameValue();
        if (str.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        nameValue.setVisibility(i);
    }

    public final void setProteinsValue(String str) {
        z65.h(str, "proteins");
        Context context = getContext();
        if (context != null) {
            getProteinsValue().setText(context.getString(r09.nutrition_format, a(str)));
        }
    }

    public final void setWeightValue(String str) {
        boolean y;
        z65.h(str, "weight");
        Context context = getContext();
        if (context != null) {
            FrameLayout weightInfo = getWeightInfo();
            y = l0b.y(str);
            un3.o(weightInfo, !y);
            getWeightValue().setText(context.getString(r09.nutrition_format, str));
        }
    }
}
