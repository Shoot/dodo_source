package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: DesignSystemButtonsFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Le13;", "Lf70;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/widget/Button;", c.a, "Lk79;", "ph", "()Landroid/widget/Button;", "changeBackgroundButton", "Landroid/widget/Spinner;", DateTokenConverter.CONVERTER_KEY, "rh", "()Landroid/widget/Spinner;", "variantSpinner", e.a, "qh", "()Landroid/view/View;", "layout", "", "Lkotlin/Pair;", "", "", "f", "Ljava/util/List;", "backgroundsList", "<init>", "()V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e13  reason: default package */
/* loaded from: classes4.dex */
public final class e13 extends f70 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final List<Pair<String, Integer>> f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(e13.class, "changeBackgroundButton", "getChangeBackgroundButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(e13.class, "variantSpinner", "getVariantSpinner()Landroid/widget/Spinner;", 0)), bc9.f(new ar8(e13.class, "layout", "getLayout()Landroid/view/View;", 0))};
    public static final a g = new a(null);

    /* compiled from: DesignSystemButtonsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Le13$a;", "", "Le13;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e13$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e13 a() {
            return new e13();
        }
    }

    public e13() {
        super(R.layout.fragment_design_system_buttons);
        List<Pair<String, Integer>> o;
        this.c = kb0.e(this, R.id.design_system_buttons_change_background_button);
        this.d = kb0.e(this, R.id.design_system_buttons_background_spinner);
        this.e = kb0.e(this, R.id.design_system_buttons_scrollview);
        o = kc1.o(new Pair("surfacePrimaryColor", Integer.valueOf((int) R.color.surfacePrimaryColor)), new Pair("surfacePrimaryAlternateColor", Integer.valueOf((int) R.color.surfacePrimaryAlternateColor)), new Pair("surfacePrimaryStrongColor", Integer.valueOf((int) R.color.surfacePrimaryStrongColor)), new Pair("surfacePrimaryTransparent70Color", Integer.valueOf((int) R.color.surfacePrimaryTransparent70Color)), new Pair("surfaceSecondaryColor", Integer.valueOf((int) R.color.surfaceSecondaryColor)), new Pair("surfaceTertiaryColor", Integer.valueOf((int) R.color.surfaceTertiaryColor)), new Pair("surfaceQuaternaryColor", Integer.valueOf((int) R.color.surfaceQuaternaryColor)), new Pair("surfaceTooltipsColor", Integer.valueOf((int) R.color.surfaceTooltipsColor)), new Pair("surfaceDodoColor", Integer.valueOf((int) R.color.surfaceDodoColor)), new Pair("surfaceDodoSecondaryColor", Integer.valueOf((int) R.color.surfaceDodoSecondaryColor)), new Pair("surfaceLoyaltyColor", Integer.valueOf((int) R.color.surfaceLoyaltyColor)), new Pair("surfaceLoyaltySecondaryColor", Integer.valueOf((int) R.color.surfaceLoyaltySecondaryColor)), new Pair("surfaceSuccessColor", Integer.valueOf((int) R.color.surfaceSuccessColor)), new Pair("surfaceSuccessSecondaryColor", Integer.valueOf((int) R.color.surfaceSuccessSecondaryColor)), new Pair("surfaceWarningColor", Integer.valueOf((int) R.color.surfaceWarningColor)), new Pair("surfaceWarningSecondaryColor", Integer.valueOf((int) R.color.surfaceWarningSecondaryColor)), new Pair("surfaceGreenColor", Integer.valueOf((int) R.color.surfaceGreenColor)), new Pair("surfaceGreenSecondaryColor", Integer.valueOf((int) R.color.surfaceGreenSecondaryColor)), new Pair("surfacePinkColor", Integer.valueOf((int) R.color.surfacePinkColor)), new Pair("surfaceYellowColor", Integer.valueOf((int) R.color.surfaceYellowColor)), new Pair("surfaceYellowSecondaryColor", Integer.valueOf((int) R.color.surfaceYellowSecondaryColor)), new Pair("backgroundPrimaryColor", Integer.valueOf((int) R.color.backgroundPrimaryColor)), new Pair("backgroundSecondaryColor", Integer.valueOf((int) R.color.backgroundSecondaryColor)), new Pair("backgroundOverlayColor", Integer.valueOf((int) R.color.backgroundOverlayColor)), new Pair("backgroundStickyColor", Integer.valueOf((int) R.color.backgroundStickyColor)), new Pair("backgroundModalColor", Integer.valueOf((int) R.color.backgroundModalColor)), new Pair("backgroundUnderlayerColor", Integer.valueOf((int) R.color.backgroundUnderlayerColor)));
        this.f = o;
    }

    private final Button ph() {
        return (Button) this.c.a(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View qh() {
        return (View) this.e.a(this, h[2]);
    }

    private final Spinner rh() {
        return (Spinner) this.d.a(this, h[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sh(e13 e13Var, View view) {
        z65.h(e13Var, "this$0");
        e13Var.rh().setSelection((e13Var.rh().getSelectedItemPosition() + 1) % e13Var.rh().getAdapter().getCount());
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int w;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ph().setOnClickListener(new View.OnClickListener() { // from class: d13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e13.sh(e13.this, view2);
            }
        });
        Spinner rh = rh();
        Context requireContext = requireContext();
        List<Pair<String, Integer>> list = this.f;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).c());
        }
        rh.setAdapter((SpinnerAdapter) new ArrayAdapter(requireContext, 17367043, arrayList));
        rh().setOnItemSelectedListener(new b());
        rh().setSelection(0);
    }

    /* compiled from: DesignSystemButtonsFragment.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"e13$b", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", "", "position", "", "id", "", "onItemSelected", "onNothingSelected", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e13$b */
    /* loaded from: classes4.dex */
    public static final class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            z65.h(adapterView, "parent");
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            z65.f(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            String str = (String) itemAtPosition;
            for (Pair pair : e13.this.f) {
                if (z65.c(pair.c(), str)) {
                    e13.this.qh().setBackgroundResource(((Number) pair.d()).intValue());
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
