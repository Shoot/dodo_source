package defpackage;

import defpackage.ym;
import kotlin.Metadata;
/* compiled from: screentosendertransforms.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lym$d;", "Lck1;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: lx9  reason: default package */
/* loaded from: classes4.dex */
public final class lx9 {

    /* compiled from: screentosendertransforms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lx9$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ym.d.values().length];
            try {
                iArr[ym.d.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ym.d.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ym.d.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ym.d.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ym.d.h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ym.d.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ym.d.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ym.d.l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ym.d.i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ym.d.o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ym.d.p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ck1 a(ym.d dVar) {
        z65.h(dVar, "<this>");
        switch (a.$EnumSwitchMapping$0[dVar.ordinal()]) {
            case 1:
                return ck1.i;
            case 2:
                return ck1.e;
            case 3:
                return ck1.m;
            case 4:
                return ck1.g;
            case 5:
                return ck1.h;
            case 6:
                return ck1.f;
            case 7:
                return ck1.j;
            case 8:
                return ck1.k;
            case 9:
                return ck1.l;
            case 10:
                return ck1.X;
            case 11:
                return ck1.Y;
            default:
                String i = dVar.i();
                throw new IllegalArgumentException("Wrong screen value " + i);
        }
    }
}
