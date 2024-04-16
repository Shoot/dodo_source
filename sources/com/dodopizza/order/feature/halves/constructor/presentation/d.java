package com.dodopizza.order.feature.halves.constructor.presentation;

import android.os.Handler;
import android.view.View;
import com.dodopizza.order.feature.halves.constructor.presentation.HalvesProgressButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: HalvesProgressButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "b", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class d extends ej5 implements Function1<View, Unit> {
    final /* synthetic */ HalvesProgressButton a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HalvesProgressButton halvesProgressButton) {
        super(1);
        this.a = halvesProgressButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(HalvesProgressButton halvesProgressButton) {
        z65.h(halvesProgressButton, "this$0");
        halvesProgressButton.b();
    }

    public final void b(View view) {
        Handler handler;
        z65.h(view, "it");
        if (this.a.c()) {
            if (px6.e(this.a.getContext())) {
                HalvesProgressButton.b listener = this.a.getListener();
                if (listener != null) {
                    listener.onClick(view);
                    return;
                }
                return;
            }
            this.a.d();
            handler = this.a.e;
            final HalvesProgressButton halvesProgressButton = this.a;
            handler.postDelayed(new Runnable() { // from class: com.dodopizza.order.feature.halves.constructor.presentation.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.c(HalvesProgressButton.this);
                }
            }, 2000L);
            return;
        }
        HalvesProgressButton.b listener2 = this.a.getListener();
        if (listener2 != null) {
            listener2.onClick(view);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        b(view);
        return Unit.a;
    }
}
