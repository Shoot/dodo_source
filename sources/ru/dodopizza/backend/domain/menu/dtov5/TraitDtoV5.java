package ru.dodopizza.backend.domain.menu.dtov5;

import com.dodopizza.persistence.entity.menu.ProductEntity;
import kotlin.Metadata;
/* compiled from: TraitDtoV5.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/TraitDtoV5;", "", "spicy", "", "vegan", "forChildren", "baked", "drink", "food", "digital", "material", "hotAndReady", "alcohol", ProductEntity.TYPE_PIZZA, "sauce", "(ZZZZZZZZZZZZ)V", "getAlcohol", "()Z", "getBaked", "getDigital", "getDrink", "getFood", "getForChildren", "getHotAndReady", "getMaterial", "getPizza", "getSauce", "getSpicy", "getVegan", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TraitDtoV5 {
    @uca("alcohol")
    private final boolean alcohol;
    @uca("baked")
    private final boolean baked;
    @uca("digital")
    private final boolean digital;
    @uca("drink")
    private final boolean drink;
    @uca("food")
    private final boolean food;
    @uca("forChildren")
    private final boolean forChildren;
    @uca("hotAndReady")
    private final boolean hotAndReady;
    @uca("material")
    private final boolean material;
    @uca(ProductEntity.TYPE_PIZZA)
    private final boolean pizza;
    @uca("sauce")
    private final boolean sauce;
    @uca("spicy")
    private final boolean spicy;
    @uca("vegan")
    private final boolean vegan;

    public TraitDtoV5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.spicy = z;
        this.vegan = z2;
        this.forChildren = z3;
        this.baked = z4;
        this.drink = z5;
        this.food = z6;
        this.digital = z7;
        this.material = z8;
        this.hotAndReady = z9;
        this.alcohol = z10;
        this.pizza = z11;
        this.sauce = z12;
    }

    public static /* synthetic */ TraitDtoV5 copy$default(TraitDtoV5 traitDtoV5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, Object obj) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        if ((i & 1) != 0) {
            z13 = traitDtoV5.spicy;
        } else {
            z13 = z;
        }
        if ((i & 2) != 0) {
            z14 = traitDtoV5.vegan;
        } else {
            z14 = z2;
        }
        if ((i & 4) != 0) {
            z15 = traitDtoV5.forChildren;
        } else {
            z15 = z3;
        }
        if ((i & 8) != 0) {
            z16 = traitDtoV5.baked;
        } else {
            z16 = z4;
        }
        if ((i & 16) != 0) {
            z17 = traitDtoV5.drink;
        } else {
            z17 = z5;
        }
        if ((i & 32) != 0) {
            z18 = traitDtoV5.food;
        } else {
            z18 = z6;
        }
        if ((i & 64) != 0) {
            z19 = traitDtoV5.digital;
        } else {
            z19 = z7;
        }
        if ((i & 128) != 0) {
            z20 = traitDtoV5.material;
        } else {
            z20 = z8;
        }
        if ((i & 256) != 0) {
            z21 = traitDtoV5.hotAndReady;
        } else {
            z21 = z9;
        }
        if ((i & 512) != 0) {
            z22 = traitDtoV5.alcohol;
        } else {
            z22 = z10;
        }
        if ((i & 1024) != 0) {
            z23 = traitDtoV5.pizza;
        } else {
            z23 = z11;
        }
        if ((i & 2048) != 0) {
            z24 = traitDtoV5.sauce;
        } else {
            z24 = z12;
        }
        return traitDtoV5.copy(z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24);
    }

    public final boolean component1() {
        return this.spicy;
    }

    public final boolean component10() {
        return this.alcohol;
    }

    public final boolean component11() {
        return this.pizza;
    }

    public final boolean component12() {
        return this.sauce;
    }

    public final boolean component2() {
        return this.vegan;
    }

    public final boolean component3() {
        return this.forChildren;
    }

    public final boolean component4() {
        return this.baked;
    }

    public final boolean component5() {
        return this.drink;
    }

    public final boolean component6() {
        return this.food;
    }

    public final boolean component7() {
        return this.digital;
    }

    public final boolean component8() {
        return this.material;
    }

    public final boolean component9() {
        return this.hotAndReady;
    }

    public final TraitDtoV5 copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return new TraitDtoV5(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraitDtoV5)) {
            return false;
        }
        TraitDtoV5 traitDtoV5 = (TraitDtoV5) obj;
        if (this.spicy == traitDtoV5.spicy && this.vegan == traitDtoV5.vegan && this.forChildren == traitDtoV5.forChildren && this.baked == traitDtoV5.baked && this.drink == traitDtoV5.drink && this.food == traitDtoV5.food && this.digital == traitDtoV5.digital && this.material == traitDtoV5.material && this.hotAndReady == traitDtoV5.hotAndReady && this.alcohol == traitDtoV5.alcohol && this.pizza == traitDtoV5.pizza && this.sauce == traitDtoV5.sauce) {
            return true;
        }
        return false;
    }

    public final boolean getAlcohol() {
        return this.alcohol;
    }

    public final boolean getBaked() {
        return this.baked;
    }

    public final boolean getDigital() {
        return this.digital;
    }

    public final boolean getDrink() {
        return this.drink;
    }

    public final boolean getFood() {
        return this.food;
    }

    public final boolean getForChildren() {
        return this.forChildren;
    }

    public final boolean getHotAndReady() {
        return this.hotAndReady;
    }

    public final boolean getMaterial() {
        return this.material;
    }

    public final boolean getPizza() {
        return this.pizza;
    }

    public final boolean getSauce() {
        return this.sauce;
    }

    public final boolean getSpicy() {
        return this.spicy;
    }

    public final boolean getVegan() {
        return this.vegan;
    }

    public int hashCode() {
        return (((((((((((((((((((((a91.a(this.spicy) * 31) + a91.a(this.vegan)) * 31) + a91.a(this.forChildren)) * 31) + a91.a(this.baked)) * 31) + a91.a(this.drink)) * 31) + a91.a(this.food)) * 31) + a91.a(this.digital)) * 31) + a91.a(this.material)) * 31) + a91.a(this.hotAndReady)) * 31) + a91.a(this.alcohol)) * 31) + a91.a(this.pizza)) * 31) + a91.a(this.sauce);
    }

    public String toString() {
        boolean z = this.spicy;
        boolean z2 = this.vegan;
        boolean z3 = this.forChildren;
        boolean z4 = this.baked;
        boolean z5 = this.drink;
        boolean z6 = this.food;
        boolean z7 = this.digital;
        boolean z8 = this.material;
        boolean z9 = this.hotAndReady;
        boolean z10 = this.alcohol;
        boolean z11 = this.pizza;
        boolean z12 = this.sauce;
        return "TraitDtoV5(spicy=" + z + ", vegan=" + z2 + ", forChildren=" + z3 + ", baked=" + z4 + ", drink=" + z5 + ", food=" + z6 + ", digital=" + z7 + ", material=" + z8 + ", hotAndReady=" + z9 + ", alcohol=" + z10 + ", pizza=" + z11 + ", sauce=" + z12 + ")";
    }
}
