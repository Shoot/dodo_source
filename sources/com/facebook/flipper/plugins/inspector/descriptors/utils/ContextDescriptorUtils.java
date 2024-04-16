package com.facebook.flipper.plugins.inspector.descriptors.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.facebook.flipper.core.FlipperObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ContextDescriptorUtils {
    private static String TAG = "ContextDescriptor";
    private static boolean doneFieldDiscovery = false;
    private static Method sAssetManagerGetStyleAttributesMethod;
    private static Field sThemeImplAssetManagerField;
    private static Field sThemeImplField;
    private static Field sThemeImplThemeKeyField;
    private static Field sThemeKeyResIdField;

    private ContextDescriptorUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Map<String, FlipperObject.Builder> collectThemeValues(Context context) {
        Resources.Theme theme;
        AssetManager assets;
        char c;
        int i;
        Object obj;
        Field field;
        HashMap hashMap = new HashMap(3);
        try {
            theme = context.getTheme();
            assets = context.getAssets();
            c = 0;
            i = 1;
            if (!doneFieldDiscovery) {
                doneFieldDiscovery = true;
                try {
                    Field declaredField = theme.getClass().getDeclaredField("mThemeImpl");
                    sThemeImplField = declaredField;
                    declaredField.setAccessible(true);
                    Object obj2 = sThemeImplField.get(theme);
                    Field declaredField2 = obj2.getClass().getDeclaredField("mKey");
                    sThemeImplThemeKeyField = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = obj2.getClass().getDeclaredField("mAssets");
                    sThemeImplAssetManagerField = declaredField3;
                    declaredField3.setAccessible(true);
                    Method declaredMethod = assets.getClass().getDeclaredMethod("getStyleAttributes", Integer.TYPE);
                    sAssetManagerGetStyleAttributesMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                    obj = sThemeImplThemeKeyField.get(obj2);
                    Field declaredField4 = obj.getClass().getDeclaredField("mResId");
                    sThemeKeyResIdField = declaredField4;
                    declaredField4.setAccessible(true);
                } catch (NoSuchFieldException | NoSuchMethodException unused) {
                    return hashMap;
                }
            } else {
                Field field2 = sThemeImplField;
                if (field2 != null && sThemeImplThemeKeyField != null) {
                    obj = sThemeImplThemeKeyField.get(field2.get(theme));
                } else {
                    obj = null;
                }
            }
            field = sThemeKeyResIdField;
        } catch (Throwable th) {
            Log.d(TAG, "Failed to generate theme attribute data!", th);
        }
        if (field != null && sAssetManagerGetStyleAttributesMethod != null && obj != null) {
            int[] iArr = (int[]) field.get(obj);
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            int length = iArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    String resourceName = resources.getResourceName(i3);
                    if (!hashMap.containsKey(resourceName)) {
                        FlipperObject.Builder builder = new FlipperObject.Builder();
                        hashMap.put(resourceName, builder);
                        Method method = sAssetManagerGetStyleAttributesMethod;
                        Object[] objArr = new Object[i];
                        objArr[c] = Integer.valueOf(i3);
                        int[] iArr2 = (int[]) method.invoke(assets, objArr);
                        int length2 = iArr2.length;
                        int i4 = 0;
                        boolean z = i;
                        while (i4 < length2) {
                            int i5 = iArr2[i4];
                            if (theme.resolveAttribute(i5, typedValue, z)) {
                                String resourceName2 = context.getResources().getResourceName(i5);
                                String[] split = resourceName2.split(":");
                                if (split.length < 2) {
                                    String str = TAG;
                                    Log.d(str, "Unknown attribute name format " + resourceName2);
                                } else {
                                    resourceName2 = split[1].split("/")[1];
                                }
                                String coerceToString = TypedValue.coerceToString(typedValue.type, typedValue.data);
                                if (coerceToString == null) {
                                    coerceToString = "null";
                                } else if (coerceToString.startsWith("@")) {
                                    int parseInt = Integer.parseInt(coerceToString.substring(1));
                                    if (parseInt == 0) {
                                        coerceToString = "null";
                                    } else {
                                        coerceToString = context.getResources().getResourceName(parseInt);
                                    }
                                    builder.put(resourceName2, coerceToString);
                                }
                                builder.put(resourceName2, coerceToString);
                            }
                            i4++;
                            z = true;
                        }
                    }
                }
                i2++;
                c = 0;
                i = 1;
            }
            return hashMap;
        }
        return hashMap;
    }

    public static FlipperObject themeData(Context context) {
        FlipperObject.Builder builder = new FlipperObject.Builder();
        for (Map.Entry<String, FlipperObject.Builder> entry : collectThemeValues(context).entrySet()) {
            builder.put(entry.getKey(), entry.getValue().build());
        }
        return builder.build();
    }
}
