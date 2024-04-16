package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ib7;
import defpackage.mv9;
import defpackage.ok9;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.slf4j.LoggerFactory;
import ru.dodopizza.backend.domain.pizzeria.dto.CoordinatesDto;
import ru.dodopizza.backend.domain.pizzeria.dto.DayOfWeekDto;
import ru.dodopizza.backend.domain.pizzeria.dto.NewPizzeriaDto;
import ru.dodopizza.backend.domain.pizzeria.dto.PizzeriaAddressInfoDto;
import ru.dodopizza.backend.domain.pizzeria.dto.PizzeriaDto;
import ru.dodopizza.backend.domain.pizzeria.dto.RestaurantServiceTypeDto;
import ru.dodopizza.backend.domain.pizzeria.dto.ScheduleDto;
import ru.dodopizza.backend.domain.pizzeria.dto.TableDeliveryDto;
/* compiled from: datapizzeriatransforms.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0000\u001a\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0000\u001a\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0000\u001a\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00002\u0006\u0010\r\u001a\u00020\f\u001a\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00002\u0006\u0010\r\u001a\u00020\f\u001a\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006H\u0002\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u00020\u0014H\u0002\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"%\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\")\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0!8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\"/\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0+\u0012\u0004\u0012\u00020\u000f0!8\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b,\u0010&\"%\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070!8\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b.\u0010&¨\u00060"}, d2 = {"Lkotlin/Function1;", "Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;", "Ld88;", com.huawei.hms.push.e.a, "Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;", "f", "", "", "Lmv9;", "p", "Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;", "o", "", "calendarDayIndex", "Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;", "Lmv9$a;", Image.TYPE_HIGH, "g", CrashHianalyticsData.TIME, "j", "Lru/dodopizza/backend/domain/pizzeria/dto/RestaurantServiceTypeDto;", "dtoList", "Lok9;", "n", "", Image.TYPE_MEDIUM, "q", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "b", "pizzeriaTimeFormatter", "", "", com.huawei.hms.opendevice.c.a, "Ljava/util/Map;", "l", "()Ljava/util/Map;", "timeZoneOffsetMap", DateTokenConverter.CONVERTER_KEY, "k", "scheduleMap", "Lkotlin/Pair;", "i", "dayMap", "getTimeMap", "timeMap", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: qm2  reason: default package */
/* loaded from: classes4.dex */
public final class qm2 {
    private static final SimpleDateFormat a;
    private static final SimpleDateFormat b;
    private static final Map<String, Long> c;
    private static final Map<List<String>, mv9> d;
    private static final Map<Pair<String, Integer>, mv9.a> e;
    private static final Map<String, String> f;

    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qm2$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestaurantServiceTypeDto.ServiceTypeDto.values().length];
            try {
                iArr[RestaurantServiceTypeDto.ServiceTypeDto.DINE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestaurantServiceTypeDto.ServiceTypeDto.TAKEAWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestaurantServiceTypeDto.ServiceTypeDto.TABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;", "dto", "Ld88;", "a", "(Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;)Ld88;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<NewPizzeriaDto, d88> {
        public static final b a = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v60, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final d88 invoke(NewPizzeriaDto newPizzeriaDto) {
            Long l;
            Date parse;
            Double d;
            Double d2;
            mv9 mv9Var;
            mv9 mv9Var2;
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            ?? l2;
            int w;
            z65.h(newPizzeriaDto, "dto");
            long j = 0;
            String str6 = null;
            if (qm2.l().containsKey(newPizzeriaDto.getTimeZoneUtcOffset())) {
                Long l3 = qm2.l().get(newPizzeriaDto.getTimeZoneUtcOffset());
                if (l3 != null) {
                    j = l3.longValue();
                }
            } else {
                try {
                    String timeZoneUtcOffset = newPizzeriaDto.getTimeZoneUtcOffset();
                    if (timeZoneUtcOffset != null && (parse = qm2.a.parse(timeZoneUtcOffset)) != null) {
                        l = Long.valueOf(parse.getTime());
                    } else {
                        l = null;
                    }
                    j = ((Number) mh5.c(l, 0L)).longValue();
                } catch (Exception e) {
                    LoggerFactory.getLogger("dataPizzeriaDtoToPizzeria").error(newPizzeriaDto.getTimeZoneUtcOffset(), (Throwable) e);
                }
                qm2.l().put(newPizzeriaDto.getTimeZoneUtcOffset(), Long.valueOf(j));
            }
            long j2 = j;
            String str7 = (String) mh5.c(newPizzeriaDto.getId(), "");
            String str8 = (String) mh5.c(newPizzeriaDto.getName(), "");
            String str9 = (String) mh5.c(newPizzeriaDto.getLocalityId(), "");
            String str10 = (String) mh5.c(newPizzeriaDto.getManagerPhoneNumber(), "");
            CoordinatesDto coordinates = newPizzeriaDto.getCoordinates();
            if (coordinates != null) {
                d = Double.valueOf(coordinates.getLat());
            } else {
                d = null;
            }
            double doubleValue = ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
            CoordinatesDto coordinates2 = newPizzeriaDto.getCoordinates();
            if (coordinates2 != null) {
                d2 = Double.valueOf(coordinates2.getLon());
            } else {
                d2 = null;
            }
            ov5 ov5Var = new ov5(doubleValue, ((Number) mh5.c(d2, Double.valueOf(0.0d))).doubleValue(), null, null, 12, null);
            h98 a2 = h98.a.a(Integer.valueOf(newPizzeriaDto.getStatus()));
            hn6 b = kn6.c.b(0.0d);
            List<String> restaurantSchedule = newPizzeriaDto.getRestaurantSchedule();
            if (restaurantSchedule != null) {
                mv9Var = qm2.p().invoke(restaurantSchedule);
            } else {
                mv9Var = null;
            }
            mv9 mv9Var3 = mv9.c;
            Object c = mh5.c(mv9Var, mv9Var3);
            z65.g(c, "orDefault(...)");
            mv9 mv9Var4 = (mv9) c;
            List<String> deliverySchedule = newPizzeriaDto.getDeliverySchedule();
            if (deliverySchedule != null) {
                mv9Var2 = qm2.p().invoke(deliverySchedule);
            } else {
                mv9Var2 = null;
            }
            Object c2 = mh5.c(mv9Var2, mv9Var3);
            z65.g(c2, "orDefault(...)");
            mv9 mv9Var5 = (mv9) c2;
            List<Integer> operationalTypeValues = newPizzeriaDto.getOperationalTypeValues();
            if (operationalTypeValues != null) {
                List<Integer> list = operationalTypeValues;
                ib7.a aVar = ib7.b;
                w = lc1.w(list, 10);
                arrayList = new ArrayList(w);
                for (Number number : list) {
                    arrayList.add(aVar.a(number.intValue()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                l2 = kc1.l();
                arrayList2 = l2;
            } else {
                arrayList2 = arrayList;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo = newPizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo != null) {
                str = pizzeriaAddressInfo.getFullAddress();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo2 = newPizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo2 != null) {
                str3 = pizzeriaAddressInfo2.getShortAddress();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo3 = newPizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo3 != null) {
                str6 = pizzeriaAddressInfo3.getLocalityName();
            }
            if (str6 == null) {
                str5 = "";
            } else {
                str5 = str6;
            }
            List n = qm2.n(newPizzeriaDto.getRestaurantServiceTypes());
            boolean m = qm2.m(newPizzeriaDto.getRestaurantServiceTypes());
            boolean m2 = qm2.m(newPizzeriaDto.getRestaurantServiceTypes());
            Boolean hasKidsPlayground = newPizzeriaDto.getHasKidsPlayground();
            Boolean bool = Boolean.FALSE;
            return new d88(str7, str8, str9, str10, "", ov5Var, a2, j2, b, true, mv9Var4, mv9Var5, arrayList2, str2, str4, str5, "", n, m, m2, ((Boolean) mh5.c(hasKidsPlayground, bool)).booleanValue(), ((Boolean) mh5.c(newPizzeriaDto.getHasWorkshops(), bool)).booleanValue(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;", "dto", "Ld88;", "a", "(Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;)Ld88;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<PizzeriaDto, d88> {
        public static final c a = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v66, types: [java.util.List] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final d88 invoke(PizzeriaDto pizzeriaDto) {
            Double d;
            Double d2;
            mv9 mv9Var;
            mv9 mv9Var2;
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Boolean bool;
            String str8;
            ?? l;
            int w;
            Long l2;
            Date parse;
            z65.h(pizzeriaDto, "dto");
            long j = 0;
            Boolean bool2 = null;
            try {
                String timeZoneUtcOffset = pizzeriaDto.getTimeZoneUtcOffset();
                if (timeZoneUtcOffset != null && (parse = qm2.a.parse(timeZoneUtcOffset)) != null) {
                    l2 = Long.valueOf(parse.getTime());
                } else {
                    l2 = null;
                }
                j = ((Number) mh5.c(l2, 0L)).longValue();
            } catch (Exception e) {
                LoggerFactory.getLogger("dataPizzeriaDtoToPizzeria").error(pizzeriaDto.getTimeZoneUtcOffset(), (Throwable) e);
            }
            long j2 = j;
            String str9 = (String) mh5.c(pizzeriaDto.getId(), "");
            String str10 = (String) mh5.c(pizzeriaDto.getName(), "");
            String str11 = (String) mh5.c(pizzeriaDto.getLocalityId(), "");
            String str12 = (String) mh5.c(pizzeriaDto.getManagerPhoneNumber(), "");
            String str13 = (String) mh5.c(pizzeriaDto.getCameraUrl(), "");
            CoordinatesDto coordinates = pizzeriaDto.getCoordinates();
            if (coordinates != null) {
                d = Double.valueOf(coordinates.getLat());
            } else {
                d = null;
            }
            double doubleValue = ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
            CoordinatesDto coordinates2 = pizzeriaDto.getCoordinates();
            if (coordinates2 != null) {
                d2 = Double.valueOf(coordinates2.getLon());
            } else {
                d2 = null;
            }
            ov5 ov5Var = new ov5(doubleValue, ((Number) mh5.c(d2, Double.valueOf(0.0d))).doubleValue(), null, null, 12, null);
            h98 a2 = h98.a.a(Integer.valueOf(pizzeriaDto.getStatus()));
            hn6 b = kn6.c.b(pizzeriaDto.getMinDeliveryPrice());
            ScheduleDto restaurantSchedule = pizzeriaDto.getRestaurantSchedule();
            if (restaurantSchedule != null) {
                mv9Var = qm2.o().invoke(restaurantSchedule);
            } else {
                mv9Var = null;
            }
            mv9 mv9Var3 = mv9.c;
            Object c = mh5.c(mv9Var, mv9Var3);
            z65.g(c, "orDefault(...)");
            mv9 mv9Var4 = (mv9) c;
            ScheduleDto deliverySchedule = pizzeriaDto.getDeliverySchedule();
            if (deliverySchedule != null) {
                mv9Var2 = qm2.o().invoke(deliverySchedule);
            } else {
                mv9Var2 = null;
            }
            Object c2 = mh5.c(mv9Var2, mv9Var3);
            z65.g(c2, "orDefault(...)");
            mv9 mv9Var5 = (mv9) c2;
            List<Integer> operationalTypeValues = pizzeriaDto.getOperationalTypeValues();
            if (operationalTypeValues != null) {
                List<Integer> list = operationalTypeValues;
                ib7.a aVar = ib7.b;
                w = lc1.w(list, 10);
                arrayList = new ArrayList(w);
                for (Number number : list) {
                    arrayList.add(aVar.a(number.intValue()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                l = kc1.l();
                arrayList2 = l;
            } else {
                arrayList2 = arrayList;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo = pizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo != null) {
                str = pizzeriaAddressInfo.getFullAddress();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo2 = pizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo2 != null) {
                str3 = pizzeriaAddressInfo2.getShortAddress();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            PizzeriaAddressInfoDto pizzeriaAddressInfo3 = pizzeriaDto.getPizzeriaAddressInfo();
            if (pizzeriaAddressInfo3 != null) {
                str5 = pizzeriaAddressInfo3.getLocalityName();
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            String postcode = pizzeriaDto.getPostcode();
            if (postcode == null) {
                str7 = "";
            } else {
                str7 = postcode;
            }
            List n = qm2.n(pizzeriaDto.getRestaurantServiceTypes());
            TableDeliveryDto tableDelivery = pizzeriaDto.getTableDelivery();
            if (tableDelivery != null) {
                bool = Boolean.valueOf(tableDelivery.isSupported());
            } else {
                bool = null;
            }
            Boolean bool3 = Boolean.FALSE;
            boolean booleanValue = ((Boolean) mh5.c(bool, bool3)).booleanValue();
            TableDeliveryDto tableDelivery2 = pizzeriaDto.getTableDelivery();
            if (tableDelivery2 != null) {
                bool2 = Boolean.valueOf(tableDelivery2.isEnabled());
            }
            boolean booleanValue2 = ((Boolean) mh5.c(bool2, bool3)).booleanValue();
            boolean booleanValue3 = ((Boolean) mh5.c(pizzeriaDto.getHasKidsPlayground(), bool3)).booleanValue();
            boolean booleanValue4 = ((Boolean) mh5.c(pizzeriaDto.getHasWorkshops(), bool3)).booleanValue();
            String workshopUrl = pizzeriaDto.getWorkshopUrl();
            if (workshopUrl == null) {
                str8 = "";
            } else {
                str8 = workshopUrl;
            }
            return new d88(str9, str10, str11, str12, str13, ov5Var, a2, j2, b, true, mv9Var4, mv9Var5, arrayList2, str2, str4, str6, str7, n, booleanValue, booleanValue2, booleanValue3, booleanValue4, str8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "dto", "Lmv9$a;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;)Lmv9$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<String, mv9.a> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i) {
            super(1);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final mv9.a invoke(String str) {
            List y0;
            mv9.a aVar;
            Object Z;
            z65.h(str, "dto");
            Pair<String, Integer> pair = new Pair<>(str, Integer.valueOf(this.a));
            if (!qm2.i().containsKey(pair)) {
                y0 = m0b.y0(str, new String[]{"-"}, false, 0, 6, null);
                String str2 = (String) y0.get(0);
                String str3 = (String) y0.get(1);
                aVar = new mv9.a(this.a, qm2.j(str2), qm2.j(str3), z65.c(str2, str3));
            } else {
                mv9.a aVar2 = qm2.i().get(pair);
                List<mv9.a> a = mv9.c.a();
                z65.g(a, "getDays(...)");
                Z = sc1.Z(a);
                aVar = (mv9.a) mh5.c(aVar2, Z);
            }
            Map<Pair<String, Integer>, mv9.a> i = qm2.i();
            z65.e(aVar);
            i.put(pair, aVar);
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;", "dto", "Lmv9$a;", "a", "(Lru/dodopizza/backend/domain/pizzeria/dto/DayOfWeekDto;)Lmv9$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$e */
    /* loaded from: classes4.dex */
    public static final class e extends ej5 implements Function1<DayOfWeekDto, mv9.a> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i) {
            super(1);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final mv9.a invoke(DayOfWeekDto dayOfWeekDto) {
            String str;
            z65.h(dayOfWeekDto, "dto");
            String openLocalTimeSpan = dayOfWeekDto.getOpenLocalTimeSpan();
            String str2 = null;
            if (openLocalTimeSpan != null) {
                str = qm2.j(openLocalTimeSpan);
            } else {
                str = null;
            }
            String closeLocalTimeSpan = dayOfWeekDto.getCloseLocalTimeSpan();
            if (closeLocalTimeSpan != null) {
                str2 = qm2.j(closeLocalTimeSpan);
            }
            return new mv9.a(this.a, str, str2, dayOfWeekDto.isFullDay());
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((RestaurantServiceTypeDto) t2).getPriority()), Integer.valueOf(((RestaurantServiceTypeDto) t).getPriority()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;", "dto", "Lmv9;", "a", "(Lru/dodopizza/backend/domain/pizzeria/dto/ScheduleDto;)Lmv9;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$g */
    /* loaded from: classes4.dex */
    public static final class g extends ej5 implements Function1<ScheduleDto, mv9> {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final mv9 invoke(ScheduleDto scheduleDto) {
            mv9.a aVar;
            mv9.a aVar2;
            mv9.a aVar3;
            mv9.a aVar4;
            mv9.a aVar5;
            mv9.a aVar6;
            List o;
            z65.h(scheduleDto, "dto");
            mv9.a[] aVarArr = new mv9.a[7];
            DayOfWeekDto monday = scheduleDto.getMonday();
            mv9.a aVar7 = null;
            if (monday != null) {
                aVar = qm2.h(2).invoke(monday);
            } else {
                aVar = null;
            }
            aVarArr[0] = aVar;
            DayOfWeekDto tuesday = scheduleDto.getTuesday();
            if (tuesday != null) {
                aVar2 = qm2.h(3).invoke(tuesday);
            } else {
                aVar2 = null;
            }
            aVarArr[1] = aVar2;
            DayOfWeekDto wednesday = scheduleDto.getWednesday();
            if (wednesday != null) {
                aVar3 = qm2.h(4).invoke(wednesday);
            } else {
                aVar3 = null;
            }
            aVarArr[2] = aVar3;
            DayOfWeekDto thursday = scheduleDto.getThursday();
            if (thursday != null) {
                aVar4 = qm2.h(5).invoke(thursday);
            } else {
                aVar4 = null;
            }
            aVarArr[3] = aVar4;
            DayOfWeekDto friday = scheduleDto.getFriday();
            if (friday != null) {
                aVar5 = qm2.h(6).invoke(friday);
            } else {
                aVar5 = null;
            }
            aVarArr[4] = aVar5;
            DayOfWeekDto saturday = scheduleDto.getSaturday();
            if (saturday != null) {
                aVar6 = qm2.h(7).invoke(saturday);
            } else {
                aVar6 = null;
            }
            aVarArr[5] = aVar6;
            DayOfWeekDto sunday = scheduleDto.getSunday();
            if (sunday != null) {
                aVar7 = qm2.h(1).invoke(sunday);
            }
            aVarArr[6] = aVar7;
            o = kc1.o(aVarArr);
            return new mv9(o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: datapizzeriatransforms.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "dto", "Lmv9;", "a", "(Ljava/util/List;)Lmv9;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qm2$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<List<? extends String>, mv9> {
        public static final h a = new h();

        h() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final mv9 invoke(List<String> list) {
            mv9 mv9Var;
            mv9 mv9Var2;
            Object Z;
            Object Z2;
            Object Z3;
            Object Z4;
            Object Z5;
            Object Z6;
            Object Z7;
            List o;
            z65.h(list, "dto");
            if (qm2.k().containsKey(list)) {
                mv9Var2 = (mv9) mh5.c(qm2.k().get(list), mv9.c);
            } else {
                int i = 0;
                if (list.size() == 1) {
                    Z = sc1.Z(list);
                    Z2 = sc1.Z(list);
                    Z3 = sc1.Z(list);
                    Z4 = sc1.Z(list);
                    Z5 = sc1.Z(list);
                    Z6 = sc1.Z(list);
                    Z7 = sc1.Z(list);
                    o = kc1.o(qm2.g(2).invoke(Z), qm2.g(3).invoke(Z2), qm2.g(4).invoke(Z3), qm2.g(5).invoke(Z4), qm2.g(6).invoke(Z5), qm2.g(7).invoke(Z6), qm2.g(1).invoke(Z7));
                    mv9Var = new mv9(o);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            kc1.v();
                        }
                        String str = (String) obj;
                        if (i == 6) {
                            arrayList.add(qm2.g(1).invoke(str));
                        } else {
                            arrayList.add(qm2.g(i + 2).invoke(str));
                        }
                        i = i2;
                    }
                    mv9Var = new mv9(arrayList);
                }
                qm2.k().put(list, mv9Var);
                mv9Var2 = mv9Var;
            }
            return new mv9(mv9Var2.a());
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("00:00"));
        a = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("00:00:00"));
        b = simpleDateFormat2;
        c = new LinkedHashMap();
        d = new LinkedHashMap();
        e = new LinkedHashMap();
        f = new LinkedHashMap();
    }

    public static final Function1<NewPizzeriaDto, d88> e() {
        return b.a;
    }

    public static final Function1<PizzeriaDto, d88> f() {
        return c.a;
    }

    public static final Function1<String, mv9.a> g(int i) {
        return new d(i);
    }

    public static final Function1<DayOfWeekDto, mv9.a> h(int i) {
        return new e(i);
    }

    public static final Map<Pair<String, Integer>, mv9.a> i() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str) {
        String str2;
        Map<String, String> map = f;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            Date parse = a.parse(str);
            if (parse != null) {
                str2 = b.format(parse);
            } else {
                str2 = null;
            }
        } catch (Exception unused) {
            str2 = "";
        }
        f.put(str, str2);
        return str2;
    }

    public static final Map<List<String>, mv9> k() {
        return d;
    }

    public static final Map<String, Long> l() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(List<RestaurantServiceTypeDto> list) {
        Boolean bool;
        int w;
        if (list != null) {
            List<RestaurantServiceTypeDto> list2 = list;
            w = lc1.w(list2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (RestaurantServiceTypeDto restaurantServiceTypeDto : list2) {
                arrayList.add(restaurantServiceTypeDto.getServiceType());
            }
            bool = Boolean.valueOf(arrayList.contains(RestaurantServiceTypeDto.ServiceTypeDto.TABLE));
        } else {
            bool = null;
        }
        return ((Boolean) mh5.c(bool, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ok9> n(List<RestaurantServiceTypeDto> list) {
        List<RestaurantServiceTypeDto> y0;
        List<ok9> l;
        if (list == null) {
            l = kc1.l();
            return l;
        }
        y0 = sc1.y0(list, new f());
        ArrayList arrayList = new ArrayList();
        for (RestaurantServiceTypeDto restaurantServiceTypeDto : y0) {
            ok9 q = q(restaurantServiceTypeDto);
            if (q != null) {
                arrayList.add(q);
            }
        }
        return arrayList;
    }

    public static final Function1<ScheduleDto, mv9> o() {
        return g.a;
    }

    public static final Function1<List<String>, mv9> p() {
        return h.a;
    }

    private static final ok9 q(RestaurantServiceTypeDto restaurantServiceTypeDto) {
        int i;
        RestaurantServiceTypeDto.ServiceTypeDto serviceType = restaurantServiceTypeDto.getServiceType();
        if (serviceType == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[serviceType.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return ok9.a.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ok9.c.a;
            }
            return ok9.b.a;
        }
        return null;
    }
}
