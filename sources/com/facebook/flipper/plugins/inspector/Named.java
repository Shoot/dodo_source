package com.facebook.flipper.plugins.inspector;
/* loaded from: classes2.dex */
public class Named<ValueType> {
    private final String mName;
    private final ValueType mValue;

    public Named(String str, ValueType valuetype) {
        this.mName = str;
        this.mValue = valuetype;
    }

    public String getName() {
        return this.mName;
    }

    public ValueType getValue() {
        return this.mValue;
    }
}
