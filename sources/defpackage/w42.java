package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ou2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CustomerAddressRepositoryImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001e"}, d2 = {"Lw42;", "Lv42;", "", "Lou2;", "deliverablePlaces", "", "b", "deliverablePlace", "f", "", "id", DateTokenConverter.CONVERTER_KEY, c.a, "Lw6;", e.a, "Le91;", "g", "clear", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "deliveryAddress", Image.TYPE_HIGH, "a", "Lgk2;", "Lcom/dodopizza/persistence/entity/address/AddressEntity;", "Lgk2;", "daoAddress", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationProfileEntity;", "daoClientDeliveryLocationProfile", "<init>", "(Lgk2;Lgk2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w42  reason: default package */
/* loaded from: classes4.dex */
public final class w42 implements v42 {
    private final gk2<AddressEntity> a;
    private final gk2<ClientDeliveryLocationProfileEntity> b;

    /* compiled from: CustomerAddressRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/address/AddressEntity;", SearchIntents.EXTRA_QUERY, "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w42$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<AddressEntity>, vu8<AddressEntity>> {
        final /* synthetic */ DeliveryAddressEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DeliveryAddressEntity deliveryAddressEntity) {
            super(1);
            this.a = deliveryAddressEntity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<AddressEntity> invoke(vu8<AddressEntity> vu8Var) {
            z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
            return vu8Var.b(AddressEntity.STREET_ID_FIELD_NAME, this.a.getStreetId()).b(AddressEntity.HOUSE_NUMBER_FIELD_NAME, this.a.getHouseNumber()).b(AddressEntity.APARTMENT_FIELD_NAME, this.a.getApartment());
        }
    }

    public w42(gk2<AddressEntity> gk2Var, gk2<ClientDeliveryLocationProfileEntity> gk2Var2) {
        z65.h(gk2Var, "daoAddress");
        z65.h(gk2Var2, "daoClientDeliveryLocationProfile");
        this.a = gk2Var;
        this.b = gk2Var2;
    }

    @Override // defpackage.v42
    public w6 a(String str) {
        z65.h(str, "id");
        AddressEntity a2 = this.a.a(str);
        if (a2 != null) {
            return f7.c().invoke(a2);
        }
        return null;
    }

    @Override // defpackage.v42
    public void b(List<? extends ou2> list) {
        int w;
        int w2;
        z65.h(list, "deliverablePlaces");
        List<? extends ou2> list2 = list;
        ArrayList<ou2.b> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof ou2.b) {
                arrayList.add(obj);
            }
        }
        ArrayList<ou2.c> arrayList2 = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            w2 = lc1.w(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(w2);
            for (ou2.b bVar : arrayList) {
                arrayList3.add(f7.b().invoke(bVar.b()));
            }
            this.a.save(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof ou2.c) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            arrayList2 = arrayList4;
        }
        if (arrayList2 != null) {
            w = lc1.w(arrayList2, 10);
            ArrayList arrayList5 = new ArrayList(w);
            for (ou2.c cVar : arrayList2) {
                arrayList5.add(lx2.a(cVar.b()));
            }
            this.b.save(arrayList5);
        }
    }

    @Override // defpackage.v42
    public void c(String str) {
        z65.h(str, "id");
        this.b.c(str);
    }

    @Override // defpackage.v42
    public void clear() {
        this.a.e();
        this.b.e();
    }

    @Override // defpackage.v42
    public void d(String str) {
        z65.h(str, "id");
        this.a.c(str);
    }

    @Override // defpackage.v42
    public List<w6> e() {
        int w;
        List<AddressEntity> b = this.a.b();
        w = lc1.w(b, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AddressEntity addressEntity : b) {
            arrayList.add(f7.c().invoke(addressEntity));
        }
        return arrayList;
    }

    @Override // defpackage.v42
    public void f(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            this.a.h(f7.b().invoke(((ou2.b) ou2Var).b()));
        } else if (ou2Var instanceof ou2.c) {
            this.b.h(lx2.a(((ou2.c) ou2Var).b()));
        }
    }

    @Override // defpackage.v42
    public List<e91> g() {
        int w;
        List<ClientDeliveryLocationProfileEntity> b = this.b.b();
        w = lc1.w(b, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity : b) {
            arrayList.add(lx2.e(clientDeliveryLocationProfileEntity));
        }
        return arrayList;
    }

    @Override // defpackage.v42
    public w6 h(DeliveryAddressEntity deliveryAddressEntity) {
        Object b0;
        z65.h(deliveryAddressEntity, "deliveryAddress");
        b0 = sc1.b0(this.a.j(new a(deliveryAddressEntity)));
        AddressEntity addressEntity = (AddressEntity) b0;
        if (addressEntity != null) {
            return f7.c().invoke(addressEntity);
        }
        return null;
    }
}
