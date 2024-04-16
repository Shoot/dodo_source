package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.controlling.OrderRatingAPI;
import ru.dodopizza.backend.domain.controlling.dto.ContactTypeDto;
import ru.dodopizza.backend.domain.controlling.dto.CreateOrderRatingDto;
import ru.dodopizza.backend.domain.controlling.dto.RatingTagDto;
import ru.dodopizza.backend.domain.controlling.dto.RatingTagsCollectionDto;
import ru.dodopizza.backend.domain.controlling.dto.RatingTagsWithRatingValueDto;
/* compiled from: RatingServiceImpl.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J(\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J,\u0010\u0011\u001a\u00020\u0010*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0016J0\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006$"}, d2 = {"Lp69;", "Lo69;", "", "Lru/dodopizza/backend/domain/controlling/dto/RatingTagsWithRatingValueDto;", "tagDtos", "", "", "Lq69;", e.a, "Lb59;", "", "ratingPhotosIds", "", "userProvidedBinaryFeedback", "Ldj9;", "requestedContactType", "Lru/dodopizza/backend/domain/controlling/dto/CreateOrderRatingDto;", "g", "Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;", "f", "orderId", "a", "orderTypeId", "b", "rating", "", c.a, DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;", "orderRatingAPI", "Lm69;", "Lm69;", "ratingRepository", "<init>", "(Lru/dodopizza/backend/domain/controlling/OrderRatingAPI;Lm69;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p69  reason: default package */
/* loaded from: classes.dex */
public final class p69 implements o69 {
    private final OrderRatingAPI a;
    private final m69 b;

    /* compiled from: RatingServiceImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p69$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[jk7.values().length];
            try {
                iArr[jk7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk7.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[dj9.values().length];
            try {
                iArr2[dj9.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[dj9.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[dj9.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public p69(OrderRatingAPI orderRatingAPI, m69 m69Var) {
        z65.h(orderRatingAPI, "orderRatingAPI");
        z65.h(m69Var, "ratingRepository");
        this.a = orderRatingAPI;
        this.b = m69Var;
    }

    private final Map<Integer, List<q69>> e(List<RatingTagsWithRatingValueDto> list) {
        int w;
        Map<Integer, List<q69>> s;
        int w2;
        List<RatingTagsWithRatingValueDto> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (RatingTagsWithRatingValueDto ratingTagsWithRatingValueDto : list2) {
            int rating = ratingTagsWithRatingValueDto.getRating();
            List<RatingTagDto> tags = ratingTagsWithRatingValueDto.getTags();
            w2 = lc1.w(tags, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (RatingTagDto ratingTagDto : tags) {
                arrayList2.add(new q69(ratingTagDto.getId(), ratingTagDto.getTitle()));
            }
            arrayList.add(lnb.a(Integer.valueOf(rating), arrayList2));
        }
        s = g86.s(arrayList);
        return s;
    }

    private final ContactTypeDto f(dj9 dj9Var) {
        int i = a.$EnumSwitchMapping$1[dj9Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ContactTypeDto.NONE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return ContactTypeDto.CHAT;
        }
        return ContactTypeDto.PHONE;
    }

    private final CreateOrderRatingDto g(b59 b59Var, List<String> list, boolean z, dj9 dj9Var) {
        Boolean bool;
        List F0;
        ContactTypeDto contactTypeDto;
        String e = b59Var.e();
        int g = b59Var.g();
        Boolean c = b59Var.c();
        if (z) {
            bool = c;
        } else {
            bool = null;
        }
        String d = b59Var.d();
        F0 = sc1.F0(b59Var.f());
        if (dj9Var != null) {
            contactTypeDto = f(dj9Var);
        } else {
            contactTypeDto = null;
        }
        return new CreateOrderRatingDto(e, g, bool, d, F0, list, contactTypeDto);
    }

    @Override // defpackage.o69
    public b59 a(String str) {
        List l;
        z65.h(str, "orderId");
        b59 w = this.b.w(str);
        if (w == null) {
            l = kc1.l();
            return this.b.C(new b59(str, 0, null, "", l, true, false));
        }
        return w;
    }

    @Override // defpackage.o69
    public Map<Integer, List<q69>> b(int i) {
        Map<Integer, List<q69>> h;
        Map<Integer, List<q69>> h2;
        try {
            RatingTagsCollectionDto tags = this.a.getTags();
            int i2 = a.$EnumSwitchMapping$0[jk7.b.a(i).ordinal()];
            if (i2 == 1) {
                h2 = g86.h();
            } else if (i2 != 2) {
                h2 = e(tags.getDeliveryOrCarryout());
            } else {
                h2 = e(tags.getRestaurant());
            }
            return h2;
        } catch (Exception unused) {
            h = g86.h();
            return h;
        }
    }

    @Override // defpackage.o69
    public void c(b59 b59Var) {
        z65.h(b59Var, "rating");
        this.b.C(b59Var);
    }

    @Override // defpackage.o69
    public void d(b59 b59Var, List<String> list, boolean z, dj9 dj9Var) {
        z65.h(b59Var, "rating");
        z65.h(list, "ratingPhotosIds");
        String uuid = this.a.sendOrderRating(g(b59Var, list, z, dj9Var)).getUuid();
        if (uuid != null) {
            if (uuid.length() > 0) {
                return;
            }
            throw new IllegalStateException("Order rating uuId is empty".toString());
        }
        throw new IllegalStateException("Order rating uuId is missing".toString());
    }
}
