package com.dodopizza.persistence.entity.cart;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalPriceDiscountEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/PersonalPriceDiscountEntity;", "Lyi3;", "Lio/realm/n0;", "", "endDateTimeUtc", "J", "getEndDateTimeUtc", "()J", "setEndDateTimeUtc", "(J)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PersonalPriceDiscountEntity extends n0 implements yi3, tfc {
    private long endDateTimeUtc;
    private String id;

    public PersonalPriceDiscountEntity() {
        this(0L, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public long getEndDateTimeUtc() {
        return realmGet$endDateTimeUtc();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.tfc
    public long realmGet$endDateTimeUtc() {
        return this.endDateTimeUtc;
    }

    @Override // defpackage.tfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.tfc
    public void realmSet$endDateTimeUtc(long j) {
        this.endDateTimeUtc = j;
    }

    @Override // defpackage.tfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setEndDateTimeUtc(long j) {
        realmSet$endDateTimeUtc(j);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ PersonalPriceDiscountEntity(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PersonalPriceDiscountEntity(long j) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$endDateTimeUtc(j);
    }
}
