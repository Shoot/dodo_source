package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.menu.BuyMoreAPI;
/* compiled from: BuyMoreService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhj0;", "Lgj0;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "pizzeriaId", "Ljk7;", "orderType", "", "a", "Lru/dodopizza/backend/domain/menu/BuyMoreAPI;", "Lru/dodopizza/backend/domain/menu/BuyMoreAPI;", "buyMoreApi", "Lxi0;", "b", "Lxi0;", "buyMoreMenuRepository", "Ldt5;", c.a, "Ldt5;", "locality", "<init>", "(Lru/dodopizza/backend/domain/menu/BuyMoreAPI;Lxi0;Ldt5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hj0  reason: default package */
/* loaded from: classes4.dex */
public final class hj0 implements gj0 {
    private final BuyMoreAPI a;
    private final xi0 b;
    private final dt5 c;

    /* compiled from: BuyMoreService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hj0$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk7.values().length];
            try {
                iArr[jk7.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk7.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk7.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jk7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hj0(BuyMoreAPI buyMoreAPI, xi0 xi0Var, dt5 dt5Var) {
        z65.h(buyMoreAPI, "buyMoreApi");
        z65.h(xi0Var, "buyMoreMenuRepository");
        z65.h(dt5Var, "locality");
        this.a = buyMoreAPI;
        this.b = xi0Var;
        this.c = dt5Var;
    }

    @Override // defpackage.gj0
    public List<String> a(String str, String str2, jk7 jk7Var) {
        List<String> a2;
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(jk7Var, "orderType");
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[jk7Var.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    a2 = null;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                a2 = this.b.b(str);
            }
        } else {
            a2 = this.b.a(str);
        }
        List<String> list = a2;
        if (list == null || list.isEmpty()) {
            a2 = this.a.getBuyMoreList(str, str2, this.c.getId(), jk7Var.i(), this.c.a()).getShoppingItemIds();
            int i2 = iArr[jk7Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    this.b.c(str, a2);
                }
            } else {
                this.b.d(str, a2);
            }
        }
        return a2;
    }
}
