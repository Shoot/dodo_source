package defpackage;

import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.huawei.hms.opendevice.c;
import defpackage.mk2;
import kotlin.Metadata;
/* compiled from: CustomerAppModule.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"La52;", "", "Lgk2;", "Lcom/dodopizza/persistence/entity/address/AddressEntity;", "daoAddress", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationProfileEntity;", "daoDeliveryLocation", "Lv42;", c.a, "Ljk2;", "daoFactory", "a", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a52  reason: default package */
/* loaded from: classes3.dex */
public final class a52 {
    public static final a52 a = new a52();

    private a52() {
    }

    public final gk2<AddressEntity> a(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(AddressEntity.class), mk2.b.a);
    }

    public final gk2<ClientDeliveryLocationProfileEntity> b(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        return jk2Var.a(bc9.b(ClientDeliveryLocationProfileEntity.class), mk2.b.a);
    }

    public final v42 c(gk2<AddressEntity> gk2Var, gk2<ClientDeliveryLocationProfileEntity> gk2Var2) {
        z65.h(gk2Var, "daoAddress");
        z65.h(gk2Var2, "daoDeliveryLocation");
        return new w42(gk2Var, gk2Var2);
    }
}
