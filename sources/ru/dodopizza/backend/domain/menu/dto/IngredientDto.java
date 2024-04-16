package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: IngredientDto.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/IngredientDto;", "", "id", "", "parentId", Action.NAME_ATTRIBUTE, "isRemovable", "", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageUrl", "()Z", "getName", "getParentId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IngredientDto {
    @uca("id")
    private final String id;
    @uca("menuImagePath")
    private final String imageUrl;
    @uca("isRemovable")
    private final boolean isRemovable;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("parentUUId")
    private final String parentId;

    public IngredientDto(String str, String str2, String str3, boolean z, String str4) {
        z65.h(str, "id");
        z65.h(str2, "parentId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "imageUrl");
        this.id = str;
        this.parentId = str2;
        this.name = str3;
        this.isRemovable = z;
        this.imageUrl = str4;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final boolean isRemovable() {
        return this.isRemovable;
    }
}
