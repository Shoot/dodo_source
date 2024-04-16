package ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: PhonePrefixVH.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001eR\"\u0010#\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lve0;", "", "prefixText", "", "setPrefix", "countryNameText", "setCountryName", "", "isVisible", "setCheckMarkVisibility", "Lkotlin/Function0;", "listener", "setOnClickListener", "", "flag", "setFlag", "Landroid/widget/TextView;", "prefix$delegate", "Lk79;", "getPrefix", "()Landroid/widget/TextView;", "prefix", "countryName$delegate", "getCountryName", "countryName", "Landroid/widget/ImageView;", "checkMark$delegate", "getCheckMark", "()Landroid/widget/ImageView;", "checkMark", "flagView$delegate", "getFlagView", "flagView", "hasBottomMargin", "Z", "getHasBottomMargin", "()Z", "setHasBottomMargin", "(Z)V", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PhonePrefixVH extends SelfInflatingViewHolder implements ve0 {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PhonePrefixVH.class, "prefix", "getPrefix()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PhonePrefixVH.class, "countryName", "getCountryName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(PhonePrefixVH.class, "checkMark", "getCheckMark()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PhonePrefixVH.class, "flagView", "getFlagView()Landroid/widget/ImageView;", 0))};
    private final k79 checkMark$delegate;
    private final k79 countryName$delegate;
    private final k79 flagView$delegate;
    private boolean hasBottomMargin;
    private final k79 prefix$delegate;

    /* compiled from: PhonePrefixVH.kt */
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
    public PhonePrefixVH(kzb kzbVar) {
        super(kzbVar, R.layout.item_phone_prefix_list);
        z65.h(kzbVar, "viewInflater");
        this.prefix$delegate = kb0.g(this, R.id.item_phone_prefix_prefix);
        this.countryName$delegate = kb0.g(this, R.id.item_phone_prefix_country_name);
        this.checkMark$delegate = kb0.g(this, R.id.item_phone_prefix_check_mark);
        this.flagView$delegate = kb0.g(this, R.id.item_phone_prefix_flag);
    }

    private final ImageView getCheckMark() {
        return (ImageView) this.checkMark$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getCountryName() {
        return (TextView) this.countryName$delegate.a(this, $$delegatedProperties[1]);
    }

    private final ImageView getFlagView() {
        return (ImageView) this.flagView$delegate.a(this, $$delegatedProperties[3]);
    }

    private final TextView getPrefix() {
        return (TextView) this.prefix$delegate.a(this, $$delegatedProperties[0]);
    }

    @Override // defpackage.ve0
    public boolean getHasBottomMargin() {
        return this.hasBottomMargin;
    }

    public final void setCheckMarkVisibility(boolean z) {
        int i;
        ImageView checkMark = getCheckMark();
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        checkMark.setVisibility(i);
    }

    public final void setCountryName(CharSequence charSequence) {
        z65.h(charSequence, "countryNameText");
        getCountryName().setText(charSequence);
    }

    public final void setFlag(String str) {
        z65.h(str, "flag");
        ImageView flagView = getFlagView();
        Resources resources = this.itemView.getResources();
        z65.g(resources, "getResources(...)");
        flagView.setImageDrawable(xy3.a(resources, str));
    }

    public void setHasBottomMargin(boolean z) {
        this.hasBottomMargin = z;
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void setPrefix(CharSequence charSequence) {
        z65.h(charSequence, "prefixText");
        getPrefix().setText(charSequence);
    }
}
