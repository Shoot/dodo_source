package ru.dodopizza.app.presentation.checkout.details.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: DestinationView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0017J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0004J\b\u0010\u0010\u001a\u00020\u0002H\u0004R\u001b\u0010\u0016\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001b\u0010\u001f\u001a\u00020\u001c8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b$\u0010\"R\u001b\u0010'\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b&\u0010\"R\u001b\u0010*\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\"R\u001b\u0010-\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\"R\u001b\u00100\u001a\u00020\u001c8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u001e¨\u00067"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/views/a;", "Lbm7;", "", "getLayoutId", "", "f", "textResId", DateTokenConverter.CONVERTER_KEY, "", "text", "comment", c.a, e.a, "openTime", "g", "getTintTextColor", "getDefaultTextColor", "Landroid/widget/TextView;", "a", "Lk79;", "getAddressLabel", "()Landroid/widget/TextView;", "addressLabel", "b", "getCommentLabel", "commentLabel", "getErrorLabel", "errorLabel", "Landroid/view/ViewGroup;", "getIconsContainer", "()Landroid/view/ViewGroup;", "iconsContainer", "Landroid/view/View;", "getPlusIcon", "()Landroid/view/View;", "plusIcon", "getArrowIcon", "arrowIcon", "getProgressBar", "progressBar", Image.TYPE_HIGH, "getErrorIcon", "errorIcon", "i", "getErrorLabelIcon", "errorLabelIcon", "j", "getErrorContainer", "errorContainer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class a extends bm7 {
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(a.class, "addressLabel", "getAddressLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "commentLabel", "getCommentLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "errorLabel", "getErrorLabel()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "iconsContainer", "getIconsContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(a.class, "plusIcon", "getPlusIcon()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "arrowIcon", "getArrowIcon()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "progressBar", "getProgressBar()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "errorLabelIcon", "getErrorLabelIcon()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "errorContainer", "getErrorContainer()Landroid/view/ViewGroup;", 0))};
    public static final int l = 8;
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

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = kb0.d(this, gy8.address_label);
        this.b = kb0.d(this, gy8.comment_label);
        this.c = kb0.d(this, gy8.error_label);
        this.d = kb0.d(this, gy8.icons_container);
        this.e = kb0.d(this, gy8.plus_icon);
        this.f = kb0.d(this, gy8.arrow_icon);
        this.g = kb0.d(this, gy8.g3);
        this.h = kb0.d(this, gy8.u0);
        this.i = kb0.d(this, gy8.error_label_icon);
        this.j = kb0.d(this, gy8.error_container);
    }

    public void c(String str, String str2) {
        boolean y;
        z65.h(str, "text");
        z65.h(str2, "comment");
        setClickable(true);
        getAddressLabel().setTextColor(getDefaultTextColor());
        getAddressLabel().setText(str);
        getCommentLabel().setText(str2);
        TextView commentLabel = getCommentLabel();
        y = l0b.y(str2);
        un3.o(commentLabel, !y);
        n1c.e(getIconsContainer(), getArrowIcon());
        un3.e(getErrorContainer());
    }

    public void d(int i) {
        setClickable(true);
        getAddressLabel().setTextColor(getTintTextColor());
        getAddressLabel().setText(getResources().getString(i));
        un3.e(getCommentLabel());
        n1c.c(getIconsContainer());
        un3.e(getErrorContainer());
    }

    public final void e(int i) {
        getErrorLabel().setText(getContext().getString(i));
        n1c.e(getIconsContainer(), getErrorIcon());
        n1c.e(getErrorContainer(), getErrorLabel());
        un3.k(getErrorContainer());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        setClickable(false);
        n1c.e(getIconsContainer(), getProgressBar());
        un3.e(getErrorContainer());
    }

    public final void g(int i, String str) {
        z65.h(str, "openTime");
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) getContext().getString(r09.pizzeria_is_closed));
        z65.g(append, "append(...)");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iu1.c(getContext(), ew8.B));
        int length = append.length();
        append.append((CharSequence) " • ");
        append.append((CharSequence) getContext().getString(i, str));
        append.setSpan(foregroundColorSpan, length, append.length(), 17);
        TextView errorLabel = getErrorLabel();
        SpannableString valueOf = SpannableString.valueOf(append);
        z65.g(valueOf, "valueOf(this)");
        errorLabel.setText(valueOf);
        n1c.e(getIconsContainer(), getArrowIcon());
        n1c.d(getErrorContainer());
        un3.k(getErrorContainer());
    }

    protected final TextView getAddressLabel() {
        return (TextView) this.a.a(this, k[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View getArrowIcon() {
        return (View) this.f.a(this, k[5]);
    }

    protected final TextView getCommentLabel() {
        return (TextView) this.b.a(this, k[1]);
    }

    protected final int getDefaultTextColor() {
        return iu1.c(getContext(), ew8.A);
    }

    protected final ViewGroup getErrorContainer() {
        return (ViewGroup) this.j.a(this, k[9]);
    }

    protected final View getErrorIcon() {
        return (View) this.h.a(this, k[7]);
    }

    protected final TextView getErrorLabel() {
        return (TextView) this.c.a(this, k[2]);
    }

    protected final View getErrorLabelIcon() {
        return (View) this.i.a(this, k[8]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewGroup getIconsContainer() {
        return (ViewGroup) this.d.a(this, k[3]);
    }

    @Override // defpackage.bm7
    protected int getLayoutId() {
        return gz8.checkout_address_item;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View getPlusIcon() {
        return (View) this.e.a(this, k[4]);
    }

    protected final View getProgressBar() {
        return (View) this.g.a(this, k[6]);
    }

    protected final int getTintTextColor() {
        return iu1.c(getContext(), ew8.textIconAccentColor);
    }
}
