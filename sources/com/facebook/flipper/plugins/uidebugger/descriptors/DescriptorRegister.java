package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.flipper.plugins.uidebugger.core.ApplicationRef;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DescriptorRegister.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005J(\u0010\u0003\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006R\"\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "", "()V", "register", "", "Ljava/lang/Class;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/Descriptor;", "descriptorForClass", "clazz", "", "T", "descriptor", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DescriptorRegister {
    public static final Companion Companion = new Companion(null);
    private final Map<Class<?>, Descriptor<?>> register = new HashMap();

    /* compiled from: DescriptorRegister.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister$Companion;", "", "()V", "withDefaults", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/DescriptorRegister;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DescriptorRegister withDefaults() {
            DescriptorRegister descriptorRegister = new DescriptorRegister();
            descriptorRegister.register(Object.class, new ObjectDescriptor());
            descriptorRegister.register(ApplicationRef.class, new ApplicationDescriptor());
            descriptorRegister.register(Activity.class, new ActivityDescriptor());
            descriptorRegister.register(Window.class, new WindowDescriptor());
            descriptorRegister.register(ViewGroup.class, new ViewGroupDescriptor());
            descriptorRegister.register(View.class, new ViewDescriptor());
            descriptorRegister.register(TextView.class, new TextViewDescriptor());
            descriptorRegister.register(Button.class, new ButtonDescriptor());
            for (Class cls : descriptorRegister.register.keySet()) {
                Descriptor descriptor = (Descriptor) descriptorRegister.register.get(cls);
                if (descriptor != null && (descriptor instanceof ChainedDescriptor)) {
                    ChainedDescriptor chainedDescriptor = (ChainedDescriptor) descriptor;
                    Class<?> superclass = cls.getSuperclass();
                    z65.g(superclass, "clazz.getSuperclass()");
                    Descriptor<?> descriptorForClass = descriptorRegister.descriptorForClass(superclass);
                    if (descriptorForClass != null) {
                        chainedDescriptor.setSuper(descriptorForClass);
                    }
                }
            }
            for (Descriptor descriptor2 : descriptorRegister.register.values()) {
                descriptor2.setDescriptorRegister(descriptorRegister);
            }
            return descriptorRegister;
        }
    }

    public final Descriptor<?> descriptorForClass(Class<?> cls) {
        z65.h(cls, "clazz");
        while (!this.register.containsKey(cls)) {
            cls = cls.getSuperclass();
            z65.g(cls, "clazz.superclass");
        }
        return this.register.get(cls);
    }

    public final <T> void register(Class<T> cls, Descriptor<T> descriptor) {
        z65.h(cls, "clazz");
        z65.h(descriptor, "descriptor");
        this.register.put(cls, descriptor);
    }
}
