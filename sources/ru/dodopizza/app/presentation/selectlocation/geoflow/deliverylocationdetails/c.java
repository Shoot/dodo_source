package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressComponentDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.LocalityAddressFieldsDesignDto;
/* compiled from: AddressDetailsFieldVOMapping.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\u00020\r2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0000*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002\u001a$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0002¨\u0006\u0017"}, d2 = {"", "Lg7;", "", "", "currentFields", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "f", "Lnx2;", "deliveryLocationDetailsField", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$b;", "b", "addressField", com.huawei.hms.opendevice.c.a, "Lnv5;", com.huawei.hms.push.e.a, "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "localityId", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressComponentDesignDto;", DateTokenConverter.CONVERTER_KEY, "design", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a$a;", "a", "g", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((AddressComponentDesignDto) t).getOrder()), Integer.valueOf(((AddressComponentDesignDto) t2).getOrder()));
            return d;
        }
    }

    private static final a.C0607a a(AddressComponentDesignDto addressComponentDesignDto, Map<String, String> map) {
        String id = addressComponentDesignDto.getId();
        String title = addressComponentDesignDto.getTitle();
        String str = map.get(addressComponentDesignDto.getId());
        if (str == null) {
            str = "";
        }
        return new a.C0607a(id, title, str, false);
    }

    private static final a.b b(nx2 nx2Var, Map<String, String> map) {
        String str = map.get(nx2Var.getValue());
        if (str == null) {
            str = "";
        }
        return new a.b(nx2Var, str, false);
    }

    private static final nx2 c(g7 g7Var) {
        nx2[] values;
        for (nx2 nx2Var : nx2.values()) {
            if (z65.c(g7Var.a(), nx2Var.getValue())) {
                return nx2Var;
            }
        }
        return null;
    }

    private static final List<AddressComponentDesignDto> d(AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, String str) {
        Object obj;
        List<AddressComponentDesignDto> fields;
        List<LocalityAddressFieldsDesignDto> localities = addressDetailsFieldDesignDto.getLocalities();
        if (localities != null) {
            Iterator<T> it = localities.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((LocalityAddressFieldsDesignDto) obj).getLocalityId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LocalityAddressFieldsDesignDto localityAddressFieldsDesignDto = (LocalityAddressFieldsDesignDto) obj;
            if (localityAddressFieldsDesignDto != null && (fields = localityAddressFieldsDesignDto.getFields()) != null) {
                return fields;
            }
        }
        return addressDetailsFieldDesignDto.getFields();
    }

    public static final List<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> e(nv5 nv5Var, Map<String, String> map) {
        List<AddressComponentDesignDto> y0;
        z65.h(nv5Var, "<this>");
        z65.h(map, "currentFields");
        y0 = sc1.y0(d(nv5Var.a(), nv5Var.b()), new a());
        ArrayList arrayList = new ArrayList();
        for (AddressComponentDesignDto addressComponentDesignDto : y0) {
            a.C0607a a2 = a(addressComponentDesignDto, map);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return g(arrayList);
    }

    public static final List<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> f(List<g7> list, Map<String, String> map) {
        a.b bVar;
        z65.h(list, "<this>");
        z65.h(map, "currentFields");
        ArrayList arrayList = new ArrayList();
        for (g7 g7Var : list) {
            nx2 c = c(g7Var);
            if (c != null) {
                bVar = b(c, map);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> g(List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> list) {
        Object l0;
        ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar;
        List T;
        List<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> r0;
        l0 = sc1.l0(list);
        ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar2 = (ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a) l0;
        if (aVar2 != null) {
            aVar = b.a(aVar2, true);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            T = sc1.T(list, 1);
            r0 = sc1.r0(T, aVar);
            return r0;
        }
        return list;
    }
}
