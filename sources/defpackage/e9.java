package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressComponentDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
import ru.dodopizza.backend.domain.country.dto.addressformat.LocalityAddressFieldsDesignDto;
/* compiled from: AddressMapMapping.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a$\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bH\u0002\u001a\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007*\b\u0012\u0004\u0012\u00020\r0\u0007H\u0002¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "Ljx2;", "deliveryLocation", "", "localityId", "Lw7;", c.a, "", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressComponentDesignDto;", "b", "design", "", "currentFields", "Ld7;", "a", DateTokenConverter.CONVERTER_KEY, "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e9  reason: default package */
/* loaded from: classes2.dex */
public final class e9 {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e9$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((AddressComponentDesignDto) t).getOrder()), Integer.valueOf(((AddressComponentDesignDto) t2).getOrder()));
            return d;
        }
    }

    private static final d7 a(AddressComponentDesignDto addressComponentDesignDto, Map<String, String> map) {
        String id = addressComponentDesignDto.getId();
        String title = addressComponentDesignDto.getTitle();
        String str = map.get(addressComponentDesignDto.getId());
        if (str == null) {
            str = "";
        }
        String str2 = str;
        boolean isRequired = addressComponentDesignDto.isRequired();
        int maxLength = addressComponentDesignDto.getMaxLength();
        int order = addressComponentDesignDto.getOrder();
        String upperCase = addressComponentDesignDto.getSize().toUpperCase(Locale.ROOT);
        z65.g(upperCase, "toUpperCase(...)");
        return new d7(id, title, str2, isRequired, maxLength, order, c7.valueOf(upperCase), false, false, false, 896, null);
    }

    public static final List<AddressComponentDesignDto> b(AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, String str) {
        Object obj;
        List<AddressComponentDesignDto> fields;
        z65.h(addressDetailsFieldDesignDto, "<this>");
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

    public static final w7 c(AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, jx2 jx2Var, String str) {
        List y0;
        int w;
        Map<String, String> h;
        z65.h(addressDetailsFieldDesignDto, "<this>");
        String mainFieldTitle = addressDetailsFieldDesignDto.getMainFieldTitle();
        y0 = sc1.y0(b(addressDetailsFieldDesignDto, str), new a());
        List<AddressComponentDesignDto> list = y0;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AddressComponentDesignDto addressComponentDesignDto : list) {
            if (jx2Var == null || (h = jx2Var.c()) == null) {
                h = g86.h();
            }
            arrayList.add(a(addressComponentDesignDto, h));
        }
        return new w7(mainFieldTitle, d(arrayList));
    }

    private static final List<d7> d(List<d7> list) {
        Object l0;
        d7 d7Var;
        List T;
        List<d7> r0;
        l0 = sc1.l0(list);
        d7 d7Var2 = (d7) l0;
        if (d7Var2 != null) {
            d7Var = e7.a(d7Var2, true);
        } else {
            d7Var = null;
        }
        if (d7Var != null) {
            T = sc1.T(list, 1);
            r0 = sc1.r0(T, d7Var);
            return r0;
        }
        return list;
    }
}
