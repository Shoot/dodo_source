package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HalvesProgressButton.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002\t\u0004B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton;", "Landroid/widget/FrameLayout;", "", DateTokenConverter.CONVERTER_KEY, "b", "", "text", "setText", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "button", "Landroid/view/View;", "Landroid/view/View;", "progress", "", com.huawei.hms.opendevice.c.a, "Z", "()Z", "setCheckNetwork", "(Z)V", "isCheckNetwork", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;", "getListener", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;", "setListener", "(Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;)V", "listener", "Landroid/os/Handler;", com.huawei.hms.push.e.a, "Landroid/os/Handler;", "fakeLoaderHandler", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HalvesProgressButton extends FrameLayout {
    public static final a f = new a(null);
    public static final int g = 8;
    private TextView a;
    private View b;
    private boolean c;
    private b d;
    private Handler e;

    /* compiled from: HalvesProgressButton.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$a;", "", "", "FAKE_LOADER_DELAY", "J", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HalvesProgressButton.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;", "", "Landroid/view/View;", "v", "", "onClick", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public interface b {
        void onClick(View view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalvesProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.e = new Handler();
        View.inflate(getContext(), gz8.view_dodo_button, this);
        View findViewById = findViewById(gy8.button);
        z65.g(findViewById, "findViewById(...)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(gy8.g3);
        z65.g(findViewById2, "findViewById(...)");
        this.b = findViewById2;
        oma.a(this.a, new d(this));
    }

    public final void b() {
        this.b.setVisibility(4);
        this.a.setVisibility(0);
    }

    public final boolean c() {
        return this.c;
    }

    public final void d() {
        this.b.setVisibility(0);
        this.a.setVisibility(4);
    }

    public final b getListener() {
        return this.d;
    }

    public final void setCheckNetwork(boolean z) {
        this.c = z;
    }

    public final void setListener(b bVar) {
        this.d = bVar;
    }

    public final void setText(String str) {
        z65.h(str, "text");
        this.a.setText(str);
    }
}
