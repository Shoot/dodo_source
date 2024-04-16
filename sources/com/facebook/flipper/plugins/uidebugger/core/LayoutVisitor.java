package com.facebook.flipper.plugins.uidebugger.core;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LayoutVisitor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor;", "", "visitor", "Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Visitor;", "(Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Visitor;)V", "getVisitor", "()Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Visitor;", "traverse", "", "view", "Landroid/view/View;", "Companion", "Visitor", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutVisitor {
    public static final Companion Companion = new Companion(null);
    private final Visitor visitor;

    /* compiled from: LayoutVisitor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Companion;", "", "()V", "create", "Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor;", "visitor", "Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Visitor;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LayoutVisitor create(Visitor visitor) {
            z65.h(visitor, "visitor");
            return new LayoutVisitor(visitor);
        }
    }

    /* compiled from: LayoutVisitor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/LayoutVisitor$Visitor;", "", "visit", "", "view", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Visitor {
        void visit(View view);
    }

    public LayoutVisitor(Visitor visitor) {
        z65.h(visitor, "visitor");
        this.visitor = visitor;
    }

    public final Visitor getVisitor() {
        return this.visitor;
    }

    public final void traverse(View view) {
        z65.h(view, "view");
        this.visitor.visit(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                z65.g(childAt, "child");
                traverse(childAt);
                i = i2;
            }
        }
    }
}
