package com.inappstory.sdk.stories.cache;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Story;
import java.util.Objects;
/* loaded from: classes3.dex */
public class SlideTaskData {
    public Integer index;
    public Integer storyId;
    public Story.StoryType storyType;

    public SlideTaskData(Integer num, Integer num2, Story.StoryType storyType) {
        this.storyId = num;
        this.index = num2;
        this.storyType = storyType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlideTaskData slideTaskData = (SlideTaskData) obj;
        if (Objects.equals(this.storyId, slideTaskData.storyId) && Objects.equals(this.index, slideTaskData.index) && this.storyType == slideTaskData.storyType) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.storyId, this.index, this.storyType);
    }

    public String toString() {
        return "Slide{, storyId = " + this.storyId + ", slideIndex = " + this.index + CoreConstants.CURLY_RIGHT;
    }

    public SlideTaskData(c cVar, Integer num) {
        this.storyId = cVar.a;
        this.index = num;
        this.storyType = cVar.b;
    }
}
