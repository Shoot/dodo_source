package ru.dodopizza.backend.domain.stories.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StoriesTagsDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/stories/dto/StoriesTagsDto;", "", "tags", "", "", "infoStory", "Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;", "(Ljava/util/List;Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;)V", "getInfoStory", "()Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;", "setInfoStory", "(Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoriesTagsDto {
    @uca("infoStories")
    private InfoStoryDto infoStory;
    @uca("tags")
    private List<String> tags;

    public StoriesTagsDto() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesTagsDto copy$default(StoriesTagsDto storiesTagsDto, List list, InfoStoryDto infoStoryDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storiesTagsDto.tags;
        }
        if ((i & 2) != 0) {
            infoStoryDto = storiesTagsDto.infoStory;
        }
        return storiesTagsDto.copy(list, infoStoryDto);
    }

    public final List<String> component1() {
        return this.tags;
    }

    public final InfoStoryDto component2() {
        return this.infoStory;
    }

    public final StoriesTagsDto copy(List<String> list, InfoStoryDto infoStoryDto) {
        return new StoriesTagsDto(list, infoStoryDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesTagsDto)) {
            return false;
        }
        StoriesTagsDto storiesTagsDto = (StoriesTagsDto) obj;
        if (z65.c(this.tags, storiesTagsDto.tags) && z65.c(this.infoStory, storiesTagsDto.infoStory)) {
            return true;
        }
        return false;
    }

    public final InfoStoryDto getInfoStory() {
        return this.infoStory;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int hashCode;
        List<String> list = this.tags;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        InfoStoryDto infoStoryDto = this.infoStory;
        if (infoStoryDto != null) {
            i = infoStoryDto.hashCode();
        }
        return i2 + i;
    }

    public final void setInfoStory(InfoStoryDto infoStoryDto) {
        this.infoStory = infoStoryDto;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public String toString() {
        List<String> list = this.tags;
        InfoStoryDto infoStoryDto = this.infoStory;
        return "StoriesTagsDto(tags=" + list + ", infoStory=" + infoStoryDto + ")";
    }

    public StoriesTagsDto(List<String> list, InfoStoryDto infoStoryDto) {
        this.tags = list;
        this.infoStory = infoStoryDto;
    }

    public /* synthetic */ StoriesTagsDto(List list, InfoStoryDto infoStoryDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : infoStoryDto);
    }
}
