package com.facebook.flipper.plugins.uidebugger.core;

import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import com.facebook.flipper.plugins.uidebugger.common.Node;
import com.facebook.flipper.plugins.uidebugger.core.RootViewResolver;
import com.facebook.flipper.plugins.uidebugger.descriptors.DescriptorRegister;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ApplicationInspector.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationInspector;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "(Lcom/facebook/flipper/plugins/uidebugger/core/Context;)V", "getContext", "()Lcom/facebook/flipper/plugins/uidebugger/core/Context;", "descriptorRegister", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "getDescriptorRegister", "()Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "traversal", "Lcom/facebook/flipper/plugins/uidebugger/core/LayoutTraversal;", "getTraversal", "()Lcom/facebook/flipper/plugins/uidebugger/core/LayoutTraversal;", "attachListeners", "", "view", "Landroid/view/View;", "inspect", "Lcom/facebook/flipper/plugins/uidebugger/common/Node;", "observe", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationInspector {
    private final Context context;
    private final DescriptorRegister descriptorRegister;
    private final LayoutTraversal traversal;

    public ApplicationInspector(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        DescriptorRegister withDefaults = DescriptorRegister.Companion.withDefaults();
        this.descriptorRegister = withDefaults;
        this.traversal = new LayoutTraversal(withDefaults);
    }

    public final void attachListeners(View view) {
        z65.h(view, "view");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facebook.flipper.plugins.uidebugger.core.ApplicationInspector$attachListeners$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
            }
        });
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.facebook.flipper.plugins.uidebugger.core.ApplicationInspector$attachListeners$2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                return true;
            }
        });
    }

    public final Context getContext() {
        return this.context;
    }

    public final DescriptorRegister getDescriptorRegister() {
        return this.descriptorRegister;
    }

    public final LayoutTraversal getTraversal() {
        return this.traversal;
    }

    public final Node inspect() {
        return this.traversal.inspect(this.context.getApplication());
    }

    public final void observe() {
        RootViewResolver rootViewResolver = new RootViewResolver();
        rootViewResolver.attachListener(new RootViewResolver.Listener() { // from class: com.facebook.flipper.plugins.uidebugger.core.ApplicationInspector$observe$1
            @Override // com.facebook.flipper.plugins.uidebugger.core.RootViewResolver.Listener
            public void onRootViewAdded(View view) {
                z65.h(view, "view");
                ApplicationInspector.this.attachListeners(view);
            }

            @Override // com.facebook.flipper.plugins.uidebugger.core.RootViewResolver.Listener
            public void onRootViewRemoved(View view) {
                z65.h(view, "view");
            }

            @Override // com.facebook.flipper.plugins.uidebugger.core.RootViewResolver.Listener
            public void onRootViewsChanged(List<View> list) {
                z65.h(list, "views");
            }
        });
        List<RootViewResolver.RootView> listActiveRootViews = rootViewResolver.listActiveRootViews();
        if (listActiveRootViews != null) {
            for (RootViewResolver.RootView rootView : listActiveRootViews) {
                z65.g(rootView, "roots");
            }
        }
    }
}
