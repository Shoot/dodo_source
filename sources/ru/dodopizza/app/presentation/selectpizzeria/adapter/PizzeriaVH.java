package ru.dodopizza.app.presentation.selectpizzeria.adapter;

import android.view.View;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: PizzeriaVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001b\u0010'\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010 ¨\u0006,"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/adapter/PizzeriaVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "address", "", "setAddress", "todayStartWorkTime", "todayEndWorkTime", "setTime", "setFullDay", "", "isSelected", "setSelected", "Lkotlin/Function0;", "onClick", "setOnClickListener", "distance", "setDistanceToUser", "showDistanceView", "hideDistanceView", "Landroid/widget/TextView;", "addressTextView$delegate", "Lk79;", "getAddressTextView", "()Landroid/widget/TextView;", "addressTextView", "scheduleTextView$delegate", "getScheduleTextView", "scheduleTextView", "Landroid/view/View;", "selectionIcon$delegate", "getSelectionIcon", "()Landroid/view/View;", "selectionIcon", "distanceToUser$delegate", "getDistanceToUser", "distanceToUser", "distanceView$delegate", "getDistanceView", "distanceView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PizzeriaVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PizzeriaVH.class, "addressTextView", "getAddressTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaVH.class, "scheduleTextView", "getScheduleTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaVH.class, "selectionIcon", "getSelectionIcon()Landroid/view/View;", 0)), bc9.f(new ar8(PizzeriaVH.class, "distanceToUser", "getDistanceToUser()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PizzeriaVH.class, "distanceView", "getDistanceView()Landroid/view/View;", 0))};
    private final k79 addressTextView$delegate;
    private final k79 distanceToUser$delegate;
    private final k79 distanceView$delegate;
    private final k79 scheduleTextView$delegate;
    private final k79 selectionIcon$delegate;

    /* compiled from: PizzeriaVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PizzeriaVH(kzb kzbVar) {
        super(kzbVar, R.layout.pizzeria_item);
        z65.h(kzbVar, "viewInflater");
        this.addressTextView$delegate = kb0.g(this, R.id.address_label);
        this.scheduleTextView$delegate = kb0.g(this, R.id.schedule_label);
        this.selectionIcon$delegate = kb0.g(this, R.id.selected_icon);
        this.distanceToUser$delegate = kb0.g(this, R.id.distance_to_user);
        this.distanceView$delegate = kb0.g(this, R.id.distance_view);
    }

    private final TextView getAddressTextView() {
        return (TextView) this.addressTextView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getDistanceToUser() {
        return (TextView) this.distanceToUser$delegate.a(this, $$delegatedProperties[3]);
    }

    private final View getDistanceView() {
        return (View) this.distanceView$delegate.a(this, $$delegatedProperties[4]);
    }

    private final TextView getScheduleTextView() {
        return (TextView) this.scheduleTextView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final View getSelectionIcon() {
        return (View) this.selectionIcon$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void hideDistanceView() {
        un3.e(getDistanceView());
    }

    public final void setAddress(String str) {
        z65.h(str, "address");
        getAddressTextView().setText(str);
    }

    public final void setDistanceToUser(String str) {
        z65.h(str, "distance");
        getDistanceToUser().setText(str);
    }

    public final void setFullDay() {
        getScheduleTextView().setText(jzb.a(this, R.string.openAroundTheClock));
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setSelected(boolean z) {
        un3.o(getSelectionIcon(), z);
    }

    public final void setTime(String str, String str2) {
        z65.h(str, "todayStartWorkTime");
        z65.h(str2, "todayEndWorkTime");
        getScheduleTextView().setText(this.itemView.getContext().getString(R.string.pizzeria_schedule_description_2, str, str2));
    }

    public final void showDistanceView() {
        un3.k(getDistanceView());
    }
}
