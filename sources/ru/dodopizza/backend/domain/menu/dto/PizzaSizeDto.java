package ru.dodopizza.backend.domain.menu.dto;

import kotlin.Metadata;
/* compiled from: PizzaSizeDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;", "", "measure", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getMeasure", "()Ljava/lang/String;", "getValue", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PizzaSizeDto {
    @uca("measure")
    private final String measure;
    @uca("value")
    private final String value;

    public PizzaSizeDto(String str, String str2) {
        z65.h(str, "measure");
        z65.h(str2, "value");
        this.measure = str;
        this.value = str2;
    }

    public final String getMeasure() {
        return this.measure;
    }

    public final String getValue() {
        return this.value;
    }
}
