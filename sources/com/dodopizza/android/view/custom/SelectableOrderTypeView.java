package com.dodopizza.android.view.custom;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: SelectableOrderTypeView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007R\u0016\u0010\u0012\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\""}, d2 = {"Lcom/dodopizza/android/view/custom/SelectableOrderTypeView;", "Lbm7;", "Landroid/util/AttributeSet;", "attrs", "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/res/TypedArray;", "", "resId", "", c.a, "getLayoutId", "Landroid/view/View;", "view", "b", "", "isSelected", "setSelected", "text", "setText", "setImage", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Lcom/google/android/material/card/MaterialCardView;", "Lcom/google/android/material/card/MaterialCardView;", "container", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SelectableOrderTypeView extends bm7 {
    private TextView a;
    private ImageView b;
    private MaterialCardView c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectableOrderTypeView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<String> {
        final /* synthetic */ TypedArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TypedArray typedArray) {
            super(0);
            this.a = typedArray;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return this.a.getString(w19.p2);
        }
    }

    public SelectableOrderTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final String c(TypedArray typedArray, int i) {
        Integer valueOf = Integer.valueOf(typedArray.getResourceId(i, 0));
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            Resources resources = typedArray.getResources();
            z65.g(resources, "getResources(...)");
            str = resources.getString(valueOf.intValue());
        }
        return (String) mh5.d(str, new a(typedArray));
    }

    private final void d(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, w19.n2, 0, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        TextView textView = this.a;
        ImageView imageView = null;
        if (textView == null) {
            z65.z("text");
            textView = null;
        }
        String c = c(obtainStyledAttributes, w19.p2);
        if (c == null) {
            c = "";
        }
        textView.setText(c);
        gdb gdbVar = gdb.a;
        TextView textView2 = this.a;
        if (textView2 == null) {
            z65.z("text");
            textView2 = null;
        }
        gdbVar.b(textView2, obtainStyledAttributes.getResourceId(w19.q2, yv8.c));
        ImageView imageView2 = this.b;
        if (imageView2 == null) {
            z65.z(ElementGenerator.TYPE_IMAGE);
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(obtainStyledAttributes.getResourceId(w19.o2, 0));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bm7
    public void b(View view, AttributeSet attributeSet) {
        z65.h(view, "view");
        super.b(view, attributeSet);
        View findViewById = findViewById(vx8.p);
        z65.g(findViewById, "findViewById(...)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(vx8.d);
        z65.g(findViewById2, "findViewById(...)");
        this.c = (MaterialCardView) findViewById2;
        View findViewById3 = findViewById(vx8.k);
        z65.g(findViewById3, "findViewById(...)");
        this.b = (ImageView) findViewById3;
        d(attributeSet);
    }

    @Override // defpackage.bm7
    protected int getLayoutId() {
        return sz8.selectable_order_type_view;
    }

    public final void setImage(int i) {
        ImageView imageView = this.b;
        if (imageView == null) {
            z65.z(ElementGenerator.TYPE_IMAGE);
            imageView = null;
        }
        imageView.setImageResource(i);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        MaterialCardView materialCardView = this.c;
        if (materialCardView == null) {
            z65.z("container");
            materialCardView = null;
        }
        if (z) {
            i = mpb.a(2.0f, getContext());
        } else {
            i = 0;
        }
        materialCardView.setStrokeWidth(i);
    }

    public final void setText(String str) {
        z65.h(str, "text");
        TextView textView = this.a;
        if (textView == null) {
            z65.z("text");
            textView = null;
        }
        textView.setText(str);
    }
}
