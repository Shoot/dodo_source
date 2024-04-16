package com.facebook.flipper.plugins.uidebugger.core;

import com.facebook.flipper.plugins.uidebugger.common.Node;
import com.facebook.flipper.plugins.uidebugger.descriptors.Descriptor;
import com.facebook.flipper.plugins.uidebugger.descriptors.DescriptorRegister;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LayoutTraversal.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0001H\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f*\u0006\u0012\u0002\b\u00030\u000fH\u0080\b¢\u0006\u0002\b\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/LayoutTraversal;", "", "descriptorRegister", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "(Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;)V", "describe", "Lcom/facebook/flipper/plugins/uidebugger/core/LayoutTraversal$IntermediateNode;", "obj", "inspect", "Lcom/facebook/flipper/plugins/uidebugger/common/Node;", "applicationRef", "Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationRef;", "traverse", "entry", "asAny", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/Descriptor;", "asAny$android_release", "IntermediateNode", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LayoutTraversal {
    private final DescriptorRegister descriptorRegister;

    /* compiled from: LayoutTraversal.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/LayoutTraversal$IntermediateNode;", "", "node", "Lcom/facebook/flipper/plugins/uidebugger/common/Node;", "(Lcom/facebook/flipper/plugins/uidebugger/common/Node;)V", "children", "", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getNode", "()Lcom/facebook/flipper/plugins/uidebugger/common/Node;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class IntermediateNode {
        private List<? extends Object> children;
        private final Node node;

        public IntermediateNode(Node node) {
            z65.h(node, "node");
            this.node = node;
        }

        public final List<Object> getChildren() {
            return this.children;
        }

        public final Node getNode() {
            return this.node;
        }

        public final void setChildren(List<? extends Object> list) {
            this.children = list;
        }
    }

    public LayoutTraversal(DescriptorRegister descriptorRegister) {
        z65.h(descriptorRegister, "descriptorRegister");
        this.descriptorRegister = descriptorRegister;
    }

    private final IntermediateNode describe(Object obj) {
        IntermediateNode intermediateNode = new IntermediateNode(new Node(new WeakReference(obj)));
        Descriptor<?> descriptorForClass = this.descriptorRegister.descriptorForClass(obj.getClass());
        if (descriptorForClass != null) {
            intermediateNode.getNode().setId(descriptorForClass.getId(obj));
            intermediateNode.getNode().setName(descriptorForClass.getName(obj));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            descriptorForClass.getData(obj, linkedHashMap);
            intermediateNode.getNode().setAttributes(linkedHashMap);
            ArrayList arrayList = new ArrayList();
            descriptorForClass.getChildren(obj, arrayList);
            intermediateNode.setChildren(arrayList);
        }
        return intermediateNode;
    }

    private final Node traverse(Object obj) {
        Object J;
        IntermediateNode describe = describe(obj);
        if (describe != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(describe);
            while (!arrayList.isEmpty()) {
                J = pc1.J(arrayList);
                IntermediateNode intermediateNode = (IntermediateNode) J;
                ArrayList arrayList2 = new ArrayList();
                List<Object> children = intermediateNode.getChildren();
                if (children != null) {
                    for (Object obj2 : children) {
                        IntermediateNode describe2 = describe(obj2);
                        arrayList2.add(describe2.getNode());
                        arrayList.add(describe2);
                    }
                }
                intermediateNode.getNode().setChildren(arrayList2);
            }
        }
        if (describe == null) {
            return null;
        }
        return describe.getNode();
    }

    public final Descriptor<Object> asAny$android_release(Descriptor<?> descriptor) {
        z65.h(descriptor, "<this>");
        return descriptor;
    }

    public final Node inspect(ApplicationRef applicationRef) {
        z65.h(applicationRef, "applicationRef");
        return traverse(applicationRef);
    }
}
