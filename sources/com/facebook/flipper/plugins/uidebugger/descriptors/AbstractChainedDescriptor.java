package com.facebook.flipper.plugins.uidebugger.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AbstractChainedDescriptor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fH\u0016¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fH\u0016¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "T", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/Descriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/ChainedDescriptor;", "()V", "mSuper", "getChildren", "", "node", "children", "", "", "(Ljava/lang/Object;Ljava/util/List;)V", "getData", "builder", "", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "getId", "(Ljava/lang/Object;)Ljava/lang/String;", "getName", "getSuper", "init", "onGetChildren", "onGetData", "onGetId", "onGetName", "onInit", "setSuper", "superDescriptor", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractChainedDescriptor<T> extends Descriptor<T> implements ChainedDescriptor<T> {
    private Descriptor<T> mSuper;

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void getChildren(T t, List<Object> list) {
        z65.h(list, "children");
        Descriptor<T> descriptor = this.mSuper;
        if (descriptor != null) {
            descriptor.getChildren(t, list);
        }
        onGetChildren(t, list);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void getData(T t, Map<String, Object> map) {
        z65.h(map, "builder");
        Descriptor<T> descriptor = this.mSuper;
        if (descriptor != null) {
            descriptor.getData(t, map);
        }
        onGetData(t, map);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public String getId(T t) {
        return onGetId(t);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public String getName(T t) {
        return onGetName(t);
    }

    public final Descriptor<T> getSuper() {
        return this.mSuper;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.NodeDescriptor
    public void init() {
        Descriptor<T> descriptor = this.mSuper;
        if (descriptor != null) {
            descriptor.init();
        }
        onInit();
    }

    public void onGetChildren(T t, List<Object> list) {
        z65.h(list, "children");
    }

    public void onGetData(T t, Map<String, Object> map) {
        z65.h(map, "builder");
    }

    public abstract String onGetId(T t);

    public abstract String onGetName(T t);

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.ChainedDescriptor
    public void setSuper(Descriptor<T> descriptor) {
        z65.h(descriptor, "superDescriptor");
        Descriptor<T> descriptor2 = this.mSuper;
        if (descriptor != descriptor2) {
            if (descriptor2 == null) {
                this.mSuper = descriptor;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public void onInit() {
    }
}
