package com.inappstory.sdk.stories.cache;

import com.inappstory.sdk.stories.api.models.Story;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StoryTaskData.java */
/* loaded from: classes3.dex */
public class c {
    public Integer a;
    public Story.StoryType b;

    public c(Integer num, Story.StoryType storyType) {
        this.a = num;
        this.b = storyType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (Objects.equals(this.a, cVar.a) && this.b == cVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
