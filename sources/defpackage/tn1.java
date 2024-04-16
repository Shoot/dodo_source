package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a\b\u0010\n\u001a\u00020\bH\u0007\u001a\u0014\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000\u001aP\u0010\u0013\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u00110\u000fj\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011`\u0012\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\tH\u0002\u001aa\u0010\u0015\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\t*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fj\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011`\u00122\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u0017\u001a\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\t*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fj\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011`\u00122\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a[\u0010\u0019\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\t*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fj\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011`\u00122\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001a\u0010\u001e\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002\u001a\u001a\u0010\u001f\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002\u001a,\u0010$\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002\u001a$\u0010'\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002\u001a\u001c\u0010(\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002\u001a\"\u0010)\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002\u001a(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002\u001a\f\u0010+\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\f\u0010,\u001a\u00020\u0000*\u00020\u0002H\u0002\u001a\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"00*\u00020-2\u0006\u0010/\u001a\u00020.H\u0002\u001a\u001c\u00105\u001a\u00020\u0002*\u0002022\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H\u0002\u001a$\u00109\u001a\u00020\u0002*\u0002022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0002H\u0002\u001a\u0010\u0010:\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000\u001a\u0010\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u0006H\u0000\"4\u0010B\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>j\u0002`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010A\"4\u0010C\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>j\u0002`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010A\"4\u0010E\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>j\u0002`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010A\"4\u0010G\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>j\u0002`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010A\"4\u0010I\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>j\u0002`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010A\" \u0010P\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\" \u0010T\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010K\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\" \u0010X\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bU\u0010K\u0012\u0004\bW\u0010O\u001a\u0004\bV\u0010M\" \u0010\\\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bY\u0010K\u0012\u0004\b[\u0010O\u001a\u0004\bZ\u0010M\" \u0010`\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010K\u0012\u0004\b_\u0010O\u001a\u0004\b^\u0010M\" \u0010d\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\ba\u0010K\u0012\u0004\bc\u0010O\u001a\u0004\bb\u0010M\"\u0018\u0010h\u001a\u00020\"*\u00020e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g*D\b\u0000\u0010i\"\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>2\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0>¨\u0006j"}, d2 = {"", "K", "", Action.KEY_ATTRIBUTE, "dirty1", "dirty2", "", "info", "", "V", "U", "Lzna;", "Lwc9;", "rememberManager", "Q", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "L", "value", "O", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "P", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "N", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lh75;", "location", "A", "z", "Le99;", Action.SCOPE_ATTRIBUTE, "", "instance", "J", "start", "end", "B", "R", "S", "y", "t", Image.TYPE_SMALL, "Lwna;", "Lrd;", "anchor", "", "u", "Lvna;", "index", "root", "x", "a", "b", "common", "M", "T", "message", "", "w", "Lkotlin/Function3;", "Lwp;", "Landroidx/compose/runtime/Change;", "Ly84;", "removeCurrentGroupInstance", "skipToGroupEndInstance", com.huawei.hms.opendevice.c.a, "endGroupInstance", DateTokenConverter.CONVERTER_KEY, "startRootGroup", com.huawei.hms.push.e.a, "resetSlotsInstance", "f", "Ljava/lang/Object;", "D", "()Ljava/lang/Object;", "getInvocation$annotations", "()V", "invocation", "g", "F", "getProvider$annotations", "provider", Image.TYPE_HIGH, "C", "getCompositionLocalMap$annotations", "compositionLocalMap", "i", "H", "getProviderValues$annotations", "providerValues", "j", "G", "getProviderMaps$annotations", "providerMaps", "k", "I", "getReference$annotations", "reference", "Lgf5;", "E", "(Lgf5;)Ljava/lang/Object;", "joinedKey", "Change", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tn1  reason: default package */
/* loaded from: classes.dex */
public final class tn1 {
    private static final y84<wp<?>, zna, wc9, Unit> a = b.a;
    private static final y84<wp<?>, zna, wc9, Unit> b = d.a;
    private static final y84<wp<?>, zna, wc9, Unit> c = a.a;
    private static final y84<wp<?>, zna, wc9, Unit> d = e.a;
    private static final y84<wp<?>, zna, wc9, Unit> e = c.a;
    private static final Object f = new fa7("provider");
    private static final Object g = new fa7("provider");
    private static final Object h = new fa7("compositionLocalMap");
    private static final Object i = new fa7("providerValues");
    private static final Object j = new fa7("providers");
    private static final Object k = new fa7("reference");

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tn1$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final a a = new a();

        a() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.O();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tn1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final b a = new b();

        b() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "rememberManager");
            tn1.Q(znaVar, wc9Var);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tn1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final c a = new c();

        c() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.I0();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tn1$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final d a = new d();

        d() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.P0();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tn1$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final e a = new e();

        e() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.Q(0);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    private static final int A(List<h75> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int j2 = z65.j(list.get(i4).b(), i2);
            if (j2 < 0) {
                i3 = i4 + 1;
            } else if (j2 > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h75 B(List<h75> list, int i2, int i3) {
        int z = z(list, i2);
        if (z < list.size()) {
            h75 h75Var = list.get(z);
            if (h75Var.b() < i3) {
                return h75Var;
            }
            return null;
        }
        return null;
    }

    public static final Object C() {
        return h;
    }

    public static final Object D() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E(gf5 gf5Var) {
        if (gf5Var.d() != null) {
            return new x95(Integer.valueOf(gf5Var.a()), gf5Var.d());
        }
        return Integer.valueOf(gf5Var.a());
    }

    public static final Object F() {
        return g;
    }

    public static final Object G() {
        return j;
    }

    public static final Object H() {
        return i;
    }

    public static final Object I() {
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(List<h75> list, int i2, e99 e99Var, Object obj) {
        int A = A(list, i2);
        lt4 lt4Var = null;
        if (A < 0) {
            int i3 = -(A + 1);
            if (obj != null) {
                lt4Var = new lt4();
                lt4Var.add(obj);
            }
            list.add(i3, new h75(e99Var, i2, lt4Var));
        } else if (obj == null) {
            list.get(A).e(null);
        } else {
            lt4<Object> a2 = list.get(A).a();
            if (a2 != null) {
                a2.add(obj);
            }
        }
    }

    public static final boolean K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> L() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(vna vnaVar, int i2, int i3, int i4) {
        if (i2 == i3) {
            return i2;
        }
        if (i2 != i4 && i3 != i4) {
            if (vnaVar.L(i2) == i3) {
                return i3;
            }
            if (vnaVar.L(i3) == i2) {
                return i2;
            }
            if (vnaVar.L(i2) == vnaVar.L(i3)) {
                return vnaVar.L(i2);
            }
            int x = x(vnaVar, i2, i4);
            int x2 = x(vnaVar, i3, i4);
            int i5 = x - x2;
            for (int i6 = 0; i6 < i5; i6++) {
                i2 = vnaVar.L(i2);
            }
            int i7 = x2 - x;
            for (int i8 = 0; i8 < i7; i8++) {
                i3 = vnaVar.L(i3);
            }
            while (i2 != i3) {
                i2 = vnaVar.L(i2);
                i3 = vnaVar.L(i3);
            }
            return i2;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V N(HashMap<K, LinkedHashSet<V>> hashMap, K k2) {
        Object a0;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet != null) {
            a0 = sc1.a0(linkedHashSet);
            V v = (V) a0;
            if (v != null) {
                P(hashMap, k2, v);
                return v;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean O(HashMap<K, LinkedHashSet<V>> hashMap, K k2, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k2, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> Unit P(HashMap<K, LinkedHashSet<V>> hashMap, K k2, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k2);
            }
            return Unit.a;
        }
        return null;
    }

    public static final void Q(zna znaVar, wc9 wc9Var) {
        z65.h(znaVar, "<this>");
        z65.h(wc9Var, "rememberManager");
        Iterator<Object> e0 = znaVar.e0();
        while (e0.hasNext()) {
            Object next = e0.next();
            if (next instanceof kn1) {
                wc9Var.b((kn1) next);
            }
            if (next instanceof xc9) {
                wc9Var.d((xc9) next);
            }
            if (next instanceof e99) {
                ((e99) next).w();
            }
        }
        znaVar.F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h75 R(List<h75> list, int i2) {
        int A = A(list, i2);
        if (A >= 0) {
            return list.remove(A);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(List<h75> list, int i2, int i3) {
        int z = z(list, i2);
        while (z < list.size() && list.get(z).b() < i3) {
            list.remove(z);
        }
    }

    public static final void T(boolean z) {
        if (z) {
            return;
        }
        w("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    public static final void V(int i2, int i3, int i4, String str) {
        z65.h(str, "info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> u(wna wnaVar, rd rdVar) {
        ArrayList arrayList = new ArrayList();
        vna D = wnaVar.D();
        try {
            v(D, arrayList, wnaVar.g(rdVar));
            Unit unit = Unit.a;
            return arrayList;
        } finally {
            D.d();
        }
    }

    private static final void v(vna vnaVar, List<Object> list, int i2) {
        if (vnaVar.F(i2)) {
            list.add(vnaVar.H(i2));
            return;
        }
        int i3 = i2 + 1;
        int A = i2 + vnaVar.A(i2);
        while (i3 < A) {
            v(vnaVar, list, i3);
            i3 += vnaVar.A(i3);
        }
    }

    public static final Void w(String str) {
        z65.h(str, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    private static final int x(vna vnaVar, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = vnaVar.L(i2);
            i4++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<h75> y(List<h75> list, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int z = z(list, i2); z < list.size(); z++) {
            h75 h75Var = list.get(z);
            if (h75Var.b() >= i3) {
                break;
            }
            arrayList.add(h75Var);
        }
        return arrayList;
    }

    private static final int z(List<h75> list, int i2) {
        int A = A(list, i2);
        if (A < 0) {
            return -(A + 1);
        }
        return A;
    }

    public static final void U() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(boolean z) {
        return z ? 1 : 0;
    }
}
