package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ExpandableIconView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J\u0012\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0004R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcn3;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "popupMeasuredHeight", "additionalMarginDp", Image.TYPE_HIGH, "popupMeasuredWidth", "g", "f", e.a, "Landroid/view/View;", "Landroid/graphics/RectF;", "k", "view", "", DateTokenConverter.CONVERTER_KEY, "j", "p", "o", "Lkotlin/Function0;", "onPopupClickListener", "setOnPopupClickListener", "", "inCenter", "l", "Landroid/widget/PopupWindow;", "a", "Lrn5;", "getPopupWindow", "()Landroid/widget/PopupWindow;", "popupWindow", "b", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cn3  reason: default package */
/* loaded from: classes.dex */
public class cn3 extends AppCompatImageView {
    private final rn5 a;
    private Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rn5 b;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        b = yn5.b(new bn3(this));
        this.a = b;
    }

    private final int e() {
        return (getContext().getResources().getDisplayMetrics().widthPixels / 2) - (getPopupWindow().getContentView().getMeasuredWidthAndState() / 2);
    }

    private final int f(int i) {
        RectF k = k(this);
        return ((int) k.bottom) + mpb.a(i, getContext());
    }

    private final int g(int i, int i2) {
        RectF k = k(this);
        return (((int) k.left) - i) + mpb.a(i2, getContext());
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.a.getValue();
    }

    private final int h(int i, int i2) {
        RectF k = k(this);
        return (((int) k.centerY()) - (i / 2)) + mpb.a(i2, getContext());
    }

    static /* synthetic */ int i(cn3 cn3Var, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return cn3Var.h(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateYOffset");
    }

    private final RectF k(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    public static /* synthetic */ void m(cn3 cn3Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            cn3Var.l(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndInitListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(cn3 cn3Var, boolean z, View view) {
        int g;
        int i;
        z65.h(cn3Var, "this$0");
        if (!cn3Var.getPopupWindow().isShowing()) {
            if (z) {
                cn3Var.getPopupWindow().getContentView().setPadding(0, 0, 0, 0);
                cn3Var.getPopupWindow().getContentView().measure(0, 0);
                g = cn3Var.e();
                i = cn3Var.f(8);
            } else {
                g = cn3Var.g(cn3Var.getPopupWindow().getContentView().getMeasuredWidthAndState(), -8);
                i = i(cn3Var, cn3Var.getPopupWindow().getContentView().getMeasuredHeight(), 0, 2, null);
            }
            cn3Var.getPopupWindow().showAtLocation(cn3Var, 0, g, i);
            cn3Var.p();
            Function0<Unit> function0 = cn3Var.b;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        cn3Var.j();
    }

    public final void d(View view) {
        z65.h(view, "view");
        getPopupWindow().setContentView(view);
        m(this, false, 1, null);
    }

    public final void j() {
        getPopupWindow().dismiss();
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(final boolean z) {
        getPopupWindow().getContentView().measure(0, 0);
        setOnClickListener(new View.OnClickListener() { // from class: zm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cn3.n(cn3.this, z, view);
            }
        });
    }

    public final void setOnPopupClickListener(Function0<Unit> function0) {
        z65.h(function0, "onPopupClickListener");
        this.b = function0;
    }

    public void o() {
    }

    public void p() {
    }
}
