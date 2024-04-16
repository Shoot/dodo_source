package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LegalInformationEntity;
import com.dodopizza.persistence.entity.locality.LocalityInfoEntity;
import com.dodopizza.persistence.entity.locality.OrderTypeDiscountEntity;
import com.dodopizza.persistence.entity.locality.SocialNetworkInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import io.realm.k0;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: LocalityInfoRepositoryConverter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpt5;", "Lot5;", "Lcom/dodopizza/persistence/entity/locality/SocialNetworkInfoEntity;", "entity", "Lcqa;", "i", "model", "j", "Lcom/dodopizza/persistence/entity/locality/LegalInformationEntity;", "Lwo5;", e.a, "f", "Lnk7;", "Lcom/dodopizza/persistence/entity/locality/OrderTypeDiscountEntity;", Image.TYPE_HIGH, "g", "Lcom/dodopizza/persistence/entity/locality/LocalityInfoEntity;", "Ljt5;", DateTokenConverter.CONVERTER_KEY, c.a, "Ldv5;", "a", "Ldv5;", "localityRepository", "<init>", "(Ldv5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pt5  reason: default package */
/* loaded from: classes4.dex */
public final class pt5 implements ot5 {
    private final dv5 a;

    public pt5(dv5 dv5Var) {
        z65.h(dv5Var, "localityRepository");
        this.a = dv5Var;
    }

    private final wo5 e(LegalInformationEntity legalInformationEntity) {
        return new wo5(legalInformationEntity.getTitle(), legalInformationEntity.getUrl(), legalInformationEntity.getText(), legalInformationEntity.getType());
    }

    private final LegalInformationEntity f(wo5 wo5Var) {
        return new LegalInformationEntity(wo5Var.b(), wo5Var.d(), wo5Var.a(), wo5Var.c());
    }

    private final nk7 g(OrderTypeDiscountEntity orderTypeDiscountEntity) {
        return new nk7(orderTypeDiscountEntity.getCarryout(), orderTypeDiscountEntity.getRestaurant(), orderTypeDiscountEntity.getCarryoutText(), orderTypeDiscountEntity.getRestaurantText());
    }

    private final OrderTypeDiscountEntity h(nk7 nk7Var) {
        return new OrderTypeDiscountEntity(nk7Var.b(), nk7Var.d(), nk7Var.c(), nk7Var.e());
    }

    private final cqa i(SocialNetworkInfoEntity socialNetworkInfoEntity) {
        return new cqa(socialNetworkInfoEntity.getName(), socialNetworkInfoEntity.getUrl());
    }

    private final SocialNetworkInfoEntity j(cqa cqaVar) {
        return new SocialNetworkInfoEntity(cqaVar.a(), cqaVar.b());
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public LocalityInfoEntity a(jt5 jt5Var) {
        z65.h(jt5Var, "model");
        String c = jt5Var.c();
        String id = jt5Var.e().getId();
        String d = jt5Var.e().d();
        String a = jt5Var.e().a();
        String f = jt5Var.f();
        String b = jt5Var.j().b();
        String a2 = jt5Var.j().a();
        k0 k0Var = new k0();
        for (wo5 wo5Var : jt5Var.d()) {
            k0Var.add(f(wo5Var));
        }
        k0 k0Var2 = new k0();
        for (cqa cqaVar : jt5Var.i()) {
            k0Var2.add(j(cqaVar));
        }
        return new LocalityInfoEntity(c, id, d, a, f, b, a2, k0Var, k0Var2, jt5Var.b(), jt5Var.k(), h(jt5Var.g()));
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public jt5 b(LocalityInfoEntity localityInfoEntity) {
        int w;
        int w2;
        nk7 a;
        z65.h(localityInfoEntity, "entity");
        dt5 f = this.a.f(localityInfoEntity.getLocalityId(), localityInfoEntity.getCountryCode());
        if (f != null) {
            String id = localityInfoEntity.getId();
            z65.e(id);
            String localityUuid = localityInfoEntity.getLocalityUuid();
            String mapUrl = localityInfoEntity.getMapUrl();
            eub eubVar = new eub(localityInfoEntity.getUserAgreementTitle(), localityInfoEntity.getUserAgreementUrl());
            k0<LegalInformationEntity> legalInformationList = localityInfoEntity.getLegalInformationList();
            w = lc1.w(legalInformationList, 10);
            ArrayList arrayList = new ArrayList(w);
            for (LegalInformationEntity legalInformationEntity : legalInformationList) {
                arrayList.add(e(legalInformationEntity));
            }
            k0<SocialNetworkInfoEntity> socialNetworksList = localityInfoEntity.getSocialNetworksList();
            w2 = lc1.w(socialNetworksList, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (SocialNetworkInfoEntity socialNetworkInfoEntity : socialNetworksList) {
                arrayList2.add(i(socialNetworkInfoEntity));
            }
            String callCenterPhone = localityInfoEntity.getCallCenterPhone();
            boolean isLanding = localityInfoEntity.isLanding();
            OrderTypeDiscountEntity orderTypeDiscount = localityInfoEntity.getOrderTypeDiscount();
            if (orderTypeDiscount == null || (a = g(orderTypeDiscount)) == null) {
                a = nk7.e.a();
            }
            return new jt5(id, localityUuid, f, mapUrl, eubVar, arrayList, arrayList2, callCenterPhone, isLanding, a);
        }
        String localityId = localityInfoEntity.getLocalityId();
        throw new IllegalArgumentException("Couldn't find locality with id=" + localityId);
    }
}
