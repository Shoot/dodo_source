package defpackage;

import kotlin.Metadata;
/* compiled from: FirebaseToggleService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lhy3;", "Lgy3;", "Lbq3;", "featureCode", "", "b", "", "a", "Lld9;", "Lld9;", "remoteConfigService", "<init>", "(Lld9;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hy3  reason: default package */
/* loaded from: classes4.dex */
public final class hy3 implements gy3 {
    private final ld9 a;

    /* compiled from: FirebaseToggleService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hy3$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bq3.values().length];
            try {
                iArr[bq3.V6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bq3.N6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bq3.O6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bq3.P6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bq3.Q6.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[bq3.R6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[bq3.S6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[bq3.T6.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[bq3.U6.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[bq3.W6.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[bq3.X6.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[bq3.Y6.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[bq3.Z6.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hy3(ld9 ld9Var) {
        z65.h(ld9Var, "remoteConfigService");
        this.a = ld9Var;
    }

    private final String b(bq3 bq3Var) {
        switch (a.$EnumSwitchMapping$0[bq3Var.ordinal()]) {
            case 1:
                return "distance_to_delivery_address_validation_enabled";
            case 2:
                return "order_rating_do_not_contact_me";
            case 3:
                return "order_rating_contact_me_via_chat";
            case 4:
                return "order_rating_binary_feedback";
            case 5:
                return "select_order_type_on_start_enabled";
            case 6:
                return "redesign_deferred_time_enabled";
            case 7:
                return "cart_scrollable_button_enabled";
            case 8:
                return "dodocoin_balance_in_menu_android_enabled";
            case 9:
                return "drinks_two_column_enabled";
            case 10:
                return "combo_customize_sections_rearrangement_enabled";
            case 11:
                return "menu_subcategories_enabled";
            case 12:
                return "choose_order_type_variants_enabled";
            case 13:
                return "show_infinite_upsell_android_enabled";
            default:
                return null;
        }
    }

    @Override // defpackage.gy3
    public boolean a(bq3 bq3Var) {
        String b;
        z65.h(bq3Var, "featureCode");
        if (bq3Var.i() != cq3.d || (b = b(bq3Var)) == null) {
            return false;
        }
        return this.a.b(b);
    }
}
