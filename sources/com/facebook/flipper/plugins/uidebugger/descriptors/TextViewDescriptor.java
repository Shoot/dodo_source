package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.widget.TextView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: TextViewDescriptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/TextViewDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "Landroid/widget/TextView;", "()V", "init", "", "onGetChildren", "textView", "children", "", "", "onGetData", "builder", "", "", "onGetId", "onGetName", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextViewDescriptor extends AbstractChainedDescriptor<TextView> {
    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(TextView textView, List<Object> list) {
        z65.h(textView, "textView");
        z65.h(list, "children");
    }

    /* renamed from: onGetData  reason: avoid collision after fix types in other method */
    public void onGetData2(TextView textView, Map<String, Object> map) {
        z65.h(textView, "textView");
        z65.h(map, "builder");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(TextView textView, List list) {
        onGetChildren2(textView, (List<Object>) list);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetData(TextView textView, Map map) {
        onGetData2(textView, (Map<String, Object>) map);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetId(TextView textView) {
        z65.h(textView, "textView");
        String num = Integer.toString(System.identityHashCode(textView));
        z65.g(num, "toString(System.identityHashCode(textView))");
        return num;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetName(TextView textView) {
        z65.h(textView, "textView");
        String simpleName = textView.getClass().getSimpleName();
        z65.g(simpleName, "textView.javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor, com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void init() {
    }
}
