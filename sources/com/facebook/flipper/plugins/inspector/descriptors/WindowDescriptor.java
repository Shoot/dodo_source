package com.facebook.flipper.plugins.inspector.descriptors;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class WindowDescriptor extends NodeDescriptor<Window> {
    private static Object internalRStyleable;
    private static Class internalRStyleableClass;
    private static Field[] internalRStyleableFields;
    private static Field internalRStyleableWindowField;

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Window window) {
        return 1;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Window window) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Window window) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(Window window, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Window window) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Window window, int i) {
        return window.getDecorView();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Window window) {
        Field[] fieldArr;
        FlipperObject.Builder builder = new FlipperObject.Builder();
        try {
            if (internalRStyleableClass == null) {
                Class<?> cls = Class.forName("com.android.internal.R$styleable");
                internalRStyleableClass = cls;
                internalRStyleable = cls.newInstance();
                internalRStyleableFields = internalRStyleableClass.getDeclaredFields();
                Field declaredField = internalRStyleableClass.getDeclaredField("Window");
                internalRStyleableWindowField = declaredField;
                declaredField.setAccessible(true);
            }
            Context context = window.getContext();
            int[] iArr = (int[]) internalRStyleableWindowField.get(internalRStyleable);
            HashMap hashMap = new HashMap();
            for (Field field : internalRStyleableFields) {
                if (field.getName().startsWith("Window_") && field.getType() == Integer.TYPE) {
                    hashMap.put(Integer.valueOf(field.getInt(internalRStyleable)), field.getName());
                }
            }
            TypedValue typedValue = new TypedValue();
            int i = 0;
            for (int i2 : iArr) {
                String str = (String) hashMap.get(Integer.valueOf(i));
                i++;
                if (str != null && context.getTheme().resolveAttribute(i2, typedValue, true)) {
                    String coerceToString = TypedValue.coerceToString(typedValue.type, typedValue.data);
                    if (coerceToString != null) {
                        if (coerceToString.startsWith("@")) {
                            int parseInt = Integer.parseInt(coerceToString.substring(1));
                            if (parseInt != 0) {
                                coerceToString = context.getResources().getResourceName(parseInt);
                            }
                        }
                        builder.put(str.substring(7), coerceToString);
                    }
                    coerceToString = "null";
                    builder.put(str.substring(7), coerceToString);
                }
            }
        } catch (Throwable th) {
            Log.d("WindowDescriptor", "Failed to generate a window descriptor!", th);
        }
        return Collections.singletonList(new Named("Window", builder.build()));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Window window) {
        return Integer.toString(System.identityHashCode(window));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Window window) {
        return window.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Window window, boolean z) throws Exception {
        return descriptorForClass(View.class).getSnapshot(window.getDecorView(), true);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Window window, Touch touch) {
        touch.continueWithOffset(0, 0, 0);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Window window) throws Exception {
        return descriptorForClass(Object.class).matches(str, window);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Window window, boolean z, boolean z2) throws Exception {
        descriptorForClass(View.class).setHighlighted(window.getDecorView(), z, z2);
    }
}
