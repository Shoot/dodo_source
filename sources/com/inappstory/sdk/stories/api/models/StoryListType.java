package com.inappstory.sdk.stories.api.models;

import androidx.annotation.NonNull;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
/* loaded from: classes3.dex */
public class StoryListType implements ParameterizedType {
    @Override // java.lang.reflect.ParameterizedType
    @NonNull
    public Type[] getActualTypeArguments() {
        return new Type[]{Story.class};
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return List.class;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NonNull
    public Type getRawType() {
        return List.class;
    }
}
