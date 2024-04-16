package defpackage;

import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: OnGetAddressResultReceived.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"Lx56;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/e$a;", "getAddressResult", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "fieldsDesign", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: f87  reason: default package */
/* loaded from: classes2.dex */
public final class f87 {

    /* compiled from: OnGetAddressResultReceived.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f87$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f9.values().length];
            try {
                iArr[f9.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f9.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final x56 a(x56 x56Var, e.a aVar, AddressDetailsFieldDesignDto addressDetailsFieldDesignDto) {
        z65.h(x56Var, "<this>");
        z65.h(aVar, "getAddressResult");
        int i = a.$EnumSwitchMapping$0[x56Var.u().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (aVar instanceof e.a.c) {
                    z65.e(addressDetailsFieldDesignDto);
                    e.a.c cVar = (e.a.c) aVar;
                    return y56.o(x56Var, addressDetailsFieldDesignDto, cVar.b(), cVar.a());
                } else if (aVar instanceof e.a.C0146a) {
                    return y56.j(x56Var);
                } else {
                    if (aVar instanceof e.a.b) {
                        return y56.s(x56Var, ((e.a.b) aVar).a());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return x56Var;
        } else if (aVar instanceof e.a.c) {
            e.a.c cVar2 = (e.a.c) aVar;
            return x56.r(x56Var, null, cVar2.b(), null, cVar2.a(), null, 21, null);
        } else if ((aVar instanceof e.a.C0146a) || (aVar instanceof e.a.b)) {
            return x56Var;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
