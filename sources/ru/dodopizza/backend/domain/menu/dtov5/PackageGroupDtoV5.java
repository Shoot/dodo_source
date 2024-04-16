package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: PackageGroupDtoV5.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0002\u0010\u0010R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/PackageGroupDtoV5;", "", "code", "", Action.NAME_ATTRIBUTE, "choiceType", "totalQuantityMin", "", "totalQuantityMax", "packageOptions", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/PackageDtoV5;", "index", "additionalData", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;ILjava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getChoiceType", "()Ljava/lang/String;", "getCode", "getIndex", "()I", "getName", "getPackageOptions", "getTotalQuantityMax", "getTotalQuantityMin", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PackageGroupDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("choiceType")
    private final String choiceType;
    @uca("code")
    private final String code;
    @uca("index")
    private final int index;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("packageOptions")
    private final List<ReferenceWrapper<PackageDtoV5>> packageOptions;
    @uca("totalQuantityMax")
    private final int totalQuantityMax;
    @uca("totalQuantityMin")
    private final int totalQuantityMin;

    public PackageGroupDtoV5(String str, String str2, String str3, int i, int i2, List<ReferenceWrapper<PackageDtoV5>> list, int i3, List<AdditionalDataDtoV5> list2) {
        z65.h(str, "code");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "choiceType");
        z65.h(list, "packageOptions");
        z65.h(list2, "additionalData");
        this.code = str;
        this.name = str2;
        this.choiceType = str3;
        this.totalQuantityMin = i;
        this.totalQuantityMax = i2;
        this.packageOptions = list;
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

    public final String getName() {
        return this.name;
    }

    public final List<ReferenceWrapper<PackageDtoV5>> getPackageOptions() {
        return this.packageOptions;
    }

    public final int getTotalQuantityMax() {
        return this.totalQuantityMax;
    }

    public final int getTotalQuantityMin() {
        return this.totalQuantityMin;
    }
}
