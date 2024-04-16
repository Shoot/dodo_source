package ru.dodopizza.app.presentation.selectlocation.localitylist.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: LocalityVH.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010$\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0014\u0010'\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001f¨\u0006,"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/localitylist/adapter/LocalityVHImpl;", "Llv5;", "Lve0;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", Action.NAME_ATTRIBUTE, "", "setLocalityName", "Lkotlin/Function0;", "listener", "setOnClickListener", "Landroid/widget/TextView;", "localityName$delegate", "Lk79;", "getLocalityName", "()Landroid/widget/TextView;", "localityName", "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ImageView;", "checkMark$delegate", "getCheckMark", "()Landroid/widget/ImageView;", "checkMark", "", "value", "isSelected", "Z", "()Z", "setSelected", "(Z)V", "isChecked", "setChecked", "isLastTop", "setLastTop", "getHasBottomMargin", "hasBottomMargin", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalityVHImpl extends SelfInflatingViewHolder implements lv5, ve0 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LocalityVHImpl.class, "localityName", "getLocalityName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LocalityVHImpl.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(LocalityVHImpl.class, "checkMark", "getCheckMark()Landroid/widget/ImageView;", 0))};
    private final k79 checkMark$delegate;
    private boolean isChecked;
    private boolean isLastTop;
    private boolean isSelected;
    private final k79 localityName$delegate;
    private final k79 progressBar$delegate;

    /* compiled from: LocalityVH.kt */
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
    public LocalityVHImpl(kzb kzbVar) {
        super(kzbVar, R.layout.item_city_list);
        z65.h(kzbVar, "viewInflater");
        this.localityName$delegate = kb0.g(this, R.id.locality_name);
        this.progressBar$delegate = kb0.g(this, R.id.progress);
        this.checkMark$delegate = kb0.g(this, R.id.check_mark);
    }

    private final ImageView getCheckMark() {
        return (ImageView) this.checkMark$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getLocalityName() {
        return (TextView) this.localityName$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar$delegate.a(this, $$delegatedProperties[1]);
    }

    @Override // defpackage.ve0
    public boolean getHasBottomMargin() {
        return isLastTop();
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isLastTop() {
        return this.isLastTop;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    @Override // defpackage.lv5
    public void setChecked(boolean z) {
        this.isChecked = z;
        un3.o(getCheckMark(), this.isChecked);
        un3.o(getProgressBar(), false);
    }

    @Override // defpackage.lv5
    public void setLastTop(boolean z) {
        this.isLastTop = z;
    }

    @Override // defpackage.lv5
    public void setLocalityName(CharSequence charSequence) {
        z65.h(charSequence, Action.NAME_ATTRIBUTE);
        getLocalityName().setText(charSequence);
    }

    @Override // defpackage.lv5
    public void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    @Override // defpackage.lv5
    public void setSelected(boolean z) {
        this.isSelected = z;
        if (z) {
            un3.o(getCheckMark(), false);
        } else {
            this.itemView.setBackgroundResource(R.drawable.selector_white_selectable_background);
        }
        un3.o(getProgressBar(), this.isSelected);
    }
}
