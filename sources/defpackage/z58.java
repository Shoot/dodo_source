package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.pickup.presentation.PickupPizzeriaVH;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.a68;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PickupPizzeriaBinder.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B1\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050%¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\r\u001a\u00020\u0005*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0014\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R)\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lz58;", "Loyb;", "Lcom/dodopizza/geo/feature/pickup/presentation/PickupPizzeriaVH;", "Lb68;", "data", "", "n", "", "localityName", "k", Image.TYPE_MEDIUM, "Lx58;", "distance", "l", "La68;", "schedule", "o", "Ljb7;", "operationalTypeVo", "j", "Ld88;", "pizzeria", "i", "view", "", "position", "g", "", "", "changes", "f", "", "a", "Z", "isShortNameEnabled", "b", "isCityTitleEnabled", "Lkotlin/Function2;", com.huawei.hms.opendevice.c.a, "Lkotlin/jvm/functions/Function2;", Image.TYPE_HIGH, "()Lkotlin/jvm/functions/Function2;", "onClick", "<init>", "(ZZLkotlin/jvm/functions/Function2;)V", DateTokenConverter.CONVERTER_KEY, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z58  reason: default package */
/* loaded from: classes2.dex */
public final class z58 extends oyb<PickupPizzeriaVH, b68> {
    public static final a d = new a(null);
    private final boolean a;
    private final boolean b;
    private final Function2<b68, Integer, Unit> c;

    /* compiled from: PickupPizzeriaBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz58$a;", "", "", "LOADING_CHANGED", "Ljava/lang/String;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z58$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PickupPizzeriaBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z58$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jb7.values().length];
            try {
                iArr[jb7.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jb7.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jb7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jb7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jb7.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickupPizzeriaBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z58$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ b68 b;
        final /* synthetic */ PickupPizzeriaVH c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b68 b68Var, PickupPizzeriaVH pickupPizzeriaVH) {
            super(0);
            this.b = b68Var;
            this.c = pickupPizzeriaVH;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z58.this.h().invoke(this.b, Integer.valueOf(this.c.getPosition()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z58(boolean z, boolean z2, Function2<? super b68, ? super Integer, Unit> function2) {
        z65.h(function2, "onClick");
        this.a = z;
        this.b = z2;
        this.c = function2;
    }

    private final String i(d88 d88Var) {
        return g88.a(d88Var, this.a);
    }

    private final void j(PickupPizzeriaVH pickupPizzeriaVH, jb7 jb7Var) {
        int i = b.$EnumSwitchMapping$0[jb7Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            pickupPizzeriaVH.setAvailableOrderTypesDeliveryOnly();
                            return;
                        }
                        return;
                    }
                    pickupPizzeriaVH.setAvailableOrderTypesCarryoutOnly();
                    return;
                }
                pickupPizzeriaVH.setAvailableOrderTypesCarryout();
                return;
            }
            pickupPizzeriaVH.setAvailableOrderTypesDeliveryAndRestaurant();
            return;
        }
        pickupPizzeriaVH.setAvailableOrderTypesDeliveryAndCarryout();
    }

    private final void k(PickupPizzeriaVH pickupPizzeriaVH, String str) {
        if (this.b) {
            pickupPizzeriaVH.showCityName(str);
        } else {
            pickupPizzeriaVH.hideCityName();
        }
    }

    private final void l(PickupPizzeriaVH pickupPizzeriaVH, x58 x58Var) {
        String str;
        String str2;
        boolean z;
        if (x58Var != null) {
            str = x58Var.a();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        pickupPizzeriaVH.setDistanceToUser(str2);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        pickupPizzeriaVH.setDistanceToUserVisibility(!z);
    }

    private final void m(PickupPizzeriaVH pickupPizzeriaVH, b68 b68Var) {
        pickupPizzeriaVH.setEnabled(b68Var.i());
        pickupPizzeriaVH.setIsLoading(b68Var.j());
    }

    private final void n(PickupPizzeriaVH pickupPizzeriaVH, b68 b68Var) {
        pickupPizzeriaVH.setAddress(i(b68Var.g()));
        pickupPizzeriaVH.setEnabled(b68Var.i());
        pickupPizzeriaVH.setIsLoading(b68Var.j());
        j(pickupPizzeriaVH, b68Var.f());
        o(pickupPizzeriaVH, b68Var.h());
        l(pickupPizzeriaVH, b68Var.c());
        pickupPizzeriaVH.setOnClickListener(new c(b68Var, pickupPizzeriaVH));
        k(pickupPizzeriaVH, b68Var.e());
    }

    private final void o(PickupPizzeriaVH pickupPizzeriaVH, a68 a68Var) {
        if (a68Var instanceof a68.c) {
            a68.c cVar = (a68.c) a68Var;
            pickupPizzeriaVH.setScheduleTimeOpenToday(cVar.b(), cVar.a());
            pickupPizzeriaVH.setDescriptionIsOpenToday();
        } else if (a68Var instanceof a68.b) {
            pickupPizzeriaVH.setScheduleOpenAroundTheClock();
            pickupPizzeriaVH.setDescriptionIsOpenToday();
        } else if (a68Var instanceof a68.e) {
            pickupPizzeriaVH.setScheduleTimeWillBeOpenToday(((a68.e) a68Var).a());
            pickupPizzeriaVH.setDescriptionIsClosedToday();
        } else if (a68Var instanceof a68.f) {
            pickupPizzeriaVH.setScheduleTimeWillBeOpenTomorrow(((a68.f) a68Var).a());
            pickupPizzeriaVH.setDescriptionIsClosedToday();
        } else if (z65.c(a68Var, a68.a.a)) {
            pickupPizzeriaVH.setScheduleTimeEmpty();
            pickupPizzeriaVH.setDescriptionIsClosedToday();
        } else if (z65.c(a68Var, a68.d.a)) {
            pickupPizzeriaVH.setDescriptionIsUndefinedToday();
        }
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void a(PickupPizzeriaVH pickupPizzeriaVH, b68 b68Var, int i, List<? extends Object> list) {
        z65.h(pickupPizzeriaVH, "view");
        z65.h(b68Var, "data");
        z65.h(list, "changes");
        for (Object obj : list) {
            if (z65.c(obj, "loading_changed")) {
                m(pickupPizzeriaVH, b68Var);
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(PickupPizzeriaVH pickupPizzeriaVH, b68 b68Var, int i) {
        z65.h(pickupPizzeriaVH, "view");
        z65.h(b68Var, "data");
        n(pickupPizzeriaVH, b68Var);
    }

    public final Function2<b68, Integer, Unit> h() {
        return this.c;
    }
}
