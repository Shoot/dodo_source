package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: IngredientGroupDtoV5.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\u0010\u0012R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/IngredientGroupDtoV5;", "", "code", "", "isBasis", "", Action.NAME_ATTRIBUTE, "choiceType", "totalQuantityMin", "", "totalQuantityMax", "ingredients", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/IngredientDtoV5;", "index", "additionalData", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/List;ILjava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getChoiceType", "()Ljava/lang/String;", "getCode", "getIndex", "()I", "getIngredients", "()Z", "getName", "getTotalQuantityMax", "getTotalQuantityMin", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IngredientGroupDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("choiceType")
    private final String choiceType;
    @uca("code")
    private final String code;
    @uca("index")
    private final int index;
    @uca("ingredients")
    private final List<ReferenceWrapper<IngredientDtoV5>> ingredients;
    @uca("isBasis")
    private final boolean isBasis;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("totalQuantityMax")
    private final int totalQuantityMax;
    @uca("totalQuantityMin")
    private final int totalQuantityMin;

    public IngredientGroupDtoV5(String str, boolean z, String str2, String str3, int i, int i2, List<ReferenceWrapper<IngredientDtoV5>> list, int i3, List<AdditionalDataDtoV5> list2) {
        z65.h(str, "code");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "choiceType");
        z65.h(list, "ingredients");
        z65.h(list2, "additionalData");
        this.code = str;
        this.isBasis = z;
        this.name = str2;
        this.choiceType = str3;
        this.totalQuantityMin = i;
        this.totalQuantityMax = i2;
        this.ingredients = list;
        this.index = i3;
        this.additionalData = list2;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final String getChoiceType() {
        return this.choiceType;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<ReferenceWrapper<IngredientDtoV5>> getIngredients() {
        return this.ingredients;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTotalQuantityMax() {
        return this.totalQuantityMax;
    }

    public final int getTotalQuantityMin() {
        return this.totalQuantityMin;
    }

    public final boolean isBasis() {
        return this.isBasis;
    }
}
