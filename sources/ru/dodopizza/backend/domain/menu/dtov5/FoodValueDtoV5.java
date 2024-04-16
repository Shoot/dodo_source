package ru.dodopizza.backend.domain.menu.dtov5;

import kotlin.Metadata;
/* compiled from: FoodValueDtoV5.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/FoodValueDtoV5;", "", "proteins", "", "fats", "carbohydrates", "calories", "weight", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getCalories", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCarbohydrates", "getFats", "getProteins", "getWeight", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FoodValueDtoV5 {
    @uca("calories")
    private final Double calories;
    @uca("carbohydrates")
    private final Double carbohydrates;
    @uca("fats")
    private final Double fats;
    @uca("proteins")
    private final Double proteins;
    @uca("weight")
    private final Double weight;

    public FoodValueDtoV5(Double d, Double d2, Double d3, Double d4, Double d5) {
        this.proteins = d;
        this.fats = d2;
        this.carbohydrates = d3;
        this.calories = d4;
        this.weight = d5;
    }

    public final Double getCalories() {
        return this.calories;
    }

    public final Double getCarbohydrates() {
        return this.carbohydrates;
    }

    public final Double getFats() {
        return this.fats;
    }

    public final Double getProteins() {
        return this.proteins;
    }

    public final Double getWeight() {
        return this.weight;
    }
}
