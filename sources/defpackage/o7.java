package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.R;
/* compiled from: AddressElement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Ln7;", "", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: o7  reason: default package */
/* loaded from: classes4.dex */
public final class o7 {

    /* compiled from: AddressElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o7$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n7.values().length];
            try {
                iArr[n7.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n7.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n7.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n7.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n7.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n7.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n7.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n7.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n7.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n7.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(n7 n7Var) {
        z65.h(n7Var, "<this>");
        switch (a.$EnumSwitchMapping$0[n7Var.ordinal()]) {
            case 1:
                return R.string.street;
            case 2:
                return R.string.house;
            case 3:
                return R.string.building;
            case 4:
                return R.string.apartment_or_office;
            case 5:
                return R.string.code_on_the_door;
            case 6:
                return R.string.entrance;
            case 7:
                return R.string.floor;
            case 8:
                return R.string.address_name;
            case 9:
                return R.string.enter_postcode_hint;
            case 10:
                return R.string.comment;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
