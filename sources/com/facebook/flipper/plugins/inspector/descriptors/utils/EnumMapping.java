package com.facebook.flipper.plugins.inspector.descriptors.utils;

import com.facebook.flipper.plugins.inspector.InspectorValue;
/* loaded from: classes2.dex */
public class EnumMapping<T> {
    private final String mDefaultKey;
    private final lr<String, T> mMapping = new lr<>();

    public EnumMapping(String str) {
        this.mDefaultKey = str;
    }

    public static <T> String findKeyForValue(wka<String, T> wkaVar, String str, T t) {
        int size = wkaVar.size();
        for (int i = 0; i < size; i++) {
            if (wkaVar.o(i).equals(t)) {
                return wkaVar.k(i);
            }
        }
        return str;
    }

    public InspectorValue<String> get(T t) {
        return get(t, true);
    }

    public void put(String str, T t) {
        this.mMapping.put(str, t);
    }

    public InspectorValue<?> toPicker() {
        return toPicker(true);
    }

    public InspectorValue<String> get(T t, boolean z) {
        String findKeyForValue = findKeyForValue(this.mMapping, this.mDefaultKey, t);
        return z ? InspectorValue.mutable(InspectorValue.Type.Enum, findKeyForValue) : InspectorValue.immutable(InspectorValue.Type.Enum, findKeyForValue);
    }

    public InspectorValue<?> toPicker(boolean z) {
        if (z) {
            return InspectorValue.mutable(InspectorValue.Type.Picker, new InspectorValue.Picker(this.mMapping.keySet(), this.mDefaultKey));
        }
        return InspectorValue.immutable(InspectorValue.Type.Enum, this.mDefaultKey);
    }

    public T get(String str) {
        if (this.mMapping.containsKey(str)) {
            return this.mMapping.get(str);
        }
        return this.mMapping.get(this.mDefaultKey);
    }

    public InspectorValue<?> toPicker(T t) {
        return toPicker(t, true);
    }

    public InspectorValue<?> toPicker(T t, boolean z) {
        String findKeyForValue = findKeyForValue(this.mMapping, this.mDefaultKey, t);
        if (z) {
            return InspectorValue.mutable(InspectorValue.Type.Picker, new InspectorValue.Picker(this.mMapping.keySet(), findKeyForValue));
        }
        return InspectorValue.immutable(InspectorValue.Type.Enum, findKeyForValue);
    }
}
