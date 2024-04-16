package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fda;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.customer.CustomerAPI;
import ru.dodopizza.backend.domain.customer.dto.AccountDeletionInfoDto;
import ru.dodopizza.backend.domain.customer.dto.ClientDeliveryLocationsDto;
import ru.dodopizza.backend.domain.customer.dto.CustomerAddressDto;
import ru.dodopizza.backend.domain.customer.dto.CustomerAddressesDto;
import ru.dodopizza.backend.domain.customer.dto.CustomerDto;
import ru.dodopizza.backend.domain.customer.dto.NeedSubscriptionRequestDto;
import ru.dodopizza.backend.domain.customer.dto.OpenSecretActionDto;
import ru.dodopizza.backend.domain.customer.dto.PersonalOfferDto;
import ru.dodopizza.backend.domain.customer.dto.PersonalPromoActionDto;
import ru.dodopizza.backend.domain.customer.dto.SecretActionDto;
import ru.dodopizza.backend.domain.customer.dto.SetBirthdayRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SetEmailRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SetNameRequestDto;
import ru.dodopizza.backend.domain.menu.dto.ImageFormat;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
/* compiled from: CustomerService.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001Bm\b\u0007\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020F\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0:\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010Z\u001a\u00020X\u0012\u0006\u0010]\u001a\u00020[¢\u0006\u0004\bg\u0010hJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u0004\u0018\u00010\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000eH\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0015H\u0002J\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0014\u0010\u001a\u001a\u00020\u0018*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0018J\u001e\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0018J\u0006\u0010*\u001a\u00020\u0004J\u0006\u0010+\u001a\u00020\u0006J\u0010\u0010,\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110-J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110-J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110-J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0018J\u0015\u00104\u001a\u0004\u0018\u000103ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u0004\u0018\u000103ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00105J\u0013\u00107\u001a\u000203ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0006\u00109\u001a\u00020\u001dR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010=R\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\\R\u001c\u0010a\u001a\n _*\u0004\u0018\u00010^0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010`R\u001c\u0010c\u001a\n _*\u0004\u0018\u00010;0;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010bR\u001c\u0010f\u001a\n _*\u0004\u0018\u00010I0I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Lt52;", "", "Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", "customerDto", "", "needToDeleteAddresses", "Ln42;", "D", "Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;", "", "Lou2;", "z", "Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;", "y", "Lru/dodopizza/backend/domain/customer/dto/PersonalOfferDto;", "dto", "isTransparentImageUrlEnabled", "Lzz7;", "p", "Ln2a;", "n", "Lru/dodopizza/backend/domain/customer/dto/PersonalPromoActionDto;", "o", "transparent", "", Image.TYPE_HIGH, "i", "q", "newCustomer", "", "t", Action.NAME_ATTRIBUTE, "w", "", "day", "month", "year", "u", "needSubscription", "x", "email", "v", "r", "f", "B", "", "j", "k", "l", "id", Image.TYPE_SMALL, "Lk4;", "A", "()Lk4;", e.a, DateTokenConverter.CONVERTER_KEY, "()J", c.a, "Las8;", "Lru/dodopizza/backend/domain/customer/CustomerAPI;", "a", "Las8;", "customerAPIProvider", "Ln52;", "b", "Ln52;", "customerRepository", "Li00;", "Li00;", "authorizationState", "Lh08;", "Lh08;", "offersRepository", "Lh48;", "phoneParserProvider", "Lx42;", "Lx42;", "customerAddressService", "Ldt5;", "g", "Ldt5;", "currentLocality", "Lhq3;", "Lhq3;", "featureService", "Lpq;", "Lpq;", "appsFlyerService", "Lk63;", "Lk63;", "domainEvents", "Lfda;", "Lfda;", "serverDateTimeParser", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "()Lru/dodopizza/backend/domain/customer/CustomerAPI;", "customerAPI", Image.TYPE_MEDIUM, "()Lh48;", "phoneParser", "<init>", "(Las8;Ln52;Li00;Lh08;Las8;Lx42;Ldt5;Lhq3;Lpq;Lk63;Lfda;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t52  reason: default package */
/* loaded from: classes4.dex */
public final class t52 {
    private final as8<CustomerAPI> a;
    private final n52 b;
    private final i00 c;
    private final h08 d;
    private final as8<h48> e;
    private final x42 f;
    private final dt5 g;
    private final hq3 h;
    private final pq i;
    private final k63 j;
    private final fda k;
    private final Logger l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomerService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", "a", "()Lru/dodopizza/backend/domain/customer/dto/CustomerDto;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t52$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<CustomerDto> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CustomerDto invoke() {
            return t52.this.g().getCustomer(t52.this.g.a(), t52.this.g.getId());
        }
    }

    public t52(as8<CustomerAPI> as8Var, n52 n52Var, i00 i00Var, h08 h08Var, as8<h48> as8Var2, x42 x42Var, dt5 dt5Var, hq3 hq3Var, pq pqVar, k63 k63Var, fda fdaVar) {
        z65.h(as8Var, "customerAPIProvider");
        z65.h(n52Var, "customerRepository");
        z65.h(i00Var, "authorizationState");
        z65.h(h08Var, "offersRepository");
        z65.h(as8Var2, "phoneParserProvider");
        z65.h(x42Var, "customerAddressService");
        z65.h(dt5Var, "currentLocality");
        z65.h(hq3Var, "featureService");
        z65.h(pqVar, "appsFlyerService");
        z65.h(k63Var, "domainEvents");
        z65.h(fdaVar, "serverDateTimeParser");
        this.a = as8Var;
        this.b = n52Var;
        this.c = i00Var;
        this.d = h08Var;
        this.e = as8Var2;
        this.f = x42Var;
        this.g = dt5Var;
        this.h = hq3Var;
        this.i = pqVar;
        this.j = k63Var;
        this.k = fdaVar;
        this.l = LoggerFactory.getLogger("CustomerService");
    }

    public static /* synthetic */ n42 C(t52 t52Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return t52Var.B(z);
    }

    private final n42 D(CustomerDto customerDto, boolean z) {
        List<? extends ou2> q0;
        q0 = sc1.q0(z(customerDto.getAddresses()), y(customerDto.getClientDeliveryLocations()));
        h48 m = m();
        z65.g(m, "<get-phoneParser>(...)");
        n42 a2 = e52.a(customerDto, m);
        if (z) {
            this.f.c();
        }
        t(a2);
        this.f.b(q0);
        this.i.b(a2.i());
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerAPI g() {
        return this.a.get();
    }

    private final String h(PersonalOfferDto personalOfferDto, boolean z) {
        String offerImageUrl;
        if (z) {
            ImageUrls imageUrls = personalOfferDto.getImageUrls();
            if (imageUrls != null) {
                offerImageUrl = imageUrls.getWebp();
            } else {
                offerImageUrl = null;
            }
        } else {
            offerImageUrl = personalOfferDto.getOfferImageUrl();
        }
        if (offerImageUrl == null) {
            return "";
        }
        return offerImageUrl;
    }

    private final String i(PersonalPromoActionDto personalPromoActionDto, boolean z) {
        String offerImageUrl;
        if (z) {
            ImageUrls imageUrls = personalPromoActionDto.getImageUrls();
            if (imageUrls != null) {
                offerImageUrl = imageUrls.getWebp();
            } else {
                offerImageUrl = null;
            }
        } else {
            offerImageUrl = personalPromoActionDto.getOfferImageUrl();
        }
        if (offerImageUrl == null) {
            return "";
        }
        return offerImageUrl;
    }

    private final h48 m() {
        return this.e.get();
    }

    private final n2a n(PersonalOfferDto personalOfferDto) {
        boolean z;
        SecretActionDto secretAction = personalOfferDto.getSecretAction();
        if (secretAction != null) {
            Boolean isOpenByUser = secretAction.isOpenByUser();
            if (isOpenByUser != null) {
                z = isOpenByUser.booleanValue();
            } else {
                z = true;
            }
            return new n2a(z);
        }
        return null;
    }

    private final n2a o(PersonalPromoActionDto personalPromoActionDto) {
        boolean z;
        SecretActionDto secretAction = personalPromoActionDto.getSecretAction();
        if (secretAction != null) {
            Boolean isOpenByUser = secretAction.isOpenByUser();
            if (isOpenByUser != null) {
                z = isOpenByUser.booleanValue();
            } else {
                z = true;
            }
            return new n2a(z);
        }
        return null;
    }

    private final zz7 p(PersonalOfferDto personalOfferDto, boolean z) {
        boolean z2;
        List l;
        String id = personalOfferDto.getId();
        String h = h(personalOfferDto, z);
        String offerName = personalOfferDto.getOfferName();
        String offerConditions = personalOfferDto.getOfferConditions();
        j08 a2 = j08.b.a(personalOfferDto.getOfferType());
        e08 e08Var = e08.d;
        String beginDateUtc = personalOfferDto.getBeginDateUtc();
        String endDateUtc = personalOfferDto.getEndDateUtc();
        String str = (String) mh5.b(personalOfferDto.getPromocode(), "In present day must be not null");
        Boolean isCollaboration = personalOfferDto.isCollaboration();
        if (isCollaboration != null) {
            z2 = isCollaboration.booleanValue();
        } else {
            z2 = false;
        }
        String collaborationForwardLink = personalOfferDto.getCollaborationForwardLink();
        if (collaborationForwardLink == null) {
            collaborationForwardLink = "";
        }
        l = kc1.l();
        return new zz7(id, h, offerName, offerConditions, a2, e08Var, beginDateUtc, endDateUtc, str, z2, collaborationForwardLink, l, n(personalOfferDto));
    }

    private final zz7 q(PersonalPromoActionDto personalPromoActionDto, boolean z) {
        boolean z2;
        List l;
        int w;
        String id = personalPromoActionDto.getId();
        String i = i(personalPromoActionDto, z);
        String offerName = personalPromoActionDto.getOfferName();
        String offerConditions = personalPromoActionDto.getOfferConditions();
        j08 a2 = j08.b.a(personalPromoActionDto.getOfferType());
        e08 a3 = e08.b.a(personalPromoActionDto.getOfferApplyingType());
        String beginDateUtc = personalPromoActionDto.getBeginDateUtc();
        String endDateUtc = personalPromoActionDto.getEndDateUtc();
        String promocode = personalPromoActionDto.getPromocode();
        Boolean isCollaboration = personalPromoActionDto.isCollaboration();
        if (isCollaboration != null) {
            z2 = isCollaboration.booleanValue();
        } else {
            z2 = false;
        }
        String collaborationForwardLink = personalPromoActionDto.getCollaborationForwardLink();
        if (collaborationForwardLink == null) {
            collaborationForwardLink = "";
        }
        String str = collaborationForwardLink;
        List<Integer> orderTypes = personalPromoActionDto.getOrderTypes();
        if (orderTypes == null) {
            l = kc1.l();
        } else {
            List<Integer> list = orderTypes;
            w = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Number number : list) {
                arrayList.add(jk7.b.a(number.intValue()));
            }
            l = new ArrayList();
            for (Object obj : arrayList) {
                if (((jk7) obj) != jk7.d) {
                    l.add(obj);
                }
            }
        }
        return new zz7(id, i, offerName, offerConditions, a2, a3, beginDateUtc, endDateUtc, promocode, z2, str, l, o(personalPromoActionDto));
    }

    private final List<ou2> y(ClientDeliveryLocationsDto clientDeliveryLocationsDto) {
        List<ou2> l;
        int w;
        if (clientDeliveryLocationsDto != null) {
            w = lc1.w(clientDeliveryLocationsDto, 10);
            ArrayList arrayList = new ArrayList(w);
            Iterator<ClientDeliveryLocationDto> it = clientDeliveryLocationsDto.iterator();
            while (it.hasNext()) {
                arrayList.add(ru2.c(kx2.a().invoke(it.next())));
            }
            return arrayList;
        }
        l = kc1.l();
        return l;
    }

    private final List<ou2> z(CustomerAddressesDto customerAddressesDto) {
        int w;
        w = lc1.w(customerAddressesDto, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<CustomerAddressDto> it = customerAddressesDto.iterator();
        while (it.hasNext()) {
            arrayList.add(ru2.b(f7.a().invoke(it.next())));
        }
        return arrayList;
    }

    public final k4 A() {
        AccountDeletionInfoDto deletionStatus = g().getDeletionStatus();
        k4 k4Var = null;
        if (deletionStatus.isProcessing()) {
            k4Var = k4.a(k4.b(fda.a.a(this.k, (String) mh5.b(deletionStatus.getDeletingDateUtc(), "Can`t be null, cause deletion in process"), null, 2, null)));
        }
        this.b.b(k4Var);
        return k4Var;
    }

    public final n42 B(boolean z) {
        CustomerDto customerDto = (CustomerDto) fnb.a.a(new a()).b();
        if (customerDto != null) {
            return D(customerDto, z);
        }
        this.l.error("Received null customerDto");
        return this.b.get();
    }

    public final void c() {
        if (!g().cancelDeletion().isProcessing()) {
            this.b.b(null);
            return;
        }
        throw new IllegalStateException("The account deletion should already be canceled".toString());
    }

    public final long d() {
        AccountDeletionInfoDto deleteAccount = g().deleteAccount();
        if (deleteAccount.isProcessing()) {
            long b = k4.b(fda.a.a(this.k, (String) mh5.b(deleteAccount.getDeletingDateUtc(), "Can`t be null, cause deletion in process"), null, 2, null));
            this.b.b(k4.a(b));
            return b;
        }
        throw new IllegalStateException("The account deletion should already be in progress ".toString());
    }

    public final k4 e() {
        return this.b.a();
    }

    public final n42 f() {
        return this.b.get();
    }

    public final synchronized Collection<zz7> j() {
        List<zz7> arrayList;
        int w;
        try {
            List<zz7> c = this.d.c();
            if (c != null) {
                arrayList = c;
            } else {
                List<PersonalOfferDto> personalOffers = g().getPersonalOffers(ImageFormat.WEBP.getValue());
                boolean a2 = this.h.a(bq3.j6);
                ArrayList<PersonalOfferDto> arrayList2 = new ArrayList();
                for (Object obj : personalOffers) {
                    if (((PersonalOfferDto) obj).getPromocode() != null) {
                        arrayList2.add(obj);
                    }
                }
                w = lc1.w(arrayList2, 10);
                arrayList = new ArrayList<>(w);
                for (PersonalOfferDto personalOfferDto : arrayList2) {
                    arrayList.add(p(personalOfferDto, a2));
                }
                this.d.b(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized Collection<zz7> k() {
        Collection<zz7> j;
        try {
            if (this.h.a(bq3.O5)) {
                j = l();
            } else {
                j = j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized Collection<zz7> l() {
        List<zz7> arrayList;
        int w;
        List<zz7> l;
        try {
            List<zz7> c = this.d.c();
            if (!this.c.b()) {
                l = kc1.l();
                arrayList = l;
            } else if (c != null) {
                arrayList = c;
            } else {
                List<PersonalPromoActionDto> personalOffersV2 = g().getPersonalOffersV2(ImageFormat.WEBP.getValue());
                boolean a2 = this.h.a(bq3.j6);
                ArrayList<PersonalPromoActionDto> arrayList2 = new ArrayList();
                for (Object obj : personalOffersV2) {
                    PersonalPromoActionDto personalPromoActionDto = (PersonalPromoActionDto) obj;
                    if (personalPromoActionDto.getOfferApplyingType() != e08.e.i() && personalPromoActionDto.getPromocode() == null) {
                    }
                    arrayList2.add(obj);
                }
                w = lc1.w(arrayList2, 10);
                arrayList = new ArrayList<>(w);
                for (PersonalPromoActionDto personalPromoActionDto2 : arrayList2) {
                    arrayList.add(q(personalPromoActionDto2, a2));
                }
                this.d.b(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final boolean r() {
        return this.h.a(bq3.b7);
    }

    public final synchronized void s(String str) {
        z65.h(str, "id");
        g().openSecretAction(new OpenSecretActionDto(str));
        this.d.d(str);
    }

    public final void t(n42 n42Var) {
        z65.h(n42Var, "newCustomer");
        n42 n42Var2 = this.b.get();
        if (!z65.c(n42Var2, n42Var)) {
            this.b.c(n42Var);
            if (!z65.c(n42Var2.h(), n42Var.h())) {
                this.j.b(j63.m);
            }
            this.j.b(j63.l);
        }
    }

    public final n42 u(int i, int i2, int i3) {
        n42 n42Var = this.b.get();
        g().setBirthday(new SetBirthdayRequestDto(i, i2, i3));
        n42 c = n42.c(n42Var, null, null, null, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0, 0.0d, null, false, 1935, null);
        t(c);
        return c;
    }

    public final n42 v(String str) {
        z65.h(str, "email");
        n42 n42Var = this.b.get();
        g().setEmail(new SetEmailRequestDto(str));
        n42 c = n42.c(n42Var, null, null, null, null, null, null, null, 0, 0.0d, str, false, 1535, null);
        t(c);
        return c;
    }

    public final n42 w(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        n42 n42Var = this.b.get();
        g().setName(new SetNameRequestDto(str));
        n42 c = n42.c(n42Var, null, null, str, null, null, null, null, 0, 0.0d, null, false, 2043, null);
        t(c);
        return c;
    }

    public final n42 x(boolean z) {
        n42 n42Var = this.b.get();
        if (n42Var.n() != z) {
            g().setNeedSubscription(new NeedSubscriptionRequestDto(z));
        }
        n42 c = n42.c(n42Var, null, null, null, null, null, null, null, 0, 0.0d, null, z, 1023, null);
        t(c);
        return c;
    }
}
