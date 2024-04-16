package com.facebook.flipper.plugins.uidebugger.common;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Node.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/Node;", "", ActionConst.REF_ATTRIBUTE, "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "attributes", "", "", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "getRef", "()Ljava/lang/ref/WeakReference;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Node {
    private Map<String, ? extends Object> attributes;
    private List<Node> children;
    private String id;
    private String name;
    private final WeakReference<Object> ref;

    public Node(WeakReference<Object> weakReference) {
        z65.h(weakReference, ActionConst.REF_ATTRIBUTE);
        this.ref = weakReference;
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final List<Node> getChildren() {
        return this.children;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final WeakReference<Object> getRef() {
        return this.ref;
    }

    public final void setAttributes(Map<String, ? extends Object> map) {
        this.attributes = map;
    }

    public final void setChildren(List<Node> list) {
        this.children = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
