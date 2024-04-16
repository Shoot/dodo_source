package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductTagItem.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lom8;", "Landroid/widget/LinearLayout;", "Lnm8;", "colorVariants", "", "setBackground", "", "a", "Llm8;", RemoteMessageConst.Notification.TAG, "setContent", "Landroid/widget/TextView;", "Lk79;", "getTagName", "()Landroid/widget/TextView;", "tagName", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: om8  reason: default package */
/* loaded from: classes2.dex */
public final class om8 extends LinearLayout {
    static final /* synthetic */ je5<Object>[] b = {bc9.f(new ar8(om8.class, "tagName", "getTagName()Landroid/widget/TextView;", 0))};
    public static final int c = 8;
    private final k79 a;

    public /* synthetic */ om8(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean a() {
        if ((getContext().getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private final TextView getTagName() {
        return (TextView) this.a.a(this, b[0]);
    }

    private final void setBackground(nm8 nm8Var) {
        int parseColor;
        if (a()) {
            parseColor = Color.parseColor(nm8Var.a());
        } else {
            parseColor = Color.parseColor(nm8Var.b());
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDimensionPixelSize(vw8.product_tag_corners));
        gradientDrawable.setColor(parseColor);
        setBackground(gradientDrawable);
    }

    public final void setContent(lm8 lm8Var) {
        CharSequence R0;
        int i;
        z65.h(lm8Var, RemoteMessageConst.Notification.TAG);
        TextView tagName = getTagName();
        R0 = m0b.R0(lm8Var.getName());
        tagName.setText(qhb.a(R0.toString()));
        if (lm8Var.d()) {
            i = s19.TextAppearance_Dodo_Button_M;
        } else {
            i = s19.TextAppearance_Dodo_Button_S;
        }
        gdb.a.b(getTagName(), i);
        setBackground(lm8Var.c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        View.inflate(context, gz8.item_product_tag, this);
        this.a = kb0.d(this, gy8.tag_name);
    }
}
