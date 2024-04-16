package ru.dodopizza.backend.domain.menu.dto;

import kotlin.Metadata;
/* compiled from: FoodValueDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/FoodValueDto;", "", "fats", "", "proteins", "carbohydrates", "kiloCalories", "weight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarbohydrates", "()Ljava/lang/String;", "getFats", "getKiloCalories", "getProteins", "getWeight", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FoodValueDto {
    @uca("carbohydrates")
    private final String carbohydrates;
    @uca("fats")
    private final String fats;
    @uca("kiloCalories")
    private final String kiloCalories;
    @uca("proteins")
    private final String proteins;
    @uca("weight")
    private final String weight;

    public FoodValueDto(String str, String str2, String str3, String str4, String str5) {
        this.fats = str;
        this.proteins = str2;
        this.carbohydrates = str3;
        this.kiloCalories = str4;
        this.weight = str5;
    }

    public final String getCarbohydrates() {
        return this.carbohydrates;
    }

    public final String getFats() {
        return this.fats;
    }

    public final String getKiloCalories() {
        return this.kiloCalories;
    }

    public final String getProteins() {
        return this.proteins;
    }

    public final String getWeight() {
        return this.weight;
    }
}
