package ru.dodopizza.backend.domain.cart.dto;

import kotlin.Metadata;
/* compiled from: SizeDto.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/cart/dto/SizeDto;", "", "measure", "", "value", "", "(IF)V", "getMeasure", "()I", "getValue", "()F", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SizeDto {
    @uca("measure")
    private final int measure;
    @uca("value")
    private final float value;

    public SizeDto(int i, float f) {
        this.measure = i;
        this.value = f;
    }

    public final int getMeasure() {
        return this.measure;
    }

    public final float getValue() {
        return this.value;
    }
}
