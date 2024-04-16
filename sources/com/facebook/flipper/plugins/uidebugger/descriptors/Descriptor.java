package com.facebook.flipper.plugins.uidebugger.descriptors;

import kotlin.Metadata;
/* compiled from: Descriptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0004J\u0016\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/Descriptor;", "T", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/NodeDescriptor;", "()V", "descritorRegister", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "getDescritorRegister", "()Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "setDescritorRegister", "(Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;)V", "descriptorForClass", "clazz", "Ljava/lang/Class;", "descriptorForObject", "obj", "", "setDescriptorRegister", "", "descriptorMapping", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Descriptor<T> implements NodeDescriptor<T> {
    private DescriptorRegister descritorRegister;

    protected final Descriptor<?> descriptorForClass(Class<?> cls) {
        z65.h(cls, "clazz");
        DescriptorRegister descriptorRegister = this.descritorRegister;
        if (descriptorRegister == null) {
            return null;
        }
        return descriptorRegister.descriptorForClass(cls);
    }

    protected final Descriptor<?> descriptorForObject(Object obj) {
        z65.h(obj, "obj");
        DescriptorRegister descriptorRegister = this.descritorRegister;
        if (descriptorRegister == null) {
            return null;
        }
        return descriptorRegister.descriptorForClass(obj.getClass());
    }

    public final DescriptorRegister getDescritorRegister() {
        return this.descritorRegister;
    }

    public final void setDescriptorRegister(DescriptorRegister descriptorRegister) {
        z65.h(descriptorRegister, "descriptorMapping");
        this.descritorRegister = descriptorRegister;
    }

    public final void setDescritorRegister(DescriptorRegister descriptorRegister) {
        this.descritorRegister = descriptorRegister;
    }
}
