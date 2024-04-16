package ru.dodopizza.app.presentation.checkout.paymentwaylist.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.R;
/* compiled from: EmailForCheckVH.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lru/dodopizza/app/presentation/checkout/paymentwaylist/adapter/EmailForCheckVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "email", "", "setEmail", "Lkotlin/Function0;", "onClick", "setOnClickListener", "", "isLoading", "setLoading", "Landroid/widget/TextView;", "emailTextView$delegate", "Lk79;", "getEmailTextView", "()Landroid/widget/TextView;", "emailTextView", "Landroid/view/View;", "arrowIcon$delegate", "getArrowIcon", "()Landroid/view/View;", "arrowIcon", "progress$delegate", "getProgress", "progress", "Landroid/view/ViewGroup;", "iconsContainer$delegate", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmailForCheckVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(EmailForCheckVH.class, "emailTextView", "getEmailTextView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(EmailForCheckVH.class, "arrowIcon", "getArrowIcon()Landroid/view/View;", 0)), bc9.f(new ar8(EmailForCheckVH.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(EmailForCheckVH.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0))};
    private final k79 arrowIcon$delegate;
    private final k79 emailTextView$delegate;
    private final k79 iconsContainer$delegate;
    private final k79 progress$delegate;

    /* compiled from: EmailForCheckVH.kt */
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
    public EmailForCheckVH(kzb kzbVar) {
        super(kzbVar, R.layout.email_for_checks_item);
        z65.h(kzbVar, "viewInflater");
        this.emailTextView$delegate = kb0.g(this, R.id.email_text);
        this.arrowIcon$delegate = kb0.g(this, R.id.arrow_icon);
        this.progress$delegate = kb0.g(this, R.id.progress);
        this.iconsContainer$delegate = kb0.g(this, R.id.icons_container);
    }

    private final View getArrowIcon() {
        return (View) this.arrowIcon$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getEmailTextView() {
        return (TextView) this.emailTextView$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ViewGroup getIconsContainer() {
        return (ViewGroup) this.iconsContainer$delegate.a(this, $$delegatedProperties[3]);
    }

    private final View getProgress() {
        return (View) this.progress$delegate.a(this, $$delegatedProperties[2]);
    }

    public final void setEmail(String str) {
        boolean y;
        z65.h(str, "email");
        TextView emailTextView = getEmailTextView();
        y = l0b.y(str);
        un3.o(emailTextView, !y);
        getEmailTextView().setText(str);
    }

    public final void setLoading(boolean z) {
        if (z) {
            n1c.e(getIconsContainer(), getProgress());
        } else {
            n1c.e(getIconsContainer(), getArrowIcon());
        }
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }
}
