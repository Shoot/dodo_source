package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MoneyType.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/MoneyType;", "Lyi3;", "Lio/realm/n0;", "", "currency", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "", "amount", "D", "getAmount", "()D", "setAmount", "(D)V", "id", "getId", "setId", "<init>", "(Ljava/lang/String;D)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MoneyType extends n0 implements yi3, vec {
    private double amount;
    private String currency;
    private String id;

    public MoneyType() {
        this(null, 0.0d, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public double getAmount() {
        return realmGet$amount();
    }

    public String getCurrency() {
        return realmGet$currency();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.vec
    public double realmGet$amount() {
        return this.amount;
    }

    @Override // defpackage.vec
    public String realmGet$currency() {
        return this.currency;
    }

    @Override // defpackage.vec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.vec
    public void realmSet$amount(double d) {
        this.amount = d;
    }

    @Override // defpackage.vec
    public void realmSet$currency(String str) {
        this.currency = str;
    }

    @Override // defpackage.vec
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setAmount(double d) {
        realmSet$amount(d);
    }

    public void setCurrency(String str) {
        z65.h(str, "<set-?>");
        realmSet$currency(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ MoneyType(String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public MoneyType(String str, double d) {
        z65.h(str, "currency");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$currency(str);
        realmSet$amount(d);
        realmSet$id("");
    }
}
