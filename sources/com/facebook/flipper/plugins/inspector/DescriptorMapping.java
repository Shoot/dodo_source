package com.facebook.flipper.plugins.inspector;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.plugins.inspector.descriptors.ActivityDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.DialogDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.DialogFragmentDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.DrawableDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.FragmentDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.ImageViewDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.ObjectDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.SupportDialogFragmentDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.SupportFragmentDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.TextViewDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.ViewDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.ViewGroupDescriptor;
import com.facebook.flipper.plugins.inspector.descriptors.WindowDescriptor;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class DescriptorMapping {
    private Map<Class<?>, NodeDescriptor<?>> mMapping = new HashMap();

    public static DescriptorMapping withDefaults() {
        DescriptorMapping descriptorMapping = new DescriptorMapping();
        descriptorMapping.register(Object.class, new ObjectDescriptor());
        descriptorMapping.register(ApplicationWrapper.class, new ApplicationDescriptor());
        descriptorMapping.register(Activity.class, new ActivityDescriptor());
        descriptorMapping.register(Window.class, new WindowDescriptor());
        descriptorMapping.register(ViewGroup.class, new ViewGroupDescriptor());
        descriptorMapping.register(View.class, new ViewDescriptor());
        descriptorMapping.register(TextView.class, new TextViewDescriptor());
        descriptorMapping.register(ImageView.class, new ImageViewDescriptor());
        descriptorMapping.register(Drawable.class, new DrawableDescriptor());
        descriptorMapping.register(Dialog.class, new DialogDescriptor());
        descriptorMapping.register(Fragment.class, new FragmentDescriptor());
        descriptorMapping.register(androidx.fragment.app.Fragment.class, new SupportFragmentDescriptor());
        descriptorMapping.register(DialogFragment.class, new DialogFragmentDescriptor());
        descriptorMapping.register(c.class, new SupportDialogFragmentDescriptor());
        return descriptorMapping;
    }

    public NodeDescriptor<?> descriptorForClass(Class<?> cls) {
        while (!this.mMapping.containsKey(cls)) {
            cls = cls.getSuperclass();
        }
        return this.mMapping.get(cls);
    }

    public void onConnect(FlipperConnection flipperConnection) {
        for (NodeDescriptor<?> nodeDescriptor : this.mMapping.values()) {
            nodeDescriptor.setConnection(flipperConnection);
            nodeDescriptor.setDescriptorMapping(this);
        }
    }

    public void onDisconnect() {
        for (NodeDescriptor<?> nodeDescriptor : this.mMapping.values()) {
            nodeDescriptor.setConnection(null);
        }
    }

    public <T> void register(Class<T> cls, NodeDescriptor<T> nodeDescriptor) {
        this.mMapping.put(cls, nodeDescriptor);
    }
}
