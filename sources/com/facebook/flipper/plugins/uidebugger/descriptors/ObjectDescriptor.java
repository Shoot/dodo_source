package com.facebook.flipper.plugins.uidebugger.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ObjectDescriptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J&\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ObjectDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/Descriptor;", "", "()V", "getChildren", "", "node", "children", "", "getData", "obj", "builder", "", "", "getId", "getName", "init", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObjectDescriptor extends Descriptor<Object> {
    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void getChildren(Object obj, List<Object> list) {
        z65.h(obj, "node");
        z65.h(list, "children");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void getData(Object obj, Map<String, Object> map) {
        z65.h(obj, "obj");
        z65.h(map, "builder");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public String getId(Object obj) {
        z65.h(obj, "obj");
        String num = Integer.toString(System.identityHashCode(obj));
        z65.g(num, "toString(System.identityHashCode(obj))");
        return num;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public String getName(Object obj) {
        z65.h(obj, "obj");
        String simpleName = obj.getClass().getSimpleName();
        z65.g(simpleName, "obj.javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void init() {
    }
}
